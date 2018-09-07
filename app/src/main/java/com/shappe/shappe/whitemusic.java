package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class whitemusic extends AppCompatActivity {

    private ImageView white1,white2,white3,white4,white5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whitemusic);

        white1=(ImageView) findViewById(R.id.white1);
        white2=(ImageView)findViewById(R.id.white2);
        white3=(ImageView)findViewById(R.id.white3);
        white4=(ImageView)findViewById(R.id.white4);
        white5=(ImageView)findViewById(R.id.white5);
    }

    public  void open11 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtu.be/tm_fzEvkBkI4"));
        startActivity(browserIntent);
    }

    public  void open22 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/5V-oI-z1NgI"));
        startActivity(browserIntent);
    }
    public  void open33 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/E9XArn2IBnA"));
        startActivity(browserIntent);
    }

    public  void open44 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/6qXnPFytzU0"));
        startActivity(browserIntent);
    }
    public  void open55 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/i6StbRRE4eo"));
        startActivity(browserIntent);
    }
}
