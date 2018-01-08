package mvvm.sample2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	public static void main(String... args) {
		Application.launch(args);
	}
	
	@Override
	public void init() throws Exception {
		//TODO
	}

	@Override
	public void start(Stage stage) throws Exception {
		//TODO
		stage.setTitle("Hello World Application - sample2");
		
		Parent root = FXMLLoader.load(getClass().getResource("/mvvm/sample2/HelloWorldView.fxml"));
		Scene scene = new Scene(root, 800, 600);
		stage.setScene(scene);
		stage.show();
	}

}