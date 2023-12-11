package MenuRegisters;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import ConexionBD.Conexion;
import ToolsMethods.Tools;

import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class RegistrarCitas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	JFormattedTextField FechaTxt;
	Tools t = new Tools();
	DefaultTableModel modelo =t.MostrarTabla("Citas");

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
		
		JComboBox<Object> DoctorBox = new JComboBox<Object>();
		t.CmbSpecialty(DoctorBox,"Doctores","Nombres");
		DoctorBox.setBounds(9, 38, 209, 22);
		panelpacientes.add(DoctorBox);
		// Agregar Datos
		

		JComboBox<Object> PacientesBox = new JComboBox<Object>();
		t.CmbSpecialty(PacientesBox,"Pacientes","Nombre");
		PacientesBox.setBounds(10, 84, 209, 22);
		panelpacientes.add(PacientesBox);
		

		FechaTxt = new JFormattedTextField();
		FechaTxt.setColumns(3);
		FechaTxt.setBounds(11, 128, 130, 23);
			// Tratar de poner formato
		panelpacientes.add(FechaTxt);
		
		JComboBox<Object> ProcedimientoBox = new JComboBox<Object>();
		t.CmbSpecialty(ProcedimientoBox, "ProcedimientosMedicos", "Nombre");
		ProcedimientoBox.setBounds(10, 180, 209, 22);
		panelpacientes.add(ProcedimientoBox);	
		
	
		//Hacer lista de horas formato 24 horas and a half;
		JLabel labelHoras = new JLabel("Horas:");
		labelHoras.setForeground(new Color(5, 30, 67));
		labelHoras.setFont(new Font("Roboto", Font.BOLD, 11));
		labelHoras.setBounds(165, 111, 125, 14);
		panelpacientes.add(labelHoras);
		
		JComboBox<String> comboBox_Horas = new JComboBox<String>();
		comboBox_Horas.setBounds(165, 129, 53, 21);
		
		String[] Horarios = new String[] {
			"8:00", "8:30 " , "9:00 ", "9:30", "10:00" , "10:30" , "11:00" ,"11:30" , "12:00" , "12:30" , 
		"13:00" , "13:30" , "14:00" , "14:30" , "15:00" , "15:30" , "16:00" , "16:30" , "17:00" , "17:30" , 
					"18:00" , "18:30" , "19:00"
		};
		comboBox_Horas.setModel(new DefaultComboBoxModel<>(Horarios));
		panelpacientes.add(comboBox_Horas);
	
		
		JPanel panelbotones = new JPanel();
		panelbotones.setLayout(null);
		panelbotones.setBackground(new Color(251, 251, 251));
		panelbotones.setBounds(248, 28, 223, 229);
		add(panelbotones);
		
		JSeparator separadorbotones = new JSeparator();
		separadorbotones.setBackground(new Color(0, 0, 64));
		separadorbotones.setBounds(1, 226, 226, 10);
		panelbotones.add(separadorbotones);
		
		//Boton de guardado/Agregar
		JButton btnSave = new JButton("Save");
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				
				
				if (FechaTxt.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog( null, "Todos los campos deben ser completados");
				}else {	
							
					
								String procedimiento = (String) ProcedimientoBox.getSelectedItem();
								String hora = (String) comboBox_Horas.getSelectedItem();
									try {
										
										
										String doctor = (String) DoctorBox.getSelectedItem();
										String paciente = (String) PacientesBox.getSelectedItem();
										
										Statement sql2 = Conexion.EstablecerConexion().createStatement();
										String consultaDoc="Select DoctorID from Doctores where Nombres = '"+ doctor +"'";
										String consultaPaciente="Select PacienteID from Pacientes where Nombre = '"+ paciente +"'";
										
										ResultSet resDoc = sql2.executeQuery(consultaDoc);
										int comboBox_ID = 0;
										
										while(resDoc.next()) {
										comboBox_ID = resDoc.getInt("DoctorID");	
										}
										
										ResultSet resPac = sql2.executeQuery(consultaPaciente);
										int comboBox2_ID = 0;
										while(resPac.next()) {
										comboBox2_ID = resPac.getInt("PacienteID");
										}
										
										
										
										String consulta2 = "Insert into Citas (DoctorID, PacienteID, Fecha, hora, procedures)values("
											+ "'" + comboBox_ID+"'," 	
											+ "'" + comboBox2_ID + "',"
											+ "'" + FechaTxt.getText()+ "',"
											+ "'" + hora + "',"
											+ "'" + procedimiento
											+ "');";		
										
										sql2.executeUpdate(consulta2);
										
										Statement sql3 = Conexion.EstablecerConexion().createStatement();	
										String consulta3 = "select CitaID From Citas where Fecha = '"+ FechaTxt.getText() +"' and hora = '"+ hora +"';";
										ResultSet res = sql3.executeQuery(consulta3);
										
										int id;
										String Sid = "";
											while(res.next()) {
												id = res.getInt("CitaID");
												Sid = String.valueOf(id);
											}
											
											Object[] nuevaFila = {Sid,comboBox_ID,comboBox2_ID, FechaTxt.getText(), hora, procedimiento };
											
										modelo.addRow(nuevaFila);
										modelo.fireTableDataChanged();
										resPac.close();
										resDoc.close();
										sql3.close();
										sql2.close();
										res.close();
										Conexion.EstablecerConexion().close();
										
									}catch(SQLException ex) {	
										JOptionPane.showMessageDialog(null, ex.toString());
									}
							}						
	
				
			}
		});
		btnSave.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\diskette.png"));
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnSave.setFocusable(false);
		btnSave.setFocusTraversalKeysEnabled(false);
		btnSave.setFocusPainted(false);
		btnSave.setBorderPainted(false);
		btnSave.setBackground(new Color(7, 43, 95));
		btnSave.setBounds(10, 50, 203, 34);
		panelbotones.add(btnSave);
		
		
		
		JButton btnNew = new JButton("New");
		btnNew.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\add.png"));
		btnNew.setForeground(Color.WHITE);
		btnNew.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNew.setFocusable(false);
		btnNew.setFocusTraversalKeysEnabled(false);
		btnNew.setFocusPainted(false);
		btnNew.setBorderPainted(false);
		btnNew.setBackground(new Color(7, 43, 95));
		btnNew.setBounds(10, 107, 203, 34);
		panelbotones.add(btnNew);
		
		btnNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}			
		});
		
		JPanel panelTable = new JPanel();
		panelTable.setBounds(10, 282, 461, 152);
		add(panelTable);
		panelTable.setLayout(null);
		
		JSeparator tableSeparator = new JSeparator();
		tableSeparator.setBounds(0, 150, 461, 10);
		tableSeparator.setBackground(new Color(0, 0, 64));
		panelTable.add(tableSeparator);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(0, 0, 461, 149);
		panelTable.add(scrollPane);
		
		//TABLA
		table = new JTable(modelo);
		scrollPane.setViewportView(table);
		table.setGridColor(UIManager.getColor("ScrollBar.background"));
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
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
