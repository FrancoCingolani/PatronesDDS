package builder;

public class Varita {
	private String madera = "";
	private String nucleo = "";
	private int longitud;

	public void setMadera(String madera) {
		this.madera = madera;
	}
	
	public String getMadera() {
		return madera;
	}

	public void setNucleo(String nucleo) {
		this.nucleo = nucleo;
	}

	public String getNucleo() {
		return nucleo;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}
	
}
