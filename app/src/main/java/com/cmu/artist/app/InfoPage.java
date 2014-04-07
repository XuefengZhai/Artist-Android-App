package com.cmu.artist.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class InfoPage extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.info_page, menu);
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

    public void website(View view){
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://channingtatumunwrapped.com")));
    }

    public void twitter(View view){
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://twitter.com/channingtatum")));
    }

    public void facebook(View view){
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.facebook.com/channingtatum")));
    }
    public void instagram(View view){
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://instagram.com/channingtatum")));
    }

    public void song(View view){
        Intent intent = new Intent(this, SongPlayer.class);
        startActivity(intent);
    }

    public void video(View view){
        Intent intent = new Intent(this, VideoPlayer.class);
        startActivity(intent);
    }

    public void wallpaper(View view){
        Intent intent = new Intent(this, WallPaper.class);
        startActivity(intent);
    }

    public void maillist(View view){
        Intent intent = new Intent(this, MailList.class);
        startActivity(intent);
    }



}
