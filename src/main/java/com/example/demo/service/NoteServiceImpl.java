package com.example.demo.service;

import com.example.demo.entities.Note;
import com.example.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteRepository noteRepository;

    @Override
    public List<Note> listAll() {
        return noteRepository.getAllNotes();
    }

    @Override
    public Note add(Note note) {
        return noteRepository.createNote(note);
    }

    @Override
    public void deleteById(long id) {
        noteRepository.deleteNoteById(id);
    }

    @Override
    public void update(Note note) {
        noteRepository.updateNote(note);
    }

    @Override
    public Note getById(long id) {
        return noteRepository.getNoteById(id);
    }
}
