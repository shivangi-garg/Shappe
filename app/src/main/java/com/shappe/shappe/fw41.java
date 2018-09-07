

package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class fw41 extends AppCompatActivity {

    private ImageView i41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw41);

        i41=(ImageView)findViewById(R.id.i41);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/41sideplankleft.jpg?alt=media&token=8abcad6a-fbcb-458f-af47-73a9bd2ffad3";




        Glide.with(getApplicationContext()).load(url1).into(i41);


    };


    public  void openi41 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=U4s4mEQ5VqU"));
        startActivity(browserIntent);
    }


}

