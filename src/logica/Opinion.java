package logica;

public class Opinion {

	private int cantEstrellas;
	private String texto;
	
	public Opinion(int cantEstrellas,String texto){
		this.setCantEstrellas(cantEstrellas);
		this.setTexto(texto);
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
}
