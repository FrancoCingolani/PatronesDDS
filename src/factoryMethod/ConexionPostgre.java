package factoryMethod;

public class ConexionPostgre implements Conexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasenia;
	
	public ConexionPostgre() {
		this.host = "localhost";
		this.puerto = "4000";
		this.usuario = "admin";
		this.contrasenia = "asdasd";
	}

	@Override
	public void conectar() {
		System.out.println("Se conectó a POSTGRE");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de POSTGRE");
		
	}

}
