 package com.practice.test9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

 public class MainActivity extends AppCompatActivity {
    EditText editText;
    String FILE_NAME="sample.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
    }

    public void save(View view){
        String text=editText.getText().toString();
        FileOutputStream fos=null;
        try {
            fos=openFileOutput("FILE_NAME",MODE_PRIVATE);
            fos.write(text.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void show(View view){
        String txt;
        FileInputStream fis=null;
        try {
            fis=openFileInput("FILE_NAME");
            InputStreamReader inputStreamReader=new InputStreamReader(fis);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder=new StringBuilder();

            while((txt=bufferedReader.readLine())!=null){
                stringBuilder.append(txt);
            }
            editText.setText(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}