package com.roakstudio.roomie;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Diego Laurentino on 06/04/2016.
 */
public class RoomiesAdapter extends ArrayAdapter<User> {

    public RoomiesAdapter(Activity activity, int textViewResourceId, ArrayList<User> user) {
        super(activity, textViewResourceId, user);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());

        View view = layoutInflater.inflate(R.layout.roomies_row_layout, parent, false);

        User user = getItem(position);
        TextView textView = (TextView) view.findViewById(R.id.txt_RoomiesRowTextTemplate);

        textView.setText(user.getName());

        ImageView imageView = (ImageView) view.findViewById(R.id.img_RoomiesRowImageTemplate);

        imageView.setImageResource(R.drawable.smiley_face);

        return view;

    }


}
