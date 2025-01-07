package homePage;


import gestioneUtente.ControlUtente; //usato nei casi accedi/registrati 
import stampaFotoCarta.ControlStampaFotoCarta;
import visualizzaCarrello.ControlVisualizzaCarrello;

//tale classe sarà il cuore della homepage e in essa non avremo mai metodi creati per un contatto diretto con l utente

public class ControlHomePage {
	//classe senza attributi
	
	public void avvio (){
		
		
		//invoco il costruttore per una boundaryHomepage
		//sarà tale classe a gestire tutto quello che è associato alla comunicazione con l utente
		
		BoundaryHomePage boundaryHomePage= new BoundaryHomePage();
		boundaryHomePage.saluta();
		

		ControlUtente controlUtente = new ControlUtente();
		
		do {
			//inserisco nella variabile "scelta" di tipo EnumHomePage il return della funzione chiediScelta()
			//la funzione chiediScelta mostra tutte le scelte e ne fa scegliere una
			EnumHomePage scelta = boundaryHomePage.chiediScelta();
			
			switch(scelta) {
			case REGISTRAZIONE:
				controlUtente.registrati();
				break;
			case ACCESSO_ACCOUNT:
				controlUtente.accedi();
				break;
			case VISUALIZZA_CARRELLO:
				ControlVisualizzaCarrello controlVisualizzaCarrello = new ControlVisualizzaCarrello();
				controlVisualizzaCarrello.visualizzaCarrello(controlUtente.getUtenteLoggato());
				//la funzione visualizzaCarrello va a capire se l utente è loggato. 
				//se non si è loggati ho utenteloggato=null.
				break;
			case STAMPA_FOTO_SU_CARTA:   //comprende anche il caso d uso "osserva listino prezzi"
				ControlStampaFotoCarta controlStampaFotoCarta = new ControlStampaFotoCarta();
				controlStampaFotoCarta.stampaFotoCarta(controlUtente.getUtenteLoggato());
				//la produzione del prodotto sarà consentita solo agli utenti loggati
				//tutti pero possono osservare i prezzi
				break;
			default:
				System.out.println("funzionalià non ancora implementata");
			}
		} while (true);
    }

	
}