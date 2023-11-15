package logica;

public class Estudiante extends User{

	private String facultad;
	private int annio;
	
	public Estudiante(String username, String contrasena, String nombre, String apellidos, String telefono, String correo, boolean admin, String facultad, int annio) {
		
		super(username, contrasena, nombre, apellidos, telefono, correo, admin);
		this.setFacultad(facultad);
		this.setAnnio(annio);
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public int getAnnio() {
		return annio;
	}

	public void setAnnio(int annio) {
		this.annio = annio;
	}
	
	
	
}
