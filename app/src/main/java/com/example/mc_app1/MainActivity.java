package com.example.mc_app1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clear(View v){
        EditText text1 = (EditText)findViewById(R.id.editTextNumberDecimal2);
        text1.setText("");
        EditText text2 = (EditText)findViewById(R.id.editTextNumberDecimal4);
        text2.setText("0");
    }

    public void convert(View v){
       RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radgrp);
       int selectedId = radioGroup.getCheckedRadioButtonId();
       EditText text1 = (EditText)findViewById(R.id.editTextNumberDecimal2);
       if(text1.getText().toString().matches("")){
           Toast.makeText(this, "You did not enter a value", Toast.LENGTH_SHORT).show();
           return;
       }
       Double num1 = Double.parseDouble(text1.getText().toString());
       if(selectedId == R.id.MtoF){
           num1 = num1 * 3.28084;
       }else{
           num1 = num1 * 0.3048;
       }
       EditText text2 = (EditText)findViewById(R.id.editTextNumberDecimal4);
       text2.setText(num1.toString());
    }
}