package com.example.demo.repository;

import com.example.demo.entities.Note;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NoteRepository {
    private List<Note> notes = new ArrayList<>();

    public Note createNote(Note note) {
        notes.add(note);
        return note;
    }

    public List<Note> getAllNotes() {return notes;}

    public void deleteNoteById(long id) {
        List <Note> newNotes = new ArrayList<>();
        for (Note note: notes) {
            if (note.getId() != id) {
                newNotes.add(note);
            }
        }
        notes = newNotes;
    }
    public Note updateNote(Note newNote) {
        boolean isId = false;
        for (Note note: notes) {
            if (note.getId() == newNote.getId()) {
                note.setTitle(newNote.getTitle());
                note.setContent(newNote.getContent());
                isId = true;
            }
        }
        if (isId == false) {
            System.out.println("Нотатки з вказаним id не існує");
        }
        return newNote;
    }

    public Note getNoteById(long id) {
        Note nNote = null;
        for (Note note: notes) {
            if (note.getId() == id) {
                nNote = note;
            }
        }
        if (nNote == null) {
            System.out.println("Нотатки з вказаним id не існує");
        }
        return nNote;
    }
}
