package com.cmu.artist.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MailList extends ActionBarActivity {

    EditText nameET;
    EditText emailET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_list);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mail_list, menu);
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
        Intent intent = new Intent(this, InfoPage.class);
        startActivity(intent);
    }

    public void confirm(View view){

        nameET = (EditText) findViewById(R.id.name);
        emailET = (EditText) findViewById(R.id.email);

        String nameS = nameET.getText().toString();
        String emailS = emailET.getText().toString();

        Intent email = new Intent(android.content.Intent.ACTION_SEND);
        email.setType("plain/text");
        String[] emailReciver = new String[]{"safenzhai@me.com"};

        String emailTitle = "Adding to Mailling List";
        String emailContent = "Name:"+nameS+"\nEmail:"+emailS;
        email.putExtra(android.content.Intent.EXTRA_EMAIL, emailReciver);
        email.putExtra(android.content.Intent.EXTRA_SUBJECT, emailTitle);
        email.putExtra(android.content.Intent.EXTRA_TEXT, emailContent);
        startActivity(Intent.createChooser(email, "Choose Email App"));

    }




}
