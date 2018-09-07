package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw11 extends AppCompatActivity {
private ImageView i11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw11);

        i11=(ImageView)findViewById(R.id.i11);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/11onelegpushup.jpg?alt=media&token=f32eeacb-2edc-441b-a9c5-70e9c9987c09";



        Glide.with(getApplicationContext()).load(url1).into(i11);


    };

    public  void openi11 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Vzlfas-sBVU"));
        startActivity(browserIntent);
    }

}
