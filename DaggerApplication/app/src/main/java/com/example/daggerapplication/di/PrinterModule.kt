package com.example.daggerapplication.di

import com.example.daggerapplication.model.*
import dagger.Lazy
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [RollerModule::class])
open class PrinterModule {

    @Singleton
    @Provides
    open fun providePrinter(paperBundle: PaperBundle, roller: Roller) : Printer {
        return Printer(Lazy {  paperBundle } , roller)
    }

}

