

package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class fw35 extends AppCompatActivity {

    private ImageView i35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw35);

        i35=(ImageView)findViewById(R.id.i35);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/35abdominalcrunches.jpg?alt=media&token=02d67f42-07f8-4d6c-9604-60030056bb39";




        Glide.with(getApplicationContext()).load(url1).into(i35);


    };


    public  void openi35 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=0326dy_-CzM"));
        startActivity(browserIntent);
    }


}

