package stampaFotoCarta;

public enum Finitura {
	LUCIDA("Lucida"),
	OPACA("Opaca");

	private String testo;

	private Finitura(String testo) {
		this.testo = testo;
	}

	public String getTesto() {
		return testo;
	}
}
