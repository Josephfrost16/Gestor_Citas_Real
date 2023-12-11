package Registro;

import java.awt.EventQueue;
import ToolsMethods.Ventana;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.DebugGraphics;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ConexionBD.Conexion;
import MenuAdmin.JMenuAdmin;

public class JLogin implements Ventana{

	boolean inicio;
	private JFrame frmSignIn;
	private JTextField UserTxt;
	private JPasswordField PsTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin window = new JLogin();
					window.frmSignIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignIn = new JFrame();
		frmSignIn.setUndecorated(true);
		frmSignIn.setResizable(false);
		frmSignIn.setTitle("Login");
		frmSignIn.getContentPane().setBackground(new Color(251, 251, 251));
		frmSignIn.setBounds(100, 100, 622, 442);
		frmSignIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignIn.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(3, 4, 94));
		panel.setBounds(406, -3, 216, 445);
		frmSignIn.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewHere = new JLabel("New Here?");
		lblNewHere.setForeground(new Color(255, 255, 255));
		lblNewHere.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewHere.setBounds(42, 136, 147, 65);
		panel.add(lblNewHere);
		
		JLabel lblSignUp = new JLabel("Register and discover\r\n");
		lblSignUp.setToolTipText("");
		lblSignUp.setHorizontalAlignment(SwingConstants.LEFT);
		lblSignUp.setForeground(Color.WHITE);
		lblSignUp.setFont(new Font("Source Sans Pro", Font.PLAIN, 13));
		lblSignUp.setBounds(25, 186, 147, 39);
		panel.add(lblSignUp);
		
		JLabel lblSignUp_1 = new JLabel("the best");
		lblSignUp_1.setToolTipText("");
		lblSignUp_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSignUp_1.setForeground(Color.WHITE);
		lblSignUp_1.setFont(new Font("Source Sans Pro", Font.PLAIN, 13));
		lblSignUp_1.setBounds(143, 174, 147, 65);
		panel.add(lblSignUp_1);
		
		JLabel lblServiceWithUs = new JLabel(" service with us");
		lblServiceWithUs.setToolTipText("");
		lblServiceWithUs.setHorizontalAlignment(SwingConstants.LEFT);
		lblServiceWithUs.setForeground(Color.WHITE);
		lblServiceWithUs.setFont(new Font("Source Sans Pro", Font.PLAIN, 13));
		lblServiceWithUs.setBounds(65, 197, 147, 39);
		panel.add(lblServiceWithUs);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton.setForeground(new Color(3, 4, 94));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setForeground(new Color(255, 255, 255));
				btnNewButton.setBackground(new Color(3, 4, 94));
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JSign SignUp = new JSign();
				SignUp.ShowVentana();
				frmSignIn.dispose();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(3, 4, 94));
		btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(55, 256, 111, 33);
		panel.add(btnNewButton);
		
		JLabel lblOdomtotech = new JLabel("ODONTODOM\r\n");
		lblOdomtotech.setForeground(Color.WHITE);
		lblOdomtotech.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblOdomtotech.setBounds(43, 12, 193, 65);
		panel.add(lblOdomtotech);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(210, 210, 210), 2, true));
		panel_2.setBackground(new Color(251, 251, 251));
		panel_2.setBounds(21, 63, 401, 328);
		frmSignIn.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login to Your Account");
		lblNewLabel.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 30));
		lblNewLabel.setBounds(30, 24, 358, 65);
		panel_2.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Sign In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Username = UserTxt.getText();
				String Password= new String(PsTxt.getPassword());
				
				try {
					String query = "SELECT * FROM Usuarios WHERE Nombre = ? AND Contraseña = ?";
					PreparedStatement statement = Conexion.EstablecerConexion().prepareStatement(query);
					statement.setString(1, Username);
			        statement.setString(2, Password);
			        ResultSet resultado = statement.executeQuery();
			        
			        if(resultado.next()) {
			        	 inicio = true;
			        	 
			        }else {
			        	JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Inténtalo de nuevo.");
			        	inicio = false;
			        }
			        
			        resultado.close();
					statement.close();
					Conexion.EstablecerConexion().close();
					
					if(inicio==true) {
						JMenuAdmin menu = JMenuAdmin.obtenerInstancia();
						menu.ShowVentana();
						frmSignIn.dispose();
					}
					
			        
				}catch(SQLException ex) {
					System.out.println(ex.toString());
				}
				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_1.setBackground(new Color(0, 119, 182));
		btnNewButton_1.setBounds(78, 258, 212, 44);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(3, 4, 94));
		panel_1.setBounds(55, 106, 253, 44);
		panel_2.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\profile (1).png"));
		lblNewLabel_1.setBounds(223, 5, 24, 34);
		panel_1.add(lblNewLabel_1);
		
		UserTxt = new JTextField();
		UserTxt.setText("Username");
		UserTxt.setMargin(new Insets(2, 6, 2, 2));
		UserTxt.setHorizontalAlignment(SwingConstants.LEFT);
		UserTxt.setColumns(10);
		UserTxt.setBorder(null);
		UserTxt.setBackground(new Color(251, 251, 251));
		UserTxt.setBounds(0, 0, 255, 43);
		panel_1.add(UserTxt);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(3, 4, 94));
		panel_1_1.setBounds(55, 161, 253, 45);
		panel_2.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\rotation-lock.png"));
		lblNewLabel_1_1.setBounds(223, 9, 24, 29);
		panel_1_1.add(lblNewLabel_1_1);
		
		PsTxt = new JPasswordField();
		PsTxt.setText("asdadasd");
		PsTxt.setBorder(null);
		PsTxt.setBackground(new Color(251, 251, 251));
		PsTxt.setBounds(0, 0, 253, 44);
		panel_1_1.add(PsTxt);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me?");
		chckbxNewCheckBox.setRolloverEnabled(false);
		chckbxNewCheckBox.setRequestFocusEnabled(false);
		chckbxNewCheckBox.setFont(new Font("Source Sans Pro", Font.PLAIN, 12));
		chckbxNewCheckBox.setFocusable(false);
		chckbxNewCheckBox.setFocusPainted(false);
		chckbxNewCheckBox.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		chckbxNewCheckBox.setBorder(null);
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(56, 219, 127, 23);
		panel_2.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frmSignIn.dispose();
			}
		});
		lblNewLabel_2.setBounds(16, 7, 33, 44);
		frmSignIn.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\exit.png"));
		frmSignIn.setLocationRelativeTo(null);
	}

	@Override
	public void ShowVentana() {
		// TODO Auto-generated method stub
		frmSignIn.setVisible(true);
	}
}
