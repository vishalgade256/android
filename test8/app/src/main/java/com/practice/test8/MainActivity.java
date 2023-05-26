package com.practice.test8;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=null;
    }
    public void music(View view){
        int id=view.getId();

        if(id==R.id.P){
            if(mediaPlayer==null){
                mediaPlayer=MediaPlayer.create(this,R.raw.file_example);
            }
            mediaPlayer.start();;
        }
        else if(id==R.id.Pa){
            mediaPlayer.pause();
        }
        else{
            mediaPlayer.stop();
        }
    }
}