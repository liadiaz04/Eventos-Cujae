package logica;

import java.util.ArrayList;

public class Universidad {
	private Universidad cujae;
	private ArrayList<User> usuarios;
	//private ArrayList<Admin> admins;
	private ArrayList<Evento> eventos;
	private Universidad(){
		
	}
	
	public Universidad getUniversidad(){
		if(cujae==null){
			this.cujae= new Universidad();
		}
		return cujae;
	}
	
}
