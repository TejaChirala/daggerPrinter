package com.example.daggerapplication.model

import javax.inject.Inject


class PrinterRoller @Inject constructor(private val paperBundle: PaperBundle): Roller {

    override fun rollPaper() {
        if (paperBundle.isPaperAvailable()) {
            println("oooooo rolling oooooo")
        }
    }

}