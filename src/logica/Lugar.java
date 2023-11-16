package logica;

public class Lugar {

	private String nombre;
	private String coordenada;
	
	public Lugar(String nombre, String coordenada){
		this.setNombre(nombre);
		this.setCoordenada(coordenada);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCoordenada() {
		return coordenada;
	}
	public void setCoordenada(String coordenada) {
		this.coordenada = coordenada;
	}
	
}
