package adapter;

public class MotorEconomico implements IMotor{
	
	public MotorEconomico() {
		super();
		System.out.println("Creando motor econůmico...");
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo motor econůmico...");
	}
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando motor econůmico...");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor econůmico...");
		
	}

	
	
	
	

}
