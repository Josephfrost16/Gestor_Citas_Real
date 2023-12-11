package Paneles;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;

import ToolsMethods.Tools;

import javax.swing.JSeparator;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Cursor;

public class Pays extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;
	Tools T = new Tools();
	Color azul = new Color(10, 59, 129);
	Color blanco = new Color(255, 255, 255);
	
	/**
	 * Create the panel.
	 */
	public Pays() {
		setLayout(null);
		setBounds(0,0,481, 452);
		setBackground(new Color(10, 59, 129));
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 311, 452);
		add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setBounds(0, 0, 312, 452);
		panel.add(table);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField.setForeground(new Color(255, 255, 255));
		textField.setDisabledTextColor(new Color(255, 255, 255));
		textField.setBackground(new Color(10, 59, 129));
		textField.setBorder(null);
		textField.setBounds(350, 12, 120, 27);
		add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(null);
		separator.setSize(new Dimension(0, 8));
		separator.setForeground(new Color(0, 0, 64));
		separator.setFont(new Font("Dialog", Font.PLAIN, 14));
		separator.setBounds(321, 43, 149, 14);
		add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\search (2).png"));
		lblNewLabel.setBounds(322, 10, 29, 29);
		add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.setBackground(new Color(10, 59, 129));
		panel_1.setBounds(311, 278, 171, 39);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel PictureUp = new JLabel("");
		PictureUp.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\edit.png"));
		PictureUp.setBounds(46, 3, 32, 34);
		panel_1.add(PictureUp);
		
		JLabel UpdateLbl = new JLabel("Update");
		UpdateLbl.setForeground(Color.WHITE);
		UpdateLbl.setFont(new Font("Segoe UI", Font.BOLD, 12));
		UpdateLbl.setBounds(78, 13, 46, 14);
		panel_1.add(UpdateLbl);
		
		JLabel PictureUpAzul = new JLabel("");
		PictureUpAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\editAzul.png"));
		PictureUpAzul.setBounds(46, 3, 32, 34);
		panel_1.add(PictureUpAzul);
		
		T.pintarPanelYLabel(panel_1, UpdateLbl, PictureUp, blanco,azul);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1_1.setBackground(new Color(10, 59, 129));
		panel_1_1.setBounds(311, 332, 171, 39);
		add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel PictureDe = new JLabel("");
		PictureDe.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\bin.png"));
		PictureDe.setBounds(46, 2, 32, 34);
		panel_1_1.add(PictureDe);
		
		JLabel DeleteLbl = new JLabel("Delete");
		DeleteLbl.setForeground(Color.WHITE);
		DeleteLbl.setFont(new Font("Segoe UI", Font.BOLD, 12));
		DeleteLbl.setBounds(79, 12, 46, 14);
		panel_1_1.add(DeleteLbl);
		
		JLabel PictureDeAzul = new JLabel("");
		PictureDeAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\binazul.png"));
		PictureDeAzul.setBounds(46, 2, 32, 34);
		panel_1_1.add(PictureDeAzul);
		
		T.pintarPanelYLabel(panel_1_1, DeleteLbl, PictureDe, blanco,azul);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1_1_1.setBackground(new Color(10, 59, 129));
		panel_1_1_1.setBounds(311, 388, 171, 39);
		add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel PictureAcc = new JLabel("");
		PictureAcc.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\profile (1)22.png"));
		PictureAcc.setBounds(33, 3, 32, 34);
		panel_1_1_1.add(PictureAcc);
		
		JLabel AccountLbl = new JLabel("Account Edit");
		AccountLbl.setForeground(Color.WHITE);
		AccountLbl.setFont(new Font("Segoe UI", Font.BOLD, 12));
		AccountLbl.setBounds(66, 13, 98, 14);
		panel_1_1_1.add(AccountLbl);
		
		JLabel PictureAccAzul = new JLabel("");
		PictureAccAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\profile (2)2.png"));
		PictureAccAzul.setBounds(33, 3, 32, 34);
		panel_1_1_1.add(PictureAccAzul);
		
		T.pintarPanelYLabel(panel_1_1_1, AccountLbl, PictureAcc, blanco,azul);
		

	}
}
