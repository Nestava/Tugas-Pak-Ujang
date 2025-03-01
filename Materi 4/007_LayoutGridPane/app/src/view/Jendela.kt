package app.src.view

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.GridPane
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val gridPane = GridPane()

        gridPane.hgap = 10.0

        gridPane.vgap = 10.0

        gridPane.padding = Insets(10.0)
        
        val label1 = Label("Elemen 1")

        val label2 = Label("Elemen 2")

        val button = Button("Tombol")

       GridPane.setRowIndex(label1, 0)
       GridPane.setColumnIndex(label1, 0)

       GridPane.setRowIndex(label2, 0)
       GridPane.setColumnIndex(label2, 1)
 
       GridPane.setRowIndex(button, 1)
       GridPane.setColumnIndex(button, 0)

       gridPane.children.addAll(label1, label2, button)

       val scene = Scene(gridPane, 600.0, 200.0)

       primaryStage.scene = scene

        primaryStage.title = "Layout GridPane (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}