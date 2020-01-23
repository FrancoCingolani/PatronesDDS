package observer;

public class ForintoHungaroObserver extends Observer {
	
private int valorCambio = 296;
	
	public ForintoHungaroObserver(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregarObservador(this);
	}

	@Override
	public void actualizar() {
		System.out.println(sujeto.getEstado() * valorCambio + " forintos hungaros");
		
	}

}
