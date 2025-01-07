package gestioneUtente;

import java.util.Scanner;

public class BoundaryRegistrazione {
	
	//creo un metodo separato per la mail dagli altri campi in modo da verificare subito se già si è registrati
	
	public String richiediEmail() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci email: ");
		return scanner.next();
	}
	
	public Utente richiediInformazioni() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci nome: ");
		String nome = scanner.next();
		
		System.out.print("Inserisci cognome: ");
		String cognome = scanner.next();
		
		System.out.print("Inserisci indirizzo di spedizione: ");
		String indirizzo = scanner.next();
		
		System.out.print("Inserisci CAP: ");
		String cap = scanner.next();
		
		System.out.print("Inserisci cellulare: ");
		String cellulare = scanner.next();
		
		System.out.print("Inserisci password: ");
		String password = scanner.next();
		
		return new Utente(password, nome, cognome, cellulare, indirizzo, cap);
	}
}
