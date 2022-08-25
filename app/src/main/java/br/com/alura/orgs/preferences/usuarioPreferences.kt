package br.com.alura.orgs.preferences

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore



val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "sessa_usuario")

val usuarioLogadoPreferences = stringPreferencesKey("usuarioLogado")


