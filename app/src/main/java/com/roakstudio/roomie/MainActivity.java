package com.roakstudio.roomie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin;
    EditText editName;
    EditText editEmail;
    EditText editPhone;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
        setActions();
    }

    private void setUI() {
        buttonLogin = (Button) findViewById(R.id.btn_Main);
        editName = (EditText) findViewById(R.id.edit_main_Name);
        editEmail = (EditText) findViewById(R.id.edit_main_Email);
        editPhone = (EditText) findViewById(R.id.edit_main_Number);
    }

    private void setActions() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String email = editEmail.getText().toString();
                int phone = Integer.parseInt(editPhone.getText().toString());
                user = new User(name, email, phone);
                nextPage(user);

            }
        });
    }

    public void nextPage(User user) {
        Intent intent = new Intent(this, IntroActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }

}
