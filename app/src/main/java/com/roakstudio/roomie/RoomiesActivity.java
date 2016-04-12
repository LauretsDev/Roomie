package com.roakstudio.roomie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RoomiesActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomies);

     //   String [] favoriteTvShows = {"Penny Dreadful", "The Walking Dead", "Alice in Borderlands", "Anime Show", "South Park", "DBZ", "XXX", "Attack on Titan", "BTOOOM!", "One Punch Man", "Seikoku"};

        user = (User) getIntent().getSerializableExtra("user");
        String [] roomies = {
                user.getName(),
                user.getName(),
                user.getName(),
                user.getName(),
                user.getName(),
                user.getName(),
                user.getName(),
                user.getName(),
                user.getName(),
                user.getName()
        };
        final ListAdapter adapter = new RoomiesAdapter(this, roomies);

        ListView listView = (ListView) findViewById(R.id.list_roomies);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String contactInfo = "Contact Info\n" +
                        "Name: "+user.getName() + "\n" +
                        "E-mail: " + user.getEmail() + "\n" +
                        "Phone: " + user.getNumber();
                Toast.makeText(RoomiesActivity.this, contactInfo, Toast.LENGTH_SHORT).show();
            }
        });

    }

}