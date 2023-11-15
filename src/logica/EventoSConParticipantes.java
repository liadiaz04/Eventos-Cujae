package logica;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class EventoSConParticipantes extends EventoSimple{
	private int limite;
	private ArrayList<Participante> participantes;

	public EventoSConParticipantes(String nombre, String tipo, String organizador, Date fechaInicial,
			Date fechaFinal, Time horaInicial, Time horaFinal, Lugar area, int limite){
		super(nombre, tipo, organizador, fechaInicial, fechaFinal, horaInicial,
				horaFinal, area);
		participantes= new ArrayList<Participante>();
		this.setLimite(limite);
	}
	
	
	private void setLimite(int limite) {
		this.limite=limite;
	}

	public void addParticipante(Participante p){
		participantes.add(p);
	}
	
	public ArrayList<Participante> getParticipantes(){
		return this.participantes;
	}

	public int getLimite() {
		return limite;
	}
	public int getCantidadParticipantes(){
		return participantes.size();
	}

}
