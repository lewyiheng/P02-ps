package com.example.yiheng.p02_ps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    TextView title;
    ListView listView1;
    ArrayList holidays1;
    ArrayAdapter aa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        title = findViewById(R.id.textView);
        listView1 = findViewById(R.id.lvHolidays1);

         Intent i = getIntent();
        int selected = i.getIntExtra("selected", 00);
        holidays1 = new ArrayList();

        if (selected == 1) {
            title.setText("Secular");
            holidays1.add(new holiday("New Year's Day", "1 Jan 2017", R.drawable.newyear));
            holidays1.add(new holiday("Labour Day", "1 May 2017", R.drawable.labour));

            aa2 = new holidayAdapter(this, R.layout.row, holidays1);
            listView1.setAdapter(aa2);

            listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast toast = Toast.makeText(Main2Activity.this, holidays1.get(i).getTitle() + " Date: " + holidays1.get(i).getDate(), Toast.LENGTH_SHORT);
                    toast.show();

                }
            });
        } else {
            title.setText("Ethnic & Religion");
            holidays1.add(new holiday("Chinese New Year's", "28-29 Jan 2017", R.drawable.cny));

            aa2 = new holidayAdapter(this, R.layout.row, holidays1);
            listView1.setAdapter(aa2);

            listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast toast = Toast.makeText(Main2Activity.this, holidays1.get(i).getTitle() + " Date: " + holidays1.get(i).getDate(), Toast.LENGTH_SHORT);
                    toast.show();
                }
            });
        }
    }
}




