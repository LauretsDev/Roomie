package com.roakstudio.roomie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.Normalizer;
import java.util.ArrayList;

public class IntroActivity extends AppCompatActivity {

    Button buttonIntro;
    User user;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        user = (User) getIntent().getSerializableExtra("user");
        setUI();
        setActions();
    }

    private void setActions() {
        buttonIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nextPage(user);
            }
        });
    }

    private void setUI() {

        buttonIntro = (Button) findViewById(R.id.btn_Intro);
    }

    public void nextPage(User user) {
        Intent intent = new Intent(this, FormActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }

}
