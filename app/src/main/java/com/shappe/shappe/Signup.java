package com.shappe.shappe;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.shappe.shappe.Model.User;

public class Signup extends AppCompatActivity {


    MaterialEditText editUsername,editAge,editGender,editPassword;
    Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editAge = (MaterialEditText) findViewById(R.id.editAge);
        editGender = (MaterialEditText) findViewById(R.id.editGender);
        editPassword = (MaterialEditText) findViewById(R.id.editPassword);
        editUsername = (MaterialEditText) findViewById(R.id.editUsername);

        btnSignUp = (Button) findViewById(R.id.btnSignUp);



        //Init Firebase

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final ProgressDialog mDialog = new ProgressDialog(Signup.this);
                mDialog.setMessage("Please wait...");
                mDialog.show();

                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        //check if username exists

                        if (dataSnapshot.child(editUsername.getText().toString()).exists()) {
                            mDialog.dismiss();
                            Toast.makeText(Signup.this, "Username already exists", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            mDialog.dismiss();
                            User user = new User(editPassword.getText().toString(),editAge.getText().toString(),editGender.getText().toString());
                            table_user.child(editUsername.getText().toString()).setValue(user);
                            Toast.makeText(Signup.this, "Sign Up Successful", Toast.LENGTH_SHORT).show();
                            finish();

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
