

package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class fw36 extends AppCompatActivity {

    private ImageView i36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw36);

        i36=(ImageView)findViewById(R.id.i36);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/36Decline-Pushup.jpg?alt=media&token=8b5206a2-1267-4fb4-894c-fb184619f5b7";




        Glide.with(getApplicationContext()).load(url1).into(i36);


    };


    public  void openi36 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=_M2Etme-tfE"));
        startActivity(browserIntent);
    }


}

