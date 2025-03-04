package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.control.ScrollPane
import javafx.scene.layout.VBox
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val scrollPane = ScrollPane()
        
        val contentBox = VBox()
        contentBox.spacing = 10.0

        for (i in 1..20) {
            contentBox.children.add(Label("Elemen $i"))
        }

        scrollPane.content = contentBox

        val scene = Scene(scrollPane, 600.0, 200.0)

        primaryStage.scene = scene

        primaryStage.title = "Layout ScrollPane (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}