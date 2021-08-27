package tablero.copy;

public class Pieza extends Tablero  {

	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "\nPieza [nombre= " + nombre + "]";
	}

}
