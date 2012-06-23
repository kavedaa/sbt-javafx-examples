package no.vedaadata.sbtjavafx.examples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExampleJavaFxml extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = FXMLLoader.load(getClass().getResource("Scene.fxml"));
		stage.setScene(scene);
		stage.show();
	}
}