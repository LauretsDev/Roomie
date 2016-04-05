package com.roakstudio.roomie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }

    public void next() {
        Button buttonIntro = (Button) findViewById(R.id.btn_Login);
        Intent intent = new Intent(getApplicationContext(), RoomiesActivity.class);
        startActivity(intent);
    }
}
