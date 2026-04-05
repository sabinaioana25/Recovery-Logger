package com.example.recoverylogger.domain.usecase

import com.example.recoverylogger.domain.model.Note
import com.example.recoverylogger.domain.repository.NoteRepositoryImpl

class NoteUseCase(private val repositoryImpl: NoteRepositoryImpl) {
  suspend operator fun invoke(note: Note) = repositoryImpl.insert(note)
}
