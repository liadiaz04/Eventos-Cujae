package utilidades;

import javax.swing.table.DefaultTableModel;

import logica.Estudiante;
import logica.User;

public class ParticipantesTableModel extends DefaultTableModel{

private static final long serialVersionUID = 1L;
	
	public ParticipantesTableModel(User[] usuarios){
		String[] encabezados = {"Nombre", "Apellidos", "Telefono", "Facultad", "Año", "Departamento"};
		this.setColumnIdentifiers(encabezados);
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i] instanceof Estudiante){
				Object[] newRow = new Object[]{usuarios[i].getNombre(), usuarios[i].getApellidos(), usuarios[i].getTelefono(), usuarios[i].getFacultad(), usuarios[i].getAnnio()};
				addRow(newRow);
			}
			if(usuarios[i] instanceof Estudiante){
				Object[] newRow = new Object[]{usuarios[i].getNombre(), usuarios[i].getApellidos(), usuarios[i].getTelefono(), usuarios[i].getFacultad(), usuarios[i].getAnnio()};
				addRow(newRow);
			}
		}
	}
}
