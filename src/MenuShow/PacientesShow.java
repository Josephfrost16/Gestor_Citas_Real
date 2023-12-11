package MenuShow;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import MenuAdmin.JMenuAdmin;
import MenuUpdates.PacientesEdit;
import ToolsMethods.Tools;
import ToolsMethods.Ventana;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PacientesShow extends JFrame implements Ventana {
	boolean ventanaAbierta;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	Tools T = new Tools();
	String Name,Proname,Email,Phone,Date,ID;
	Color azul = new Color(10, 59, 129);
	Color blanco = new Color(255, 255, 255);
	
	@SuppressWarnings("unused")
	private JMenuAdmin instanciaJMenuAdmin; 	
	DefaultTableModel modelo = T.MostrarTabla("Pacientes");

	/**
	 * Create the frame.
	 */
	public PacientesShow(JMenuAdmin instanciaJMenuAdmin) {
		this.instanciaJMenuAdmin = instanciaJMenuAdmin;
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 626, 419);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(10, 59, 129));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\search (2).png"));
		lblNewLabel.setBounds(422, 11, 31, 29);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 412, 380);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 346, 355);
		table.setModel(modelo);
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBorder(null);
		scrollPane.setBackground(new Color(4, 28, 62));
		scrollPane.setBounds(0, 0, 412, 380);
		panel.add(scrollPane);
		
		
		textField = new JTextField();
		
		textField.setForeground(new Color(255, 255, 255));
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				modelo = T.FilterTable(textField.getText(),"Pacientes","Nombre");
				table.setModel(modelo);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		textField.setFont(new Font("Roboto", Font.PLAIN, 13));
		textField.setBorder(null);
		textField.setBackground(new Color(10, 59, 129));
		textField.setBounds(452, 13, 150, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(422, 45, 178, 2);
		contentPane.add(separator);
		
		JPanel UpdatePanel = new JPanel();
		UpdatePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				update();
			}
		});
		UpdatePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		UpdatePanel.setBackground(new Color(10, 59, 129));
		UpdatePanel.setBounds(412, 72, 198, 41);
		contentPane.add(UpdatePanel);
		UpdatePanel.setLayout(null);
		
		JLabel PictureUp = new JLabel("");
		PictureUp.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\edit.png"));
		PictureUp.setBounds(62, 4, 32, 34);
		UpdatePanel.add(PictureUp);
		
		JLabel lblNewLabel_1 = new JLabel("Update");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1.setBounds(95, 14, 46, 14);
		UpdatePanel.add(lblNewLabel_1);
		
		JLabel PictureAzul = new JLabel("");
		PictureAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\editAzul.png"));
		PictureAzul.setBounds(62, 4, 32, 34);
		UpdatePanel.add(PictureAzul);
		
		T.pintarPanelYLabel(UpdatePanel, lblNewLabel_1, PictureUp, blanco,azul);
		
		JPanel DeletePanel = new JPanel();
		DeletePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				delete();
			}
		});
		DeletePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DeletePanel.setBackground(new Color(10, 59, 129));
		DeletePanel.setBounds(412, 118, 198, 40);
		contentPane.add(DeletePanel);
		DeletePanel.setLayout(null);
		
		JLabel PictureDe = new JLabel("");
		PictureDe.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\bin.png"));
		PictureDe.setBounds(61, 3, 32, 34);
		DeletePanel.add(PictureDe);
		
		JLabel lblNewLabel_1_1 = new JLabel("Delete");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(96, 14, 46, 14);
		DeletePanel.add(lblNewLabel_1_1);
		
		JLabel PictureDeAzul = new JLabel("");
		PictureDeAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\binazul.png"));
		PictureDeAzul.setBounds(61, 3, 32, 34);
		DeletePanel.add(PictureDeAzul);
		
		T.pintarPanelYLabel(DeletePanel, lblNewLabel_1_1, PictureDe, blanco,azul);
		
		 addWindowListener((WindowListener) new WindowAdapter() {
	            @Override
	            public void windowOpened(WindowEvent e) {
	                instanciaJMenuAdmin.DisableWindows();
	            }

	            @Override
	            public void windowClosing(WindowEvent e) {
	                instanciaJMenuAdmin.EnableWindows();
	            }
	        });
		
	}

	@Override
	public void ShowVentana() {
		// TODO Auto-generated method stub
		this.setVisible(true);
	}
	
	 public boolean isVentanaAbierta() {
	        return ventanaAbierta;
	    }
	 
	 void delete() {
			int selectedrow = table.getSelectedRow();
			if(selectedrow >= 0 && selectedrow < modelo.getRowCount()) {
				int id = (int) modelo.getValueAt(selectedrow, 0);
				T.EliminarDatos(id,"Pacientes","PacienteID");
				modelo.removeRow(selectedrow);
			}
	 }
	 
	 void update() {
		 int selectedrow = table.getSelectedRow();
			
			if(selectedrow != -1) {
				
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
}
