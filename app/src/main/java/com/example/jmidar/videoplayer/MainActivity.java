package com.example.jmidar.videoplayer;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VideoView videoView = findViewById(R.id.videoView);

        //String fileName = "video"; //this is video name
        //String filePlace = "android.resource://"+getPackageName()+"/raw/"+fileName; //video path location
        //videoView.setVideoURI(Uri.parse(filePlace)); // define the videoview

        videoView.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"); //online video link

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true); // repeat video
            }
        });

        videoView.setMediaController(new MediaController(this)); //video controls

        videoView.start(); //videoview start
    }
}
