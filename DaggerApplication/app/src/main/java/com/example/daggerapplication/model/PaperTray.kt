package com.example.daggerapplication.model

import javax.inject.Inject

class PaperTray @Inject constructor(): PaperBundle {

    private var paperCount: Int = 10

    override fun getPaper() {
        if (isPaperAvailable()) {
            println("Getting paper")
            paperCount--
        }

    }

    override fun isPaperAvailable() : Boolean{
        return paperCount > 0
    }

}