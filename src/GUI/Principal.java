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

import javax.swing.JMenuItem;

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
	private JMenuBar menuBar;
	private JMenu mnSesion;
	private JMenu mnNewMenu_1;
	private JMenuItem mnIUser;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmCerrarSesin;
	private JMenu mnNewMenu;
	private JMenuItem mntmAadirEvento;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnEliminar;
	private JMenuItem mntmUsuario;
	private JMenuItem mntmEvento;
	private JMenu mnReportes;
	private JMenuItem mntmReporte;

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
		//setUndecorated(true);
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
		contentPane.add(getMenuBar_2());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(0, 94, 1923, 80);
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
					try {
						Eventos dialog = new Eventos(Principal.this);
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
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
					try {
						Administracion dialog = new Administracion(Principal.this);
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
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
	private JMenuBar getMenuBar_2() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBorderPainted(false);
			menuBar.setBounds(0, 0, 1923, 48);
			menuBar.add(getMnSesion());
			menuBar.add(getMnNewMenu_1());
			menuBar.setBackground(Colores.getAzulbarra());
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnReportes());
		}
		return menuBar;
	}
	public JMenu getMnSesion() {
		if (mnSesion == null) {
			mnSesion = new JMenu("Sesi\u00F3n");
			mnSesion.setIcon(new ImageIcon(Principal.class.getResource("/images/Contacts.png")));
			mnSesion.setFont(new Font("Tahoma", Font.PLAIN, 23));
			mnSesion.add(getMnIUser());
			mnSesion.setForeground(Colores.getVerde());
			mnSesion.add(getMntmCerrarSesin());
			
		}
		return mnSesion;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("Eventos");
			mnNewMenu_1.setIcon(new ImageIcon(Principal.class.getResource("/images/News.png")));
			mnNewMenu_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
			mnNewMenu_1.add(getMntmNewMenuItem_1());
			mnNewMenu_1.setForeground(Colores.getVerde());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMnIUser() {
		if (mnIUser == null) {
			mnIUser = new JMenuItem("Usuario");
			mnIUser.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						mnSesion.setIcon(new ImageIcon(Principal.class.getResource("/images/Contactsblanco.png")));
						mnSesion.setForeground(Colores.getBlancuzo());
						Sesion dialog = new Sesion(Principal.this);
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			mnIUser.setIcon(new ImageIcon(Principal.class.getResource("/images/ContactsI.png")));
			mnIUser.setFont(new Font("Tahoma", Font.PLAIN, 21));
			mnIUser.setForeground(Colores.getVerde());
			mnIUser.setBackground(Colores.getAzulbarra());
		}
		return mnIUser;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Ver Eventos");
			mntmNewMenuItem_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
			mntmNewMenuItem_1.setBackground(Colores.getAzulbarra());
			mntmNewMenuItem_1.setForeground(Colores.getVerde());
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmCerrarSesin() {
		if (mntmCerrarSesin == null) {
			mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
			mntmCerrarSesin.setForeground(new Color(0, 165, 83));
			mntmCerrarSesin.setFont(new Font("Tahoma", Font.PLAIN, 21));
			mntmCerrarSesin.setBackground(new Color(6, 43, 63));
		}
		return mntmCerrarSesin;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Administraci\u00F3n");
			mnNewMenu.setIcon(new ImageIcon(Principal.class.getResource("/images/Opened Folder.png")));
			mnNewMenu.setFont(new Font("Tahoma", Font.PLAIN, 23));
			mnNewMenu.setForeground(Colores.getVerde());
			mnNewMenu.add(getMntmAadirEvento());
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMnEliminar());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmAadirEvento() {
		if (mntmAadirEvento == null) {
			mntmAadirEvento = new JMenuItem("A\u00F1adir Evento");
		}
		return mntmAadirEvento;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("A\u00F1adir Usuario");
		}
		return mntmNewMenuItem;
	}
	private JMenu getMnEliminar() {
		if (mnEliminar == null) {
			mnEliminar = new JMenu("Eliminar");
			mnEliminar.add(getMntmUsuario());
			mnEliminar.add(getMntmEvento());
		}
		return mnEliminar;
	}
	private JMenuItem getMntmUsuario() {
		if (mntmUsuario == null) {
			mntmUsuario = new JMenuItem("Usuario");
		}
		return mntmUsuario;
	}
	private JMenuItem getMntmEvento() {
		if (mntmEvento == null) {
			mntmEvento = new JMenuItem("Evento");
		}
		return mntmEvento;
	}
	private JMenu getMnReportes() {
		if (mnReportes == null) {
			mnReportes = new JMenu("Reportes");
			mnReportes.setIcon(new ImageIcon(Principal.class.getResource("/images/Menu.png")));
			mnReportes.setFont(new Font("Tahoma", Font.PLAIN, 23));
			mnReportes.setForeground(Colores.getVerde());
			mnReportes.add(getMntmReporte());
		}
		return mnReportes;
	}
	private JMenuItem getMntmReporte() {
		if (mntmReporte == null) {
			mntmReporte = new JMenuItem("Reporte 1");
		}
		return mntmReporte;
	}
}
