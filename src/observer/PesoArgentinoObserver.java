package observer;

public class PesoArgentinoObserver extends Observer {
	
	private int valorCambio = 63;
	
	public PesoArgentinoObserver(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregarObservador(this);
	}

	@Override
	public void actualizar() {
		System.out.println(sujeto.getEstado() * valorCambio + " pesos argentinos");
		
	}

}
