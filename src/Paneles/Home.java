package Paneles;

import javax.swing.JPanel;
import java.awt.Color;
import ToolsMethods.Tools;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import Registro.JLogin;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import MenuAdmin.JMenuAdmin;
import javax.swing.JSeparator;



public class Home extends JPanel {
	Tools T = new Tools();
	@SuppressWarnings("unused")
	private JMenuAdmin instanciaJMenuAdmin;
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Home(JMenuAdmin instanciaJMenuAdmin) {
		this.instanciaJMenuAdmin = instanciaJMenuAdmin;
		setLayout(null);
		setBounds(0,0,481, 452);
		setBackground(new Color(251, 251, 251));
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new LineBorder(new Color(0, 128, 128), 1, true));
		panel_4_1.setBackground(new Color(90, 152, 243));
		panel_4_1.setBounds(353, 156, 118, 89);
		add(panel_4_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(128, 128, 128));
		separator_3.setBorder(new LineBorder(new Color(192, 192, 192), 7));
		separator_3.setBackground(new Color(93, 93, 93));
		separator_3.setBounds(108, 0, 10, 89);
		panel_4_1.add(separator_3);
		
		JLabel lblAppointments_1_1_1 = new JLabel("Bills");
		lblAppointments_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppointments_1_1_1.setForeground(Color.WHITE);
		lblAppointments_1_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblAppointments_1_1_1.setBounds(12, 52, 89, 27);
		panel_4_1.add(lblAppointments_1_1_1);
		
		JLabel NumAppointments_1_1 = new JLabel("150");
		NumAppointments_1_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		NumAppointments_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		NumAppointments_1_1.setForeground(Color.WHITE);
		NumAppointments_1_1.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 33));
		NumAppointments_1_1.setBounds(23, 11, 74, 43);
		panel_4_1.add(NumAppointments_1_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 128, 128), 1, true));
		panel_4.setBackground(new Color(90, 152, 243));
		panel_4.setBounds(224, 156, 119, 89);
		add(panel_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(128, 128, 128));
		separator_2.setBorder(new LineBorder(new Color(192, 192, 192), 7));
		separator_2.setBackground(new Color(93, 93, 93));
		separator_2.setBounds(0, 0, 10, 89);
		panel_4.add(separator_2);
		
		JLabel lblAppointments_1_1 = new JLabel("Doctors");
		lblAppointments_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppointments_1_1.setForeground(Color.WHITE);
		lblAppointments_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblAppointments_1_1.setBounds(19, 52, 89, 27);
		panel_4.add(lblAppointments_1_1);
		
		JLabel NumAppointments_1 = new JLabel("");
		NumAppointments_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		NumAppointments_1.setHorizontalAlignment(SwingConstants.CENTER);
		NumAppointments_1.setForeground(Color.WHITE);
		NumAppointments_1.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 33));
		NumAppointments_1.setBounds(30, 11, 68, 43);
		T.GetData(NumAppointments_1, "Doctores");
		panel_4.add(NumAppointments_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 128, 128), 1, true));
		panel.setBounds(224, 56, 247, 89);
		panel.setBackground(new Color(7, 43, 95));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblClients = new JLabel("Clients");
		lblClients.setForeground(new Color(255, 255, 255));
		lblClients.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblClients.setBounds(172, 55, 144, 27);
		panel.add(lblClients);
		
		JLabel NumClient = new JLabel("");
		NumClient.setHorizontalAlignment(SwingConstants.RIGHT);
		NumClient.setForeground(Color.WHITE);
		NumClient.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 33));
		NumClient.setBounds(162, 9, 75, 43);
		T.GetData(NumClient,"Pacientes");
		panel.add(NumClient);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(128, 128, 128));
		separator.setBorder(new LineBorder(new Color(192, 192, 192), 7));
		separator.setBackground(new Color(93, 93, 93));
		separator.setBounds(-1, 0, 10, 89);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 128, 128)));
		panel_1.setBounds(224, 252, 247, 89);
		panel_1.setBackground(new Color(7, 43, 95));
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAppointments = new JLabel("Appointments");
		lblAppointments.setForeground(new Color(255, 255, 255));
		lblAppointments.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblAppointments.setBounds(93, 51, 144, 27);
		panel_1.add(lblAppointments);
		
		JLabel NumAppointments = new JLabel("");
		NumAppointments.setHorizontalAlignment(SwingConstants.RIGHT);
		NumAppointments.setHorizontalTextPosition(SwingConstants.RIGHT);
		NumAppointments.setForeground(new Color(255, 255, 255));
		NumAppointments.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 33));
		NumAppointments.setBounds(163, 12, 74, 43);
		T.GetData(NumAppointments, "Citas");
		panel_1.add(NumAppointments);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(128, 128, 128));
		separator_1.setBorder(new LineBorder(new Color(192, 192, 192), 7));
		separator_1.setBackground(new Color(93, 93, 93));
		separator_1.setBounds(0, 0, 10, 89);
		panel_1.add(separator_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(9, 49, 104));
		panel_2.setBounds(0, 0, 481, 45);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblUsernames = new JLabel("User");
		lblUsernames.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsernames.setForeground(Color.WHITE);
		lblUsernames.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		lblUsernames.setBounds(265, 9, 165, 27);
		panel_2.add(lblUsernames);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\menu.png"));
		lblNewLabel_4.setBounds(439, 8, 46, 30);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JLogin login = new JLogin();
				login.ShowVentana();
				instanciaJMenuAdmin.CloseWindows();
				
			}
		});
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\logout2.png"));
		lblNewLabel.setBounds(12, 10, 30, 23);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 128, 128)));
		panel_3.setBackground(new Color(3, 21, 48));
		panel_3.setBounds(10, 56, 208, 285);
		add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\tooth2.png"));
		lblNewLabel_2.setBounds(35, 8, 145, 182);
		panel_3.add(lblNewLabel_2);
		
		
		JLabel hora = new JLabel("");
		T.ObtenerHora(hora);
		hora.setForeground(new Color(255, 255, 255));
		hora.setFont(new Font("Tahoma", Font.BOLD, 30));
		hora.setBounds(35, 166, 145, 68);
		panel_3.add(hora);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(128, 128, 128));
		separator_4.setBorder(new LineBorder(new Color(192, 192, 192), 7));
		separator_4.setBackground(new Color(93, 93, 93));
		separator_4.setBounds(0, 271, 208, 14);
		panel_3.add(separator_4);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 128, 128)));
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(90, 152, 243));
		panel_1_1.setBounds(10, 352, 461, 89);
		add(panel_1_1);
		
		JLabel lblAppointments_1 = new JLabel("Procedures Medicals");
		lblAppointments_1.setForeground(Color.WHITE);
		lblAppointments_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblAppointments_1.setBounds(12, 30, 260, 27);
		panel_1_1.add(lblAppointments_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("150");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 33));
		lblNewLabel_1_2.setBounds(379, 21, 86, 43);
		T.GetData(lblNewLabel_1_2, "ProcedimientosMedicos");
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\9df3722f9a8265f473ef6f1503279b80.jpg"));
		lblNewLabel_1.setBounds(0, 45, 481, 407);
		add(lblNewLabel_1);
		
	}
	
}
