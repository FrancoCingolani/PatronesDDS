package adapter;

public class MotorElectrico {
	
	private boolean conectado;
	
	public MotorElectrico() {
		System.out.println("Creando motor eléctrico...");
		this.conectado = false;
	}
	
	public void conectar() {
		System.out.println("Conectando motor eléctrico...");
		this.conectado = true;
	}
	
	public void activar() {
		if(this.conectado != true) {
			System.out.println("No se puede activar. Por favor conecte el motor");
		}else {
			System.out.println("Activando motor eléctrico...");
		}
	}
	
	
	public void moverMasRapido() {
		if(this.conectado != true) {
			System.out.println("No se puede mover más rápido. Por favor conecte el motor");
		}else {
			System.out.println("Moviéndose más rápido. Aumentando el voltaje del motor eléctrico...");
		}
	}
	
	public void detener() {
		if(this.conectado != true) {
			System.out.println("No se puede detener. Por favor conecte el motor");
		}else {
			System.out.println("Deteniéndose. Bajando el voltaje del motor eléctrico...");
		}
	}
	
	public void apagar() {
		if(this.conectado != true) {
			System.out.println("No se puede apagar. Por favor conecte el motor");
		}else {
			System.out.println("Apagando motor eléctrico...");
		}
	}
	

}
