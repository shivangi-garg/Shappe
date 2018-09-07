package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw34 extends AppCompatActivity {
    private ImageView i34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw34);
        i34=(ImageView)findViewById(R.id.i34);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/34tricepdip.png?alt=media&token=b0c16fd9-a9a8-4195-9ec5-6aa44c8e9d49";



        Glide.with(getApplicationContext()).load(url1).into(i34);


    };

    public  void openi34 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=EgIMk-PZwo0"));
        startActivity(browserIntent);
    }
}
