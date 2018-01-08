package mvvm.sample2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import mvvm.sample2.HelloWorldViewModel;

public class HelloWorldView {

	@FXML
	private Label helloLabel;

	@FXML
	public void initialize() {
		HelloWorldViewModel viewModel = new HelloWorldViewModel();
		helloLabel.textProperty().bind(viewModel.helloMessage());
	}

}