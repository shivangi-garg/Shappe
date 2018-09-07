package com.shappe.shappe;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw6 extends AppCompatActivity {
private ImageView i6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw6);


        i6=(ImageView)findViewById(R.id.i6);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/6wallsit.jpg?alt=media&token=80510f5f-ab59-4034-b79f-1f14114604cb";




        Glide.with(getApplicationContext()).load(url1).into(i6);


    };


    public  void openi6 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XULOKw4E4P4"));
        startActivity(browserIntent);
    }
    }


