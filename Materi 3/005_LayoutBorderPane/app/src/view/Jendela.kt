package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val borderPane = BorderPane()

        val labelTop = Label("Wilayah Atas")
        val labelBottom = Label("Wilayah Bawah")
        val labelLeft = Label("Wilayah Kiri")
        val labelRight = Label("Wilayah Kanan")
        val labelCenter = Label("Wilayah Tengah")

        borderPane.top = labelTop
        borderPane.bottom = labelBottom
        borderPane.left = labelLeft
        borderPane.right = labelRight
        borderPane.center = labelCenter

        val scene = Scene(borderPane, 600.0, 200.0)

        primaryStage.scene = scene

        primaryStage.title = "Layout BorderPane (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}