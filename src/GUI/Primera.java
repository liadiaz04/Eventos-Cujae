package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import utilidades.ContraseñaPlaceHolder;
import utilidades.PLaceHolder;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


public class Primera extends JFrame {

	private JPanel contentPane;
	private JLabel lblWelcome;
	private PLaceHolder campoUser;
	private JLabel error;
	private JPasswordField campoContrasena;
	private JLabel lblLogo;
	Color colortrans = new Color(0,0,0,0);
	private JLabel lblUserIcon;
	private JLabel lbllock;
	private JButton btnsesion;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Primera() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 492);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				Image img= Toolkit.getDefaultToolkit().getImage(Primera.class.getResource("/images/fondoLogin.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		contentPane.add(getLblWelcome());
		contentPane.add(getCampoUser());
		contentPane.add(getError());
		contentPane.add(getCampoContrasena());
		contentPane.add(getLblLogo());
		contentPane.add(getLblUserIcon());
		contentPane.add(getLbllock());
		contentPane.add(getBtnsesion());
		setLocationRelativeTo(null);
	}
	private JLabel getLblWelcome() {
		if (lblWelcome == null) {
			lblWelcome = new JLabel("BIENVENDIO A EVENTOS CUJAE");
			lblWelcome.setBounds(98, 218, 292, 16);
			lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblWelcome.setForeground(Color.BLACK);
			lblWelcome.setForeground(Colores.getVerde());
		}
		return lblWelcome;
	}
	
	private JTextField getCampoUser() {
		if (campoUser == null) {
			campoUser = new PLaceHolder("Usuario");
			campoUser.setSelectedTextColor(Color.BLACK);
			campoUser.setBounds(146, 256, 209, 33);
			campoUser.setFont(new Font("Tahoma", Font.BOLD, 16));
			campoUser.setBackground(Colores.getAzulbarra());
			campoUser.setForeground(Colores.getVerde());
			campoUser.setColumns(10);
		}
		return campoUser;
	}
	
	private JLabel getError() {
		if (error == null) {
			error = new JLabel("Usuario o contrase\u00F1a incorrecta");
			error.setBounds(104, 355, 263, 16);
			error.setFont(new Font("Tahoma", Font.BOLD, 16));
			error.setForeground(new Color(178, 34, 34));
			error.setVisible(false);
		}
		return error;
	}
	private JPasswordField getCampoContrasena() {
		if (campoContrasena == null) {
			campoContrasena = new ContraseñaPlaceHolder("Contraseña");
			campoContrasena.setBounds(146, 309, 209, 33);
			campoContrasena.setFont(new Font("Tahoma", Font.BOLD, 16));
			campoContrasena.setBackground(Colores.getAzulbarra());
			campoContrasena.setForeground(Colores.getVerde());
		}
		return campoContrasena;
	}
	private JLabel getLblLogo() {
		if (lblLogo == null) {
			lblLogo = new JLabel("");
			lblLogo.setBounds(146, 25, 180, 180);
			ImageIcon icon= new ImageIcon(getClass().getResource("/images/logoLogin.png"));
			ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), 10));
			lblLogo.setIcon(img);
		}
		return lblLogo;
	}
	
	private JLabel getLblUserIcon() {
		if (lblUserIcon == null) {
			lblUserIcon = new JLabel("");
			lblUserIcon.setBounds(104, 256, 33, 33);
			ImageIcon icon= new ImageIcon(getClass().getResource("/images/User.png"));
			ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblUserIcon.getWidth(), lblUserIcon.getHeight(), 10));
			lblUserIcon.setIcon(img);
		}
		return lblUserIcon;
	}
	private JLabel getLbllock() {
		if (lbllock == null) {
			lbllock = new JLabel("");
			lbllock.setBounds(104, 309, 33, 33);
			ImageIcon icon= new ImageIcon(getClass().getResource("/images/Lock.png"));
			ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lbllock.getWidth(), lbllock.getHeight(), 10));
			lbllock.setIcon(img);
		}
		return lbllock;
	}
	private JButton getBtnsesion() {
		if (btnsesion == null) {
			btnsesion = new JButton("INICIAR SESI\u00D3N");
			btnsesion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String user = campoUser.getText();
					String contra = campoContrasena.getText();
					if(!validarUC(user,contra))
						{
							error.setVisible(true);
						}
					else
					{
						error.setVisible(false);
						Principal p = new Principal();
						p.setVisible(true);
						dispose();
					}
				}
			});
			btnsesion.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnsesion.setBounds(165, 384, 161, 45);
			btnsesion.setBackground(Colores.getVerde());
			btnsesion.setForeground(Colores.getAzulbarra());
		}
		return btnsesion;
	}
	
	protected boolean validarUC(String user, String contrasena) {
		
		boolean x=true;
		
		if(!user.equals("Ruben")||contrasena.length()>10)
		{
			x=false;
		}
		
		return x;
	}
}
