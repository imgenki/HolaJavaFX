package dad.javafx.holamundo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private HolaController holaController;
	
	public void start(Stage primaryStage) throws Exception {
		
		holaController = new HolaController();
		
		holaController.getView().getSaludoLabel().setText("¡Hola " + holaController.getModel().nombreProperty() + "!");
		holaController.getView().getSaludoLabel().setStyle("-fx-text-fill: blue; -fx-font: italic bold 30 sans-serif;");
		Scene escena = new Scene(holaController.getView(), 320, 200);

		primaryStage.setScene(escena);
		primaryStage.setTitle("Hola Mundo Mejorado");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
