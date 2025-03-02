package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Accordion
import javafx.scene.control.Label
import javafx.scene.control.TitledPane
import javafx.scene.layout.VBox
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val accordion = Accordion()
        
        val titledPane1 = TitledPane("Bagian 1", VBox(Label("Konten Bagian 1")))
        accordion.panes.add(titledPane1)

        val titledPane2 = TitledPane("Bagian 2", VBox(Label("Konten Bagian 2")))
        accordion.panes.add(titledPane2)

        val scene = Scene(accordion, 600.0, 200.0)

        primaryStage.scene = scene

        primaryStage.title = "Layout Accordion (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}