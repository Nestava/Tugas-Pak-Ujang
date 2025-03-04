package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.control.Tab
import javafx.scene.control.TabPane
import javafx.scene.layout.VBox
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val tabPane = TabPane()
        
        val tab1 = Tab("Tab 1")
        val tab2 = Tab("Tab 2")

        val content1 = VBox(Label("Konten Tab 1"))
        tab1.content = content1

        val content2 = VBox(Label("Konten Tab 2"))
        tab2.content = content2

        tabPane.tabs.addAll(tab1, tab2)

        val scene = Scene(tabPane, 600.0, 200.0)

        primaryStage.scene = scene

        primaryStage.title = "Layout TabPane (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}