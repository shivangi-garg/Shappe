package com.shappe.shappe;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.shappe.shappe.Common.Common;
import com.shappe.shappe.Model.User;

import javax.sql.CommonDataSource;

public class Signin extends AppCompatActivity {

    EditText editUsername,editPassword;
    Button btnSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        editPassword = (MaterialEditText) findViewById(R.id.editPassword);
        editUsername = (MaterialEditText) findViewById(R.id.editUsername);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);

        //Init Firebase

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final ProgressDialog mDialog = new ProgressDialog(Signin.this);
                mDialog.setMessage("Please wait...");
                mDialog.show();


                table_user.addValueEventListener(new ValueEventListener() {



                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        //check if user exist in database
                        if(dataSnapshot.child(editUsername.getText().toString()).exists()) {
                            //Get User Information
                            mDialog.dismiss();
                            User user = dataSnapshot.child(editUsername.getText().toString()).getValue(User.class);
                            if (user.getPassword().equals(editPassword.getText().toString())) {
                                Intent choose = new Intent(Signin.this,Choose.class);
                                Common.currentUser = user;
                                startActivity(choose);
                                finish();
                            } else {
                                Toast.makeText(Signin.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                            }
                        }

                        else
                            {
                                mDialog.dismiss();
                                Toast.makeText(Signin.this, "User does not exist", Toast.LENGTH_SHORT).show();
                            }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
