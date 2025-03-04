package app.src.view

import javafx.application.Application
import javafx.stage.Stage
import javafx.stage.WindowEvent


class Jendela : Application() {

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Window   Event (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        
        primaryStage.setOnCloseRequest {
            handleCloseRequest()
        }

        primaryStage.show()
    }

    private fun handleCloseRequest() {
        println("Jendela stage telah ditutup!")
    }
}   