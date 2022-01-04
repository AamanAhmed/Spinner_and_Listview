package com.example.dropdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView  mylist;
    String[] colors =  {"Red","green","Blue","Pink","Light Blue","Dark Blue"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        mylist = (ListView) findViewById(R.id.mylist);
        ArrayAdapter<String> humaradata = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,colors);
        mylist.setAdapter(humaradata);
        mylist.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(HomePage.this,item, Toast.LENGTH_SHORT).show();
    }
}