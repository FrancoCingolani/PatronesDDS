package factoryMethod;

public class ConexionOracle implements Conexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasenia;
	
	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "8000";
		this.usuario = "admin";
		this.contrasenia = "asdasd";
	}

	@Override
	public void conectar() {
		System.out.println("Se conectó a ORACLE");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de ORACLE");
		
	}

}
