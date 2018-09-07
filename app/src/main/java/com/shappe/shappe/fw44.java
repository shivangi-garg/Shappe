

package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class fw44 extends AppCompatActivity {

    private ImageView i44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw44);

        i44=(ImageView)findViewById(R.id.i44);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/44birddog.jpg?alt=media&token=84d5ce3c-5b1c-496d-a4fe-709315f7b9d6";




        Glide.with(getApplicationContext()).load(url1).into(i44);


    };


    public  void openi44 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zL0YEtJulBs"));
        startActivity(browserIntent);
    }


}

