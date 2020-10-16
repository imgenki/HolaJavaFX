package dad.javafx.holamundo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaView extends VBox {

	Label saludoLabel;
	private Button saludarButton;
	private TextField nombreText;

	public HolaView() {
		super();
		nombreText = new TextField();
		nombreText.setPrefColumnCount(5);
		nombreText.setPromptText("Introduce un nombre");
		nombreText.setMaxWidth(150);

		saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");

		saludarButton = new Button();
		saludarButton.setText("Saludar");
		saludarButton.setDefaultButton(true);

		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, saludarButton, saludoLabel);

	}
	
	public TextField getNombreText() {
		return nombreText;
	}
	
	public Button getSaludarButton() {
		return saludarButton;
	}
	
	public Label getSaludoLabel() {
		return saludoLabel;
	}
}
