package app.src.view

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.FlowPane
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val flowPane = FlowPane()

        flowPane.hgap = 10.0
        flowPane.vgap = 10.0

        flowPane.alignment = Pos.CENTER
        
        val label1 = Label("Elemen 1")
        val label2 = Label("Elemen 2")
        val button1 = Button("Tombol 1")
        val button2 = Button("Tombol 2")

       flowPane.children.addAll(label1, label2, button1, button2)

       val scene = Scene(flowPane, 600.0, 200.0)

       primaryStage.scene = scene

        primaryStage.title = "Layout FlowPane (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}