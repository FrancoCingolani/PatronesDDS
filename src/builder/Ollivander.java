package builder;

public class Ollivander {
	private VaritaBuilder varitaBuilder;
	
	public void setVaritaBuilder(VaritaBuilder vb) {
		this.varitaBuilder = vb;
	}
	
	public Varita getVarita() {
		return varitaBuilder.getVarita();
	}
	
	public void crearVarita() {
		varitaBuilder.buildMadera();
		varitaBuilder.buildNucleo();
		varitaBuilder.buildLongitud();
	}
	
	
}
