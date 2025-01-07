package stampaFotoCarta;

public enum ColoreBordo {
	BIANCO("Bianco"), 
	NERO("Nero"), 
	CELESTE("Celeste"), 
	ROSA("Rosa"), 
	ROSSO("Rosso");

	private String testo;

	private ColoreBordo(String testo) {
		this.testo = testo;
	}

	public String getTesto() {
		return testo;
	}
}
