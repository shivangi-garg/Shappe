

package com.shappe.shappe;

        import android.content.Intent;
        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.Toast;

        import com.bumptech.glide.Glide;

public class fw1 extends AppCompatActivity {

    private ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw1);

        i1=(ImageView)findViewById(R.id.i1);



        String url1="https://firebasestorage.googleapis.com/v0/b/shappe-1f40c.appspot.com/o/1spider.jpg?alt=media&token=c34cb95a-f098-4f3e-8011-fb2a96943bd0";




        Glide.with(getApplicationContext()).load(url1).into(i1);


    };


    public  void openi1 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fKBeHALPsSU"));
        startActivity(browserIntent);
    }


}

