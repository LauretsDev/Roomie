package com.roakstudio.roomie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, RoomiesActivity.class);

        Button buttonForm = (Button) findViewById(R.id.btn_Form);

        startActivity(intent);
    }

}
