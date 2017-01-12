package com.chema.noteapp.model;

import java.util.List;

public interface Enumerable<Note> {

    int count();
    void add(Note element);
    void remove(int index);
    void update(int index, Note newElement);
    List<Note> getAll();

}
