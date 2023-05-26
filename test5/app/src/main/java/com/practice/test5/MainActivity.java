    package com.practice.test5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.view.ContextMenu;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.textView);
        registerForContextMenu(textView);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.popup,menu);

    }


    public void popup(View view){
        PopupMenu popupMenu=new PopupMenu(MainActivity.this,view);
        popupMenu.inflate(R.menu.popup);
        popupMenu.show();
    }
}