package com.roakstudio.roomie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Diego Laurentino on 06/04/2016.
 */
public class RoomiesAdapter extends ArrayAdapter<String> {

    public RoomiesAdapter(Context context, String[] resource) {
        super(context, R.layout.roomies_row_layout,resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());

        View view = layoutInflater.inflate(R.layout.roomies_row_layout, parent, false);

        String tvShow = getItem(position);

        TextView textView = (TextView) view.findViewById(R.id.txt_RoomiesRowTextTemplate);

        textView.setText(tvShow);

        ImageView imageView = (ImageView) view.findViewById(R.id.img_RoomiesRowImageTemplate);

        imageView.setImageResource(R.drawable.smiley_face);

        return view;

    }


}
