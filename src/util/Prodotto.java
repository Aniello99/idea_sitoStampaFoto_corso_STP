package util;


//visto che avremo diverse tipologie di prodotti, partimano da una classe astratta che poi estenderemo
public abstract class Prodotto {
	
	//attributi e metodi comuni a tutti i prodotti
	
	private double prezzo;

	public Prodotto(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	

}
