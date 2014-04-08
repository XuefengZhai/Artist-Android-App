package com.cmu.artist.app;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;


public class SongPlayer extends ActionBarActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_player);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.song_player, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void back(View view){
        if (mediaPlayer !=null){

            mediaPlayer.stop();

        }

        Intent intent = new Intent(this, InfoPage.class);
        startActivity(intent);
    }

    public void song1(View view) throws IOException {

        if (mediaPlayer !=null){

            mediaPlayer.stop();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.mp3a);
        if (mediaPlayer !=null){

            mediaPlayer.stop();

        }
        mediaPlayer.prepare();
        mediaPlayer.start();

        Context context = getApplicationContext();
        CharSequence text = "First song is playing";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void song2(View view) throws IOException {


        if (mediaPlayer !=null){

            mediaPlayer.stop();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.mp3b);
        if (mediaPlayer !=null){

            mediaPlayer.stop();

        }
        mediaPlayer.prepare();
        mediaPlayer.start();


        Context context = getApplicationContext();
        CharSequence text = "Second song is playing";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void pause(View view){

        if(mediaPlayer.isPlaying()) {
            mediaPlayer.pause();


            Context context = getApplicationContext();
            CharSequence text = "Music pause";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

    }

    public void stop(View view){
        if(mediaPlayer.isPlaying()) {
            mediaPlayer.stop();


            Context context = getApplicationContext();
            CharSequence text = "Music stop";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

    }

    public void resume(View view){
        mediaPlayer.start();

        Context context = getApplicationContext();
        CharSequence text = "Song resume";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }







}
