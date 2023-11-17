package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JComboBox;

import logica.Lugar;
import logica.Universidad;

import com.toedter.calendar.JDateChooser;

import utilidades.Identificadores;
import utilidades.TextAreaMejor;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class EventoSimpleMaker extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Principal padre;
	private JButton btnNewButton;
	private JLabel lblEventoSimple;
	private JLabel lblDatos;
	private JPanel panel;
	private JScrollPane scrollPane_1;
	private JLabel lblObligatorios;
	private JLabel lblDescripcin;
	private JTextField tfID;
	private JLabel lblId;
	private JTextField textField_1;
	private JLabel lblNombre;
	private JLabel lblTipo;
	private JComboBox cbTipo;
	private JComboBox cBOrg;
	private JLabel lblOrganizador;
	private JLabel lblFechaInicial;
	private JLabel lblFechaFinal;
	private JDateChooser dcFIni;
	private JDateChooser dcFFin;
	private JButton btnCrear;
	private TextAreaMejor textAreaMejor;
	private JComboBox cbLugar;
	private JLabel lblLugar;
	private JTextField tfotrotipo;
	private JLabel lblDigaElTipo;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			EventoSimpleMaker dialog = new EventoSimpleMaker(Principal p);
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public EventoSimpleMaker(Principal p) {
		super(p, true);
		padre=p;
		setBounds(600, 190, 750, 736);
		setUndecorated(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new LineBorder(Colores.getVerde()));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getBtnNewButton());
		contentPanel.add(getLblEventoSimple());
		contentPanel.add(getLblDatos());
		contentPanel.add(getPanel());
		contentPanel.add(getScrollPane_1());
		contentPanel.add(getLblObligatorios());
		contentPanel.add(getLblDescripcin());
		contentPanel.add(getBtnCrear());
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Cancelar");
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setBounds(191, 673, 126, 45);
		}
		return btnNewButton;
	}
	private JLabel getLblEventoSimple() {
		if (lblEventoSimple == null) {
			lblEventoSimple = new JLabel("Evento Simple");
			lblEventoSimple.setFont(new Font("Tahoma", Font.BOLD, 32));
			lblEventoSimple.setForeground(Colores.getVerde());
			lblEventoSimple.setBounds(257, 10, 230, 56);
		}
		return lblEventoSimple;
	}
	private JLabel getLblDatos() {
		if (lblDatos == null) {
			lblDatos = new JLabel("Datos");
			lblDatos.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblDatos.setBounds(342, 65, 62, 18);
			lblDatos.setForeground(Colores.getVerde());
		}
		return lblDatos;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setFont(new Font("Tahoma", Font.PLAIN, 17));
			panel.setBorder(new LineBorder(Colores.getVerde()));
			panel.setBounds(47, 120, 641, 304);
			panel.setBackground(Colores.getAzulbarra());
			panel.setLayout(null);
			panel.add(getTfID());
			panel.add(getLblId());
			panel.add(getTextField_1());
			panel.add(getLblNombre());
			panel.add(getLblTipo());
			panel.add(getCbTipo());
			panel.add(getCBOrg());
			panel.add(getLblOrganizador());
			panel.add(getLblFechaInicial());
			panel.add(getLblFechaFinal());
			panel.add(getDcFIni());
			panel.add(getDcFFin());
			panel.add(getCbLugar());
			panel.add(getLblLugar());
			panel.add(getTfotrotipo());
			panel.add(getLblDigaElTipo());
		}
		return panel;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setEnabled(false);
			scrollPane_1.setBounds(47, 460, 641, 200);
			scrollPane_1.setBorder(new LineBorder(Colores.getVerde()));
			scrollPane_1.setViewportView(getTextAreaMejor());
		}
		return scrollPane_1;
	}
	
	/**
	 * @wbp.nonvisual location=615,954
	 */
	private TextAreaMejor getTextAreaMejor() {
		if (textAreaMejor == null) {
			textAreaMejor = new TextAreaMejor();
			textAreaMejor.setFont(new Font("Tahoma", Font.PLAIN, 18));
			textAreaMejor.setWrapStyleWord(true);
			textAreaMejor.setLineWrap(true);
			textAreaMejor.setLimite(1000);
			textAreaMejor.setBackground(Colores.getAzulbarra());
			textAreaMejor.setForeground(Colores.getBlancuzo());
		}
		return textAreaMejor;
	}
	
	private JLabel getLblObligatorios() {
		if (lblObligatorios == null) {
			lblObligatorios = new JLabel("Obligatorios");
			lblObligatorios.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblObligatorios.setBounds(47, 96, 102, 22);
			lblObligatorios.setForeground(Colores.getVerde());
		}
		return lblObligatorios;
	}
	private JLabel getLblDescripcin() {
		if (lblDescripcin == null) {
			lblDescripcin = new JLabel("Descripci\u00F3n");
			lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblDescripcin.setBounds(47, 437, 102, 24);
			lblDescripcin.setForeground(Colores.getVerde());
		}
		return lblDescripcin;
	}
	private JTextField getTfID() {
		if (tfID == null) {
			tfID = new JTextField();
			tfID.setFont(new Font("Tahoma", Font.PLAIN, 17));
			tfID.setEnabled(false);
			tfID.setBounds(20, 44, 64, 32);
			tfID.setColumns(10);
			tfID.setForeground(Colores.getVerde());
			tfID.setBackground(Colores.getAzulbarra());
		}
		return tfID;
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID:");
			lblId.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblId.setBounds(20, 25, 34, 16);
			lblId.setForeground(Colores.getBlancuzo());
		}
		return lblId;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(20, 116, 601, 32);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre:");
			lblNombre.setForeground(new Color(216, 217, 226));
			lblNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNombre.setBounds(20, 97, 85, 16);
		}
		return lblNombre;
	}
	private JLabel getLblTipo() {
		if (lblTipo == null) {
			lblTipo = new JLabel("Tipo:");
			lblTipo.setForeground(new Color(216, 217, 226));
			lblTipo.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblTipo.setBounds(20, 161, 85, 22);
		}
		return lblTipo;
	}
	private JComboBox getCbTipo() {
		if (cbTipo == null) {
			cbTipo = new JComboBox();
			cbTipo.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					String x= Identificadores.getIdens().hacerId((String)cbTipo.getSelectedItem());
					tfID.setText(x);
					if(((String)cbTipo.getSelectedItem()).equals("Otro"))
					{
						lblDigaElTipo.setVisible(true);
						tfotrotipo.setVisible(true);
					}
					else
					{
						lblDigaElTipo.setVisible(false);
						tfotrotipo.setVisible(false);
					}
				}
			});
			cbTipo.setFont(new Font("Tahoma", Font.PLAIN, 17));
			cbTipo.setBounds(20, 185, 162, 32);
			cbTipo.setModel(new DefaultComboBoxModel(Universidad.getUniversidad().getTipos().toArray()));
		}
		return cbTipo;
	}
	private JComboBox getCBOrg() {
		if (cBOrg == null) {
			cBOrg = new JComboBox();
			cBOrg.setBounds(441, 185, 162, 32);
			cBOrg.setModel(new DefaultComboBoxModel(Universidad.getUniversidad().getOrgs().toArray()));
		}
		return cBOrg;
	}
	private JLabel getLblOrganizador() {
		if (lblOrganizador == null) {
			lblOrganizador = new JLabel("Organizador");
			lblOrganizador.setForeground(new Color(216, 217, 226));
			lblOrganizador.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblOrganizador.setBounds(441, 161, 122, 22);
		}
		return lblOrganizador;
	}
	private JLabel getLblFechaInicial() {
		if (lblFechaInicial == null) {
			lblFechaInicial = new JLabel("Fecha Inicial");
			lblFechaInicial.setForeground(new Color(216, 217, 226));
			lblFechaInicial.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblFechaInicial.setBounds(223, 25, 128, 16);
		}
		return lblFechaInicial;
	}
	private JLabel getLblFechaFinal() {
		if (lblFechaFinal == null) {
			lblFechaFinal = new JLabel("Fecha Final");
			lblFechaFinal.setForeground(new Color(216, 217, 226));
			lblFechaFinal.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblFechaFinal.setBounds(475, 25, 128, 16);
		}
		return lblFechaFinal;
	}
	private JDateChooser getDcFIni() {
		if (dcFIni == null) {
			dcFIni = new JDateChooser("dd/MM/yyyy","##/##/####", '_');
			dcFIni.setBounds(223, 44, 146, 32);
			dcFIni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return dcFIni;
	}
	private JDateChooser getDcFFin() {
		if (dcFFin == null) {
			dcFFin = new JDateChooser("dd/MM/yyyy","##/##/####", '_');
			dcFFin.setBounds(475, 44, 146, 32);
			dcFFin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return dcFFin;
	}
	private JButton getBtnCrear() {
		if (btnCrear == null) {
			btnCrear = new JButton("Crear");
			btnCrear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String id = tfID.getText();
				}
			});
			btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 21));
			btnCrear.setBounds(415, 673, 126, 45);
		}
		return btnCrear;
	}
	private JComboBox getCbLugar() {
		if (cbLugar == null) {
			cbLugar = new JComboBox();
			cbLugar.setFont(new Font("Tahoma", Font.PLAIN, 17));
			cbLugar.setBounds(223, 185, 162, 32);
			String [] array = new String [Universidad.getUniversidad().getLugares().size()];
			for(int i=0;i<Universidad.getUniversidad().getLugares().size();i++)
			{
				array[i]=Universidad.getUniversidad().getLugares().get(i).getNombre();
			}
			cbLugar.setModel(new DefaultComboBoxModel(array));
		}
		return cbLugar;
	}
	private JLabel getLblLugar() {
		if (lblLugar == null) {
			lblLugar = new JLabel("Lugar:");
			lblLugar.setForeground(new Color(216, 217, 226));
			lblLugar.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblLugar.setBounds(223, 161, 85, 22);
		}
		return lblLugar;
	}
	private JTextField getTfotrotipo() {
		if (tfotrotipo == null) {
			tfotrotipo = new JTextField();
			tfotrotipo.setVisible(false);
			tfotrotipo.setColumns(10);
			tfotrotipo.setBounds(20, 261, 162, 30);
		}
		return tfotrotipo;
	}
	private JLabel getLblDigaElTipo() {
		if (lblDigaElTipo == null) {
			lblDigaElTipo = new JLabel("Diga el Tipo:");
			lblDigaElTipo.setVisible(false);
			lblDigaElTipo.setForeground(new Color(216, 217, 226));
			lblDigaElTipo.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblDigaElTipo.setBounds(20, 236, 162, 22);
		}
		return lblDigaElTipo;
	}
}
