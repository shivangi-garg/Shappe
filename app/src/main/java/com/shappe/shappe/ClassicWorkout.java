package com.shappe.shappe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ClassicWorkout extends AppCompatActivity {

    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_workout);

        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
        img5=(ImageView)findViewById(R.id.img5);
        img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);
        img8=(ImageView)findViewById(R.id.img8);
        img9=(ImageView)findViewById(R.id.img9);
        img10=(ImageView)findViewById(R.id.img10);
        img11=(ImageView)findViewById(R.id.img11);
        img12=(ImageView)findViewById(R.id.img12);


        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img1.png?alt=media&token=c9fe79ac-d66c-4839-96a7-7e71394adcf0";
        String url2="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img3.png?alt=media&token=ca9d6622-f2ee-4537-b8a7-c9ffb125face";
        String url3="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img4.png?alt=media&token=393f23e6-1cec-4976-8441-38e317b46980";
        String url4="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img5.png?alt=media&token=03d9d189-a4f7-4990-885e-da2450ac514d";
        String url5="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img6.png?alt=media&token=9a40a961-4e7b-49b5-bd91-5187d2e4b7b7";
        String url6="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img9.png?alt=media&token=460d22d3-5798-45f0-a63c-353890ce7d9a";
        String url7="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img7.png?alt=media&token=d5fafe22-e8a8-4240-9672-ffaff8604510";
        String url8="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img8.png?alt=media&token=e21a9455-0507-4028-8338-13e50fe54c1b";
        String url9="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img10.png?alt=media&token=db3dd1c7-de6e-4a49-a7ca-db0c67078be2";
        String url10="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img11.png?alt=media&token=26420351-e424-4ca6-bf38-54bafb0e7941";
        String url11="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img12.png?alt=media&token=243620f3-8ce7-4b41-80fa-0dd763350f0b";
        String url12="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/img13.png?alt=media&token=a7c91557-beee-48e0-8856-f6dfa62d668f";




        Glide.with(getApplicationContext()).load(url1).into(img1);
        Glide.with(getApplicationContext()).load(url2).into(img2);
        Glide.with(getApplicationContext()).load(url3).into(img3);
        Glide.with(getApplicationContext()).load(url4).into(img4);
        Glide.with(getApplicationContext()).load(url5).into(img5);
        Glide.with(getApplicationContext()).load(url6).into(img6);
        Glide.with(getApplicationContext()).load(url7).into(img7);
        Glide.with(getApplicationContext()).load(url8).into(img8);
        Glide.with(getApplicationContext()).load(url9).into(img9);
        Glide.with(getApplicationContext()).load(url10).into(img10);
        Glide.with(getApplicationContext()).load(url11).into(img11);
        Glide.with(getApplicationContext()).load(url12).into(img12);


    };


    public  void open1 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/yDSMdd8hiFg"));
        startActivity(browserIntent);
    }

    public  void open2 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Eh00_rniF8E"));
        startActivity(browserIntent);
    }
    public  void open3 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/M6yAoJJQvGY"));
        startActivity(browserIntent);
    }

    public  void open4 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ay-MtjfYtwo"));
        startActivity(browserIntent);
    }
    public  void open5 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/SU2UmCkiKC8"));
        startActivity(browserIntent);
    }
    public  void open6 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/kMFv3Alg-Gc"));
        startActivity(browserIntent);
    }
    public  void open7 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6kALZikXxLc"));
        startActivity(browserIntent);
    }
    public  void open8 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/pSHjTRCQxIw"));
        startActivity(browserIntent);
    }
    public  void open9 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Z2n58m2i4jg"));
        startActivity(browserIntent);
    }
    public  void open10 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/iu3VptPuikY"));
        startActivity(browserIntent);
    }

    public  void open11 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/NXr4Fw8q60o"));
        startActivity(browserIntent);
    }

    public  void open12 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/NXr4Fw8q60o"));
        startActivity(browserIntent);
    }


}

