package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.control.SplitPane
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val splitPane = SplitPane()
        
        val leftPane = SplitPane(Label("Kiri"))
        splitPane.items.add(leftPane)

        val rightPane = SplitPane(Label("Kanan"))
        splitPane.items.add(rightPane)

        splitPane.setDividerPosition(0, 0.3)

        val scene = Scene(splitPane, 600.0, 200.0)

        primaryStage.scene = scene

        primaryStage.title = "Layout SplitPane (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}