package adapter;

public class MotorElectrico {
	
	private boolean conectado;
	
	public MotorElectrico() {
		System.out.println("Creando motor el�ctrico...");
		this.conectado = false;
	}
	
	public void conectar() {
		System.out.println("Conectando motor el�ctrico...");
		this.conectado = true;
	}
	
	public void activar() {
		if(this.conectado != true) {
			System.out.println("No se puede activar. Por favor conecte el motor");
		}else {
			System.out.println("Activando motor el�ctrico...");
		}
	}
	
	
	public void moverMasRapido() {
		if(this.conectado != true) {
			System.out.println("No se puede mover m�s r�pido. Por favor conecte el motor");
		}else {
			System.out.println("Movi�ndose m�s r�pido. Aumentando el voltaje del motor el�ctrico...");
		}
	}
	
	public void detener() {
		if(this.conectado != true) {
			System.out.println("No se puede detener. Por favor conecte el motor");
		}else {
			System.out.println("Deteni�ndose. Bajando el voltaje del motor el�ctrico...");
		}
	}
	
	public void apagar() {
		if(this.conectado != true) {
			System.out.println("No se puede apagar. Por favor conecte el motor");
		}else {
			System.out.println("Apagando motor el�ctrico...");
		}
	}
	

}
