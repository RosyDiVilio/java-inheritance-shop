package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto{
	
	protected static int codiceIMEI;
	protected static int memoria;
	
	public Smartphone(String nome, String marca, float prezzo, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceIMEI = codiceIMEI;
		this.memoria = memoria;
		
		Random randomImei = new Random();
		int numeroImei = randomImei.nextInt(999999999);
		codiceIMEI = numeroImei;
	}
		
		public int getCodiceImei() {
			return this.codiceIMEI;
		}
		
		public int getMemoria() {
			return this.memoria;
		}
		
	
		public static void shop() {
			System.out.println("Codice IMEI: " + codiceIMEI);
			System.out.println("Memoria: GB" + memoria);
			
		}
	}


