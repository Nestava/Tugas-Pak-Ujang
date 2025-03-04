package app.src.view

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.control.RadioButton
import javafx.scene.control.ToggleGroup
import javafx.scene.layout.VBox
import javafx.stage.Stage


class Jendela : Application() {
    override fun start(primaryStage: Stage) {

        val radioButton1 = RadioButton("Pilihan 1")
        val radioButton2 = RadioButton("Pilihan 2")
        val toggleGroup = ToggleGroup()

        val label = Label("Pilih salah satu")

        radioButton1.toggleGroup = toggleGroup
        radioButton2.toggleGroup = toggleGroup

        toggleGroup.selectedToggleProperty().addListener {_, _, selectedToggle ->
            val selectedRadioButton = selectedToggle as RadioButton
            println("Pilihan yang dipilih: ${selectedRadioButton.text}")
            label.text = "Pilihan yang dipilih: ${selectedRadioButton.text}"
        }
        
        val vbox = VBox(20.0)
        vbox.alignment = Pos.CENTER
        vbox.children.addAll(label, radioButton1, radioButton2)

        val scene = Scene(vbox, 600.0, 150.0)
        primaryStage.title = "Radio Button (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        primaryStage.scene = scene

        primaryStage.show()
    }
}   

