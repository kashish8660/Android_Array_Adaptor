package com.example.listnrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class KashishAdapter extends ArrayAdapter<String> {//mtlb ArrayAdapter hi banana hai hume, bas thoda modify karke

private String[] arr;
    public KashishAdapter(@NonNull Context context, int resource, @NonNull String[] arr) { //Constructor suggested by Android Studio which takes String array as input
        super(context, resource, arr); //calls the constructor of ArrayAdapter Class
        this.arr= arr; //'this.arr' String array is used below while setting text in convertView view. It is defined above.
    }
//    @Nullable
//    @Override
//    public String getItem(int position) {
//        return arr[position];
//    }
//    @NonNull
//    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) //getView function is never called by any object of 'KashishAdaptor'
    {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_kashish_layout, parent, false);//LayoutInflater tumhe 'findViewById' use karne deta hai layout pe
        TextView t = convertView.findViewById(R.id.textView1); //textView1 is id of 'textview' present in 'my_kashish_layout' layout defined by me
        t.setText(arr[position]); //'position' is position of textView in 'my_kashish_layout'
        return convertView; //Layout has been converted into a View and can be used in ListView
    }
}
