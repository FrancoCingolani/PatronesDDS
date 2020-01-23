package observer;

public class Main {
	
	public static void main(String [] args) {
	
	Subject sujeto = new Subject();
	new PesoArgentinoObserver(sujeto);
	new ForintoHungaroObserver(sujeto);
	
	System.out.println("Si queres cambiar 10 dolares, obtendrás: ");
	sujeto.setEstado(10);
	
	System.out.println("------------------");
	
	System.out.println("Si queres cambiar 500 dolares, obtendrás: ");
	sujeto.setEstado(500);
	
	
	}
}
