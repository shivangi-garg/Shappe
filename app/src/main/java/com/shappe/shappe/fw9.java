package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw9 extends AppCompatActivity {
private ImageView i9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw9);
        i9=(ImageView)findViewById(R.id.i9);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/9pushuprotate.jpg?alt=media&token=173e62e4-6cdc-4dce-b5ec-06c37ab337b8";




        Glide.with(getApplicationContext()).load(url1).into(i9);


    };


    public  void openi9 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=awxqXW6i55A"));
        startActivity(browserIntent);
    }
}
