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

        primaryStage.title = "Drag-and-drop Event (Kotlin UI JavaFX) - Nabhan Alzam Faturohman"
        primaryStage.scene = scene
        primaryStage.show()
    }

    private fun createDragSourceBox(): VBox {
        val sourceLabel = Label("Sumber :\n_\n\n\n (Klik dan seret label ini) \n\n\n _")

        sourceLabel.setOnDragDetected { event -> 
            val dragboard = sourceLabel.startDragAndDrop(TransferMode.COPY)
            dragboard.setContent(mapOf(dataFormat to "Data dari sumber"))

            event.consume()
        }

        val sourceBox = VBox(sourceLabel)
        sourceBox.style = "-fx-border-color: black;"
        return sourceBox
    }

    private fun createDragTargetBox(): VBox {
        val targetLabel = Label("Target : \n_\n\n\n (Lepaskan Label disini) \n\n\n _")

        targetLabel.setOnDragOver { event ->
            if (event.dragboard.hasContent(dataFormat)) {
                event.acceptTransferModes(TransferMode.COPY)
            }
            event.consume()
        }

        targetLabel.setOnDragDropped { event ->
            if(event.dragboard.hasContent(dataFormat)) {
                val content = event.dragboard.getContent(dataFormat) as String
                println("Data diterima di target: $content")
                statusLabel.text = "Data diterima di target: $content"
            }
        
            event.isDropCompleted = true

            event.consume()
        }

        val targetBox = VBox(targetLabel)
        targetBox.style = "-fx-border-color: black;"

        return targetBox
    }
}   

