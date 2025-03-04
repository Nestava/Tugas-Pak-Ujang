package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.scene.layout.VBox
import javafx.stage.Stage
import javafx.geometry.Pos

class Jendela : Application() {
    override fun start(stage: Stage) {
        val button = Button("Klik Saya")
        
        val keteranganLabel = Label("Klik tombol di bawah untuk memicu event")

        val statusLabel = Label()

        button.setOnAction {
            handleButtonClick(statusLabel)
        }

        val root = VBox(10.0)
        root.children.addAll(keteranganLabel, button, statusLabel)
        root.alignment = Pos.CENTER

        val scene = Scene(root, 600.0, 200.0)
        
        stage.title =
        "Event Handler With Lambda Expression (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        stage.scene = scene
        stage.show()
    }

    private fun handleButtonClick(statusLabel: Label) {
        println("Tombol diklik!")
        statusLabel.text = "Tombol telah diklik"
    }

}