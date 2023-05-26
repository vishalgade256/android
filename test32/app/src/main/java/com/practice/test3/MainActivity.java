package com.practice.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,pass;
    Button button,button2;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name= findViewById(R.id.name);
        pass = findViewById(R.id.pass);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);

        databaseHelper=new DatabaseHelper(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String username= name.getText().toString();
                    String password = pass.getText().toString();
                    databaseHelper.addUser(username, password);
                    Toast.makeText(MainActivity.this,"login successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}