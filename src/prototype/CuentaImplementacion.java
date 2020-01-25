package prototype;

public class CuentaImplementacion implements ICuenta {
	
	private String tipo;
	private int monto;
	
	public CuentaImplementacion() {
		tipo = "AHORRO";
	}

	@Override
	public ICuenta clonar() {
		CuentaImplementacion cuenta = null;
		
		try {
			cuenta = (CuentaImplementacion) clone();
		}catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		return cuenta;
	}
	
	public String detallesCuenta() {
		return "Detalles de la cuenta:  Tipo = "+ tipo + "// Monto = "+ monto;
	}
	
	

	public int getMonto() {
		return monto;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	

}
