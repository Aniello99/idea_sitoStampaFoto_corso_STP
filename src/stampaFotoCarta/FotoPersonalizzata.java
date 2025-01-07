package stampaFotoCarta;

import util.Prodotto;

public class FotoPersonalizzata extends Prodotto {
	
	private TipologiaFoto tipologiaFoto;
	private Formato formato;
	private Finitura finitura;
	private ColoreBordo coloreBordo;
	
	private int quantita;
	private String pathFoto;
	
	public FotoPersonalizzata(TipologiaFoto tipologiaFoto, Formato formato, Finitura finitura, ColoreBordo coloreBordo,
			int quantita, String pathFoto) {
		super(formato.getPrezzo()*quantita);
		
		this.tipologiaFoto = tipologiaFoto;
		this.formato = formato;
		this.finitura = finitura;
		this.coloreBordo = coloreBordo;
		this.quantita = quantita;
		this.pathFoto = pathFoto;
	}
	
	public TipologiaFoto getTipologiaFoto() {
		return tipologiaFoto;
	}
	public void setTipologiaFoto(TipologiaFoto tipologiaFoto) {
		this.tipologiaFoto = tipologiaFoto;
	}
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	public Finitura getFinitura() {
		return finitura;
	}
	public void setFinitura(Finitura finitura) {
		this.finitura = finitura;
	}
	public ColoreBordo getColoreBordo() {
		return coloreBordo;
	}
	public void setColoreBordo(ColoreBordo coloreBordo) {
		this.coloreBordo = coloreBordo;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public String getPathFoto() {
		return pathFoto;
	}
	public void setPathFoto(String pathFoto) {
		this.pathFoto = pathFoto;
	}

	@Override
	//modifico il letodo toString() per non creare errori con campi nulli
	public String toString() {
		String testoFinitura = null;
		String testoColoreBordo = null;
		if (finitura == null)
			testoFinitura = "-";
		else
			testoFinitura = finitura.getTesto();
		
		if (coloreBordo == null)
			testoColoreBordo = "-";
		else
			testoColoreBordo = coloreBordo.getTesto();
		
		return "[" + tipologiaFoto.getTesto() + ", " + formato.getTesto() + ", " + testoFinitura
				+ ", " + testoColoreBordo + ", " + quantita
				+ ", " + getPrezzo() + "€]";
	}

	
	
}
