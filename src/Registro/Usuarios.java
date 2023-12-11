package Registro;

public class Usuarios {

	private String Nombre;
	private String Correo;
	private String Contraseña;
	
	public Usuarios (String N, String C, String CN) {
		this.setNombre(N);
		this.setCorreo(C);
		this.setContraseña(CN);
	}

	//Methods
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	
	//Methods
	//Clase Administrador Hereda de Usuarios
	public class Administrador extends Usuarios{
		int NivelAcceso;
		
		public Administrador(String N, String C, String CN) {
			super(N,C,CN);
		}
	}
	
}



	