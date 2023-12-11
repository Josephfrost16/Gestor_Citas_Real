package MenuRegisters;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class RegistrarCitas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public RegistrarCitas() {
		setBounds(0,0,481, 452);
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 64));
		separator_1.setBounds(10, 28, 461, 10);
		add(separator_1);
		
		JPanel panelpacientes = new JPanel();
		panelpacientes.setLayout(null);
		panelpacientes.setBackground(new Color(251, 251, 251));
		panelpacientes.setBounds(10, 28, 228, 229);
		add(panelpacientes);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 64));
		separator.setBounds(0, 226, 226, 10);
		panelpacientes.add(separator);
		
		JLabel lblname = new JLabel("Doctor:");
		lblname.setForeground(new Color(5, 30, 67));
		lblname.setFont(new Font("Roboto", Font.BOLD, 11));
		lblname.setBounds(10, 20, 131, 14);
		panelpacientes.add(lblname);
		
		JLabel lblproname = new JLabel("Pacientes:");
		lblproname.setForeground(new Color(5, 30, 67));
		lblproname.setFont(new Font("Roboto", Font.BOLD, 11));
		lblproname.setBounds(10, 65, 131, 14);
		panelpacientes.add(lblproname);
		
		JLabel lblemail = new JLabel("Fecha:");
		lblemail.setForeground(new Color(5, 30, 67));
		lblemail.setFont(new Font("Roboto", Font.BOLD, 11));
		lblemail.setBounds(9, 111, 125, 14);
		panelpacientes.add(lblemail);
		
		JLabel lblid = new JLabel("Procedimiento:");
		lblid.setForeground(new Color(5, 30, 67));
		lblid.setFont(new Font("Roboto", Font.BOLD, 11));
		lblid.setBounds(10, 156, 102, 14);
		panelpacientes.add(lblid);
		
		JComboBox<?> DoctorCmb = new JComboBox<Object>();
		DoctorCmb.setBounds(9, 38, 209, 22);
		panelpacientes.add(DoctorCmb);
		
		JComboBox<?> PacientesCmb = new JComboBox<Object>();
		PacientesCmb.setBounds(10, 84, 209, 22);
		panelpacientes.add(PacientesCmb);
		
		JFormattedTextField FechaTxt = new JFormattedTextField();
		FechaTxt.setColumns(3);
		FechaTxt.setBounds(11, 128, 205, 23);
		panelpacientes.add(FechaTxt);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 180, 209, 22);
		panelpacientes.add(comboBox);
		
		JPanel panelbotones = new JPanel();
		panelbotones.setLayout(null);
		panelbotones.setBackground(new Color(251, 251, 251));
		panelbotones.setBounds(248, 28, 223, 229);
		add(panelbotones);
		
		JSeparator separadorbotones = new JSeparator();
		separadorbotones.setBackground(new Color(0, 0, 64));
		separadorbotones.setBounds(1, 226, 226, 10);
		panelbotones.add(separadorbotones);
		
		JButton btnSave = new JButton("Save");
		btnSave.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\diskette.png"));
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnSave.setFocusable(false);
		btnSave.setFocusTraversalKeysEnabled(false);
		btnSave.setFocusPainted(false);
		btnSave.setBorderPainted(false);
		btnSave.setBackground(new Color(7, 43, 95));
		btnSave.setBounds(10, 35, 203, 34);
		panelbotones.add(btnSave);
		
		JButton btnUpdate = new JButton("Update\r\n");
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\edita.png"));
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnUpdate.setFocusable(false);
		btnUpdate.setFocusTraversalKeysEnabled(false);
		btnUpdate.setFocusPainted(false);
		btnUpdate.setBorderPainted(false);
		btnUpdate.setBackground(new Color(7, 43, 95));
		btnUpdate.setBounds(10, 78, 203, 34);
		panelbotones.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\delete.png"));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnDelete.setFocusable(false);
		btnDelete.setFocusTraversalKeysEnabled(false);
		btnDelete.setFocusPainted(false);
		btnDelete.setBorderPainted(false);
		btnDelete.setBackground(new Color(7, 43, 95));
		btnDelete.setBounds(10, 123, 203, 34);
		panelbotones.add(btnDelete);
		
		JButton btnNew = new JButton("New");
		btnNew.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\add.png"));
		btnNew.setForeground(Color.WHITE);
		btnNew.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNew.setFocusable(false);
		btnNew.setFocusTraversalKeysEnabled(false);
		btnNew.setFocusPainted(false);
		btnNew.setBorderPainted(false);
		btnNew.setBackground(new Color(7, 43, 95));
		btnNew.setBounds(10, 166, 203, 34);
		panelbotones.add(btnNew);
		
		JPanel panelTable = new JPanel();
		panelTable.setLayout(null);
		panelTable.setBounds(10, 282, 461, 152);
		add(panelTable);
		
		JSeparator tableSeparator = new JSeparator();
		tableSeparator.setBackground(new Color(0, 0, 64));
		tableSeparator.setBounds(0, 150, 461, 10);
		panelTable.add(tableSeparator);
		
		table = new JTable();
		table.setGridColor(UIManager.getColor("ScrollBar.background"));
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setBounds(0, 0, 439, 0);
		panelTable.add(table);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(10, 11, 441, 130);
		panelTable.add(scrollPane);
		
		JLabel lblAppointment = new JLabel("Appointment");
		lblAppointment.setForeground(new Color(0, 0, 64));
		lblAppointment.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblAppointment.setBounds(11, 9, 111, 14);
		add(lblAppointment);
		
		JLabel lblRegisteredPatients = new JLabel("Registered Patients");
		lblRegisteredPatients.setForeground(new Color(0, 0, 64));
		lblRegisteredPatients.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblRegisteredPatients.setBounds(10, 262, 148, 14);
		add(lblRegisteredPatients);

	}
}
