package visualizzaCarrello;

import gestioneUtente.Utente;

public class ControlVisualizzaCarrello {

	public void visualizzaCarrello(Utente utente) {
		BoundaryVisualizzaCarrello boundaryVisualizzaCarrello = new BoundaryVisualizzaCarrello();
		boundaryVisualizzaCarrello.visualizzaCarrello(utente);
		
		if (utente == null)
			return;
		
		if (utente.getTotaleCarrello() > 100)
			boundaryVisualizzaCarrello.mostraSconto(utente.getTotaleCarrello()*0.8, 20);
		else if (utente.getTotaleCarrello() > 50)
			boundaryVisualizzaCarrello.mostraSconto(utente.getTotaleCarrello()*0.9, 10);
		
		
		//per nuovi funzioni come ad esempio "modificaCarrello" la generalizzazione di visualizzaCarrello a carrello
		//tale funzione è solo dimostrativa
		boundaryVisualizzaCarrello.futureImplementazioni();
	}
}
