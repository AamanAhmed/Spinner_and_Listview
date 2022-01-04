package com.example.dropdown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner drp;
    TextView setitem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drp = (Spinner) findViewById(R.id.spinner);
        setitem = (TextView) findViewById(R.id.textView);
        ArrayAdapter<CharSequence> mydata = ArrayAdapter.createFromResource(this,R.array.batch, android.R.layout.simple_spinner_dropdown_item);
        mydata.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        drp.setAdapter(mydata);
        drp.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String selectitem = adapterView.getItemAtPosition(i).toString();
        setitem.setText(selectitem);
        Toast.makeText(MainActivity.this, "Batch:" + selectitem, Toast.LENGTH_SHORT).show();
        if (selectitem.equals("1912G1"))
        {
            Intent a = new Intent(MainActivity.this,HomePage.class);
            startActivity(a);
            finish();
        }
        else if(selectitem.equals("1912G2")){
            Intent a = new Intent(MainActivity.this,About.class);
            startActivity(a);
            finish();
        }
        else{

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}