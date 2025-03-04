package app.src.view

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.CheckBox
import javafx.scene.control.Label
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.stage.Stage


class Jendela : Application() {

    override fun start(primaryStage: Stage) {

        val checkbox = CheckBox("Pilihan")

        val statusLabel = Label("Status Checkbox: ")

        val keteranganLabel = Label("Perubahan status checkbox akna ditampilkan di bawah:")

        checkbox.setOnAction {
            val isSelected = checkbox.isSelected
            statusLabel.text = "Status Checkbox: $isSelected"
        }

        val hbox = HBox(20.0)
        hbox.alignment = Pos.CENTER
        hbox.children.addAll(checkbox)

        val vbox = VBox(20.0)
        vbox.alignment = Pos.CENTER
        vbox.children.addAll(keteranganLabel, hbox, statusLabel)

        val scene = Scene(vbox, 600.0, 150.0)
        primaryStage.title = "Checkbox (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        primaryStage.scene = scene

        primaryStage.show()
    }
}   

