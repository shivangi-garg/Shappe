package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw33 extends AppCompatActivity {
    private ImageView i33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw33);
        i33=(ImageView)findViewById(R.id.i33);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/33kneepushup.jpg?alt=media&token=c43fe685-26b3-4b61-97be-0d59b950ee61";



        Glide.with(getApplicationContext()).load(url1).into(i33);


    };

    public  void openi33 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=hyv14e2QDq0"));
        startActivity(browserIntent);
    }
}
