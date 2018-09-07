package com.shappe.shappe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.shappe.shappe.Model.Food;
import com.shappe.shappe.Model.User;

public class Add extends AppCompatActivity {

    EditText input1,input2,input3;
    Button insert,goback;
    long count=0;
    Integer count1;
    String count2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        input3 = (EditText) findViewById(R.id.input3);
        insert =(Button)findViewById(R.id.insert);
        goback = (Button)findViewById(R.id.goback);

        //Init Firebase

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference category = database.getReference("Food");

       insert.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               category.addListenerForSingleValueEvent(new ValueEventListener() {
                   @Override
                   public void onDataChange(DataSnapshot dataSnapshot) {

                           count = dataSnapshot.getChildrenCount();
                           count1=(int)count+1;
                           String counter= count1.toString();
                           Food food = new Food(input1.getText().toString(),input2.getText().toString(),input3.getText().toString());
                           category.child(counter).setValue(food);
                           Toast.makeText(Add.this, "Added", Toast.LENGTH_SHORT).show();
                           count2=counter;


                   }

                   @Override
                   public void onCancelled(DatabaseError databaseError) {

                   }

               });

           }
       });



       goback.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent choose = new Intent(Add.this,CalorieCounter.class);
               startActivity(choose);
               finish();
           }
       });


    }
}
