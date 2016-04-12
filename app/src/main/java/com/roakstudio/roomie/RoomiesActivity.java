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
    ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomies);

        users = (ArrayList<User>) getIntent().getSerializableExtra("user");

       // final ListAdapter adapter = new RoomiesAdapter(this, users);

        final ArrayAdapter<User> adapter = new ArrayAdapter<User>(this,
                android.R.layout.simple_list_item_1, users);

        ListView listView = (ListView) findViewById(R.id.list_roomies);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String contactInfo = "Contact Info\n " +
                        "Name: "+adapter.getItem(position).getName()+
                        "\nE-mail: "+adapter.getItem(position).getEmail()+
                        "\nPhone: "+String.valueOf(adapter.getItem(position).getNumber());
                Toast.makeText(RoomiesActivity.this, contactInfo, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
