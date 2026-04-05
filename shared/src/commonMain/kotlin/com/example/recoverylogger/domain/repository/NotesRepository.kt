package com.example.recoverylogger.domain.repository

import com.example.recoverylogger.domain.model.Note

interface NotesRepository {
    suspend fun insert(note: Note)
    suspend fun getAllNotes(): List<Note>
    suspend fun deleteSingleNote(note: Note)
    suspend fun clear()
}
