package logica;

import java.sql.Time;
import java.util.Date;

public class EventoSimple extends Evento{
	
	public EventoSimple(String nombre, String tipo, String organizador, Date fechaInicial, Date fechaFinal, Time horaInicial, Time horaFinal){
		super( nombre,  tipo,  organizador,  fechaInicial,  fechaFinal,  horaInicial, horaFinal);
	}
}
