package dad.javafx.holamundo;

import javafx.event.ActionEvent;

public class HolaController {
	private HolaView view = new HolaView();
	private HolaModel model = new HolaModel();

	public HolaController() {
		view.getSaludarButton().setOnAction(e -> onSaludarButtonAction(e));
	}

	public HolaView getView() {
		return view;
	}

	public HolaModel getModel() {
		return model;
	}

	private void onSaludarButtonAction(ActionEvent e) {
		String nombre = view.getNombreText().toString();
		
		view.getSaludoLabel().setText("¡Hola " + nombre + "!");
		view.getSaludoLabel().setStyle("-fx-text-fill: blue; -fx-font: italic bold 30 sans-serif;");
	}
}