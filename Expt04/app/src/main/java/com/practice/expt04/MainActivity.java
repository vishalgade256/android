package com.practice.expt04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText cPassword;
    Spinner subject;
    RadioGroup gender;
    CheckBox check1,check2,check3;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, ShowActivity.class);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password1);
        cPassword = findViewById(R.id.password2);

        ArrayList<String> subjects =new ArrayList<>();
        subjects.add("Mathematics");
        subjects.add("Science");
        subjects.add("History");

        ArrayAdapter<String> subList = new ArrayAdapter<>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,subjects);
        subject = findViewById(R.id.spinner);
        subject.setAdapter(subList);

        subject.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                intent.putExtra("sub",subjects.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        gender = findViewById(R.id.radioGroup);

        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int selId = gender.getCheckedRadioButtonId();
                RadioButton selGender = findViewById(selId);
                intent.putExtra("Gender",selGender.getText().toString());
            }
        });

        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = password.getText().toString();
                String cPass = cPassword.getText().toString();
                if(pass.equals(cPass)){
                    intent.putExtra("Name",username.getText().toString());
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"Password Doesn't Match",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}