package app.src.view

import javafx.application.Application
import javafx.geometry.Pos
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.input.KeyEvent
import javafx.scene.layout.VBox
import javafx.stage.Stage


class Jendela : Application() {

    private val statusLabel = Label()

    override fun start(primaryStage: Stage) {
        val textField = TextField()

        textField.setOnKeyPressed { event -> handleKeyPressed(event)
        }

        textField.setOnKeyReleased { event -> handleKeyReleased(event)
        }
        
        val keteranganLabel = Label("Ketik Sesuatu Di Sini")

        val vbox = VBox(10.0)
        vbox.alignment = Pos.CENTER
        vbox.children.addAll(keteranganLabel, textField, statusLabel)
        vbox.padding = Insets(10.0)

        val scene = Scene(vbox, 600.0, 200.0)

        primaryStage.title = "Keyboard Events (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        primaryStage.scene = scene
        primaryStage.show()
    }

    private fun handleKeyPressed(event: KeyEvent) {
        println("Tombol $(event.code) ditekan!")
        statusLabel.text = "Tombol $(event.code) ditekan!"
    }

    private fun handleKeyReleased(event: KeyEvent) {
        println("Tombol $(event.code) dilepas!")
        statusLabel.text = "Tombol $(event.code) dilepas!"
    }
}