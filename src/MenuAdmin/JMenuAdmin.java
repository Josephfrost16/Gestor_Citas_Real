package MenuAdmin;

import java.awt.EventQueue;
import ToolsMethods.Ventana;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import MenuRegisters.RegisterDoctor;
import MenuRegisters.RegisterProcess;
import MenuRegisters.Pacientes;
import MenuRegisters.RegistrarCitas;
import Paneles.Citas;
import Paneles.Home;
import ToolsMethods.Tools;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;


public class JMenuAdmin implements Ventana {

	private static JMenuAdmin instanciaUnica = null;
	Tools T = new Tools();
	private JFrame frame;
	JPanel PanelDespliegue;
	JPanel contenedor, panelHome, panelAppoint,panelRegister,panelPays;
	JLabel LblHome, lblRegister, lblAppointment, lblPayments,FPays,FPaysAzul,FHome,FHomeAzul,FRegister,FRegisterAzul,FAppoint, FAppointAzul;
	
	Color azul = new Color(10, 59, 129);
	Color blanco = new Color(255, 255, 255);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenuAdmin window = new JMenuAdmin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	private JMenuAdmin() {
		initialize();
		ShowHome();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 700, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBackground(new Color(10, 59, 129));
		panel.setBounds(0, 0, 203, 452);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		contenedor = new JPanel(new BorderLayout());
		contenedor.setBounds(203, 0, 481, 452);
		frame.getContentPane().add(contenedor);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(10, 59, 129));
		panel_1.setBounds(33, 15, 135, 41);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOdomtotech = new JLabel("ODONTODOM\r\n");
		lblOdomtotech.setForeground(Color.WHITE);
		lblOdomtotech.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblOdomtotech.setBounds(3, -11, 193, 65);
		panel_1.add(lblOdomtotech);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 60, 162, 3);
		panel.add(separator);

		
		panelHome = new JPanel();
		panelHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ShowHome();
			}
		});
		panelHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelHome.setBackground(new Color(10, 59, 129));
		panelHome.setBounds(-5, 87, 208, 54);
		panel.add(panelHome);
		panelHome.setLayout(null);
		
		FHome = new JLabel("");
		FHome.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\home.png"));
		FHome.setBounds(33, 4, 32, 43);
		panelHome.add(FHome);
		
		FHomeAzul = new JLabel("");
		FHomeAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\home azul.png"));
		FHomeAzul.setBounds(33, 4, 32, 43);
		panelHome.add(FHomeAzul);
		
		LblHome = new JLabel("Home");
		LblHome.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		LblHome.setForeground(new Color(255, 255, 255));
		LblHome.setBounds(67, 19, 46, 14);
		panelHome.add(LblHome);
		
		T.pintarPanelYLabel(panelHome, LblHome,FHome, blanco,azul);
		
		panelAppoint = new JPanel();
		panelAppoint.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ShowAppointment();
			}
		});
		panelAppoint.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelAppoint.setBackground(new Color(10, 59, 129));
		panelAppoint.setBounds(-5, 140, 208, 54);
		panel.add(panelAppoint);
		panelAppoint.setLayout(null);
		
		FAppoint = new JLabel("");
		FAppoint.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\calendar.png"));
		FAppoint.setBounds(36, 5, 32, 43);
		panelAppoint.add(FAppoint);
		
		FAppointAzul = new JLabel("");
		FAppointAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\calendarAzul.png"));
		FAppointAzul.setBounds(36, 5, 32, 43);
		panelAppoint.add(FAppointAzul);
		
		lblAppointment = new JLabel("Appointments");
		lblAppointment.setForeground(Color.WHITE);
		lblAppointment.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblAppointment.setBounds(68, 20, 106, 14);
		panelAppoint.add(lblAppointment);
		
		T.pintarPanelYLabel(panelAppoint, lblAppointment, FAppoint, blanco,azul);
		
		panelRegister = new JPanel();
		panelRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ShowMenuRegister();
			}
		});
		panelRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelRegister.setBackground(new Color(10, 59, 129));
		panelRegister.setBounds(-5, 193, 208, 54);
		panel.add(panelRegister);
		panelRegister.setLayout(null);
		
		FRegister = new JLabel("");
		FRegister.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\profile (1)22.png"));
		FRegister.setBounds(36, 5, 32, 43);
		panelRegister.add(FRegister);
		
		FRegisterAzul = new JLabel("");
		FRegisterAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\profile (2)2.png"));
		FRegisterAzul.setBounds(36, 5, 32, 43);
		panelRegister.add(FRegisterAzul);
		
		lblRegister = new JLabel("Register");
		lblRegister.setForeground(Color.WHITE);
		lblRegister.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblRegister.setBounds(69, 17, 187, 23);
		panelRegister.add(lblRegister);
		
		T.pintarPanelYLabel(panelRegister, lblRegister, FRegister, blanco,azul);

		

			
	}
	
	void EliminarVentanas() {
		contenedor.removeAll();	
	}

	@Override
	public void ShowVentana() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
	
	 public static  JMenuAdmin obtenerInstancia() {
	        if (instanciaUnica == null) {
	            instanciaUnica = new  JMenuAdmin();
	        }
	        return instanciaUnica;
	    }
	
	 public void ShowPatients() {
			EliminarVentanas();
			Pacientes p = new Pacientes(this);
			p.setBounds(203, 0, 481, 452);
			contenedor.add(p, BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint(); 	
		}
		
		public void ShowHome() {
			EliminarVentanas();
			Home h = new Home(this);
			h.setBounds(203, 0, 481, 452);
			contenedor.add(h,  BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint();
		}
		
		public void ShowAppointment() {
			EliminarVentanas();
			Citas c = new Citas();
			c.setBounds(203, 0, 481, 452);
			contenedor.add(c, BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint();
		}
		
		public void ShowRegisterAppointment() {
			EliminarVentanas();
			RegistrarCitas rg = new RegistrarCitas();
			rg.setBounds(0, 0, 481, 452);
			contenedor.add(rg, BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint();
		}
		
		
		public void ShowMenuRegister() {
			EliminarVentanas();
			MenuRegister re = new MenuRegister(this);
			re.setBounds(0, 0, 481, 452);
			contenedor.add(re, BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint();
		}
		
		
		public void ShowDoctor() {
			EliminarVentanas();
			RegisterDoctor doc = new RegisterDoctor(this);
			doc.setBounds(0, 0, 481, 452);
			contenedor.add(doc, BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint();
		}
		
		public void ShowProcess() {
			EliminarVentanas();
			RegisterProcess doc = new RegisterProcess(this);
			doc.setBounds(0, 0, 481, 452);
			contenedor.add(doc, BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint();
		}
	
	@SuppressWarnings("deprecation")
	public void EnableWindows() {
		frame.enable();
	}
	
	@SuppressWarnings("deprecation")
	public void DisableWindows() {
		frame.disable();
	}
	
	public void CloseWindows() {
		frame.dispose();
	}
}
