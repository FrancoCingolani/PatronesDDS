package command;

public class Main {
	
	public static void main (String[] args) {
		
		Cuenta cuenta = new Cuenta(1, 500);
		Depositar depositar1 = new Depositar(cuenta, 600);
		Retirar retirar1 = new Retirar(cuenta, 300);
		
		Invoker invoker = new Invoker();
		invoker.agregarOperacion(depositar1);
		invoker.agregarOperacion(retirar1);
		
		invoker.realizarOperaciones();
		
	}

}
