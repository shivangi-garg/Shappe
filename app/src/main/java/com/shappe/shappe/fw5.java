package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw5 extends AppCompatActivity {
private ImageView i5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw5);

        i5=(ImageView)findViewById(R.id.i5);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/5leftlunge.jpg?alt=media&token=7a3f4ca9-6aa8-4d8f-b857-d33a57f3851b";



        Glide.with(getApplicationContext()).load(url1).into(i5);


    };


    public  void openi5 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=QF0BQS2W80k"));
        startActivity(browserIntent);
    }
    }

