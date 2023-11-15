package logica;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class EventoSConParticipantes extends EventoSimple{
	private ArrayList<User> participantes;
	
	public EventoSConParticipantes(String nombre, String tipo, String organizador, Date fechaInicial, Date fechaFinal, Time horaInicial, Time horaFinal){
		super(nombre, tipo, organizador, fechaInicial, fechaFinal, horaInicial, horaFinal);
		participantes= new ArrayList<User>();
	}
	
	public void addParticipante(User p){
		participantes.add(p);
	}
	
	public ArrayList<User> getParticipantes(){
		return this.participantes;
	}
}
