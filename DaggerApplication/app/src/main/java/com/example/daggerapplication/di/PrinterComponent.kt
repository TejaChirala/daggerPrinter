package com.example.daggerapplication.di

import com.example.daggerapplication.model.Printer
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [PrinterModule::class])
interface PrinterComponent {

    fun printer() : Printer

}