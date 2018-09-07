

package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class fw2 extends AppCompatActivity {

    private ImageView i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw2);

        i2=(ImageView)findViewById(R.id.i2);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/2bridge.jpg?alt=media&token=ca59e281-251a-4498-aee9-69b34578343b";




        Glide.with(getApplicationContext()).load(url1).into(i2);


    };


    public  void openi2 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WowARnE-p0s"));
        startActivity(browserIntent);
    }


}



