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

public class Sesion extends JDialog {

	private final JPanel contentPanel;
	private Principal padre;
	private JButton btnNewButton;

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
		contentPanel.add(getBtnNewButton());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					padre.getLblSesion().setForeground(Colores.getVerde());
					padre.getLblSesion().setIcon(new ImageIcon(Principal.class.getResource("/images/Contacts.png")));
					padre.getLblSesionMarco().setVisible(false);
					dispose();
				}
			});
			btnNewButton.setBounds(230, 259, 129, 58);
		}
		return btnNewButton;
	}
}
