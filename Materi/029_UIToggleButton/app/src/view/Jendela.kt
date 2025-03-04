package app.src.view

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.control.ToggleButton
import javafx.scene.control.ToggleGroup
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.stage.Stage


class Jendela : Application() {

    override fun start(primaryStage: Stage) {

        val toggleButton1 = ToggleButton("Pilihan 1")
        val toggleButton2 = ToggleButton("Pilihan 2")
        val toggleGroup = ToggleGroup()

        val statusLabel = Label("Status Toggle Button: ")

        toggleButton1.toggleGroup = toggleGroup
        toggleButton2.toggleGroup = toggleGroup

        toggleGroup.selectedToggleProperty().addListener {_, _, selectedToggle ->
            if(selectedToggle != null) {
                val selectedToggleButton = selectedToggle as ToggleButton
                val status = if(selectedToggleButton.isSelected) "Aktif" else "Non-aktif"
                statusLabel.text = "Status Toggle Button: ${selectedToggleButton.text} = $status"
            }
        }
        
        val hbox = HBox(20.0)
        hbox.alignment = Pos.CENTER
        hbox.children.addAll( toggleButton1, toggleButton2)

        val vbox = VBox(20.0)
        vbox.alignment = Pos.CENTER
        vbox.children.addAll(hbox, statusLabel)

        val scene = Scene(vbox, 600.0, 150.0)
        primaryStage.title = "Toggle Button (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        primaryStage.scene = scene

        primaryStage.show()
    }
}   

