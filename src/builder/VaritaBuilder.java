package builder;

public abstract class VaritaBuilder {
	
	protected Varita varita;
	
	public Varita getVarita(){
		return varita;
	}
	
	public void crearVarita() {
		varita = new Varita();
	}
	
	public abstract void buildMadera();
	public abstract void buildNucleo();
	public abstract void buildLongitud();

}
