package logica;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class EventoSConParticipantes extends EventoSimple{
	private int cantidad;
	private ArrayList<Participante> participantes;
	
	public EventoSConParticipantes(String nombre, String tipo, String organizador, Date fechaInicial,
			Date fechaFinal, Time horaInicial, Time horaFinal, Lugar area){
		super(nombre, tipo, organizador, fechaInicial, fechaFinal, horaInicial,
				horaFinal, area);
		participantes= new ArrayList<Participante>();
		this.setCantidad(cantidad);
	}
	
	private void setCantidad(int cantidad) {
		this.cantidad=cantidad;
	}

	public void addParticipante(Participante p){
		participantes.add(p);
	}
	
	public ArrayList<Participante> getParticipantes(){
		return this.participantes;
	}
}
