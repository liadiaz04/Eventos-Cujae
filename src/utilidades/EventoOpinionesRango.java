package utilidades;

import logica.Evento;

public class EventoOpinionesRango {
	private Evento e;
	private int frecuencia;
	
	public EventoOpinionesRango(Evento e){
		this.setE(e);
		this.setFrecuencia(0);
	}
	
	public void incrementoFrecuencia(){
		this.setFrecuencia(this.getFrecuencia() + 1);
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public Evento getE() {
		return e;
	}

	public void setE(Evento e) {
		this.e = e;
	}
}
