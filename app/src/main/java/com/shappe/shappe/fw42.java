

package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class fw42 extends AppCompatActivity {

    private ImageView i42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw42);

        i42=(ImageView)findViewById(R.id.i42);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/42mountainclimbers.jpg?alt=media&token=09a40ea4-9568-4752-8366-e8ccd2d10172";




        Glide.with(getApplicationContext()).load(url1).into(i42);


    };


    public  void openi42 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=H9_wC-Xv2P4"));
        startActivity(browserIntent);
    }


}

