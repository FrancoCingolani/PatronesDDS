package adapter;

public class MotorComun implements IMotor{
	
	public MotorComun() {
		super();
		System.out.println("Creando motor com�n...");
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo motor com�n...");
	}
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando motor com�n...");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor com�n...");
		
	}

}
