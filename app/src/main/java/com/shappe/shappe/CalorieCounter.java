package com.shappe.shappe;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.shappe.shappe.Interface.ItemClickListener;
import com.shappe.shappe.Model.Food;
import com.shappe.shappe.Model.User;
import com.shappe.shappe.ViewHolder.CategoryViewHolder;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CalorieCounter extends AppCompatActivity {


    FirebaseDatabase database;
    DatabaseReference category;
    RecyclerView recycler_menu;
    RecyclerView.LayoutManager layoutManager;
    Double count=0.0;
    Button reset;
    Button addelement;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_counter);

        reset=(Button)findViewById(R.id.reset);
        addelement=(Button)findViewById(R.id.addelement);




        //Init Firebase

        database = FirebaseDatabase.getInstance();
        category = database.getReference("Food");

        //Load Menu

        recycler_menu = (RecyclerView) findViewById(R.id.recycler_menu);
        recycler_menu.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recycler_menu.setLayoutManager(layoutManager);

        loadCategory();

        addelement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent choose = new Intent(CalorieCounter.this,Add.class);
                startActivity(choose);
                finish();
            }
        });
    }

    private void loadCategory()
    {
        FirebaseRecyclerAdapter<Food,CategoryViewHolder> adapter = new FirebaseRecyclerAdapter<Food,CategoryViewHolder>(Food.class,R.layout.category_item,CategoryViewHolder.class,category)

        {

            @Override
            protected  void populateViewHolder(CategoryViewHolder viewHolder, Food model, int position){

                viewHolder.txtCategoryName.setText(model.getName());
                viewHolder.txtCategoryMeasure.setText(model.getMeasure());

                final Food clickItem = model;
                viewHolder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View view, int position, boolean isLongClick) {

                        String cal=clickItem.getCal();
                        float calorie=Float.parseFloat(cal);
                        count+=calorie;

                        Toast.makeText(CalorieCounter.this,""+count,Toast.LENGTH_SHORT).show();

                       // Toast.makeText(CalorieCounter.this,""+clickItem.getName(),Toast.LENGTH_SHORT).show();

                    }
                });

                reset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        count=0.0;
                        Toast.makeText(CalorieCounter.this, "CALORIE RESET", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        };
        recycler_menu.setAdapter(adapter);
    }

}