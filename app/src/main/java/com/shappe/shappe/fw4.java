package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw4 extends AppCompatActivity {
private ImageView i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw4);
        i4=(ImageView)findViewById(R.id.i4);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/4inclinepushup.jpg?alt=media&token=5551fced-5c01-438f-9879-b89d79caf9eb";




        Glide.with(getApplicationContext()).load(url1).into(i4);


    };


    public  void openi4 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Me9bHFAxnCs"));
        startActivity(browserIntent);
    }
    }

