package com.chema.noteapp.model;

/**
 * Created by usuario on 11/01/2017.
 */

public class Note {

    private String title;
    private String text;
    private long color;

    public Note (String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }
}
