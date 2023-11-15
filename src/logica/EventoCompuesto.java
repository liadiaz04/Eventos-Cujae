package logica;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class EventoCompuesto extends Evento{
	private ArrayList<Evento> subeventos;
	
	public EventoCompuesto(String nombre, String tipo, String organizador, Date fechaInicial, Date fechaFinal, Time horaInicial, Time horaFinal){
		super( nombre,  tipo,  organizador,  fechaInicial,  fechaFinal,  horaInicial,  horaFinal);
		subeventos= new ArrayList<Evento>();
	}
	
	public void addSubEvento(Evento e){
		subeventos.add(e);
	}
	
	public ArrayList<Evento> getSubeventos(){
		return this.subeventos;
	}
}
