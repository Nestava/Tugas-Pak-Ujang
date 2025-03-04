package app.src.view

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.stage.Stage

class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        val borderPane = BorderPane()
        
        val topVBox = VBox()
        topVBox.spacing = 10.0
        topVBox.padding = Insets(10.0)

        val topLabel = Label("Bagian Tas (Top)")

        val topButton = Button("Tombol Atas")

        
        topVBox.children.addAll(topLabel, topButton)
        
        borderPane.top = topVBox

        val leftVBox = VBox()
        leftVBox.spacing = 10.0
        leftVBox.padding = Insets(10.0)

        val leftLabel = Label("Bagian Kiri (Left)")

        val leftButton = Button("Tombol Kiri")

        leftVBox.children.addAll(leftLabel, leftButton)

        borderPane.left = leftVBox

        val centerHBox = HBox()
        centerHBox.spacing = 10.0
        centerHBox.padding = Insets(10.0)

        val centerLabel = Label("Bagian Tengah (Center)")

        val centerButton = Button("Tombol Tengah")

        centerHBox.children.addAll(centerLabel, centerButton)

        borderPane.center = centerHBox

        val rightVBox = VBox()
        rightVBox.spacing = 10.0
        rightVBox.padding = Insets(10.0)

        val rightLabel = Label("Bagian Kanan (Right)")

        val rightButton = Button("Tombol Kanan")

        rightVBox.children.addAll(rightLabel, rightButton)

        borderPane.right = rightVBox

        val bottomHBox = HBox()
        bottomHBox.spacing = 10.0
        bottomHBox.padding = Insets(10.0)

        val bottomLabel = Label("Bagian Bawah (Bottom)")

        val bottomButton = Button("Tombol Bawah")

        bottomHBox.children.addAll(bottomLabel, bottomButton)

        borderPane.bottom = bottomHBox

        val scene = Scene(borderPane, 600.0, 250.0)

        primaryStage.scene = scene

        primaryStage.title = "Layout Kombinasi (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        primaryStage.show()
    }
}