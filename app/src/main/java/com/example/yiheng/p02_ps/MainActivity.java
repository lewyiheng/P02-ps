package com.example.yiheng.p02_ps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList holiday;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lvHolidays);

        holiday = new ArrayList();
        holiday.add("Secular");
        holiday.add("Ethic and Religion");

        aa = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, holiday);

        listView.setAdapter(aa);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("selected",i+1);
                startActivity(i);
            }
        });
    }
}
