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

// Ventana de Updates.
public class PacientesEdit extends JFrame implements Ventana{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Name;
	private JTextField proname;
	private JTextField email;
	private JTextField phone;
	private JTextField date;
	private JTextField id;
	int id2;
	private JMenuAdmin instanciaJMenuAdmin;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public PacientesEdit() {
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
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 64));
		separator.setBounds(0, 226, 226, 10);
		panel.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 21, 131, 14);
		panel.add(lblNewLabel_1);
		
		Name = new JTextField();
		Name.setBorder(new LineBorder(new Color(171, 173, 179)));
		Name.setColumns(10);
		Name.setBounds(87, 18, 131, 20);
		panel.add(Name);
		
		JLabel txtlabel = new JLabel("Proname:");
		txtlabel.setFont(new Font("Roboto", Font.BOLD, 11));
		txtlabel.setForeground(new Color(255, 255, 255));
		txtlabel.setBounds(10, 49, 131, 14);
		panel.add(txtlabel);
		
		proname = new JTextField();
		proname.setBorder(new LineBorder(new Color(171, 173, 179)));
		proname.setColumns(10);
		proname.setBounds(87, 46, 131, 20);
		panel.add(proname);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email:");
		lblNewLabel_1_2.setFont(new Font("Roboto", Font.BOLD, 11));
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setBounds(10, 77, 125, 14);
		panel.add(lblNewLabel_1_2);
		
		email = new JTextField();
		email.setBorder(new LineBorder(new Color(171, 173, 179)));
		email.setColumns(10);
		email.setBounds(87, 74, 131, 20);
		panel.add(email);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone:");
		lblNewLabel_1_3.setFont(new Font("Roboto", Font.BOLD, 11));
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setBounds(10, 105, 131, 14);
		panel.add(lblNewLabel_1_3);
		
		phone = new JTextField();
		phone.setBorder(new LineBorder(new Color(171, 173, 179)));
		phone.setColumns(10);
		phone.setBounds(87, 102, 131, 20);
		panel.add(phone);
		
		JLabel lblNewLabel_1_4 = new JLabel("Date:");
		lblNewLabel_1_4.setFont(new Font("Roboto", Font.BOLD, 11));
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setBounds(10, 133, 131, 14);
		panel.add(lblNewLabel_1_4);
		
		date = new JTextField();
		date.setBorder(new LineBorder(new Color(171, 173, 179)));
		date.setColumns(10);
		date.setBounds(87, 130, 131, 20);
		panel.add(date);
		
		JLabel lblNewLabel_1_5 = new JLabel("ID:");
		lblNewLabel_1_5.setFont(new Font("Roboto", Font.BOLD, 11));
		lblNewLabel_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_5.setBounds(10, 161, 46, 14);
		panel.add(lblNewLabel_1_5);
		
		id = new JTextField();
		id.setBorder(new LineBorder(new Color(171, 173, 179)));
		id.setColumns(10);
		id.setBounds(87, 158, 131, 20);
		panel.add(id);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tools t = new Tools();
				t.ActualizarDatos("Pacientes",id2, "Nombre", Name.getText(),"PacienteID");
				t.ActualizarDatos("Pacientes",id2, "Apellido", proname.getText(),"PacienteID");
				t.ActualizarDatos("Pacientes",id2, "Email", email.getText(),"PacienteID");
				t.ActualizarDatos("Pacientes",id2, "Telefono", phone.getText(),"PacienteID");
				t.ActualizarDatos("Pacientes",id2, "Fecha", date.getText(),"PacienteID");
				t.ActualizarDatos("Pacientes",id2, "Cedula", id.getText(),"PacienteID");
				instanciaJMenuAdmin.ShowPatients();
				
				dispose();
			} 
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setBackground(new Color(225, 225, 225));
		btnNewButton.setBounds(10, 189, 208, 23);
		panel.add(btnNewButton);
	}
	

	public void setName(String Name) {
		this.Name.setText(Name);
	}
	
	public void setProname(String Name) {
		this.proname.setText(Name);
	}
	
	public void setEmail(String Name) {
		this.email.setText(Name);
	}
	
	public void setPhone(String Name) {
		this.phone.setText(Name);
	}
	
	public void setDate(String Name) {
		this.date.setText(Name);
	}
	
	public void setID(String Name) {
		this.id.setText(Name);
	}
	
	public void setid(int id) {
		this.id2 = id;
	}
	
	 public void setInstanciaJMenuAdmin(JMenuAdmin instancia) {
	        this.instanciaJMenuAdmin = instancia; 
	    }
	
	
	@Override
	public void ShowVentana() {
		// TODO Auto-generated method stub
		this.setVisible(true);
	}
	

}
