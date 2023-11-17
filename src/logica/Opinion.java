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
	
	//La saobrecarga de constructores no es funcional en toda la aplicación
	//sino solamente para instanciar los datos con los que funcionará la aplicación inicialmente
	
	public Opinion(int cantEstrellas, Date fecha, String texto){
		this.setCantEstrellas(cantEstrellas);
		this.setTexto(texto);
		this.setFecha(fecha);
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
	
	public void setFecha(Date fecha){
		this.fecha=fecha;
	}

	public Date getFecha() {
		return fecha;
	}
}
