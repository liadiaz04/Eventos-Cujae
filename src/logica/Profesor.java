package logica;

public class Profesor extends User{

	private String departamento;
	
	public Profesor(String username, String contrasena, String nombre, String apellidos, String telefono, String correo, boolean admin, String departamento) {
		
		super(username, contrasena, nombre, apellidos, telefono, correo, admin);
		this.setDepartamento(departamento);
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	

}
