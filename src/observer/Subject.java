package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> observadores = new ArrayList<Observer>();
	private int estado;
	
	public void setEstado(int estado) {
		this.estado = estado;
		sendNotification();
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void agregarObservador(Observer observador){
		observadores.add(observador);
	}
	
	public void sendNotification() {
		for(Observer observador : observadores) {
			observador.actualizar();
		}
	}

}
