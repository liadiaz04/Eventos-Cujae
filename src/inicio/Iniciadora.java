package inicio;

import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import logica.Estudiante;
import logica.Evento;
import logica.EventoSConParticipantes;
import logica.EventoSimple;
import logica.Lugar;
import logica.Opinion;
import logica.Profesor;
import logica.Universidad;
import logica.UserSingle;
import GUI.Primera;

public class Iniciadora {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio();
					Primera frame = new Primera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings("null")
	private static void inicio(){
		
		
		Universidad.getUniversidad().addTipo("<Tipo>");
		Universidad.getUniversidad().addTipo("Cientifico");
		Universidad.getUniversidad().addTipo("Cultural");
		Universidad.getUniversidad().addTipo("Deportivo");
		Universidad.getUniversidad().addTipo("Recreativo");
		Universidad.getUniversidad().addTipo("Politico");
		Universidad.getUniversidad().addTipo("Otro");
		
		Universidad.getUniversidad().addOrg("<Organizador>");
		Universidad.getUniversidad().addOrg("CUJAE");
		Universidad.getUniversidad().addOrg("Facultad de Arquitectura");
		Universidad.getUniversidad().addOrg("Facultad de Ing. Automatica y Biomedica");
		Universidad.getUniversidad().addOrg("Facultad de Ing. Civil");
		Universidad.getUniversidad().addOrg("Facultad de Ing. Electrica");
		Universidad.getUniversidad().addOrg("Facultad de Ing. Industrial");
		Universidad.getUniversidad().addOrg("Facultad de Ing. Informatica");
		Universidad.getUniversidad().addOrg("Facultad de Ing. Mecanica");
		Universidad.getUniversidad().addOrg("Facultad de Ing. en Telecomunicaciones");
		Universidad.getUniversidad().addOrg("Facultad de Ing. Quimica");
		Universidad.getUniversidad().addOrg("CEMAT");
		Universidad.getUniversidad().addOrg("DEDER");
		
		Universidad.getUniversidad().addLugar(new Lugar("<Lugar>", null));
		Universidad.getUniversidad().addLugar(new Lugar("Canchas", "23.052110,-82.418370"));
		Universidad.getUniversidad().addLugar(new Lugar("Edificio 19", "23.055080,-82.415034"));
		Universidad.getUniversidad().addLugar(new Lugar("Teatro del CECAT", "23.0542293,-82.415803"));
		Universidad.getUniversidad().addLugar(new Lugar("Pasillo Central", "23.054578,-82.417641"));
		Universidad.getUniversidad().addLugar(new Lugar("Edificio 5", "23.054966,-82.419126"));
		Universidad.getUniversidad().addLugar(new Lugar("Escalinata", "23.054419,-82.419396"));
		Universidad.getUniversidad().addLugar(new Lugar("Canchas", "23.055259,-82.418195"));
		Universidad.getUniversidad().addLugar(new Lugar("Beca", "23.051022,-82.416522"));
		Universidad.getUniversidad().addLugar(new Lugar("Cenicero", "23.054418,-82.419144"));
		Universidad.getUniversidad().addLugar(new Lugar("Otro", null));
		
		
//		EVENTO SIMPLE
//		private String id;
//		private String nombre;
//		private String tipo;
//		private String descripcion;
//		private String organizador;
//		private Date fechaInicial;
//		private Date fechaFinal;
//		private ArrayList<Opinion> opiniones;
//		private Lugar lugar;
		
//      EVENTO S CON PARTIC
// 		capacidad
		
//		EVENTO COMPUESTO 
//		eventos
		
		
//		USUARIO
//		protected String username;
//		protected String contrasena;
//		protected String nombre;
//		protected String apellidos;
//		protected String telefono;
//		protected String correo;
//		protected boolean admin;
		
//		PROFESOR 
//		departamento
		
//		ESTUDIANTE
//		facultad
//		ano academico
		
		
//  	Date date = ff.parse("15/11/2023");
		try {
		SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
		Evento e = new EventoSimple("RE111", "Fiesta Hashtag", "Recreativo", "Una fiesta buena ahi", "Facultad de Ing. Quimica", ff.parse("20/3/2023"), ff.parse("20/3/2023"), new Lugar("Casa de la musica de Plaza", null));
		e.addOpinion(5,ff.parse("21/3/2023"), null);
		e.addOpinion(5,ff.parse("21/3/2023"), "SUPER BUENA");
		e.addOpinion(4, ff.parse("21/3/2023"), "Muy bueno pero malo el alcohol");
		e.addOpinion(3, ff.parse("22/3/2023"), "Que caloooor");
		Universidad.getUniversidad().getEventos().add(e);
		
		Evento e1 = new EventoSimple("CU123", "Concierto de Buena Fe", "Cultural", "Concierto de esta banda cubana tan popular por el día de la UJC a las 12:00pm", "CUJAE", ff.parse("4/4/2023"), ff.parse("4/4/2023"), new Lugar("Cenicero", "23.054418,-82.419144"));
		e1.addOpinion(5, ff.parse("4/4/2023"), "ME ENCANTOOO");
		e1.addOpinion(5, ff.parse("4/4/2023"), "Los amo");
		e1.addOpinion(5, ff.parse("4/4/2023"), "Son los mejores");
		e1.addOpinion(5, ff.parse("5/4/2023"), "Que se repita");
		Universidad.getUniversidad().getEventos().add(e1);
		
		Evento e4 = new EventoSimple("CI351", "Exposicion de Proyectos", "Cientifico", "Los estudiantes deben sacar a pasear su creatividad", "Facultad de Ing. Informatica", ff.parse("15/4/2023"), ff.parse("15/4/2023"), new Lugar("Edificio 19", "23.055080,-82.415034"));
	    e4.addOpinion(4, ff.parse("16/4/2023"), "Interesante y bien organizado.");
	    Universidad.getUniversidad().getEventos().add(e4);
	    
	    Evento e5 = new EventoSimple("CI555", "Conferencia de Innovacion Tecnologica", "Cientifico", "Enfoque en últimas tendencias tecnológicas", "CEMAT", ff.parse("20/4/2023"), ff.parse("20/4/2023"), new Lugar("Teatro del CECAT", "23.0542293,-82.415803"));
	    e5.addOpinion(5, ff.parse("21/4/2023"), "¡Excelente conferencia!"); 
	    e5.addOpinion(4, ff.parse("21/4/2023"), "Muy informativa y visualmente atractiva."); 
	    Universidad.getUniversidad().getEventos().add(e5);
	    
	    Evento e6 = new EventoSimple("RE989", "Feria de Empleo y Oportunidades Laborales", "Recreativo", "Interaccion con empresas y oportunidades de empleo", "Facultad de Arquitectura", ff.parse("25/4/2023"), ff.parse("25/4/2023"), new Lugar("Pasillo Central", "23.054578,-82.417641"));
	    e6.addOpinion(4, ff.parse("26/4/2023"), "Muchas oportunidades interesantes");
	    e6.addOpinion(3, ff.parse("26/4/2023"), "Podría haber más empresas participantes");
	    Universidad.getUniversidad().getEventos().add(e6);
	    
	    Evento e7 = new EventoSimple("DE333", "Competencia de Robotica", "Deportivo", "Presentacion de proyectos roboticos", "Facultad de Ing. Mecanica", ff.parse("30/4/2023"), ff.parse("30/4/2023"), new Lugar("Edificio 5", "23.054966,-82.419126"));
	    e7.addOpinion(5, ff.parse("1/5/2023"), "Increibles diseños y construcciones de robots.");
	    Universidad.getUniversidad().getEventos().add(e7);
	   
	    Evento e8 = new EventoSimple("CU213", "Concierto de Musica Latina", "Cultural", "Noche de musica y baile latino", "Facultad de Ing. Industrial", ff.parse("5/5/2023"), ff.parse("5/5/2023"), new Lugar("Casa de la musica de Plaza", null));
	    e8.addOpinion(4, ff.parse("6/5/2023"), "Gran ambiente y selección musical.");
	    Universidad.getUniversidad().getEventos().add(e8);
		
		EventoSConParticipantes e2 = new EventoSConParticipantes("PO155", "Conferencia en apoyo a Pakistan", "Politico", "Comenzará a las 10:00am", "CUJAE", ff.parse("05/04/2023"), ff.parse("05/04/2023"), new Lugar("Teatro del CECAT", "23.0542293,-82.415803"), 80);
		e2.addOpinion(5, ff.parse("06/04/2023"), "Cese del fuego contra Pakistan");
		e2.addParticipante(new Profesor("ceahernandez", "1234", "Amanda", "Hernandez", "53612685", "wfgfd@ceis.com.cu", false, "qwe"));
		e2.addParticipante(new Profesor("cetperez", "5678", "Tulio", "Perez", "53612385", "wfgfr@ceis.com.cu", true, "rde"));
		e2.addParticipante(new Estudiante("cedfernandez", "9012", "Daniel", "Fernandez", "53697685", "egvfd@ceis.com.cu", false, "Informatica", 1));
		e2.addParticipante(new Estudiante("cesloez", "2345", "Sabrina", "Lopez", "53603685", "eplfd@ceis.com.cu", true, "Civil", 4));
		Universidad.getUniversidad().getEventos().add(e2);
		
		EventoSConParticipantes e3 = new EventoSConParticipantes("DE345", "Partido de Football amistoso", "Deportivo", "Comenzará a las 3:00pm", "Facultad de Industrial", ff.parse("10/09/2023"), ff.parse("10/09/2023"), new Lugar("Canchas", "23.055259,-82.418195"), 20);
		e3.addOpinion(0, ff.parse("10/09/2023"), "Tremendo palo");
		e3.addOpinion(1, ff.parse("11/09/2023"), "De madre perder contra Informatica");
		e3.addParticipante(new Estudiante("cepsuarez", "4556", "Pedro", "Suarez", "53143685", "gfbfd@ceis.com.cu", false, "Informatica", 2));
		e3.addParticipante(new Estudiante("cecgonzalez", "7654", "Carlos", "Gonzalez", "50756385", "plgkh@ceis.com.cu", false, "Informatica", 2));
		e3.addParticipante(new Estudiante("ceypotter", "3976", "Yuri", "Potter", "53697025", "kmjfd@ceis.com.cu", false, "Industrial", 3));
		e3.addParticipante(new Estudiante("cepgranger", "0923", "Pogrebin", "Granger", "53018685", "epsld@ceis.com.cu", false, "Civil", 3));
		Universidad.getUniversidad().getEventos().add(e3);
		
		
		
		} catch (ParseException f) {
			// TODO Auto-generated catch block
			f.printStackTrace();
		}
		
	}
}
