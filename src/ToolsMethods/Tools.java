package ToolsMethods;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import ConexionBD.Conexion;

public class Tools {

	public Tools() {
		// TODO Auto-generated constructor stub
	}
		int id2;
	public DefaultTableModel MostrarTabla(String Tabla) {
		
		DefaultTableModel modelo = new DefaultTableModel(); // crear modelo de la tabla
			try {
				
				String consulta = "SELECT * FROM " + Tabla; //crear consulta
				
				Statement sql = Conexion.EstablecerConexion().createStatement(); //crear statement para consulta
				
				ResultSet tabla = sql.executeQuery(consulta); //Guardar los datos de la consulta en un result 
				
				int columnas = tabla.getMetaData().getColumnCount(); //Guardar el numero de columnas de la tabla
				
				for(int i = 1; i<=columnas; i++) {
					modelo.addColumn(tabla.getMetaData().getColumnName(i)); //Agregamos las columnas al modelo
				}	
				
				while (tabla.next()) {
					Object[] fila = new Object[columnas]; //creamos un vector para almacenar filas
					for(int i = 1; i<=columnas; i++) { //recorremos columnas
						fila[i-1] = tabla.getObject(i); //agregar las filas al vector
					}
					modelo.addRow(fila); //añadir el vector al modelo
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return modelo;
		}
	
	
	
	public void ActualizarDatos(String NombreTabla, int id, String column, String object,String WhereColumn ) {
		 try {
			 String consulta = "UPDATE " +  NombreTabla + " SET "+ column +" = " + "'" + object +"'" + " Where "+ WhereColumn +" = " + id;
			 Statement sql = Conexion.EstablecerConexion().createStatement();
			 sql.executeUpdate(consulta);
			 
			 sql.close();
			 Conexion.EstablecerConexion().close();
			 
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	}
	
	//Sobrecarga del metodo para aceptar enteros
	public void ActualizarDatos(int id, String column, int nuevodato, String NombreTabla, String WhereColumn) {
		 try {
			 String consulta = "UPDATE "+ NombreTabla +" SET "+ column +" = " + "'" +nuevodato+"'" + " Where "+WhereColumn +" PacienteID = " + id;
			 Statement sql = Conexion.EstablecerConexion().createStatement();
			 sql.executeUpdate(consulta);
			 
			 sql.close();
			 Conexion.EstablecerConexion().close();
			 
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	}
	//Sobrecarga para el comboBox
	public void ActualizarDatosC(String NombreTabla, int id, String column, String Especialidad,String WhereColumn ) {
		 try {
			 String consulta = "UPDATE " +  NombreTabla + " SET "+ column +" = " + "'" + Especialidad+"'" + " Where "+ WhereColumn +" = '" + id + "'";
			 Statement sql = Conexion.EstablecerConexion().createStatement();
			 sql.executeUpdate(consulta);
			 
			 sql.close();
			 Conexion.EstablecerConexion().close();
			 
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	}
	
	public void EliminarDatos(int id, String Tabla, String Columna) {
		try {
			String consulta = "DELETE FROM "+ Tabla +" Where "+ Columna +" = " + id + ";";
			Statement sql = Conexion.EstablecerConexion().createStatement();
			sql.executeUpdate(consulta);
			
			sql.close();
			Conexion.EstablecerConexion().close();
			
			}catch(SQLException e){
				e.printStackTrace();
			}
	}
	
	public DefaultTableModel FilterTable( String nombre, String Tabla, String Columna) {
		
		DefaultTableModel modelo = new DefaultTableModel();
		try {
			String consulta = "SELECT * FROM "+ Tabla +" WHERE "+ Columna +" LIKE '%" + nombre + "%';";
			Statement sql = Conexion.EstablecerConexion().createStatement();
			ResultSet tabla = sql.executeQuery(consulta);
			
			int columnas = tabla.getMetaData().getColumnCount();
			
			for(int i = 1; i<=columnas; i++) {
				modelo.addColumn(tabla.getMetaData().getColumnName(i));
			}
			
			while (tabla.next()) {
				Object[] fila = new Object[columnas];
				for(int i = 1; i<=columnas; i++) {
					fila[i-1] = tabla.getObject(i);
				}
				modelo.addRow(fila);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		modelo.fireTableDataChanged();
		return modelo;
	}
	
	public void pintarBotones(JButton btn) {
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setBackground(new Color(200, 211, 227));
				btn.setForeground(new Color(7, 43, 95));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn.setBackground(new Color(7, 43, 95));
				btn.setForeground(new Color(255,255,255));
			}
		});
	}
	
	public void pintarPanelYLabel(JPanel panel, JLabel label, JLabel Img, Color color1, Color color2) {
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(color1);
				label.setForeground(color2);
				Img.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(color2);
				label.setForeground(color1);
				Img.setVisible(true);
			}
		});
	}	
	public void GetData(JLabel lbl, String Table) {
		String consulta = "SELECT COUNT(*) AS Total FROM "+ Table +";";
		try {
			Statement sql = Conexion.EstablecerConexion().createStatement();
			ResultSet result = sql.executeQuery(consulta);
			int num;
			String numS;
			while(result.next()) {
				num = result.getInt("Total");
				numS = String.valueOf(num); 
				lbl.setText(numS);
			}
			
			sql.close();
			Conexion.EstablecerConexion().close();
			
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null,ex);
		}
	}
	
	public void ObtenerHora(JLabel lbl) {
		
		 Timer timer = new Timer();
	        TimerTask actualizarHora = new TimerTask() {
	            public void run() {
	            	int hora;
	        		int minutos;
	                LocalTime horaActual = LocalTime.now();
	                hora = horaActual.getHour();
	                minutos = horaActual.getMinute();
	                String Tiempo = "";
	                if(hora>=12) {
	                	Tiempo = "PM";
	                }else {
	                	Tiempo = "AM";
	                }
	                
	                lbl.setText(String.format("%02d:%02d ", hora, minutos) + Tiempo);
	            }
	        };

	        timer.schedule(actualizarHora, 0, 1000);
	    }
	
	public void CmbSpecialty(JComboBox<Object> cmb, String Tabla, String Columna) {
        String query = "SELECT "+ Columna +" FROM "+ Tabla +";";

          try {
              Statement sql = Conexion.EstablecerConexion().createStatement();
              ResultSet res = sql.executeQuery(query);

              ComboBoxModel<Object> model = new DefaultComboBoxModel<>(); // Crear un modelo de ComboBox

              while (res.next()) {
                  String nombreEspecialidad = res.getString(Columna);
                  ((DefaultComboBoxModel<Object>) model).addElement(nombreEspecialidad); // Agregar cada nombre de especialidad al modelo
              }

              cmb.setModel(model); // Establecer el modelo en el JComboBox

          } catch (SQLException e) {
              e.printStackTrace(); // Manejo básico de excepciones
          }

  }

	
	public void LimpiarCampos(JTextField Name,JTextField LastName,
			JTextField Email,JTextField Phone) {
			Name.setText(null);
			LastName.setText(null);
			Email.setText(null);
			Phone.setText(null);
		}
}
	


	