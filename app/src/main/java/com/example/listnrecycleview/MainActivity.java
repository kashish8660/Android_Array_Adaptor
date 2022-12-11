package com.example.listnrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] arr= {"Chitri is cute","Chitri is very cute", "Chitri is dumb", "But she is cute ","also very smart","kinda combo", "best combo", "legit legit", "trust me", "One in a million", "Very unique", "Very very hot bhi!!!!"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.listView);
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        KashishAdapter ad= new KashishAdapter(this, R.layout.my_kashish_layout, arr); //these arguments are handled by constructor in KashishAdapter class
        listView.setAdapter(ad);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "you clicked on "+ i, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}