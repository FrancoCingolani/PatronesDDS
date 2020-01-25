package command;

public class Retirar implements IOperacion{
	
	private Cuenta cuenta;
	private int monto;
	
	public Retirar(Cuenta cuenta, int monto) {
		this.cuenta = cuenta;
		this.monto = monto;
	}

	@Override
	public void execute() {
		this.cuenta.retirar(this.monto);
		
	}

}
