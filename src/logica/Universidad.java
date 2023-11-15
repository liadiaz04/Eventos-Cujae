package logica;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Universidad {
	private static Universidad cujae;
	private ArrayList<Participante> participantes;
	private ArrayList<Evento> eventos;
	private ArrayList<Lugar> lugares;

	private Universidad(ArrayList<Participante> participantes, ArrayList<Evento> eventos,
			ArrayList<Lugar> lugares) {
		participantes = new ArrayList<Participante>();
		eventos = new ArrayList<Evento>();
		lugares = new ArrayList<Lugar>();
	}

	public Universidad getUniversidad() {
		if (cujae == null) {
			cujae = new Universidad(participantes, eventos, lugares);
		}
		return cujae;
	}

	public void addProfesor(String username, String contrasena, String nombre,
			String apellidos, String telefono, String correo, String ci,
			String fechaCreacion, String permiso, String departamento) {

		Profesor p = new Profesor(username, contrasena, nombre, apellidos, telefono,
				correo, ci, fechaCreacion, permiso, departamento);
		participantes.add(p);
	}

	public void addEstudiante(String username, String contrasena, String nombre,
			String apellidos, String telefono, String correo, String ci,
			String fechaCreacion, String permiso) {

		Estudiante e = new Estudiante(username, contrasena, nombre, apellidos,
				telefono, correo, ci, fechaCreacion, permiso);
		participantes.add(e);
	}

	public Participante buscarParticipante(String username) {
		boolean encontrado = false;
		Participante p = null;
		for (int i = 0; i < participantes.size() && !encontrado; i++) {
			if (participantes.get(i).getUsername().equals(username)) {
				encontrado = true;
				p = participantes.get(i);
			}
		}
		return p;
	}

	

	// public a�adirEventoSimple(String nombre, String tipo, String organizador,
	// Date fechaInicial, Date fechaFinal, Time horaInicial, Time horaFinal)

}
