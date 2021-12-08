package com.example.tugas5_1918119;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    MediaPlayer player;

    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context, "Time is Money.", Toast.LENGTH_LONG).show();
        player = MediaPlayer.create(context, R.raw.warning);
        player.start();
    }
}
