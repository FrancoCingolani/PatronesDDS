package command;

public class Depositar implements IOperacion{
	
	private Cuenta cuenta;
	private int monto;
	
	public Depositar(Cuenta cuenta, int monto) {
		this.cuenta = cuenta;
		this.monto = monto;
	}

	@Override
	public void execute() {
		this.cuenta.depositar(this.monto);
		
	}

}
