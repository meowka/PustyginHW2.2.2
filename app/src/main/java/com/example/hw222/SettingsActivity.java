package com.example.hw222;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar myToolbar = findViewById(R.id.toolbarSettings);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle(R.string.myToolbarSettings);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_open_notes){
            Toast.makeText(SettingsActivity.this, R.string.openNotesToast,Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SettingsActivity.this, NotesActivity.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.action_journal){
            Toast.makeText(SettingsActivity.this, R.string.openJournalToast, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SettingsActivity.this, JournalActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
