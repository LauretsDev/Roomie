package com.roakstudio.roomie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.Normalizer;
import java.util.ArrayList;

public class IntroActivity extends AppCompatActivity {

    Button buttonIntro;
    ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        users = (ArrayList<User>) getIntent().getSerializableExtra("users");
        setUI();
        setActions();
    }

    private void setActions() {
        buttonIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage(users);
            }
        });
    }

    private void setUI() {
        buttonIntro = (Button) findViewById(R.id.btn_Intro);
    }

    public void nextPage(ArrayList<User> users) {
        Intent intent = new Intent(this, FormActivity.class);
        intent.putExtra("users", users);
        startActivity(intent);
    }

}
