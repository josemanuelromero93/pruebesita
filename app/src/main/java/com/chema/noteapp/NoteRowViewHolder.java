package com.chema.noteapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.chema.noteapp.model.Note;

public class NoteRowViewHolder extends RecyclerView.ViewHolder{

    TextView noteTitleText;
    TextView noteTextText;

    private Note note;

    public NoteRowViewHolder(View itemView) {
        super(itemView);

        noteTitleText = (TextView) itemView.findViewById(R.id.row_note_note_title);
        noteTextText = (TextView) itemView.findViewById(R.id.row_note_note_text);
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
        noteTitleText.setText(note.getText());
        noteTextText.setText(note.getText());
    }
}
