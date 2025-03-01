package app.src.view

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.HBox
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val hBox = HBox()

        hBox.spacing = 10.0

        hBox.padding = Insets(10.0)

        val label = Label("Contoh HBox")
        val button1 = Button("Tombol 1")
        val button2 = Button("Tombol 2")

        hBox.children.addAll(label, button1, button2)

        val scene = Scene(hBox, 600.0, 200.0)

        primaryStage.scene = scene

        primaryStage.title = "Layout HBox (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}