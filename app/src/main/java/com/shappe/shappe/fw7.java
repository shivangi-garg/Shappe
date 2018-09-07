package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw7 extends AppCompatActivity {
private ImageView i7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw7);

        i7=(ImageView)findViewById(R.id.i7);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/7jumping%20jacks.png?alt=media&token=ac3b7ae4-a9f4-4224-a56f-8f9b7db22168";




        Glide.with(getApplicationContext()).load(url1).into(i7);


    };


    public  void openi7 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=UpH7rm0cYbM"));
        startActivity(browserIntent);
    }
    }
