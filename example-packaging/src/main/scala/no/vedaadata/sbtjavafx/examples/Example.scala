package no.vedaadata.sbtjavafx.examples

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.layout.VBox
import javafx.scene.control.Label
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.event.EventHandler
import javafx.event.ActionEvent
import javafx.scene.image.ImageView
import javafx.scene.image.Image

object Example {
  def main(args: Array[String]) {
    Application launch(classOf[Example], args: _*)
  }
}

class Example extends Application {
  
  def start(stage: Stage) {
    
    val root = new VBox
    
    val hello = new Label("Hello JavaFX from Scala!")
    val button = new Button("Please click me")
    button setGraphic new ImageView(new Image(getClass.getResourceAsStream("arrow.png")))
    val thankYou = new Label
    
    button setOnAction new EventHandler[ActionEvent] {
      def handle(event: ActionEvent) {
        thankYou setText "Thank you!"
      }
    }
    
    root.getChildren addAll (hello, button, thankYou)
    
    val scene = new Scene(root, 800, 600)
    stage setScene scene
    stage show ()
  }  
}