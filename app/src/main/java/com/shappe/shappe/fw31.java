package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw31 extends AppCompatActivity {
    private ImageView i31;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw31);
        i31=(ImageView)findViewById(R.id.i31);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/31reversecrunches.jpg?alt=media&token=77932270-6580-4dbc-921c-5ee26a6e2263";



        Glide.with(getApplicationContext()).load(url1).into(i31);


    };

    public  void openi31 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ASdvN_XEl_c"));
        startActivity(browserIntent);
    }
}
