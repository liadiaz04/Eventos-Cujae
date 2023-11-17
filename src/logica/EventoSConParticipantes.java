package logica;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class EventoSConParticipantes extends EventoSimple{
	private int limite;
	private ArrayList<User> participantes;
	
	public EventoSConParticipantes(String id, String nombre, String tipo, String descripcion, String organizador, Date fechaInicial, Date fechaFinal, Lugar lugar, int limite){
		super(id, nombre, tipo,descripcion, organizador, fechaInicial, fechaFinal, lugar);
		this.setLimite(limite);
		participantes= new ArrayList<User>();
	}
	
	public void addParticipante(User p){
		participantes.add(p);
	}
	
	public ArrayList<User> getParticipantes(){
		return this.participantes;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
}
