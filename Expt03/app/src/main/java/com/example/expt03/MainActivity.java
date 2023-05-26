package com.example.expt03;

import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button signin;
    private SQLiteDatabase db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        signin = findViewById(R.id.signin);

        db = openOrCreateDatabase("mydb.db",MODE_PRIVATE,null);

        db.execSQL("CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, password TEXT)");

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();
            }
        });
    }
}