package no.vedaadata.sbtjavafx.examples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExampleJava extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {

		VBox root = new VBox();

		Label hello = new Label("Hello JavaFX from Java!");
		Button button = new Button("Please click me");
		button.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("arrow.png"))));
		final Label response = new Label();

		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				response.setText("Thank you very much!");
			}
		});

		root.getChildren().addAll(hello, button, response);

		Scene scene = new Scene(root, Color.AZURE);
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
}
