package com.chema.noteapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.chema.noteapp.model.Note;
import com.chema.noteapp.model.Notes;

public class NotesListActivity extends AppCompatActivity {

    Notes listOfNotes = new Notes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);

        NoteListFragment noteListFragment = (NoteListFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_activity_notes_list);

        for (int i = 0; i < 20; i = i + 2) {

            Note note = new Note("Note " + i);
            note.setText("Noticia súper hiper mega importante " + i);
            listOfNotes.add(note);
        }
            NoteAdapter adapter = new NoteAdapter(listOfNotes ,this);
        noteListFragment.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_main_action_add_note) {

            Intent i= new Intent(NotesListActivity.this, NoteDetailActivity.class);
            startActivity(i);
            return true;
            
        }
        return super.onOptionsItemSelected(item);
    }
}
