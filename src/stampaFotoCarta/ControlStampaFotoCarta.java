package stampaFotoCarta;

import gestioneUtente.Utente;

public class ControlStampaFotoCarta {
	
	public void stampaFotoCarta(Utente utente) {
		BoundaryStampaFotoCarta boundaryStampaFotoCarta = new BoundaryStampaFotoCarta();
		
		//richiediTipologia() mi dirà le varie opzioni e mi farà scegliere
		TipologiaFoto tipologiaFoto = boundaryStampaFotoCarta.richiediTipologia(); //ritorna un enum TipologiaFoto
		
		//richiediFormato(tipologiaFoto) mi dirà le varie opzioni per la tipologia di foto scelta
		Formato formato = boundaryStampaFotoCarta.richiediFormato(tipologiaFoto); //ritorna un enum Formato 
		
		Finitura finitura = null;  //inizializzo a null visto che le polaroid non hanno finitura
		ColoreBordo coloreBordo = null; //inizializzo a null visto che le classiche non hanno colore bordo
		
		if (tipologiaFoto.equals(TipologiaFoto.CLASSICA))
			finitura = boundaryStampaFotoCarta.richiediFinitura();
		else 
			coloreBordo = boundaryStampaFotoCarta.richiediColoreBordo();
		
		System.out.println("In questo punto chiedermo il caricamento di una foto");
		int quantita = boundaryStampaFotoCarta.richiediQuantita();
		
		FotoPersonalizzata fotoPersonalizzata =  new FotoPersonalizzata(tipologiaFoto, 
				formato, finitura, coloreBordo, quantita, null); //metto null nel campo pathFoto per ora
		
		if (utente == null)
			System.out.println("Per favore accedi per poter proseguire ed aggiungere questo prodotto al carrello");
		else {
			utente.aggiungiAlCarrello(fotoPersonalizzata);
			System.out.println("Prodotto aggiungo con successo al carrello");
		}
		
	}

}
