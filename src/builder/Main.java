package builder;

public class Main {
	public static void main(String[] args) {
		Ollivander ollivander = new Ollivander();
		ollivander.setVaritaBuilder(new SaucoVaritaBuilder());
		ollivander.crearVarita();
		Varita varita = ollivander.getVarita();
		
		System.out.println(varita.getMadera());
		System.out.println(varita.getNucleo());
		System.out.println(varita.getLongitud());
		
		
	}
}
