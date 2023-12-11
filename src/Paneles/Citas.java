package Paneles;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Citas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Citas() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 481, 452);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 461, 361);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\add.png"));
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnUpdate.setFocusable(false);
		btnUpdate.setFocusTraversalKeysEnabled(false);
		btnUpdate.setFocusPainted(false);
		btnUpdate.setBorderPainted(false);
		btnUpdate.setBackground(new Color(7, 43, 95));
		btnUpdate.setBounds(268, 383, 203, 34);
		add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas_5\\Gestor_Citas_Real\\imagenes\\delete.png"));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnDelete.setFocusable(false);
		btnDelete.setFocusTraversalKeysEnabled(false);
		btnDelete.setFocusPainted(false);
		btnDelete.setBorderPainted(false);
		btnDelete.setBackground(new Color(7, 43, 95));
		btnDelete.setBounds(10, 383, 203, 34);
		add(btnDelete);
	}
}
