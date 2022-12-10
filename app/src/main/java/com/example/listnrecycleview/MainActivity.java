package com.example.listnrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] arr= {"Chitri is cute","Chitri is very cute", "Chitri is dumb", "But she is cute ","also very smart","kinda combo", "best combo", "legit legit", "trust me", "One in a million", "Very unique", "Very very hot bhi!!!!"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.listView);
        KashishAdapter ad= new KashishAdapter(this, R.layout.my_kashish_layout, arr); //these arguments are handled by constructor in KashishAdapter class
        listView.setAdapter(ad);
    }
}