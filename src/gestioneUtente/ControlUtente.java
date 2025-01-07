package gestioneUtente;

import java.util.ArrayList;
import java.util.List;


//OSSERVAZIONE: visto che la gestione degli utenti si avrà sia nel caso di registrati che di accedi==> uso un solo control ma 2 boundary

public class ControlUtente {
	
//	private List<Utente> utentiIscritti = List.of(
//			new Utente("test@a.it", "test", "test", "test", "3333333333", "indirizzo di test", "00000"));
	private List<Utente> utentiIscritti = new ArrayList<>();
	
	private Utente utenteLoggato; //ci serve per capire se l utente ha effettuato l'accesso
	
	public void registrati() {
		BoundaryRegistrazione boundaryRegistrazione = new BoundaryRegistrazione();
		String email = boundaryRegistrazione.richiediEmail();
		if (trovaUtenteDaEmail(email) != null) {
			System.out.println("Email già esistente, sarai riportato alla home page\n\n");
			return;   
		}
		
		Utente utente = boundaryRegistrazione.richiediInformazioni(); //la funzione ritorna un utente con info(no mail)
		utente.setEmail(email);
		
		utentiIscritti.add(utente);
	}
	
	private Utente trovaUtenteDaEmail(String email) {
		
		for (int i = 0; i < utentiIscritti.size(); i++) {
			Utente utente = utentiIscritti.get(i);
			if (utente.getEmail().equals(email))
				return utente;
		}
		return null;
	}
	
	public void accedi() {
		BoundaryAccesso boundaryAccesso = new BoundaryAccesso();
		
		String email = boundaryAccesso.richiediEmail();
		String password = boundaryAccesso.richiediPassword();
		
		Utente utente = trovaUtenteDaEmail(email);  //la funzione ritorna un utente
		if (utente == null || !utente.getPassword().equals(password))
			System.out.println("Credenziali errate");
		else {
			System.out.println("Accesso effettuato");
			this.utenteLoggato = utente;  //inserisce un utentologgato l utente che ha effettuato l accesso
		}
	}
	
	public Utente getUtenteLoggato() {
		return utenteLoggato;
	}
	
	
}
