package logica;

public class Profesor extends Participante{
	private String departamento;
	
	public Profesor(String username, String contrasena, String nombre,
			String apellidos, String telefono, String correo, String ci,
			String fechaCreacion, String permiso, String departamento) {
		super(username, contrasena, nombre, apellidos, telefono, correo, ci,
				fechaCreacion, permiso);
		this.setDepartamento(departamento);
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	

}
