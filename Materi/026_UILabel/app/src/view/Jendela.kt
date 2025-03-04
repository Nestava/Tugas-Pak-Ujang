package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.stage.Stage


class Jendela : Application() {
    override fun start(primaryStage: Stage) {

        val label = Label("Klik Saya!")

        label.setOnMouseClicked {
            label.text = "Halo, Kotlin JavaFX!"
        }
        
        val root = StackPane()
        root.children.add(label)

        val scene = Scene(root, 600.0, 150.0)
        primaryStage.title = "Label (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        primaryStage.scene = scene

        primaryStage.show()
    }
}   

