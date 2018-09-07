package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw22 extends AppCompatActivity {
    private ImageView i22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw22);

        i22=(ImageView)findViewById(R.id.i22);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/22bicyclecrunches.jpg?alt=media&token=a8c8e9f0-fa82-4c00-85ab-472b9811d681";



        Glide.with(getApplicationContext()).load(url1).into(i22);


    };

    public  void openi22 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NECcLiefy0M"));
        startActivity(browserIntent);
    }
}
