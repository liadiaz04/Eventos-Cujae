package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;

public class SeleccionReportes extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SeleccionReportes dialog = new SeleccionReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SeleccionReportes() {
		setBounds(100, 100, 722, 190);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblSeleccioneElReporte = new JLabel("Seleccione el reporte que desea analizar:");
			lblSeleccioneElReporte.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblSeleccioneElReporte.setBounds(214, 13, 312, 48);
			contentPanel.add(lblSeleccioneElReporte);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(90, 61, 528, 38);
			contentPanel.add(comboBox);
		}
	}

}
