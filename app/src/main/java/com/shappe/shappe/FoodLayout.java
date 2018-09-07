package com.shappe.shappe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.shappe.shappe.Model.Food;
import com.shappe.shappe.Model.User;

public class FoodLayout extends AppCompatActivity {

    LinearLayout linearLayout2;

    private EditText height;
    private EditText weight;
    private TextView result;
    String Age,Gender;
    Button calc,next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_layout);

        height = (EditText) findViewById(R.id.height1);
        weight = (EditText) findViewById(R.id.weight1);
        result = (TextView) findViewById(R.id.result1);
        calc = (Button) findViewById(R.id.calc1);
        next = (Button) findViewById(R.id.next);



        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {


                        for (DataSnapshot SubSnapshot : dataSnapshot.getChildren()) {

                            final User user = SubSnapshot.getValue(User.class);

                            Age = user.getAge();
                            Gender = user.getGender();

                            String heightStr = height.getText().toString();
                            String weightStr = weight.getText().toString();
                            float calorie;
                            if (heightStr != null && !"".equals(heightStr)
                                    && weightStr != null  &&  !"".equals(weightStr))
                            {
                                float heightValue = Float.parseFloat(heightStr);
                                float weightValue = Float.parseFloat(weightStr);
                                float age = Float.parseFloat(Age);

                                if(Gender.contains("M"))
                                {
                                    calorie =(int) Math.round(1.2 * (66 + (13.7 * weightValue) + (5 * heightValue) - (6.8 * age)));
                                    display(calorie);
                                }
                                if(Gender.contains("F"))
                                {
                                    calorie =(int) Math.round(1.2*(655 + (9.6 * weightValue) + (1.8 * heightValue) - (4.7 * age)));
                                    display(calorie);
                                }

                            }

                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        System.out.println("Data Access Failed" + databaseError.getMessage());
                    }

                });

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cal = new Intent(FoodLayout.this,CalorieCounter.class);
                startActivity(cal);
            }
        });

    }


    private void display(float calorie) {
        String calorieLabel = "";

        calorieLabel = "Calories you should intake are "+calorie;
        result.setText(calorieLabel);
    }

}

