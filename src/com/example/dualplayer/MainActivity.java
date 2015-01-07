package com.example.dualplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {
	MediaPlayer mp,mp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
        	
        	mp = MediaPlayer.create(this,R.drawable.abc);
        	mp.start();
        	mp.setVolume(0, 1);
        	mp1 = MediaPlayer.create(this,R.drawable.xyz);
        	mp1.start();
        	mp1.setVolume(1, 0);
        }
        catch(Exception e)
        {
        	Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
