package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw3 extends AppCompatActivity {
    private ImageView i3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw3);
        i3=(ImageView)findViewById(R.id.i3);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/3highstepping.jpg?alt=media&token=e2305bd3-ecaf-4534-b859-3a41832695a3";




        Glide.with(getApplicationContext()).load(url1).into(i3);


    };


    public  void openi3 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kMFv3Alg-Gc"));
        startActivity(browserIntent);
    }

}

