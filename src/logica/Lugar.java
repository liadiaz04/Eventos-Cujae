package logica;

public class Lugar {
	private String nombre;
	private String x;
	private String y;
	
	public Lugar(String nombre, String x, String y) {
		this.setNombre(nombre);
		this.setX(x);
		this.setY(y);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getX() {
		return x;
	}

	private void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	private void setY(String y) {
		this.y = y;
	}

}
