package command;

public class Cuenta {
	
	private int id;
	private int saldo;
	
	public Cuenta(int id, int saldo) {
		this.id = id;
		this.saldo = saldo;
	}
	
	public void retirar(int monto) {
		this.saldo = this.saldo - monto;
		System.out.println("[COMANDO RETIRAR] Cuenta: " + id + " // Saldo: " + this.saldo);
	}
	
	public void depositar(int monto) {
		this.saldo = this.saldo + monto;
		System.out.println("[COMANDO DEPOSITAR] Cuenta: " + id + " // Saldo: " + this.saldo);
	}

}
