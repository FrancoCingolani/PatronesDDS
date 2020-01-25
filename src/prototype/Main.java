package prototype;

public class Main {
	
	public static void main (String[] args) {
		
		CuentaImplementacion cuentaAhorro = new CuentaImplementacion();
		cuentaAhorro.setMonto(300);
		CuentaImplementacion cuentaClonada = (CuentaImplementacion) cuentaAhorro.clonar();
		
		if(cuentaClonada != null) {
			System.out.println(cuentaClonada.detallesCuenta());
		}
		
		System.out.println(cuentaClonada == cuentaAhorro); //Pregunta si el espacio en memoria es igual
	}

}
