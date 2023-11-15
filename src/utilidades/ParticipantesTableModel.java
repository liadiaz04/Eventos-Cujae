package utilidades;

import javax.swing.table.DefaultTableModel;

import logica.User;

public class ParticipantesTableModel extends DefaultTableModel{

private static final long serialVersionUID = 1L;
	
	public ParticipantesTableModel(User[] usuarios){
		String[] encabezados = {"Nombre", "Apellidos", "Telefono", "Facultad", "Año"};
		this.setColumnIdentifiers(encabezados);
//		for (int i = 0; i < usuarios.length; i++) {
//			Object[] newRow = new Object[]{usuarios[i].getNombre(), usuarios[i].getTipo(), usuarios[i].getOrganizador()};
//			addRow(newRow);
//		}
	}
}
