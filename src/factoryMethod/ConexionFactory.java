package factoryMethod;

public class ConexionFactory {
	
	public Conexion getConexion(String motor){
		if(motor.equalsIgnoreCase("MYSQL")){
			return new ConexionMySQL();
		} else if(motor.equalsIgnoreCase("POSTGRE")){
			return new ConexionPostgre();
		} else if(motor.equalsIgnoreCase("ORACLE")){
			return new ConexionOracle();
		}
		return null;
	}

}
