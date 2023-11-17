package logica;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class EventoCompuesto extends Evento{
	private ArrayList<Evento> subeventos;
	
	public EventoCompuesto(String id, String nombre, String tipo, String descripcion, String organizador, Date fechaInicial, Date fechaFinal, Lugar lugar){
		super( id, nombre,  tipo, descripcion, organizador,  fechaInicial,  fechaFinal, lugar);
		subeventos= new ArrayList<Evento>();
	}
	
	public void addSubEvento(Evento e){
		subeventos.add(e);
	}
	
	public ArrayList<Evento> getSubeventos(){
		return this.subeventos;
	}
}
