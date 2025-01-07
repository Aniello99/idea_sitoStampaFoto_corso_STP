package stampaFotoCarta;

public enum Formato {
	F12_12("12x12", 0.1),
	F12_16("12x16", 0.15),
	F12_18("12x18", 0.2),
	F8_10("8x10", 0.2),
	F12_15("12x15", 0.3);

	private String testo;
	private double prezzo;

	private Formato(String testo, double prezzo) {
		this.testo = testo;
		this.prezzo = prezzo;
	}

	public String getTesto() {
		return testo;
	}

	public double getPrezzo() {
		return prezzo;
	}
	
	//creo degli array non modificabili per fissare quali formati sono disponibili per le diverse tipologie
	public static final Formato[] formatiClassica = new Formato[] {F12_12, F12_16, F12_18};
	public static final Formato[] formatiPolaroid = new Formato[] {F8_10, F12_15};
	
}
