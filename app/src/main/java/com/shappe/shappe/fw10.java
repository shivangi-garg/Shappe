package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw10 extends AppCompatActivity {
private ImageView i10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw10);
        i10=(ImageView)findViewById(R.id.i10);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/10burpee.jpg?alt=media&token=7b372fed-200a-412a-af80-c2c0a56edf66";


        Glide.with(getApplicationContext()).load(url1).into(i10);


    };


    public  void openi11 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JZQA08SlJnM"));
        startActivity(browserIntent);
    }
}
