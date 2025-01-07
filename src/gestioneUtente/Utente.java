package gestioneUtente;

import java.util.ArrayList;
import java.util.List;
import util.Prodotto;

public class Utente {
	
	private String email;
	private String password;
	private String nome;
	private String cognome;
	private String cellulare;
	private String indirizzo;
	private String cap;
	
	//il carrello di un utente è visto come una lista di prodotti
	private List<Prodotto> prodottiCarrello = new ArrayList<>();
	
	
	//costruttore senza mail
	public Utente(String password, String nome, String cognome, String cellulare, String indirizzo,
			String cap) {
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.cellulare = cellulare;
		this.indirizzo = indirizzo;
		this.cap = cap;
	}
	
	
    //costruttore con mail
	public Utente(String email, String password, String nome, String cognome, String cellulare, String indirizzo,
			String cap) {
		this.email = email;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.cellulare = cellulare;
		this.indirizzo = indirizzo;
		this.cap = cap;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}
	
	public List<Prodotto> getProdottiCarrello() {
		return prodottiCarrello;
	}
	
	public void aggiungiAlCarrello(Prodotto prodotto) {
		prodottiCarrello.add(prodotto);
	}
	
	public double getTotaleCarrello() {
		//funzione trovata per creare il totale
		return prodottiCarrello.stream().mapToDouble(p -> p.getPrezzo()).sum();
	}
	
}
