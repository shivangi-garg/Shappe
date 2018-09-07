

package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class fw19 extends AppCompatActivity {

    private ImageView i19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw19);

        i19=(ImageView)findViewById(R.id.i19);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/19straightarmplank.jpg?alt=media&token=315ea733-db78-4849-8d56-2e041b27bea4";




        Glide.with(getApplicationContext()).load(url1).into(i19);


    };


    public  void openi19 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=17ydV85ihp8"));
        startActivity(browserIntent);
    }


}

