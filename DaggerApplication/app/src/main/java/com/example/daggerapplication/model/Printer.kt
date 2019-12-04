package com.example.daggerapplication.model

import dagger.Lazy
import javax.inject.Inject

class Printer @Inject constructor(_paperBundle: Lazy<PaperBundle>, private val roller: Roller) {

    private val paperBundle by lazy {  _paperBundle.get()  }

    fun print() {

        paperBundle.getPaper()
        println("Printing.....")
        roller.rollPaper()

    }

}