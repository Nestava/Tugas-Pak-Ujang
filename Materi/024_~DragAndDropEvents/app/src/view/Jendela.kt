package app.src.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.input.DataFormat
import javafx.scene.input.TransferMode
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.geometry.Pos
import javafx.stage.Stage


class Jendela : Application() {

    val statusLabel = Label()

    private val dataFormat = DataFormat("custom_data_format")

    override fun start(primaryStage: Stage) {
        val sourceBox = createDragSourceBox()
        val targetBox = createDragTargetBox()

        val keteranganLabel = Label(
            "Klik dan seret Label pada Box Sumber, kemudian lepaskan" +
            "pada Box Target untuk melihat perubahan :"
        )

        val boxSourcedanTarget = HBox(10.0)
        boxSourcedanTarget.children.addAll(sourceBox, targetBox)
        boxSourcedanTarget.alignment = Pos.CENTER

        val vbox = VBox(10.0)
        
        vbox.children.addAll(keteranganLabel, boxSourcedanTarget, statusLabel)
        vbox.alignment = Pos.CENTER

        val scene = Scene(vbox, 600.0, 200.0)

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

