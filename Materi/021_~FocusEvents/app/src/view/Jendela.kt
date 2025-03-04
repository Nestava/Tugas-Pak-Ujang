package app.src.view

import javafx.application.Application
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import javafx.stage.Stage


class Jendela : Application() {

    val statusLabel = Label()

    override fun start(primaryStage: Stage) {
        val textField1 = TextField("Ini adalah Textfield 1")
        val textField2 = TextField("Ini adalah Textfield 2")

        textField1.focusedProperty().addListener{_, _, newFocus ->
            if(newFocus) {
                handleFocusGained()
            } else {
                handleFocusLost()
            }
        }
        
        val keteranganLabel = Label("Klik TextField dibawah untuk melihat perubahan fokus")

        val vbox = VBox(10.0)
        vbox.alignment = Pos.CENTER
        vbox.children.addAll(keteranganLabel, textField1, textField2, statusLabel)

        val scene = Scene(vbox, 600.0, 200.0)

        primaryStage.title = "Focus Event (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        primaryStage.scene = scene
        primaryStage.show()
    }

    private fun handleFocusGained() {
        println("Pada TextField 1, fokus diperoleh")
        statusLabel.text = "Fokus diperoleh pada TextField 1"
    }

    private fun handleFocusLost() {
        println("Pada TextField 1, fokus hilang")
        statusLabel.text = "Fokus hilang pada TextField 1"
    }
}   