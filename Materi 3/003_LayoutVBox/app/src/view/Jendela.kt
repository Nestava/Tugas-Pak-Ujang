package app.src.view

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val vBox = VBox()

        vBox.spacing = 10.0

        vBox.padding = Insets(10.0)

        val label = Label("Contoh VBox")
        val button1 = Button("Tombol 1")
        val button2 = Button("Tombol 2")

        vBox.children.addAll(label, button1, button2)

        val scene = Scene(vBox, 600.0, 200.0)

        primaryStage.scene = scene

        primaryStage.title = "Layout VBox (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}