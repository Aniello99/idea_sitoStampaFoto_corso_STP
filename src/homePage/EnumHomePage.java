package homePage;

public enum EnumHomePage {
	REGISTRAZIONE("Registrati", true),
	ACCESSO_ACCOUNT("Accedi", true),
	VISUALIZZA_CARRELLO("Visualizza Carrello", true),
	STAMPA_FOTO_SU_CARTA("Stampa foto su carta", true),
	STAMPA_FOTO_SU_TELA("Stamp foto su tela", false),
	PERSONALIZZA_TAZZA_CON_FOTO("Personalizza tazza con foto", false),
	PERSONALIZZA_TSHIRT_CON_FOTO("Personalizza tshirt con foto", false),
	PERSONALIZZA_PORTACHIAVI_CON_PAROLA("Personalizza portachiavi con parola", false);
	
	//ad ogni costante enum ho associato una stringa che sarà usata nel boundaryHomePage per mostrare la scelta all utente e un boolean solo per fissare cosa ho implementato o meno
	
	
	private String testo;
	private boolean implementato;
	
	//in java il costruttore degli enum è private
	//modifico il costruttore che ora, all avvia dell app imposta 
	private EnumHomePage(String testo, boolean implementato) {
		
		this.testo = testo;   //uso this per fare riferimento all oggetto corrente
		this.implementato = implementato;
	}
	
	public String getTesto() {
		return testo;
	}
	
	public boolean isImplementato() {
		return implementato;
	}
	

}
