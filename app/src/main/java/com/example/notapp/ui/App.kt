package com.example.notapp.ui

import android.app.Application
import com.example.notapp.ui.utils.PreferenceHelper

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        PreferenceHelper.unit(this)
    }
}