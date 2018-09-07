package com.shappe.shappe;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

public class Choose extends AppCompatActivity {


    Button btnphysical,btnpsychological;
    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);


        btnphysical = (Button) findViewById(R.id.btnphysical);
        btnpsychological = (Button) findViewById(R.id.btnpsychological);

        btnphysical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent physical = new Intent(Choose.this,GridLayout.class);
                startActivity(physical);

            }
        });

        btnpsychological.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent physical = new Intent(Choose.this,GridLayout2.class);
                startActivity(physical);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to SIGN OUT", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
