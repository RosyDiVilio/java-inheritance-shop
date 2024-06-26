package org.lessons.java.shop;

import java.util.Scanner;

import java.util.Random;

public class main {
	
	public static void main(String[] args) {
		
        Scanner inputUser = new Scanner(System.in);
        Prodotto prodotto = null;
        Carrello carrello = new Carrello();
       
		
		System.out.println("Inserisci il tipo di prodotto di acquistare (Scegli tra Smartphone, Televisori, Cuffie)");
        String userInput = inputUser.nextLine();
		
		System.out.println("Inserisci il codice del prodotto");
		int codice = inputUser.nextInt();
		
		System.out.println("Inserisci il nome del prodotto");
		String nome = inputUser.nextLine();
		
		System.out.println("Inserisci la marca del prodotto");
		String marca = inputUser.nextLine();
		
		System.out.println("Inserisci il prezzo del prodotto");
		int prezzo = inputUser.nextInt();
		
		System.out.println("Inserisci l'iva del prodotto");
		int iva = inputUser.nextInt();
		
		//richiesta campi da compilare in base alla scelta dell'utente
		if(userInput == "Smartphone") {
			System.out.println("Inserisci il codice IMEI");
			int codiceIMEI = inputUser.nextInt();
			
			System.out.println("Inserisci memoria");
			int memoria = inputUser.nextInt();
			
			prodotto = new Smartphone(codice, nome, marca, prezzo, iva, codiceIMEI, memoria);
			
		}

		else if(userInput == "Televisori") {
			System.out.println("Inserisci le dimensioni della TV");
			int dimensioni = inputUser.nextInt();
			
			System.out.println("La TV scelta è Smart? Scrivi True o False");
			boolean smart = inputUser.nextBoolean();
			
			prodotto =  new Televisori(codice, nome, marca, prezzo, iva, dimensioni, smart);
		
		}
		
		else if(userInput == "Cuffie") {
			System.out.println("Inserisci il colore delle cuffie");
			String colore = inputUser.nextLine();
			
			System.out.println("Le cuffie sono Wireless? Scrivi True o False");
			boolean wireless = inputUser.nextBoolean();
			
			System.out.println("Le cuffie sono cablate? Scrivi True o False");
			boolean cablate = inputUser.nextBoolean();
			
			prodotto = new Cuffie(codice, nome, marca, prezzo, iva, colore, wireless, cablate);
			
			//carrello.nuoviProdotti = prodotto;
			
			inputUser.close();
		}

	}

}
