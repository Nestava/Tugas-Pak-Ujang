package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Menu
import javafx.scene.control.MenuBar
import javafx.scene.control.MenuItem
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import javafx.stage.Stage


class Jendela : Application() {
    override fun start(primaryStage: Stage) {
        primaryStage.title = "Menu Event (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"

        val statusLabel = Label()

        val menuBar = MenuBar()

        val fileMenu = Menu("File")

        val openItem = MenuItem("Open")
        val saveItem = MenuItem("Save")

        openItem.setOnAction {
            handleOpen()
            statusLabel.text = "Menu Open diklik!"
        }

        saveItem.setOnAction {
            handleSave()
            statusLabel.text = "Menu Save diklik!"
        }

        fileMenu.items.addAll(openItem, saveItem)

        menuBar.menus.add(fileMenu)

        val keteranganLabel = Label("Klik menu untuk melihat status")

        val root = BorderPane()
        root.top = menuBar
        root.center = keteranganLabel
        root.bottom = statusLabel

        val scene = Scene(root, 600.0, 200.0)

        primaryStage.scene = scene
        primaryStage.show()
    }

    private fun handleOpen() {
        println("Menu Open Diklik")
    }

    private fun handleSave() {
        println("Menu Save Diklik")
    }
}   

