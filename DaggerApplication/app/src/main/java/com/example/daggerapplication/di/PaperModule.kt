package com.example.daggerapplication.di

import com.example.daggerapplication.model.PaperBundle
import com.example.daggerapplication.model.PaperTray
import dagger.Binds
import dagger.Module

@Module
abstract class PaperModule {

    @Binds
    abstract fun providesPaperTray(paperTray: PaperTray) : PaperBundle

}