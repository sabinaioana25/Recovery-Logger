package com.example.recoverylogger

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.example.recoverylogger.db.AppDatabase

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class DatabaseDriverFactory {
  actual fun createDriver(): SqlDriver {
    return NativeSqliteDriver(AppDatabase.Schema, "notes.db")
  }
}
