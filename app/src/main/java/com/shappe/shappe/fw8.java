package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw8 extends AppCompatActivity {
private ImageView i8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw8);
        i8=(ImageView)findViewById(R.id.i8);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/8cruches.jpg?alt=media&token=a7f051d0-1c4c-4f52-8ead-86e4195e51fa";




        Glide.with(getApplicationContext()).load(url1).into(i8);


    };


    public  void openi8 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Xyd_fa5zoEU"));
        startActivity(browserIntent);
    }
}
