package logica;

public abstract class Participante {
	protected String username;
	protected String contrasena;
	protected String nombre;
	protected String apellidos;
	protected String telefono;
	protected String correo;
	protected String ci;
	protected String fechaCreacion;
	protected String permiso;
		
		public Participante(String username, String contrasena, String nombre,
				String apellidos, String telefono, String correo, String ci,
				String fechaCreacion, String permiso) {
			this.setUsername(username);
			this.setContrasena(contrasena);
			this.setNombre(nombre);
			this.setApellidos(apellidos);
			this.setTelefono(telefono);
			this.setCorreo(correo);
			this.setCi(ci);
			this.setFechaCreacion(fechaCreacion);
			this.setPermiso(permiso);
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

		private void setApellidos(String apellidos) {
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

		public String getCi() {
			return ci;
		}

		private void setCi(String ci) {
			this.ci = ci;
		}

		public String getFechaCreacion() {
			return fechaCreacion;
		}

		private void setFechaCreacion(String fechaCreacion) {
			this.fechaCreacion = fechaCreacion;
		}

		public String getPermiso() {
			return permiso;
		}

		public void setPermiso(String permiso) {
			this.permiso = permiso;
		}


}


