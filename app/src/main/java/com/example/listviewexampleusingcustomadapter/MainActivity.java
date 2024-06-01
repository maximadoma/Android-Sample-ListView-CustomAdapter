package com.example.listviewexampleusingcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    String countryList[] = {
            "Philippines",
            "India",
            "Russia",
            "USA",
            "Japan",
            "New Zealand",
            "Hungary",
            "Denmark",
            "Qatar",
            "Finland",
            "Yemen",
            "Ireland",
            "Portugal",
            "Italy",
            "Argentina",
            "France",
            "Brazil"
    };
    int flags[] = {
            R.drawable.philippines,
            R.drawable.india,
            R.drawable.russia,
            R.drawable.united_states,
            R.drawable.japan,
            R.drawable.new_zealand,
            R.drawable.hungary,
            R.drawable.denmark,
            R.drawable.qatar,
            R.drawable.finland,
            R.drawable.yemen,
            R.drawable.ireland,
            R.drawable.portugal,
            R.drawable.italy,
            R.drawable.argentina,
            R.drawable.france,
            R.drawable.brazil
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView data_list = (ListView)findViewById(R.id.DataList);
        customAdapter base = new customAdapter(countryList, flags, this);
        data_list.setAdapter(base);

    }
}