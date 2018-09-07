package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class fw18 extends AppCompatActivity {
private ImageView i18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw18);
        i18=(ImageView)findViewById(R.id.i18);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/18russiantwist.jpg?alt=media&token=8c3921a2-ab0a-4c96-a906-50134c851d9a";



        Glide.with(getApplicationContext()).load(url1).into(i18);


    };

    public  void openi18 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NeAtimSCxsY"));
        startActivity(browserIntent);
    }
}
