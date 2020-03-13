package com.indysoft.amazingtetris;

import android.media.MediaPlayer;

public class GestionMalus {

    public void GererMalus(Malus malus, GameActivity activity){
        switch (malus){
            case SONG:
                MediaPlayer media = MediaPlayer.create(activity,R.raw.crie);
                media.start();
                break;
            case ACCELERER_PIECE:
                activity.changeToSpeedState();
                break;
            case INVERSER_SENS:
                activity.inverse_direction();
                break;
            default:
                break;
        }
    }


}


