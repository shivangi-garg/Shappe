package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw20 extends AppCompatActivity {
    private ImageView i20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw20);

        i20=(ImageView)findViewById(R.id.i20);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/20situp.png?alt=media&token=f30bda64-14ef-4a98-abd3-9eed5f07ff75";



        Glide.with(getApplicationContext()).load(url1).into(i20);


    };

    public  void openi20 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jDwoBqPH0jk"));
        startActivity(browserIntent);
    }
}
