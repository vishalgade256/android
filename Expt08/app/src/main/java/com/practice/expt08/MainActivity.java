package com.practice.expt08;

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

        mediaPlayer = null;

    }

    public void music(View view){
        int id = view.getId();


            if(id ==R.id.Play)
            {
                if(mediaPlayer==null){
                    mediaPlayer=MediaPlayer.create(this,R.raw.file_example);
                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
//                        stopMusic();
                        mediaPlayer.start();
                    }
                });
                mediaPlayer.start();
            }
            else if(id == R.id.Pause) {
                mediaPlayer.pause();
            }
            else{
                mediaPlayer.stop();
                stopMusic();
            }
    }

    public void stopMusic(){

        mediaPlayer.release();
        mediaPlayer=null;
    }
}