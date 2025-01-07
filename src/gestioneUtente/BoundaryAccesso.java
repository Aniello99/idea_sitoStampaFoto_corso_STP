package gestioneUtente;

import java.util.Scanner;

public class BoundaryAccesso {
	
	public String richiediEmail() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci email: ");
		return scanner.next();
	}
	
	public String richiediPassword() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci password: ");
		return scanner.next();
	}

}
