package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.control.TextArea
import javafx.scene.input.ScrollEvent
import javafx.scene.layout.VBox
import javafx.geometry.Pos
import javafx.stage.Stage


class Jendela : Application() {

    val statusLabel = Label()

    override fun start(primaryStage: Stage) {
        val textArea = TextArea()
        
        textArea.setOnScroll { event ->
            handleScrollEvent(event)
        }
        
        val keteranganLabel = Label("Coba skrol dalem textarea")

        val vbox = VBox(10.0)
        vbox.alignment = Pos.CENTER
        vbox.children.addAll(keteranganLabel, textArea, statusLabel)

        val scene = Scene(vbox, 600.0, 200.0)

        primaryStage.title = "Scroll Event (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        primaryStage.scene = scene
        primaryStage.show()
    }

    private fun handleScrollEvent(event: ScrollEvent) {
        println("Pengguliran mouse : Delta Y = ${event.deltaY}")
        statusLabel.text = "Pengguliran mouse : Delta Y = ${event.deltaY}"
    }
}   

