package stampaFotoCarta;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

import homePage.EnumHomePage;

public class BoundaryStampaFotoCarta {
	
	public TipologiaFoto richiediTipologia() {
		TipologiaFoto[] tipologie = TipologiaFoto.values();
		
		System.out.println("Scegli una tipologia di foto:\n");
		for(int i = 0; i < tipologie.length; i++) {
			System.out.println((i+1) + ") " + tipologie[i].getTesto() + ", a partire da " + prezzoMinimo(tipologie[i].getFormati()) + "€");
		}
		
		TipologiaFoto tipologia = null;
		do {
			System.out.println("Inserisci il numero della tipologia che vuoi scegliere: ");
			Scanner scanner = new Scanner(System.in);
			try {
				int numeroScelta = scanner.nextInt();
				if (numeroScelta - 1 < 0 || numeroScelta - 1 >= tipologie.length)
					throw new Exception("Valore non valido");
				
				tipologia = tipologie[numeroScelta-1];
			} catch (InputMismatchException ex) {
				System.out.println("Valore non valido");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} while(tipologia == null);
		
		return tipologia;
	}
	
	private double prezzoMinimo(Formato[] formati) {
		//funzione trovata
		return Stream.of(formati).mapToDouble(f -> f.getPrezzo()).min().getAsDouble();
	}
	
	public Formato richiediFormato(TipologiaFoto tipologiaFoto) {
		Formato[] formati = tipologiaFoto.getFormati();
		
		System.out.println("Scegli una formato di foto:\n");
		for(int i = 0; i < formati.length; i++) {
			System.out.println((i+1) + ") " + formati[i].getTesto() + " " + formati[i].getPrezzo() + "€");
		}
		
		Formato formato = null;
		do {
			System.out.println("Inserisci il numero del formato che vuoi scegliere: ");
			Scanner scanner = new Scanner(System.in);
			try {
				int numeroScelta = scanner.nextInt();
				if (numeroScelta - 1 < 0 || numeroScelta - 1 >= formati.length)
					throw new Exception("Valore non valido");
				
				formato = formati[numeroScelta-1];
			} catch (InputMismatchException ex) {
				System.out.println("Valore non valido");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} while(formato == null);
		
		return formato;
	}
	
	public Finitura richiediFinitura() {
		Finitura[] finiture = Finitura.values();
		
		System.out.println("Scegli una finitura di foto:\n");
		for(int i = 0; i < finiture.length; i++) {
			System.out.println((i+1) + ") " + finiture[i].getTesto());
		}
		
		Finitura finitura = null;
		do {
			System.out.println("Inserisci il numero della finitura che vuoi scegliere: ");
			Scanner scanner = new Scanner(System.in);
			try {
				int numeroScelta = scanner.nextInt();
				if (numeroScelta - 1 < 0 || numeroScelta - 1 >= finiture.length)
					throw new Exception("Valore non valido");
				
				finitura = finiture[numeroScelta-1];
			} catch (InputMismatchException ex) {
				System.out.println("Valore non valido");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} while(finitura == null);
		
		return finitura;
	}
	
	public ColoreBordo richiediColoreBordo() {
		ColoreBordo[] colori = ColoreBordo.values();
		
		System.out.println("Scegli un colore per il bordo della foto:\n");
		for(int i = 0; i < colori.length; i++) {
			System.out.println((i+1) + ") " + colori[i].getTesto());
		}
		
		ColoreBordo coloreBordo = null;
		do {
			System.out.println("Inserisci il numero del colore del bordo che vuoi scegliere: ");
			Scanner scanner = new Scanner(System.in);
			try {
				int numeroScelta = scanner.nextInt();
				if (numeroScelta - 1 < 0 || numeroScelta - 1 >= colori.length)
					throw new Exception("Valore non valido");
				
				coloreBordo = colori[numeroScelta-1];
			} catch (InputMismatchException ex) {
				System.out.println("Valore non valido");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} while(coloreBordo == null);
		
		return coloreBordo;
	}
	
	public int richiediQuantita() {
		int quantita = -1;
		do {
			System.out.println("Inserisci il numero di copie che desideri: ");
			Scanner scanner = new Scanner(System.in);
			try {
				quantita = scanner.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Valore non valido");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} while(quantita < 1);
		return quantita;
	}
}
