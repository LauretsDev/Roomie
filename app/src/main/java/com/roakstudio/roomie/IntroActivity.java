package com.roakstudio.roomie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.Normalizer;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, FormActivity.class);

        Button buttonIntro = (Button) findViewById(R.id.btn_Intro);

        startActivity(intent);
    }

}
