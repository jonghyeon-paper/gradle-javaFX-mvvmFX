package mvvm.sample;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import javafx.application.Application;
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
		stage.setTitle("Hello World Application");

		final ViewTuple<HelloWorldView, HelloWorldViewModel> viewTuple = FluentViewLoader.fxmlView(HelloWorldView.class).load();

		final Parent root = viewTuple.getView();
		stage.setScene(new Scene(root, 800, 600));
		stage.show();
	}

}