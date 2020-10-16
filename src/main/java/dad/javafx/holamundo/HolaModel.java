package dad.javafx.holamundo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HolaModel {
		private StringProperty nombre = new SimpleStringProperty();

		public final StringProperty nombreProperty() {
			return this.nombre;
		}
		

		public final String getNombre() {
			return this.nombreProperty().get();
		}
		

		public final void setNombre(final String nombre) {
			this.nombreProperty().set(nombre);
		}
		
}
