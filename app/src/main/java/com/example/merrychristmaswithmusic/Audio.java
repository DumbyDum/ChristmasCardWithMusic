package com.example.merrychristmaswithmusic;

import android.content.Context;
import android.media.MediaPlayer;

public class Audio {
    private MediaPlayer mPlayer;

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }


    public void play(Context c){
        stop();
        mPlayer = MediaPlayer.create(c, R.raw.song);
        mPlayer.setOnCompletionListener (new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
        mPlayer.start();
    }
}
