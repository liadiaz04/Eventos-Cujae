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
import javax.swing.JCheckBoxMenuItem;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JLabel lblEventosCujae;
	private JLabel lblNewLabel_1;
	private JMenuBar menuBar;
	private JMenu mnSesion;
	private JMenu mnNewMenu_1;
	private JMenuItem mnIUser;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmCerrarSesin;
	private JMenu mnNewMenu;
	private JMenu mnReportes;
	private JMenuItem mntmReporte;
	private JMenu mnAadirEvento;
	private JMenuItem mntmEventoSimple;
	private JMenuItem mntmEventoSimpleCon;
	private JMenuItem mntmEventoCompuesto;
	private JMenuItem mntmUsuariosQue;
	private JMenu mnReportesPorRango;
	private JMenuItem mntmLugaresCon;
	private JMenuItem mntmEventoMasValorado;
	private JMenuItem mntmSalir;
	private JMenuItem mntmEliminarevento;

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
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getMenuBar_2());
		contentPane.add(getLblEventosCujae());
	}
	private JLabel getLblEventosCujae() {
		if (lblEventosCujae == null) {
			lblEventosCujae = new JLabel("EVENTOS CUJAE");
			lblEventosCujae.setBounds(1731, 81, 171, 48);
			lblEventosCujae.setFont(new Font("Tahoma", Font.PLAIN, 23));
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
	private JMenuBar getMenuBar_2() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBorderPainted(false);
			menuBar.setBounds(0, 0, 1923, 80);
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
			mnSesion.add(getMntmSalir());
			
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
			mnIUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
			mnIUser.setForeground(Colores.getVerde());
			mnIUser.setBackground(Colores.getAzulbarra());
		}
		return mnIUser;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Ver Eventos");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						VerEventos dialog = new VerEventos(Principal.this);
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			mntmNewMenuItem_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			mntmNewMenuItem_1.setBackground(Colores.getAzulbarra());
			mntmNewMenuItem_1.setForeground(Colores.getVerde());
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmCerrarSesin() {
		if (mntmCerrarSesin == null) {
			mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
			mntmCerrarSesin.setForeground(new Color(0, 165, 83));
			mntmCerrarSesin.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
			mnNewMenu.add(getMnAadirEvento());
			mnNewMenu.add(getMntmEliminarevento());
		}
		return mnNewMenu;
	}
	private JMenu getMnReportes() {
		if (mnReportes == null) {
			mnReportes = new JMenu("Reportes");
			mnReportes.setIcon(new ImageIcon(Principal.class.getResource("/images/Menu.png")));
			mnReportes.setFont(new Font("Tahoma", Font.PLAIN, 23));
			mnReportes.setForeground(Colores.getVerde());
			mnReportes.add(getMntmReporte());
			mnReportes.add(getMntmUsuariosQue());
			mnReportes.add(getMnReportesPorRango());
		}
		return mnReportes;
	}
	private JMenuItem getMntmReporte() {
		if (mntmReporte == null) {
			mntmReporte = new JMenuItem("Eventos de un usuario");
			mntmReporte.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return mntmReporte;
	}
	private JMenu getMnAadirEvento() {
		if (mnAadirEvento == null) {
			mnAadirEvento = new JMenu("A\u00F1adir Evento");
			mnAadirEvento.setFont(new Font("Tahoma", Font.PLAIN, 20));
			mnAadirEvento.add(getMntmEventoSimple());
			mnAadirEvento.add(getMntmEventoSimpleCon());
			mnAadirEvento.add(getMntmEventoCompuesto());
		}
		return mnAadirEvento;
	}
	private JMenuItem getMntmEventoSimple() {
		if (mntmEventoSimple == null) {
			mntmEventoSimple = new JMenuItem("Evento Simple");
			mntmEventoSimple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						EventoSimpleMaker dialog = new EventoSimpleMaker(Principal.this);
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			mntmEventoSimple.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return mntmEventoSimple;
	}
	private JMenuItem getMntmEventoSimpleCon() {
		if (mntmEventoSimpleCon == null) {
			mntmEventoSimpleCon = new JMenuItem("Evento Simple con Participaci\u00F3n");
			mntmEventoSimpleCon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return mntmEventoSimpleCon;
	}
	private JMenuItem getMntmEventoCompuesto() {
		if (mntmEventoCompuesto == null) {
			mntmEventoCompuesto = new JMenuItem("Evento Compuesto");
			mntmEventoCompuesto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return mntmEventoCompuesto;
	}
	private JMenuItem getMntmUsuariosQue() {
		if (mntmUsuariosQue == null) {
			mntmUsuariosQue = new JMenuItem("10 usuarios que m\u00E1s han participado en un tipo de evento");
			mntmUsuariosQue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return mntmUsuariosQue;
	}
	private JMenu getMnReportesPorRango() {
		if (mnReportesPorRango == null) {
			mnReportesPorRango = new JMenu("Reportes por rango de tiempo");
			mnReportesPorRango.setFont(new Font("Tahoma", Font.PLAIN, 20));
			mnReportesPorRango.add(getMntmLugaresCon());
			mnReportesPorRango.add(getMntmEventoMasValorado());
		}
		return mnReportesPorRango;
	}
	private JMenuItem getMntmLugaresCon() {
		if (mntmLugaresCon == null) {
			mntmLugaresCon = new JMenuItem("Top 10 lugares con mas eventos realizados");
			mntmLugaresCon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return mntmLugaresCon;
	}
	private JMenuItem getMntmEventoMasValorado() {
		if (mntmEventoMasValorado == null) {
			mntmEventoMasValorado = new JMenuItem("Evento mas valorado");
			mntmEventoMasValorado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return mntmEventoMasValorado;
	}
	private JMenuItem getMntmSalir() {
		if (mntmSalir == null) {
			mntmSalir = new JMenuItem("Salir");
			mntmSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			mntmSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
			mntmSalir.setForeground(Colores.getVerde());
		}
		return mntmSalir;
	}
	private JMenuItem getMntmEliminarevento() {
		if (mntmEliminarevento == null) {
			mntmEliminarevento = new JMenuItem("Eliminar Evento");
			mntmEliminarevento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return mntmEliminarevento;
	}
}
