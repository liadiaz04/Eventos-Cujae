package logica;

public class User {
	protected String username;
	protected String contrasena;
	protected String nombre;
	protected String apellidos;
	protected String telefono;
	protected String correo;
	protected boolean admin;
	
	public User(String username, String contrasena, String nombre, String apellidos, String telefono, String correo, boolean admin){
		this.setUsername(username);
		this.setContrasena(contrasena);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setTelefono(telefono);
		this.setCorreo(correo);
		this.setAdmin(admin);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}


}
