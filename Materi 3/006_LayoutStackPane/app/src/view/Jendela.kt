package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val stackPane = StackPane()

        val label = Label("Ini adalah StackPane")
        
        val button = Button("Tombol di Atas")

        stackPane.children.addAll(label, button)

        val scene = Scene(stackPane, 600.0, 200.0)

        primaryStage.scene = scene

        primaryStage.title = "Layout StackPane (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}