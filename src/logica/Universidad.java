package logica;

import java.util.ArrayList;
import java.util.Date;

public class Universidad {
	private Universidad cujae;
	private ArrayList<User> usuarios;
	private ArrayList<Evento> eventos;
	private Universidad(){
		
	}
	
	public Universidad getUniversidad(){
		if(cujae==null){
			this.cujae= new Universidad();
		}
		return cujae;
	}
	
	/*Filtrados de tablas*/
	
	public ArrayList<Evento> eventosPorOrganizador(String organizador){
		
		ArrayList<Evento> eventos= new ArrayList<Evento>();
		
		for(Evento e : eventos)
		{
			if(e.getTipo().equals(organizador))
			{
				eventos.add(e);
			}
		}
		
		return eventos;
	}
	
	public ArrayList<Evento> eventosPorTipo(String tipo){
		
		ArrayList<Evento> eventos= new ArrayList<Evento>();
		
		for(Evento e : eventos)
		{
			if(e.getTipo().equals(tipo))
			{
				eventos.add(e);
			}
		}
		
		return eventos;
	}
	
	public ArrayList<User> usersEstudiantes(){
		
		ArrayList<User> users = new ArrayList<User>();
		
		for(User u : usuarios)
		{
			if(u instanceof Estudiante)
					users.add(u);
		}
		
		return users;
	}
	
	public ArrayList<User> usersProfesores(){
		
		ArrayList<User> users = new ArrayList<User>();
		
		for(User u : usuarios)
		{
			if(u instanceof Profesor)
					users.add(u);
		}
		
		return users;
	}
	
	public ArrayList<User> usersEPorFacultad(String facultad){
		
		ArrayList<User> users = new ArrayList<User>();
		
		for(User u : usuarios)
		{
			if(u instanceof Estudiante)
				if(((Estudiante) u).getFacultad().equals(facultad))
				{
					users.add(u);
				}
		}
		
		return users;
	}

	public ArrayList<User> usersPPorDepartamento(String depart){
		
		ArrayList<User> users = new ArrayList<User>();
		
		for(User u : usuarios)
		{
			if(u instanceof Profesor)
				if(((Profesor) u).getDepartamento().equals(depart))
				{
					users.add(u);
				}
		}
		
		return users;
	}
	
	//Fin de los filtrados
	
	//Reporte 4
	
	public void eventoMasValoradoEnRango(Date limI, Date limS){
		
	}

	public ArrayList<User> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<User> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}
	
	
	
}
