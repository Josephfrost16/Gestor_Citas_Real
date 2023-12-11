package MenuUpdates;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import ToolsMethods.Tools;
import ToolsMethods.Ventana;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;

import MenuAdmin.JMenuAdmin;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

// Ventana de Updates.
public class ProceEdit extends JFrame implements Ventana{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Name;
	int id2;
	private JMenuAdmin instanciaJMenuAdmin;
	JTextPane textPane;
	JComboBox<Object> comboBox;
	Tools t = new Tools();
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ProceEdit() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 269, 294);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(7, 43, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		panel.setBackground(new Color(7, 43, 95));
		panel.setLayout(null);
		panel.setBounds(10, 11, 228, 229);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 21, 67, 14);
		panel.add(lblNewLabel_1);
		
		Name = new JTextField();
		Name.setBorder(new LineBorder(new Color(192, 192, 192)));
		Name.setColumns(10);
		Name.setBounds(87, 18, 131, 20);
		panel.add(Name);
		
		JLabel txtlabel = new JLabel("Specialty:");
		txtlabel.setFont(new Font("Roboto", Font.BOLD, 11));
		txtlabel.setForeground(new Color(255, 255, 255));
		txtlabel.setBounds(10, 49, 91, 14);
		panel.add(txtlabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Description:");
		lblNewLabel_1_2.setFont(new Font("Roboto", Font.BOLD, 11));
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setBounds(10, 77, 91, 14);
		panel.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tools t = new Tools();
				t.ActualizarDatos("ProcedimientosMedicos",id2, "Nombre", Name.getText(),"ProcedimientoID");
				t.ActualizarDatosC("ProcedimientosMedicos",id2, "EspecialidadID", String.valueOf(comboBox.getSelectedIndex()),"ProcedimientoID");
				t.ActualizarDatos("ProcedimientosMedicos",id2, "Descripcion", textPane.getText(),"ProcedimientoID");
				
				instanciaJMenuAdmin.ShowProcess();
				
				dispose();
			} 
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setBackground(new Color(225, 225, 225));
		btnNewButton.setBounds(10, 189, 208, 23);
		panel.add(btnNewButton);
		
		textPane = new JTextPane();
		textPane.setBorder(new LineBorder(new Color(192, 192, 192)));
		textPane.setBounds(87, 74, 131, 104);
		panel.add(textPane);
		
		comboBox = new JComboBox<Object>();
		Especialidad_values(comboBox);
		comboBox.setBounds(87, 45, 131, 22);
		panel.add(comboBox);
	}
	

	public void setName(String Name) {
		this.Name.setText(Name);
	}
	
	public void setEspecialidad(String selectedRow) {
		this.comboBox.setSelectedItem(selectedRow);
	}
	
	
	public void setDescription(String Name) {
		this.textPane.setText(Name);
	}
	
	public void setid(int id) {
		this.id2 = id;
	}
	
	 public void setInstanciaJMenuAdmin(JMenuAdmin instancia) {
	        this.instanciaJMenuAdmin = instancia; 
	    }
	
	 public void Especialidad_values(JComboBox<Object> ComboBox) {
			t.CmbSpecialty(ComboBox,"Especialidad","Nombre");
		}
	 
	@Override
	public void ShowVentana() {
		// TODO Auto-generated method stub
		this.setVisible(true);
	}
}
