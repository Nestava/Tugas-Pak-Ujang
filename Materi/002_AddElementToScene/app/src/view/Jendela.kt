package app.src.view

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.control.Button
import javafx.scene.Scene

class Jendela : Application() {
    override fun start(stage: Stage) {

        val tombol = Button("Klik Disini")

        stage.scene = Scene(tombol, 600.0, 200.0)

        stage.title = "Hello Kotlin GUI JavaFX [Nabhan Alzam Faturohman]"

        stage.show()
    }
}