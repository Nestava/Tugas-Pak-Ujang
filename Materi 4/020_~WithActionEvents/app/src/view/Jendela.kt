package app.src.view

import javafx.application.Application
import javafx.event.ActionEvent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.scene.layout.VBox
import javafx.geometry.Pos
import javafx.stage.Stage


class Jendela : Application() {

    private val statusLabel = Label()

    override fun start(primaryStage: Stage) {
        val button = Button("Klik Saya")

        button.setOnAction {
            handleButtonClick()
        }
        
        val keteranganLabel = Label("Klik tombol di bawah ini:")

        val vbox = VBox(10.0)
        vbox.alignment = Pos.CENTER
        vbox.children.addAll(keteranganLabel, button, statusLabel)

        val scene = Scene(vbox, 600.0, 200.0)

        primaryStage.title = "Action Event (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        primaryStage.scene = scene
        primaryStage.show()
    }

    private fun handleButtonClick() {
        println("Tombol diklik!")
        statusLabel.text = "Tombol diklik!"
    }
}   