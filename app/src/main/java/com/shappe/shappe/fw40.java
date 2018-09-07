

package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class fw40 extends AppCompatActivity {

    private ImageView i40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw40);

        i40=(ImageView)findViewById(R.id.i40);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/40jumpsquat.jpg?alt=media&token=2589615a-82b3-43aa-a917-f4c4ef282b12";




        Glide.with(getApplicationContext()).load(url1).into(i40);


    };


    public  void openi40 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NmyiMb2XYAM"));
        startActivity(browserIntent);
    }


}

