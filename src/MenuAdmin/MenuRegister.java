package MenuAdmin;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import java.awt.Cursor;

public class MenuRegister extends JPanel {
	
	@SuppressWarnings("unused")
	private JMenuAdmin instancia;
	
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public MenuRegister(JMenuAdmin instanciaJMenuAdmin) {
		this.instancia = instanciaJMenuAdmin;
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 481, 452);
		setLayout(null);
		
		JPanel panelPatients = new JPanel();
		panelPatients.addMouseListener(new MouseAdapter() {	
			public void mousePressed(MouseEvent e) {
				instancia.ShowPatients();
			}
		});	
		panelPatients.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelPatients.setBorder(new LineBorder(new Color(10, 59, 129)));
		panelPatients.setBackground(new Color(255, 255, 255));
		panelPatients.setBounds(16, 19, 213, 193);
		add(panelPatients);
		panelPatients.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(10, 59, 129), 9));
		separator.setBounds(199, 0, 14, 193);
		panelPatients.add(separator);
		
		JLabel FPatients = new JLabel("");
		FPatients.setHorizontalAlignment(SwingConstants.CENTER);
		FPatients.setHorizontalTextPosition(SwingConstants.CENTER);
		FPatients.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\Rpatient (2).png"));
		FPatients.setBounds(68, 41, 89, 94);
		panelPatients.add(FPatients);
		
		JLabel lblpatients = new JLabel("Patients");
		lblpatients.setHorizontalTextPosition(SwingConstants.CENTER);
		lblpatients.setHorizontalAlignment(SwingConstants.CENTER);
		lblpatients.setFont(new Font("Roboto Condensed", Font.BOLD, 21));
		lblpatients.setBounds(60, 137, 94, 27);
		panelPatients.add(lblpatients);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBorder(new LineBorder(new Color(10, 59, 129), 9));
		separator_3.setBounds(0, 0, 14, 193);
		panelPatients.add(separator_3);
		
		JLabel FPatientsAzul = new JLabel("");
		FPatientsAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\Rpatient W.png"));
		FPatientsAzul.setHorizontalTextPosition(SwingConstants.CENTER);
		FPatientsAzul.setHorizontalAlignment(SwingConstants.CENTER);
		FPatientsAzul.setBounds(68, 41, 89, 94);
		panelPatients.add(FPatientsAzul);
		
		pintar(panelPatients, lblpatients, FPatients);
		
		
		JPanel panelDoctor = new JPanel();
		panelDoctor.addMouseListener(new MouseAdapter() {	
			public void mousePressed(MouseEvent e) {
				instancia.ShowDoctor();
			}
		});	
		panelDoctor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelDoctor.setLayout(null);
		panelDoctor.setBorder(new LineBorder(new Color(10, 59, 129)));
		panelDoctor.setBackground(new Color(255, 255, 255));
		panelDoctor.setBounds(249, 19, 213, 193);
		add(panelDoctor);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(new Color(10, 59, 129), 9));
		separator_1.setBounds(199, 0, 14, 193);
		panelDoctor.add(separator_1);
		
		JLabel FDoctor = new JLabel("");
		FDoctor.setHorizontalAlignment(SwingConstants.CENTER);
		FDoctor.setHorizontalTextPosition(SwingConstants.CENTER);
		FDoctor.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\doctor.png"));
		FDoctor.setBounds(62, 37, 89, 94);
		panelDoctor.add(FDoctor);
		
		JLabel lbldoctor = new JLabel("Doctor");
		lbldoctor.setHorizontalTextPosition(SwingConstants.CENTER);
		lbldoctor.setHorizontalAlignment(SwingConstants.CENTER);
		lbldoctor.setFont(new Font("Roboto Condensed", Font.BOLD, 21));
		lbldoctor.setBounds(59, 135, 94, 27);
		panelDoctor.add(lbldoctor);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBorder(new LineBorder(new Color(10, 59, 129), 9));
		separator_4.setBounds(0, 0, 14, 193);
		panelDoctor.add(separator_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\doctor (1).png"));
		lblNewLabel_6.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(62, 37, 89, 94);
		panelDoctor.add(lblNewLabel_6);
		
		pintar(panelDoctor, lbldoctor, FDoctor);
		
		JPanel panelAppointment = new JPanel();
		panelAppointment.addMouseListener(new MouseAdapter() {	
			public void mousePressed(MouseEvent e) {
				instancia.ShowRegisterAppointment();
			}
		});	
		panelAppointment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelAppointment.setLayout(null);
		panelAppointment.setBorder(new LineBorder(new Color(10, 59, 129)));
		panelAppointment.setBackground(new Color(255, 255, 255));
		panelAppointment.setBounds(16, 236, 213, 193);
		add(panelAppointment);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBorder(new LineBorder(new Color(10, 59, 129), 9));
		separator_2.setBounds(199, 0, 14, 193);
		panelAppointment.add(separator_2);
		
		JLabel FAppoint = new JLabel("");
		FAppoint.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\medical-appointment.png"));
		FAppoint.setHorizontalTextPosition(SwingConstants.CENTER);
		FAppoint.setHorizontalAlignment(SwingConstants.CENTER);
		FAppoint.setBounds(62, 35, 89, 94);
		panelAppointment.add(FAppoint);
		
		JLabel lblappoint = new JLabel("Appointment");
		lblappoint.setHorizontalTextPosition(SwingConstants.CENTER);
		lblappoint.setHorizontalAlignment(SwingConstants.CENTER);
		lblappoint.setFont(new Font("Roboto Condensed", Font.BOLD, 21));
		lblappoint.setBounds(36, 131, 140, 27);
		panelAppointment.add(lblappoint);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBorder(new LineBorder(new Color(10, 59, 129), 9));
		separator_2_2.setBounds(0, 0, 14, 193);
		panelAppointment.add(separator_2_2);
		
		JLabel FAppointAzul = new JLabel("");
		FAppointAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\medical-appointment (1).png"));
		FAppointAzul.setHorizontalTextPosition(SwingConstants.CENTER);
		FAppointAzul.setHorizontalAlignment(SwingConstants.CENTER);
		FAppointAzul.setBounds(62, 35, 89, 94);
		panelAppointment.add(FAppointAzul);
		
		pintar(panelAppointment, lblappoint, FAppoint);
		
		JPanel panelProcedures = new JPanel();
		panelProcedures.addMouseListener(new MouseAdapter() {	
			public void mousePressed(MouseEvent e) {
				instancia.ShowProcess();
			}
		});	
		panelProcedures.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelProcedures.setLayout(null);
		panelProcedures.setBorder(new LineBorder(new Color(10, 59, 129)));
		panelProcedures.setBackground(new Color(255, 255, 255));
		panelProcedures.setBounds(249, 236, 213, 193);
		add(panelProcedures);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBorder(new LineBorder(new Color(10, 59, 129), 9));
		separator_2_1.setBounds(199, 0, 14, 193);
		panelProcedures.add(separator_2_1);
		
		JLabel FProcedures = new JLabel("");
		FProcedures.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\gear.png"));
		FProcedures.setHorizontalTextPosition(SwingConstants.CENTER);
		FProcedures.setHorizontalAlignment(SwingConstants.CENTER);
		FProcedures.setBounds(63, 35, 89, 94);
		panelProcedures.add(FProcedures);
		
		JLabel lblprocedures = new JLabel("procedures");
		lblprocedures.setHorizontalTextPosition(SwingConstants.CENTER);
		lblprocedures.setHorizontalAlignment(SwingConstants.CENTER);
		lblprocedures.setFont(new Font("Roboto Condensed", Font.BOLD, 21));
		lblprocedures.setBounds(37, 131, 140, 27);
		panelProcedures.add(lblprocedures);
		
		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setBorder(new LineBorder(new Color(10, 59, 129), 9));
		separator_4_1.setBounds(0, 0, 14, 193);
		panelProcedures.add(separator_4_1);
		
		JLabel FProceduresAzul = new JLabel("");
		FProceduresAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\gear (1).png"));
		FProceduresAzul.setHorizontalTextPosition(SwingConstants.CENTER);
		FProceduresAzul.setHorizontalAlignment(SwingConstants.CENTER);
		FProceduresAzul.setBounds(63, 35, 89, 94);
		panelProcedures.add(FProceduresAzul);
		
		pintar(panelProcedures, lblprocedures, FProcedures);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\9df3722f9a8265f473ef6f1503279b80.jpg"));
		lblNewLabel_4.setBounds(0, 0, 481, 452);
		add(lblNewLabel_4);
	}
	
	
	void pintar(JPanel panel, JLabel lbl, JLabel foto1) {
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new Color(10, 59, 129));
				lbl.setForeground(new Color(255, 255, 255));
				foto1.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new Color(255, 255, 255));
				lbl.setForeground(new Color(0,0,0));
				foto1.setVisible(true);
			}
		
		});	
	}
	
	
	
}
