package com.example.daggerapplication.application

import android.app.Application
import com.example.daggerapplication.di.PrinterModule
import com.example.daggerapplication.di.DaggerPrinterComponent

class ApplicationClass: Application() {


    override fun onCreate() {
        super.onCreate()
        val printerComponent = DaggerPrinterComponent.builder()
            .printerModule(PrinterModule())
            .build()
        printerComponent.printer().print()


    }

}