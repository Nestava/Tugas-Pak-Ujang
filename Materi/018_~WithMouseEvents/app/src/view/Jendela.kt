package app.src.view

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.scene.shape.Rectangle
import javafx.stage.Stage


class Jendela : Application() {

    override fun start(primaryStage: Stage) {
        val rectangle = Rectangle(100.0, 100.0, Color.GREEN)
        
        val keteranganLabel = Label("Klik kotak hijau atau arahkan mouse ke atasnya untuk memicu event")

        val statusLabel = Label()

        rectangle.setOnMouseClicked {
            handleMouseClick(statusLabel)
        }

        rectangle.setOnMouseEntered {
            handleMouseEnter(statusLabel)
        }

        rectangle.setOnMouseExited {
            handleMouseExit(statusLabel)
        }

        val vbox = VBox(10.0)
        vbox.children.addAll(keteranganLabel, rectangle, statusLabel)

        vbox.alignment = Pos.CENTER

        val stackPane = StackPane()
        stackPane.children.add(vbox)

        val scene = Scene(stackPane, 600.0, 200.0)

        primaryStage.title = "Mouse Events (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        primaryStage.scene = scene
        primaryStage.show()
    }

    private fun handleMouseClick(statusLabel: Label) {
        println("Mouse diklik!")
        statusLabel.text = "Mouse diklik"
    }

    private fun handleMouseEnter(statusLabel: Label) {
        println("Mouse masuk ke kotak!")
        statusLabel.text = "Mouse masuk ke kotak!"
    }

    private fun handleMouseExit(statusLabel: Label) {
        println("Mouse keluar dari kotak!")
        statusLabel.text = "Mouse keluar dari kotak!"
    }
}