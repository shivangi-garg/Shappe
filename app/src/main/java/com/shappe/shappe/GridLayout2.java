package com.shappe.shappe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class GridLayout2 extends AppCompatActivity {

    ImageButton image5,image6,image7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout2);



        image5 = (ImageButton)findViewById(R.id.image5);
        image6 = (ImageButton)findViewById(R.id.image6);
        image7 = (ImageButton)findViewById(R.id.image7);



        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(GridLayout2.this,QuizPsy.class);
                startActivity(quiz);
            }
        });

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent music = new Intent(GridLayout2.this,whitemusic.class);
                startActivity(music);
            }
        });

        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent doctor = new Intent(GridLayout2.this,Doctor.class);
                startActivity(doctor);
            }
        });
    }

}
