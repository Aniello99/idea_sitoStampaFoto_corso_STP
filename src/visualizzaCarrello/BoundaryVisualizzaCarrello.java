package visualizzaCarrello;

import gestioneUtente.Utente;

public class BoundaryVisualizzaCarrello {
	public void visualizzaCarrello(Utente utente) {
		if (utente == null) {
			System.out.println("Accedi per poter usufruire del carrello");
			return;
		}
		
		System.out.println("Il tuo carrello è composto da:");
		for (int i=0; i < utente.getProdottiCarrello().size(); i++) {
			System.out.println("Prodotto "+ (i+1) +": " + utente.getProdottiCarrello().get(i));
		}
		
		double prezzoTotale = utente.getTotaleCarrello();
		System.out.println("Totale "+prezzoTotale+"€");
		
	}
	
	public void mostraSconto(double prezzoScontato, double percentualeSconto) {
		System.out.println("Totale dopo il "+percentualeSconto+"% di sconto "+prezzoScontato+"€");
	}
	
	public void futureImplementazioni() {
		System.out.println("Saranno implementate in seguito le funzionalità di elimina dal carrello e invio ordine");
	}
	
}
