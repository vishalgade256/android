package com.practice.expt04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    TextView name;
    TextView gender;
    TextView subject;
    TextView qual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Bundle extras = getIntent().getExtras();

        name = findViewById(R.id.name);
        gender = findViewById(R.id.gender);
        subject = findViewById(R.id.subject);
        qual = findViewById(R.id.qual);

        name.setText(extras.getString("Name"));
        gender.setText(extras.getString("Gender"));
        subject.setText(extras.getString("sub"));
        qual.setText("No Qualification");
    }
}