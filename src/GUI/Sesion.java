package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;

public class Sesion extends JDialog {

	private final JPanel contentPanel;
	private Principal padre;
	private JButton btnVolver;
	private JButton btnCerrarSesin;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public Sesion(Principal p) {
		super(p, true);
		padre=p;
		setUndecorated(true);
		setBounds(620, 220, 700, 700);
		contentPanel = new JPanel(){
			public void paintComponent(Graphics g){
				Image img= Toolkit.getDefaultToolkit().getImage(Sesion.class.getResource("/images/fondoLogin.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new LineBorder(Colores.getVerde()));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getBtnVolver());
		contentPanel.add(getBtnCerrarSesin());
	}
	private JButton getBtnVolver() {
		if (btnVolver == null) {
			btnVolver = new JButton("Volver");
			btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 21));
			btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					padre.getMnSesion().setForeground(Colores.getVerde());
					padre.getMnSesion().setIcon(new ImageIcon(Principal.class.getResource("/images/Contacts.png")));
					dispose();
				}
			});
			btnVolver.setBackground(Colores.getVerde());
			btnVolver.setBounds(154, 586, 167, 58);
		}
		return btnVolver;
	}
	private JButton getBtnCerrarSesin() {
		if (btnCerrarSesin == null) {
			btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
			btnCerrarSesin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnCerrarSesin.setFont(new Font("Tahoma", Font.PLAIN, 21));
			btnCerrarSesin.setBackground(Colores.getVerde());
			btnCerrarSesin.setBounds(367, 586, 167, 58);
		}
		return btnCerrarSesin;
	}
}
