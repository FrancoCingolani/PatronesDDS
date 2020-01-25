package factoryMethod;

public class ConexionMySQL implements Conexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasenia;
	
	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "1234";
		this.usuario = "admin";
		this.contrasenia = "asdasd";
	}
	

	@Override
	public void conectar() {
		System.out.println("Se conect� a MYSQL");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconect� de MYSQL");
		
	}

}
