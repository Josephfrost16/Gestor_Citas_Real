package MenuRegisters;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import ConexionBD.Conexion;
import MenuAdmin.JMenuAdmin;
import MenuUpdates.ProceEdit;
import ToolsMethods.Tools;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterProcess extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField NameTxT;
	JTextPane textPane;
	JComboBox<Object> comboBox;
	Tools T = new Tools();
	private String Nombre,Especialidad,Description;
	DefaultTableModel modelo = T.MostrarTabla("ProcedimientosMedicos");
	@SuppressWarnings("unused")
	private JMenuAdmin instanciaJMenuAdmin;
	
	/**
	 * Create the panel.
	 */
	public RegisterProcess(JMenuAdmin instanciaJMenuAdmin) {
		this.instanciaJMenuAdmin = instanciaJMenuAdmin;
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 481, 452);
		setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 64));
		separator_1.setBounds(10, 30, 461, 10);
		add(separator_1);
		
		JPanel panelbotones = new JPanel();
		panelbotones.setLayout(null);
		panelbotones.setBackground(new Color(251, 251, 251));
		panelbotones.setBounds(248, 30, 223, 229);
		add(panelbotones);
		
		JSeparator separadorbotones = new JSeparator();
		separadorbotones.setBackground(new Color(0, 0, 64));
		separadorbotones.setBounds(1, 226, 226, 10);
		panelbotones.add(separadorbotones);
		
		JButton btnSave = new JButton("Save");
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int comboBox_ID = comboBox.getSelectedIndex() + 1;
				
				if (NameTxT.getText().isEmpty() || textPane.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog( null, "Todos los campos deben ser completados");
				}else {
					try {
						String consulta = "Select * FROM ProcedimientosMedicos Where Nombre = '" + NameTxT.getText()+"'";
						Statement sql = Conexion.EstablecerConexion().createStatement();
						ResultSet resultado = sql.executeQuery(consulta);
							if (resultado.next()) {
								String mensaje = "Ya existe esa persona en la base de datos";
								JOptionPane.showMessageDialog(null, mensaje);
							}
							else {
									try {
										Statement sql2 = Conexion.EstablecerConexion().createStatement();
										String consulta2 = "Insert into ProcedimientosMedicos (Nombre,Especialidad, Descripcion)values("
											+ "'" + NameTxT.getText()+"'," 	
											+ "'" + comboBox_ID + "',"
											+ "'" + textPane.getText()
											+ "');";		
										
										sql2.executeUpdate(consulta2);
										
										Statement sql3 = Conexion.EstablecerConexion().createStatement();	
										String consulta3 = "Select ProcedimientoID From ProcedimientosMedicos where Nombre = '"+NameTxT.getText()+"'";
										ResultSet res = sql3.executeQuery(consulta3);
										
										int id;
										String Sid = "";
											while(res.next()) {
												id = res.getInt("ProcedimientoID");
												Sid = String.valueOf(id);
											}
											
											Object[] nuevaFila = {Sid,NameTxT.getText(), comboBox_ID, textPane.getText()};
											
										modelo.addRow(nuevaFila);
										modelo.fireTableDataChanged();
									}catch(SQLException ex) {	
										JOptionPane.showMessageDialog(null, ex.toString());
									}
							}						
					}catch(SQLException ex) {
						JOptionPane.showMessageDialog(null, ex.toString());
					}
			}
				
			}
		});
		btnSave.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\diskette.png"));
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnSave.setFocusable(false);
		btnSave.setFocusTraversalKeysEnabled(false);
		btnSave.setFocusPainted(false);
		btnSave.setBorderPainted(false);
		btnSave.setBackground(new Color(7, 43, 95));
		btnSave.setBounds(10, 28, 203, 34);
		panelbotones.add(btnSave);
		
		JButton btnUpdate = new JButton("Update\r\n");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				int selectedrow = table.getSelectedRow();
				if (selectedrow >=0) {
					
					Object IdObj = (modelo.getValueAt(selectedrow, 0));
				    int Id = 0;
				    if (IdObj instanceof Integer) {
				        Id = (Integer) IdObj;
				    }  
						Nombre = (String) modelo.getValueAt(selectedrow, 1);
					    Especialidad = (String)comboBox.getSelectedItem();
					    Description = (String) modelo.getValueAt(selectedrow, 3);
				
					    ProceEdit edit = new ProceEdit();
						edit.setName(Nombre);
						edit.setEspecialidad(Especialidad);
						edit.setDescription(Description);
						edit.setid(Id);
						edit.ShowVentana();	
						edit.setInstanciaJMenuAdmin(instanciaJMenuAdmin);
			}
			
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\edita.png"));
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnUpdate.setFocusable(false);
		btnUpdate.setFocusTraversalKeysEnabled(false);
		btnUpdate.setFocusPainted(false);
		btnUpdate.setBorderPainted(false);
		btnUpdate.setBackground(new Color(7, 43, 95));
		btnUpdate.setBounds(10, 71, 203, 34);
		panelbotones.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int selectedrow = table.getSelectedRow();
				if(selectedrow >= 0 && selectedrow < modelo.getRowCount()) {
					int id = (int) modelo.getValueAt(selectedrow, 0);
					T.EliminarDatos(id,"ProcedimientosMedicos","ProcedimientoID");
					modelo.removeRow(selectedrow);
			}
		}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\delete.png"));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnDelete.setFocusable(false);
		btnDelete.setFocusTraversalKeysEnabled(false);
		btnDelete.setFocusPainted(false);
		btnDelete.setBorderPainted(false);
		btnDelete.setBackground(new Color(7, 43, 95));
		btnDelete.setBounds(10, 116, 203, 34);
		panelbotones.add(btnDelete);
		
		JButton btnNew = new JButton("New");
		btnNew.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				NameTxT.setText("");
				textPane.setText("");
			}
		});
		btnNew.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\add.png"));
		btnNew.setForeground(Color.WHITE);
		btnNew.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNew.setFocusable(false);
		btnNew.setFocusTraversalKeysEnabled(false);
		btnNew.setFocusPainted(false);
		btnNew.setBorderPainted(false);
		btnNew.setBackground(new Color(7, 43, 95));
		btnNew.setBounds(10, 159, 203, 34);
		panelbotones.add(btnNew);
		
		JPanel panelTable = new JPanel();
		panelTable.setLayout(null);
		panelTable.setBounds(10, 284, 461, 152);
		add(panelTable);
		
		JSeparator tableSeparator = new JSeparator();
		tableSeparator.setBackground(new Color(0, 0, 64));
		tableSeparator.setBounds(0, 150, 461, 10);
		panelTable.add(tableSeparator);
		
		table = new JTable();
		table.setGridColor(UIManager.getColor("ScrollBar.background"));
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setBounds(0, 0, 439, 0);
		table.setModel(modelo);
		panelTable.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 441, 130);
		panelTable.add(scrollPane);
		
		JLabel lblDoctors = new JLabel("Procedures");
		lblDoctors.setForeground(new Color(0, 0, 64));
		lblDoctors.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblDoctors.setBounds(11, 11, 71, 14);
		add(lblDoctors);
		
		JLabel lblRegisteredPatients = new JLabel("Registered Medical Procedures");
		lblRegisteredPatients.setForeground(new Color(0, 0, 64));
		lblRegisteredPatients.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblRegisteredPatients.setBounds(10, 264, 212, 14);
		add(lblRegisteredPatients);
		
		JPanel panelpacientes = new JPanel();
		panelpacientes.setLayout(null);
		panelpacientes.setBackground(new Color(251, 251, 251));
		panelpacientes.setBounds(10, 30, 228, 229);
		add(panelpacientes);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 64));
		separator.setBounds(0, 226, 226, 10);
		panelpacientes.add(separator);
		
		JLabel lblname = new JLabel("Procedure name:");
		lblname.setForeground(new Color(5, 30, 67));
		lblname.setFont(new Font("Roboto", Font.BOLD, 11));
		lblname.setBounds(10, 22, 131, 14);
		panelpacientes.add(lblname);
		
		NameTxT = new JTextField();
		NameTxT.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		NameTxT.setColumns(10);
		NameTxT.setBackground(UIManager.getColor("Button.background"));
		NameTxT.setBounds(10, 40, 208, 20);
		panelpacientes.add(NameTxT);
		
		JLabel lblphone = new JLabel("Specialty");
		lblphone.setForeground(new Color(5, 30, 67));
		lblphone.setFont(new Font("Roboto", Font.BOLD, 11));
		lblphone.setBounds(10, 65, 131, 14);
		panelpacientes.add(lblphone);
		
		JLabel lblemail = new JLabel("Description");
		lblemail.setForeground(new Color(5, 30, 67));
		lblemail.setFont(new Font("Roboto", Font.BOLD, 11));
		lblemail.setBounds(9, 111, 125, 14);
		panelpacientes.add(lblemail);
		
		comboBox = new JComboBox<Object>();
		T.CmbSpecialty(comboBox, "Especialidad", "Nombre");
		comboBox.setFocusable(false);
		comboBox.setFocusTraversalKeysEnabled(false);
		comboBox.setLightWeightPopupEnabled(false);
		comboBox.setBackground(new Color(240, 240, 240));
		comboBox.setBounds(11, 83, 206, 22);
		panelpacientes.add(comboBox);
		
		textPane = new JTextPane();
		textPane.setBorder(new LineBorder(new Color(192, 192, 192)));
		textPane.setBackground(new Color(240, 240, 240));
		textPane.setBounds(10, 129, 208, 70);
		panelpacientes.add(textPane);
	}
}
