package com.example.hw222;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle(R.string.myToolbarTittle);
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
            Toast.makeText(MainActivity.this, R.string.openNotesToast,Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.action_settings){
            Toast.makeText(MainActivity.this, R.string.openSettingsToast, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.action_journal){
            Toast.makeText(MainActivity.this, R.string.openJournalToast, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, JournalActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
