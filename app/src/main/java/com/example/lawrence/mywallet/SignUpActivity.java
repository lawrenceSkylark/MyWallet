package com.example.lawrence.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class SignUpActivity extends AppCompatActivity {
    private EditText inputEmail, inputPassword,inputPhone,inputUsername;
    private Button register ;
    private TextView Loginuser;
    private ProgressBar progressBar;
    private ProgressDialog progressDialog;
    private FirebaseAuth mAuth;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Loginuser = (TextView) findViewById(R.id.Loginuser);
        register = (Button) findViewById(R.id.register);
        inputUsername = (EditText) findViewById(R.id.username);
        inputEmail = (EditText) findViewById(R.id.email);
        inputPhone = (EditText) findViewById(R.id.phone);
        inputPassword = (EditText) findViewById(R.id.password);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        Loginuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SignUpActivity.this,SignInActivity.class));
            }
        });
    }

}
