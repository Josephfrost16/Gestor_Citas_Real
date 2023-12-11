package MenuRegisters;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import ConexionBD.Conexion;
import MenuAdmin.JMenuAdmin;
import MenuShow.PacientesShow;
import MenuUpdates.PacientesEdit;
import ToolsMethods.Tools;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Cursor;


public class Pacientes extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField NameTxt;
	private JTextField PronameTxt;
	private JTextField EmailTxt;
	private JTextField PhoneTxt;
	private JTextField DateTxt;
	private JTextField IDTxt;
	private JTable table;
	JPanel panelTable; 
	String Name,Proname,Email,Phone,Date,ID;
	Tools T = new Tools();
	@SuppressWarnings("unused")
	private JMenuAdmin instanciaJMenuAdmin; 
	/**
	 * Create the panel.
	 */
	public Pacientes(JMenuAdmin instanciaJMenuAdmin) {
		this.instanciaJMenuAdmin = instanciaJMenuAdmin;
		setBackground(new Color(251, 251, 251));
		setBounds(0,0, 481, 452);
		setLayout(null);
		DefaultTableModel modelo = T.MostrarTabla("Pacientes");
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 64));
		separator_1.setBounds(10, 35, 461, 10);
		add(separator_1);
		
	
		JPanel panelpacientes = new JPanel();
		panelpacientes.setBackground(new Color(251, 251, 251));
		panelpacientes.setBounds(10, 35, 228, 229);
		add(panelpacientes);
		panelpacientes.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 64));
		separator.setBounds(0, 226, 226, 10);
		panelpacientes.add(separator);
		
		JLabel lblname = new JLabel("Name:");
		lblname.setForeground(new Color(5, 30, 67));
		lblname.setFont(new Font("Roboto", Font.BOLD, 11));
		lblname.setBounds(10, 22, 131, 14);
		panelpacientes.add(lblname);
		
		NameTxt = new JTextField();
		NameTxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		NameTxt.setBackground(new Color(240, 240, 240));
		NameTxt.setBounds(10, 40, 101, 20);
		panelpacientes.add(NameTxt);
		NameTxt.setColumns(10);
		
		JLabel lblproname = new JLabel("Proname:");
		lblproname.setForeground(new Color(5, 30, 67));
		lblproname.setFont(new Font("Roboto", Font.BOLD, 11));
		lblproname.setBounds(10, 65, 131, 14);
		panelpacientes.add(lblproname);
		
		PronameTxt = new JTextField();
		PronameTxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		PronameTxt.setBackground(new Color(240, 240, 240));
		PronameTxt.setColumns(10);
		PronameTxt.setBounds(9, 81, 102, 20);
		panelpacientes.add(PronameTxt);
		
		JLabel lblemail = new JLabel("Email:");
		lblemail.setForeground(new Color(5, 30, 67));
		lblemail.setFont(new Font("Roboto", Font.BOLD, 11));
		lblemail.setBounds(9, 111, 125, 14);
		panelpacientes.add(lblemail);
		
		EmailTxt = new JTextField();
		EmailTxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		EmailTxt.setBackground(new Color(240, 240, 240));
		EmailTxt.setColumns(10);
		EmailTxt.setBounds(9, 129, 209, 20);
		panelpacientes.add(EmailTxt);
		
		JLabel lblphone = new JLabel("Phone:");
		lblphone.setForeground(new Color(5, 30, 67));
		lblphone.setFont(new Font("Roboto", Font.BOLD, 11));
		lblphone.setBounds(120, 22, 131, 14);
		panelpacientes.add(lblphone);
		
		PhoneTxt = new JTextField();
		PhoneTxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		PhoneTxt.setBackground(new Color(240, 240, 240));
		PhoneTxt.setColumns(10);
		PhoneTxt.setBounds(120, 40, 98, 20);
		panelpacientes.add(PhoneTxt);
		
		JLabel lbldate = new JLabel("Date:");
		lbldate.setForeground(new Color(5, 30, 67));
		lbldate.setFont(new Font("Roboto", Font.BOLD, 11));
		lbldate.setBounds(120, 65, 131, 14);
		panelpacientes.add(lbldate);
		
		DateTxt = new JTextField();
		DateTxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		DateTxt.setBackground(new Color(240, 240, 240));
		DateTxt.setColumns(10);
		DateTxt.setBounds(121, 81, 97, 20);
		panelpacientes.add(DateTxt);
		
		JLabel lblid = new JLabel("DNI:");
		lblid.setForeground(new Color(5, 30, 67));
		lblid.setFont(new Font("Roboto", Font.BOLD, 11));
		lblid.setBounds(10, 156, 46, 14);
		panelpacientes.add(lblid);
		
		IDTxt = new JTextField();
		IDTxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		IDTxt.setBackground(new Color(240, 240, 240));
		IDTxt.setColumns(10);
		IDTxt.setBounds(10, 175, 208, 20);
		panelpacientes.add(IDTxt);
		
		JPanel panelbotones = new JPanel();
		panelbotones.setBackground(new Color(251, 251, 251));
		panelbotones.setBounds(248, 35, 223, 229);
		add(panelbotones);
		panelbotones.setLayout(null);
		
		JSeparator separadorbotones = new JSeparator();
		separadorbotones.setBackground(new Color(0, 0, 64));
		separadorbotones.setBounds(1, 226, 226, 10);
		panelbotones.add(separadorbotones);
		
		JButton btnSave = new JButton("Save");
		T.pintarBotones(btnSave);
		btnSave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSave.setBorderPainted(false);
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(NameTxt.getText().isEmpty() || PronameTxt.getText().isEmpty() || EmailTxt.getText().isEmpty()
					    || PhoneTxt.getText().isEmpty() || DateTxt.getText().isEmpty() || IDTxt.getText().isEmpty()) 
				{
				
					JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados");
				}
				else {

					try {
						String query= "SELECT * FROM Pacientes WHERE Cedula ='" + IDTxt.getText() + "'";
						Statement sql = Conexion.EstablecerConexion().createStatement();
						ResultSet resultado = sql.executeQuery(query);
						
							if(resultado.next()) {
								String mensaje = "Ya existe esta persona en la base de datos";
								JOptionPane.showMessageDialog(null, mensaje);
								
							}else {
									try {
										Statement sql2 = Conexion.EstablecerConexion().createStatement();
									
										String query2 = "INSERT INTO Pacientes(Nombre, Apellido, Email, Telefono, Fecha, Cedula) VALUES ("
												+ "'"+NameTxt.getText()+"',"
												+ "'"+PronameTxt.getText()+"',"
												+ "'"+EmailTxt.getText()+"',"
												+ "'"+PhoneTxt.getText()+"',"
												+ "'"+DateTxt.getText()+"',"
												+ "'"+IDTxt.getText()+"'"
												+ ");";
										sql2.executeUpdate(query2);
										
										String query3 = "Select PacienteID From Pacientes where Cedula = '"+IDTxt.getText()+"'";
										ResultSet res = sql2.executeQuery(query3);	
										int id;
										String SId = "";
										
											while(res.next()) {
												id = res.getInt("PacienteID");
												SId = String.valueOf(id);
											}		
											
										Object[] nuevaFila = {SId, NameTxt.getText(), PronameTxt.getText(), EmailTxt.getText(), PhoneTxt.getText(), DateTxt.getText(), IDTxt.getText()};
										modelo.addRow(nuevaFila);
										modelo.fireTableDataChanged();
										LimpiarCampos();
										sql2.close();
										Conexion.EstablecerConexion().close();
									}catch(SQLException ex) {
										JOptionPane.showMessageDialog(null, ex.toString());
									}
							}
						
						
					}catch(SQLException ex) {
						JOptionPane.showMessageDialog(null, ex.toString());
					}
					
				
				}
			
			}
			
		}
	);
		btnSave.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\diskette.png"));
		btnSave.setBackground(new Color(7, 43, 95));
		btnSave.setFocusable(false);
		btnSave.setFocusTraversalKeysEnabled(false);
		btnSave.setFocusPainted(false);
		btnSave.setBounds(10, 11, 203, 34);
		panelbotones.add(btnSave);
		
		JButton btnShow = new JButton("Show");
		T.pintarBotones(btnShow);
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PacientesShow s = new PacientesShow(instanciaJMenuAdmin);
				s.ShowVentana();
			}
		});
		
		btnShow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnShow.setBorderPainted(false);
		btnShow.setForeground(new Color(255, 255, 255));
		btnShow.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnShow.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\printer.png"));
		btnShow.setBackground(new Color(7, 43, 95));
		btnShow.setFocusable(false);
		btnShow.setFocusTraversalKeysEnabled(false);
		btnShow.setFocusPainted(false);
		btnShow.setBounds(10, 53, 203, 34);
		panelbotones.add(btnShow);
		
		JButton btnUpdate = new JButton("Update\r\n");
		T.pintarBotones(btnUpdate);
		btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUpdate.setBorderPainted(false);
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnUpdate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int selectedrow = table.getSelectedRow();
				
				if(selectedrow >=0) {
					Object IdObj = modelo.getValueAt(selectedrow, 0);
				    int Id = -1;
				    if (IdObj instanceof Integer) {
				        Id = (Integer) IdObj;
				    }

				    Name = (String) modelo.getValueAt(selectedrow, 1);
				    Proname = (String) modelo.getValueAt(selectedrow, 2);
				    Email = (String) modelo.getValueAt(selectedrow, 3);
				    Object phoneObj = modelo.getValueAt(selectedrow, 4);
				    Phone = phoneObj != null ? phoneObj.toString() : "";
				    Date = (String) modelo.getValueAt(selectedrow, 5);
				    Object IDObj = modelo.getValueAt(selectedrow, 6);
				    ID = IDObj != null ? IDObj.toString() : "";
				    PacientesEdit edit = new PacientesEdit();
					edit.setName(Name);
					edit.setProname(Proname);
					edit.setEmail(Email);
					edit.setPhone(Phone);
					edit.setDate(Date);
					edit.setID(ID);
					edit.setid(Id);
					edit.ShowVentana();	
					edit.setInstanciaJMenuAdmin(instanciaJMenuAdmin);
				}
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\edita.png"));
		btnUpdate.setBackground(new Color(7, 43, 95));
		btnUpdate.setFocusable(false);
		btnUpdate.setFocusTraversalKeysEnabled(false);
		btnUpdate.setFocusPainted(false);
		btnUpdate.setBounds(10, 96, 202, 34);
		panelbotones.add(btnUpdate);
		
		// Revisar explosion de repeticion.
		JButton btnDelete = new JButton("Delete");
		T.pintarBotones(btnDelete);
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setBorderPainted(false);
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnDelete.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int selectedrow = table.getSelectedRow();
				if(selectedrow >= 0 && selectedrow < modelo.getRowCount()) {
					int id = (int) modelo.getValueAt(selectedrow, 0);
					T.EliminarDatos(id,"Pacientes","PacienteID");
					modelo.removeRow(selectedrow);
				}
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\delete.png"));
		btnDelete.setBackground(new Color(7, 43, 95));
		btnDelete.setFocusable(false);
		btnDelete.setFocusTraversalKeysEnabled(false);
		btnDelete.setFocusPainted(false);
		btnDelete.setBounds(10, 141, 203, 34);
		panelbotones.add(btnDelete);
		
		JButton btnNew = new JButton("New");
		T.pintarBotones(btnNew);
		btnNew.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNew.setBorderPainted(false);
		btnNew.setForeground(new Color(255, 255, 255));
		btnNew.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimpiarCampos();
			}
		});
		
		btnNew.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\add.png"));
		btnNew.setBackground(new Color(7, 43, 95));
		btnNew.setFocusable(false);
		btnNew.setFocusTraversalKeysEnabled(false);
		btnNew.setFocusPainted(false);
		btnNew.setBounds(10, 184, 203, 34);
		panelbotones.add(btnNew);
		
		panelTable = new JPanel();
		panelTable.setBounds(10, 289, 461, 152);
		add(panelTable);
		panelTable.setLayout(null);
		
		JSeparator tableSeparator = new JSeparator();
		tableSeparator.setBackground(new Color(0, 0, 64));
		tableSeparator.setBounds(0, 150, 461, 10);
		panelTable.add(tableSeparator);
		
		
		table = new JTable();
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setBounds(10, 12, 443, 124);
		table.setModel(modelo);
		JTableHeader header = table.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER); 
        headerRenderer.setBackground(Color.BLUE); 
        headerRenderer.setForeground(Color.WHITE);
        Color gris = new Color(200,200,200);
        table.setGridColor(gris);
        header.setDefaultRenderer(new CustomHeaderRenderer());        
		panelTable.add(table);
		

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 441, 130);
		panelTable.add(scrollPane);
		
		JLabel lblPacientes = new JLabel("Patients");
		lblPacientes.setForeground(new Color(0, 0, 64));
		lblPacientes.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblPacientes.setBounds(11, 16, 71, 14);
		add(lblPacientes);
		
		JLabel lblRegisteredPatients = new JLabel("Registered Patients");
		lblRegisteredPatients.setForeground(new Color(0, 0, 64));
		lblRegisteredPatients.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblRegisteredPatients.setBounds(10, 269, 148, 14);
		add(lblRegisteredPatients);
	}
	
	public void LimpiarCampos() {
		NameTxt.setText(null);
		PronameTxt.setText(null);
		EmailTxt.setText(null);
		PhoneTxt.setText(null);
		IDTxt.setText(null);
		DateTxt.setText(null);
	}
	
}

@SuppressWarnings("serial")
class CustomHeaderRenderer extends DefaultTableCellRenderer {
    public CustomHeaderRenderer() {
      
        setOpaque(true);
        setForeground(Color.white); 
        setBackground(new Color(0,0,64)); 
        setHorizontalAlignment(SwingConstants.CENTER);
        setBorder(UIManager.getBorder("TableHeader.cellBorder"));
        Font headerFont = new Font("Roboto", Font.BOLD, 14); 
        setFont(headerFont);
    }

}


