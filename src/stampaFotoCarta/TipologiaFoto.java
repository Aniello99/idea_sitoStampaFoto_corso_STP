package stampaFotoCarta;

public enum TipologiaFoto {
	CLASSICA("Classica", Formato.formatiClassica),
	POLAROID("Polaroid", Formato.formatiPolaroid);
	
	private String testo;
	private Formato[] formati;

	private TipologiaFoto(String testo, Formato[] formati) {
		this.testo = testo;
		this.formati = formati;
	}

	public String getTesto() {
		return testo;
	}
	
	public Formato[] getFormati() {
		return formati;
	}

}
