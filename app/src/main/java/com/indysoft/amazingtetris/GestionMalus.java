package com.indysoft.amazingtetris;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;

public class GestionMalus {

AudioManager audioManager;
    public void GererMalus(Malus malus, Activity activity){
        switch (malus){
            case SONG:
                MediaPlayer media = MediaPlayer.create(activity,R.raw.crie);
                media.start();
                media.start();
                media.start();
                break;
            case ACCELERER_PIECE:
                break;

            default:
                break;
        }
    }


}


