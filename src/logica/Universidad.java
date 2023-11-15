package logica;

import java.sql.Time;
import java.time.LocalDate;
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

	public void perfilEventosUser(String username) {
		for (int i = 0; i < participantes.size(); i++) {
			// if(participantes.username(i).equals(username)){

		}
	}

}

	public ArrayList<Lugar> reporteTop10(Date limiteInferior, Date limiteSuperior) {
		ArrayList<Lugar> lugares = new ArrayList<Lugar>();
		ArrayList<ContadorLugares> aux = new ArrayList<ContadorLugares>();
		for (Evento i : eventos) {
			if ((i.getFechaInicial().compareTo(limiteInferior) == 1) &&
					(i.getFechaInicial().compareTo(limiteSuperior) == -1)) {
				lugares.add(i.getArea());
			}
		}
		for (Lugar l : lugares) {
			boolean found = false;
			for (int i = 0; i < aux.size() && !found; i++) {
				if (aux.get(i).getLugar().equals(l)) {
					aux.get(i).contarLugares();
					found=true;
				}
			}
				if(!found){
				aux.add(new ContadorLugares(l))
				}
			}
		}return lugares;
}
// public a�adirEventoSimple(String nombre, String tipo, String organizador,
// Date fechaInicial, Date fechaFinal, Time horaInicial, Time horaFinal)

}
