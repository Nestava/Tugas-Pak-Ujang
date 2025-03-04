package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage


class Jendela : Application() {
    override fun start(primaryStage: Stage) {

        val button = Button("Klik Saya!")

        button.setOnAction {
            button.text = "Tombol sudah diklik!"
        }
        
        val root = StackPane()
        root.children.add(button)

        val scene = Scene(root, 600.0, 150.0)
        primaryStage.title = "Tombol (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        primaryStage.scene = scene

        primaryStage.show()
    }
}   

