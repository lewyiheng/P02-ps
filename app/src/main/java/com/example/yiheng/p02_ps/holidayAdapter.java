package com.example.yiheng.p02_ps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class holidayAdapter {

    private ArrayList holidays;
    private Context context;
    private TextView tvTitle, tvDate;
    private ImageView ivHoliday;

    public holidayAdapter(Context context, int resource, ArrayList<holiday>objects ){
        super(context,resource,objects);
        holidays = objects;

        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvTitle = rowView.findViewById(R.id.tvTitle);

        ivHoliday = rowView.findViewById(R.id.ivHoliday);

        tvDate = rowView.findViewById(R.id.tvDate);

        holiday  current = holidays.get(position);

        tvTitle.setText(current.getTitle());

        tvDate.setText(current.getDate());

        ivHoliday.setImageResource(current.getImage());


        return rowView;
    }

}
