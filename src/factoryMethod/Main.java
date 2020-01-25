package factoryMethod;

public class Main {
	
	public static void main (String[] args) {
		ConexionFactory fabrica = new ConexionFactory();
		
		Conexion conexion1 = fabrica.getConexion("POSTGRE");
		conexion1.conectar();
		conexion1.desconectar();
		
		Conexion conexion2 = fabrica.getConexion("MYSQL");
		conexion2.conectar();
		conexion2.desconectar();
	}

}
