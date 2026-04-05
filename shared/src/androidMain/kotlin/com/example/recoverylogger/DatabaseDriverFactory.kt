package com.example.recoverylogger

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.example.recoverylogger.db.AppDatabase

@Suppress(names = ["EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING"])
actual class DatabaseDriverFactory(private val context: Context) {
  actual fun createDriver(): SqlDriver {
    return AndroidSqliteDriver(
      AppDatabase.Schema,
      context,
      "notes.db"
    )
  }
}
