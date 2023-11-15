package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.TextArea;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Eventos extends JDialog {

	private final JPanel contentPanel;
	private Principal padre;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel tableModel;
	private JTextArea textArea;
	private JScrollPane scrollPane_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel;
	private JLabel lblSeleccione;
	private JButton btnNewButton_1;
	private JButton btnInscribirse;
	private JButton btnOpinar;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public Eventos(Principal p) {
		super(p,true);
		padre=p;
		setBounds(230, 150, 1500, 873);
		getContentPane().setLayout(new BorderLayout());
		contentPanel = new JPanel();
		setUndecorated(true);
		contentPanel.setBorder(new LineBorder(Colores.getVerde()));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnNewButton = new JButton("Cerrar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					padre.getLblEventos().setForeground(Colores.getVerde());
					padre.getLblEventos().setIcon(new ImageIcon(Principal.class.getResource("/images/News.png")));
					padre.getLblEventosMarco().setVisible(false);
					dispose();
				}
			});
			btnNewButton.setBounds(1391, 13, 97, 25);
			contentPanel.add(btnNewButton);
		}
		contentPanel.add(getScrollPane());
		contentPanel.add(getScrollPane_1());
		contentPanel.add(getComboBox());
		contentPanel.add(getComboBox_1());
		contentPanel.add(getLblNewLabel());
		contentPanel.add(getLblSeleccione());
		contentPanel.add(getBtnNewButton_1());
		contentPanel.add(getBtnInscribirse());
		contentPanel.add(getBtnOpinar());
		contentPanel.add(getBtnNewButton_2());
	}
	
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(77, 155, 933, 680);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			//table.setModel(tableModel);
		}
		return table;
	}
	
	public void cargarEventos(){
		//ArrayList<Evento> eventos = 
	}
	
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setFont(new Font("Tahoma", Font.PLAIN, 23));
			textArea.setForeground(Colores.getVerde());
			textArea.setWrapStyleWord(true);
			textArea.setLineWrap(true);
			textArea.setBackground(Colores.getAzulbarra());
		}
		return textArea;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setEnabled(false);
			scrollPane_1.setBounds(1047, 155, 412, 478);
			scrollPane_1.setViewportView(getTextArea());
			scrollPane_1.setBorder(new LineBorder(Colores.getVerde()));
		}
		return scrollPane_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(77, 81, 376, 41);
		}
		return comboBox;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(634, 81, 376, 41);
		}
		return comboBox_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Ver por:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
			lblNewLabel.setBounds(77, 45, 97, 25);
		}
		return lblNewLabel;
	}
	private JLabel getLblSeleccione() {
		if (lblSeleccione == null) {
			lblSeleccione = new JLabel("Seleccione ");
			lblSeleccione.setFont(new Font("Tahoma", Font.PLAIN, 22));
			lblSeleccione.setBounds(634, 45, 376, 25);
		}
		return lblSeleccione;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Ver Subeventos");
			btnNewButton_1.setBounds(1047, 810, 97, 25);
		}
		return btnNewButton_1;
	}
	private JButton getBtnInscribirse() {
		if (btnInscribirse == null) {
			btnInscribirse = new JButton("Inscribirse");
			btnInscribirse.setBounds(1205, 810, 97, 25);
		}
		return btnInscribirse;
	}
	private JButton getBtnOpinar() {
		if (btnOpinar == null) {
			btnOpinar = new JButton("Opinar");
			btnOpinar.setBounds(1362, 810, 97, 25);
		}
		return btnOpinar;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("");
			btnNewButton_2.setBounds(12, 13, 46, 46);
		}
		return btnNewButton_2;
	}
}
