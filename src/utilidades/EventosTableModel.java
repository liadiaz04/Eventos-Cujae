package utilidades;

import javax.swing.table.DefaultTableModel;

import logica.Evento;

public class EventosTableModel extends DefaultTableModel{
	
	private static final long serialVersionUID = 1L;
	
	public EventosTableModel(Evento[] eventos){
		String[] encabezados = {"ID", "Nombre", "Tipo", "Organizador"};
		this.setColumnIdentifiers(encabezados);
		for (int i = 0; i < eventos.length; i++) {
			Object[] newRow = new Object[]{eventos[i].getId(), eventos[i].getNombre(), eventos[i].getTipo(), eventos[i].getOrganizador()};
			addRow(newRow);
		}
	}
}
