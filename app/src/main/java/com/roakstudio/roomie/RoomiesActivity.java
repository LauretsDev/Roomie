package com.roakstudio.roomie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RoomiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomies);


    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        Button buttonRoomies = (Button) findViewById(R.id.btn_Roomies);

        startActivity(intent);
    }

}
