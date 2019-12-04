package com.example.daggerapplication.di

import com.example.daggerapplication.model.PaperBundle
import com.example.daggerapplication.model.PrinterRoller
import com.example.daggerapplication.model.Roller
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [PaperModule::class])
class RollerModule {

    @Singleton
    @Provides
    fun providesRoller(paperBundle: PaperBundle) : Roller {
        return PrinterRoller(paperBundle)
    }

}