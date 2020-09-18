package com.example.lawrence.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SignInActivity extends AppCompatActivity {

    private EditText inputEmail, inputPassword;
    private FirebaseAuth mAuth;
    private ProgressBar progressBarlogin;
    private Button btnLogin, btnReset;
    TextView newUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        inputEmail = (EditText) findViewById(R.id.email);
        inputPassword = (EditText) findViewById(R.id.password);
        progressBarlogin = (ProgressBar) findViewById(R.id.progressBarlogin);
        newUser = (TextView) findViewById(R.id.newUser);
        btnLogin = (Button) findViewById(R.id.loginaccount);
        btnReset = (Button) findViewById(R.id.btn_reset_password);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SignInActivity.this,OTPActivity.class));
            }
        });

        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SignInActivity.this,OTPActivity.class));
            }
        });
    }
}
