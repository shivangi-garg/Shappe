

package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class fw37 extends AppCompatActivity {

    private ImageView i37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw37);

        i37=(ImageView)findViewById(R.id.i37);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/37splitsquatleft.jpg?alt=media&token=4b1b97df-fb8b-47f9-8722-5b857330bb62";




        Glide.with(getApplicationContext()).load(url1).into(i37);


    };


    public  void openi37 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WBmXffkfcXQ"));
        startActivity(browserIntent);
    }


}

