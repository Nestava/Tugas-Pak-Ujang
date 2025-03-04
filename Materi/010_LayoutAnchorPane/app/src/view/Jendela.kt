package app.src.view

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.AnchorPane
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val anchorPane = AnchorPane()

        val label = Label("Ini adalah AnchorPane")
        val button = Button("Tombol")
        
        AnchorPane.setTopAnchor(label, 10.0)
        AnchorPane.setLeftAnchor(label, 10.0)

        AnchorPane.setBottomAnchor(button, 10.0)
        AnchorPane.setRightAnchor(button, 10.0)

        anchorPane.children.addAll(label, button)

        val scene = Scene(anchorPane, 600.0, 200.0)

       primaryStage.scene = scene

        primaryStage.title = "Layout AnchorPane (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}