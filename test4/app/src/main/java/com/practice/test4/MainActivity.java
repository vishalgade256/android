package com.practice.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText pass;
TextView username;
RadioGroup radioGroup;
Button button;
Spinner spinner;
CheckBox checkBox,checkBox2;
Spinner spinner;
RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=new Intent(MainActivity.this,showActivity.class);
        username=findViewById(R.id.username);
        pass=findViewById(R.id.pass);

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("item1");
        arrayList.add("item2");

        ArrayAdapter<String> list=new ArrayAdapter<>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arrayList);
        spinner=findViewById(R.id.spinner);
        spinner.setAdapter(list);

        radioGroup=findViewById(R.id.radioGroup);
        button=findViewById(R.id.button);



    }
}