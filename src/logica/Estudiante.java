package logica;

public class Estudiante extends Participante{
	private String facultad;
	private int annoacademico;

	public Estudiante(String username, String contrasena, String nombre,
			String apellidos, String telefono, String correo, String ci,
			String fechaCreacion, String permiso) {
		super(username, contrasena, nombre, apellidos, telefono, correo, ci,
				fechaCreacion, permiso);
		this.setFacultad(facultad);
		this.setAnnoacademico(annoacademico);
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public int getAnnoacademico() {
		return annoacademico;
	}

	public void setAnnoacademico(int annoacademico) {
		this.annoacademico = annoacademico;
	}
	
}
