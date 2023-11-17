package logica;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import utilidades.Identificadores;

public abstract class Evento {
	
	private String id;
	private String nombre;
	private String tipo;
	private String descripcion;
	private String organizador;
	private Date fechaInicial;
	private Date fechaFinal;
	private ArrayList<Opinion> opiniones;
	private Lugar lugar;
	
	public Evento(String id, String nombre, String tipo, String descripcion, String organizador, Date fechaInicial, Date fechaFinal, Lugar lugar){
		this.setId(id);
		this.setNombre(nombre);
		this.setTipo(tipo);
		this.setDescripcion(descripcion);
		this.setOrganizador(organizador);
		this.setFechaInicial(fechaInicial);
		this.setFechaFinal(fechaFinal);
		this.setLugar(lugar);
		opiniones = new ArrayList<Opinion>();
		}
	
	public void addOpinion(int estrellas, String texto){
		Opinion o = new Opinion(estrellas, texto);
		opiniones.add(o);
	}
	
	public void addOpinion(int estrellas, Date date, String texto){
		Opinion o = new Opinion(estrellas, date, texto);
		opiniones.add(o);
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

	public String getId() {
		return id;
	}

	private void setId(String id) {
		
		this.id=id;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
