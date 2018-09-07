package com.shappe.shappe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FullWorkout extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b17, b18, b19, b20, b22, b30, b31, b33, b34, b35, b36, b37, b40, b41, b42, b44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_workout);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b17 = (Button) findViewById(R.id.b17);
        b18 = (Button) findViewById(R.id.b18);
        b19 = (Button) findViewById(R.id.b19);
        b20 = (Button) findViewById(R.id.b20);
        b22 = (Button) findViewById(R.id.b22);
        b30 = (Button) findViewById(R.id.b30);
        b31 = (Button) findViewById(R.id.b31);
        b33 = (Button) findViewById(R.id.b33);
        b34 = (Button) findViewById(R.id.b34);
        b35 = (Button) findViewById(R.id.b35);
        b36 = (Button) findViewById(R.id.b36);
        b37 = (Button) findViewById(R.id.b37);
        b40 = (Button) findViewById(R.id.b40);
        b41 = (Button) findViewById(R.id.b41);
        b42 = (Button) findViewById(R.id.b42);
        b44 = (Button) findViewById(R.id.b44);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(FullWorkout.this, fw1.class);
                startActivity(a);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b = new Intent(FullWorkout.this, fw2.class);
                startActivity(b);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent c = new Intent(FullWorkout.this, fw3.class);
                startActivity(c);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent d = new Intent(FullWorkout.this, fw4.class);
                startActivity(d);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent e = new Intent(FullWorkout.this, fw5.class);
                startActivity(e);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent f = new Intent(FullWorkout.this, fw6.class);
                startActivity(f);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent g = new Intent(FullWorkout.this, fw7.class);
                startActivity(g);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent h = new Intent(FullWorkout.this, fw8.class);
                startActivity(h);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(FullWorkout.this, fw9.class);
                startActivity(i);

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j = new Intent(FullWorkout.this, fw10.class);
                startActivity(j);

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent k = new Intent(FullWorkout.this, fw11.class);
                startActivity(k);

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent l = new Intent(FullWorkout.this, fw12.class);
                startActivity(l);

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent m = new Intent(FullWorkout.this, fw17.class);
                startActivity(m);

            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent n = new Intent(FullWorkout.this, fw18.class);
                startActivity(n);

            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent o = new Intent(FullWorkout.this, fw19.class);
                startActivity(o);

            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent p = new Intent(FullWorkout.this, fw20.class);
                startActivity(p);

            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent q = new Intent(FullWorkout.this, fw22.class);
                startActivity(q);

            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent r = new Intent(FullWorkout.this, fw30.class);
                startActivity(r);

            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent s = new Intent(FullWorkout.this, fw31.class);
                startActivity(s);

            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent t = new Intent(FullWorkout.this, fw33.class);
                startActivity(t);

            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent u = new Intent(FullWorkout.this, fw34.class);
                startActivity(u);

            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(FullWorkout.this, fw35.class);
                startActivity(v);

            }
        });
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent w = new Intent(FullWorkout.this, fw36.class);
                startActivity(w);

            }
        });
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent x = new Intent(FullWorkout.this, fw37.class);
                startActivity(x);

            }
        });
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent y = new Intent(FullWorkout.this, fw40.class);
                startActivity(y);

            }
        });
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent z = new Intent(FullWorkout.this, fw41.class);
                startActivity(z);

            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ab = new Intent(FullWorkout.this, fw42.class);
                startActivity(ab);

            }
        });
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cd = new Intent(FullWorkout.this, fw44.class);
                startActivity(cd);

            }
        });
    }
}

