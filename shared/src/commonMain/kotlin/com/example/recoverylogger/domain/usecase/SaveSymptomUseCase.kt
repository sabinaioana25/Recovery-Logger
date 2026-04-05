package com.example.recoverylogger.domain.usecase

import com.example.recoverylogger.domain.model.Symptom
import com.example.recoverylogger.domain.repository.SymptomRepository

class SaveSymptomUseCase(private val repository: SymptomRepository) {
  suspend operator fun invoke(symptom: Symptom) {
    repository.saveSymptom(symptom)
  }
}
