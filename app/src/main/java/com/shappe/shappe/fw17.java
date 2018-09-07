package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw17 extends AppCompatActivity {
private ImageView i17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw17);
        i17=(ImageView)findViewById(R.id.i17);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/17squat.png?alt=media&token=0ea3693f-6502-4b1a-949b-686709674361";



        Glide.with(getApplicationContext()).load(url1).into(i17);


    };

    public  void openi17 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aclHkVaku9U"));
        startActivity(browserIntent);
    }
}
