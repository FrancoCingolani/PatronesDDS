package builder;

public class HarryPotterVaritaBuilder extends VaritaBuilder {

	@Override
	public void buildMadera() {
		varita.setMadera("Acebo");
	}

	@Override
	public void buildNucleo() {
		varita.setNucleo("Pluma de Cola de Fénix");
	}

	@Override
	public void buildLongitud() {
		varita.setLongitud(28);
	}
	
}
