package adapter;

public class Main {
	
	private static IMotor motor;
	
	public static void main (String[] args) {
		
		motor = new MotorElectricoAdapter();
		usarMotor();
		
	}
	
	private static void usarMotor() {
		motor.encender();
		motor.acelerar();
		motor.apagar();
	}

}
