package logica;

import java.util.ArrayList;
import java.util.Date;

import utilidades.EventoOpinionesRango;

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
	
	public Evento eventoMasValoradoEnRango(Date limI, Date limS){

		ArrayList<EventoOpinionesRango> arreglo = new ArrayList<EventoOpinionesRango>();
		
		for(Evento e : eventos)
		{
			if(e.getFechaFinal().compareTo(limI)==1 && e.getFechaFinal().compareTo(limS)==-1)
			{
				EventoOpinionesRango eor = new EventoOpinionesRango(e);
				for(Opinion o : e.getOpiniones())
				{
					if(o.getFecha().compareTo(limI)==1 && o.getFecha().compareTo(limS)==-1)
					{
						eor.incrementoFrecuencia();
					}
				}
				arreglo.add(eor);
			}
		}
		
		Evento e1 = buscarEventoMasOpinado(arreglo);
		
		return e1;
	}
	
	public Evento buscarEventoMasOpinado(ArrayList<EventoOpinionesRango> arreglo){
		
		Evento emayor=null;
		int mayor=0;
		
		for(EventoOpinionesRango e : arreglo)
		{
			if(e.getFrecuencia()>mayor)
			{
				mayor=e.getFrecuencia();
				emayor=e.getE();
			}
		}
		
		return emayor;
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
