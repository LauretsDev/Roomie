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

public class RoomiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomies);

        String [] favoriteTvShows = {"Penny Dreadful", "The Walking Dead", "Alice in Borderlands", "Anime Show", "South Park", "DBZ", "XXX", "Attack on Titan", "BTOOOM!", "One Punch Man", "Seikoku"};

        final ListAdapter adapter = new RoomiesAdapter(this, favoriteTvShows);

        ListView listView = (ListView) findViewById(R.id.list_roomies);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String tvShowPicked = "You picked "+ String.valueOf(adapter.getItem(position));
                Toast.makeText(RoomiesActivity.this, tvShowPicked, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        Button buttonRoomies = (Button) findViewById(R.id.btn_Roomies);

        startActivity(intent);
    }

}
