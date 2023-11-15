package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel lblEventosCujae;
	private JLabel lblNewLabel_1;
	private JLabel lblEventos;
	private JLabel lblSesion;
	private JLabel lblAdministracin;
	private JLabel lblAdminMarco;
	private JLabel lblEventosMarco;
	private JLabel lblSesionMarco;
	private JLabel lblReportes;
	private JLabel lblReportesMarco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/images/logoLogin.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setUndecorated(true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 1930, 1000);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/images/fondo.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLblNewLabel_1());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(0, 0, 1923, 80);
			panel.setBackground(Colores.getAzulbarra());
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLabel());
			panel.add(getLblEventosCujae());
			panel.add(getLblEventos());
			panel.add(getLblSesion());
			panel.add(getLblAdministracin());
			panel.add(getLblAdminMarco());
			panel.add(getLblEventosMarco());
			panel.add(getLblSesionMarco());
			panel.add(getLblReportes());
			panel.add(getLblReportesMarco());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					System.exit(EXIT_ON_CLOSE);
				}
			});
			lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/images/Close.png")));
			lblNewLabel.setBounds(1855, 13, 48, 48);
		}
		return lblNewLabel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setBounds(1769, 3, 74, 74);
			ImageIcon icon= new ImageIcon(getClass().getResource("/images/logoLogin.png"));
			ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), 10));
			label.setIcon(img);
		}
		return label;
	}
	private JLabel getLblEventosCujae() {
		if (lblEventosCujae == null) {
			lblEventosCujae = new JLabel("EVENTOS CUJAE");
			lblEventosCujae.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblEventosCujae.setBounds(1592, 16, 171, 48);
			lblEventosCujae.setForeground(Colores.getBlancuzo());
		}
		return lblEventosCujae;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Orgullosamente el Alma Cujae");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 33));
			lblNewLabel_1.setBounds(740, 860, 444, 61);
			lblNewLabel_1.setForeground(Colores.getVerde());
		}
		return lblNewLabel_1;
	}
	public JLabel getLblEventos() {
		if (lblEventos == null) {
			lblEventos = new JLabel("Eventos");
			lblEventos.addMouseListener(new MouseAdapter() {
				boolean clicked=false;
				@Override
				public void mouseEntered(MouseEvent e) {
					if(clicked)
						clicked=false;
					lblEventosMarco.setVisible(true);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					if(!clicked)
						lblEventosMarco.setVisible(false);
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					lblEventos.setIcon(new ImageIcon(Principal.class.getResource("/images/Newsblanco.png")));
					lblEventos.setForeground(Colores.getBlancuzo());
					lblEventosMarco.setVisible(true);
					clicked=true;
				}
			});
			lblEventos.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblEventos.setIcon(new ImageIcon(Principal.class.getResource("/images/News.png")));
			lblEventos.setBounds(210, 16, 138, 48);
			lblEventos.setForeground(Colores.getVerde());
		}
		return lblEventos;
	}
	public JLabel getLblSesion() {
		if (lblSesion == null) {
			lblSesion = new JLabel("Sesi\u00F3n");
			lblSesion.addMouseListener(new MouseAdapter() {
				boolean clicked=false;
				@Override
				public void mouseEntered(MouseEvent e) {
					if(clicked)
						clicked=false;
					lblSesionMarco.setVisible(true);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					if(!clicked)
					lblSesionMarco.setVisible(false);
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					lblSesion.setIcon(new ImageIcon(Principal.class.getResource("/images/Contactsblanco.png")));
					lblSesion.setForeground(Colores.getBlancuzo());
					lblSesionMarco.setVisible(true);
					clicked=true;
					try {
						Sesion dialog = new Sesion(Principal.this);
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			lblSesion.setIcon(new ImageIcon(Principal.class.getResource("/images/Contacts.png")));
			lblSesion.setForeground(new Color(0, 165, 83));
			lblSesion.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblSesion.setBounds(25, 16, 138, 48);
		}
		return lblSesion;
	}
	public JLabel getLblAdministracin() {
		if (lblAdministracin == null) {
			lblAdministracin = new JLabel("Administraci\u00F3n");
			lblAdministracin.addMouseListener(new MouseAdapter() {
				boolean clicked=false;
				@Override
				public void mouseEntered(MouseEvent e) {
					if(clicked)
						clicked=false;
					lblAdminMarco.setVisible(true);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					if(!clicked)
						lblAdminMarco.setVisible(false);
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					lblAdministracin.setIcon(new ImageIcon(Principal.class.getResource("/images/Opened FolderG.png")));
					lblAdministracin.setForeground(Colores.getBlancuzo());
					lblAdminMarco.setVisible(true);
					clicked=true;
				}
			});
			lblAdministracin.setIcon(new ImageIcon(Principal.class.getResource("/images/Opened Folder.png")));
			lblAdministracin.setForeground(new Color(0, 165, 83));
			lblAdministracin.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblAdministracin.setBounds(400, 16, 205, 48);
		}
		return lblAdministracin;
	}
	public JLabel getLblAdminMarco() {
		if (lblAdminMarco == null) {
			lblAdminMarco = new JLabel("");
			lblAdminMarco.setVisible(false);
			lblAdminMarco.setBounds(382, 0, 244, 80);
			ImageIcon icon= new ImageIcon(getClass().getResource("/images/marcoB.png"));
			ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblAdminMarco.getWidth(), lblAdminMarco.getHeight(), 10));
			lblAdminMarco.setIcon(img);
		}
		return lblAdminMarco;
	}
	public JLabel getLblEventosMarco() {
		if (lblEventosMarco == null) {
			lblEventosMarco = new JLabel("");
			lblEventosMarco.setVisible(false);
			lblEventosMarco.setBounds(195, 0, 188, 79);
			ImageIcon icon= new ImageIcon(getClass().getResource("/images/marcoB.png"));
			ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblEventosMarco.getWidth(), lblEventosMarco.getHeight(), 10));
			lblEventosMarco.setIcon(img);
		}
		return lblEventosMarco;
	}
	public JLabel getLblSesionMarco() {
		if (lblSesionMarco == null) {
			lblSesionMarco = new JLabel("");
			lblSesionMarco.setVisible(false);
			lblSesionMarco.setBounds(0, 0, 196, 79);
			ImageIcon icon= new ImageIcon(getClass().getResource("/images/marcoB.png"));
			ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblSesionMarco.getWidth(), lblSesionMarco.getHeight(), 10));
			lblSesionMarco.setIcon(img);
		}
		return lblSesionMarco;
	}
	public JLabel getLblReportes() {
		if (lblReportes == null) {
			lblReportes = new JLabel("Reportes");
			lblReportes.addMouseListener(new MouseAdapter() {
				boolean clicked=false;
				@Override
				public void mouseEntered(MouseEvent e) {
					if(clicked)
						clicked=false;
					lblReportesMarco.setVisible(true);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					if(!clicked)
						lblReportesMarco.setVisible(false);
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					lblReportes.setIcon(new ImageIcon(Principal.class.getResource("/images/Menublanco.png")));
					lblReportes.setForeground(Colores.getBlancuzo());
					lblReportesMarco.setVisible(true);
					clicked=true;
				}
			});
			lblReportes.setIcon(new ImageIcon(Principal.class.getResource("/images/Menu.png")));
			lblReportes.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblReportes.setBounds(650, 13, 157, 54);
			lblReportes.setForeground(Colores.getVerde());
		}
		return lblReportes;
	}
	public JLabel getLblReportesMarco() {
		if (lblReportesMarco == null) {
			lblReportesMarco = new JLabel("");
			lblReportesMarco.setVisible(false);
			lblReportesMarco.setBounds(625, 0, 188, 80);
			ImageIcon icon= new ImageIcon(getClass().getResource("/images/marcoB.png"));
			ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblReportesMarco.getWidth(), lblReportesMarco.getHeight(), 10));
			lblReportesMarco.setIcon(img);
		}
		return lblReportesMarco;
	}
}
