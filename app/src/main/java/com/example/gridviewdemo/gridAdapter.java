package com.example.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class gridAdapter extends BaseAdapter {

    private final String names[];
    private final int images[];
    Context context;

    public gridAdapter(Context context, String[] name, int[] images) {
        this.context = context;
        this.names = name;
        this.images = images;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.single_grid_view_frame, null);

        ImageView img = (ImageView) view.findViewById(R.id.icon_image);
        TextView tv = (TextView) view.findViewById(R.id.text_data);

        img.setImageResource(images[position]);
        tv.setText(names[position]);
        return view;
    }
}
