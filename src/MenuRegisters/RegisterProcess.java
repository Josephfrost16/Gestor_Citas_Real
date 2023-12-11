package MenuRegisters;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class RegisterProcess extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public RegisterProcess() {
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
		btnSave.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\diskette.png"));
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
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\edita.png"));
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
		btnDelete.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\delete.png"));
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
		btnNew.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\add.png"));
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
		panelTable.add(table);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
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
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBackground(UIManager.getColor("Button.background"));
		textField.setBounds(10, 40, 208, 20);
		panelpacientes.add(textField);
		
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
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setFocusable(false);
		comboBox.setFocusTraversalKeysEnabled(false);
		comboBox.setLightWeightPopupEnabled(false);
		comboBox.setBackground(new Color(240, 240, 240));
		comboBox.setBounds(11, 83, 206, 22);
		panelpacientes.add(comboBox);
		
		JTextPane textPane = new JTextPane();
		textPane.setBorder(new LineBorder(new Color(192, 192, 192)));
		textPane.setBackground(new Color(240, 240, 240));
		textPane.setBounds(10, 129, 208, 70);
		panelpacientes.add(textPane);
	}
}
