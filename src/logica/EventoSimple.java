package logica;

import java.sql.Time;
import java.util.Date;

public class EventoSimple extends Evento{
	
	public EventoSimple(String id, String nombre, String tipo, String descripcion, String organizador, Date fechaInicial, Date fechaFinal, Lugar lugar){
		super( id, nombre,  tipo,  descripcion, organizador,  fechaInicial,  fechaFinal, lugar);
	}
}
