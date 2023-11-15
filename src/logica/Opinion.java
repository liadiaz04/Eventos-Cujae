package logica;

import java.util.Date;

public class Opinion {

	private int cantEstrellas;
	private String texto;
	private Date fecha;
	
	public Opinion(int cantEstrellas,String texto){
		this.setCantEstrellas(cantEstrellas);
		this.setTexto(texto);
		fecha = new Date();
	}
	
	public int getCantEstrellas() {
		return cantEstrellas;
	}
	public void setCantEstrellas(int cantEstrellas) {
		this.cantEstrellas = cantEstrellas;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getFecha() {
		return fecha;
	}
}
