package logica;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public abstract class Evento {
	protected String nombre;
	protected String tipo;
	protected String organizador;
	protected Date fechaInicial;
	protected Date fechaFinal;
	protected Time horaInicial;
	protected Time horaFinal;
	protected Lugar area;
	protected ArrayList<Opinion> opiniones;
	
	public Evento(String nombre, String tipo, String organizador, Date fechaInicial, Date fechaFinal,
			Time horaInicial, Time horaFinal, Lugar area){
		this.setNombre(nombre);
		this.setTipo(tipo);
		this.setOrganizador(organizador);
		this.setFechaInicial(fechaInicial);
		this.setFechaFinal(fechaFinal);
		this.setHoraInicial(horaInicial);
		this.setHoraFinal(horaFinal);
		this.setArea(area);
		opiniones = new ArrayList<Opinion>();
		}
	
	public void addOpinion(int cantEstrellas, String texto){
		Opinion o = new Opinion(cantEstrellas, texto);
		opiniones.add(o);
	}
	
	public void elimOpinion(Opinion o){
		opiniones.remove(o);
	}
	
	public ArrayList<Opinion> getOpiniones() {
		return opiniones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOrganizador() {
		return organizador;
	}

	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Time getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(Time horaInicial) {
		this.horaInicial = horaInicial;
	}

	public Time getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(Time horaFinal) {
		this.horaFinal = horaFinal;
	}

	public Lugar getArea() {
		return area;
	}

	public void setArea(Lugar area) {
		this.area = area;
	}
}
