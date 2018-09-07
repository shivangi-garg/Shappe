package com.shappe.shappe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WorkoutLayout extends AppCompatActivity {


    ImageButton classic,full;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_layout);
        classic=(ImageButton)findViewById(R.id.classic);
        full=(ImageButton)findViewById(R.id.full);


        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cls = new Intent(WorkoutLayout.this,ClassicWorkout.class);
                startActivity(cls);
            }
        });

        full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fll = new Intent(WorkoutLayout.this,FullWorkout.class);
                startActivity(fll);
            }
        });
    }
}