package com.indysoft.amazingtetris;

import android.media.MediaPlayer;
import android.widget.Toast;

import java.util.Random;

public class GestionMalus {

    public void GererMalus(Malus malus, GameActivity activity){
        switch (malus){
            case SONG:
                Toast.makeText(activity.getApplicationContext(), "MALUS SONG, let's dance ",Toast.LENGTH_LONG).show();
                MediaPlayer media = MediaPlayer.create(activity,R.raw.crie);
                media.start();
                break;
            case ACCELERER_PIECE:
                Toast.makeText(activity, "MALUS SPEED !!!! ",Toast.LENGTH_LONG).show();
                activity.changeToSpeedState();
                break;
            case INVERSER_SENS:
                Toast.makeText(activity, "MALUS INVERSE !!",Toast.LENGTH_LONG ).show();
                activity.inverse_direction();
                break;
            case DISAPPEAR_GRID:
                //activity.disappear_grid();
            default:
                break;
        }
    }

    public void malusRandom(GameActivity activity){
        Random r = new Random();
        int valeur = 0 + r.nextInt(Malus.values().length - 0);
        this.GererMalus(Malus.values()[valeur],activity);
    }


}


