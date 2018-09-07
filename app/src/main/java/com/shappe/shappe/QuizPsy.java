package com.shappe.shappe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class QuizPsy extends AppCompatActivity {


    ImageButton imagee1,imagee2,imagee3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_psy);

        imagee1=(ImageButton)findViewById(R.id.imagee1);
        imagee2=(ImageButton)findViewById(R.id.imagee2);
        imagee3=(ImageButton)findViewById(R.id.imagee3);

        imagee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OCD = new Intent(QuizPsy.this,ocdq1.class);
                startActivity(OCD);
            }
        });

        imagee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anxiety = new Intent(QuizPsy.this,anxq1.class);
                startActivity(anxiety);
            }
        });

        imagee3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  depression = new Intent(QuizPsy.this,depq1.class);
                startActivity(depression);
            }
        });
    }
}
