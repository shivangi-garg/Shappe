package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw12 extends AppCompatActivity {
private ImageView i12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw12);
        i12=(ImageView)findViewById(R.id.i12);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/12widearm.jpg?alt=media&token=a46cfbd8-9edb-4c47-b707-fa78e30f014a";



        Glide.with(getApplicationContext()).load(url1).into(i12);


    };

    public  void openi12 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=B78GwfC-87Y"));
        startActivity(browserIntent);
    }
}
