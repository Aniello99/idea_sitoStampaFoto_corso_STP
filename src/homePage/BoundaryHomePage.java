package homePage;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BoundaryHomePage {
 
	public void saluta() {
		System.out.println("benvenuto sul sito!");
	}
	
	public EnumHomePage chiediScelta() {
		
		//creo un array chiamato scelte di tipo EnumHomePage e ci inserisco tutte le costnati di EnumHomePage 
		EnumHomePage[] scelte = EnumHomePage.values();
		
		System.out.println("Le opzioni disponibili sono:\n");
		for(int i = 0; i < scelte.length; i++) {
			System.out.println((i+1) + ") " + scelte[i].getTesto());
		}
		
		//per garantire che il sistema non si blocchi prima di una scelta corretta uso il do while (scelta==null)
		EnumHomePage scelta = null;
		do {
			System.out.println("Inserisci il numero dell'azione che vuoi compiere: ");
			
			//creo istanza della classe Scanner(java.util.scanner) con flusso di input: System.in
			Scanner scanner = new Scanner(System.in);
			
			try {
				int numeroScelta = scanner.nextInt();
				
				//controlli sugli inserimenti
				if (numeroScelta - 1 < 0 || numeroScelta - 1 >= scelte.length)
					throw new Exception("Valore non valido");  //gestione indiretta eccezione
				
				if (!scelte[numeroScelta-1].isImplementato())
					throw new Exception("Funzionalità non ancora implementata");
				
				scelta = scelte[numeroScelta-1];
				
			} catch (InputMismatchException ex) {         //gestione diretta dell eccezione
				System.out.println("Valore non valido");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} while(scelta == null);
		
		System.out.println("Hai scelto "+scelta.getTesto()+"\n\n");
		
		return scelta;
	}
	
}
