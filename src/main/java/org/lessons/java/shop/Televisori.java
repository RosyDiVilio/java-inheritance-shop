package org.lessons.java.shop;

public class Televisori extends Prodotto{
	
	protected static int dimensioni;
	protected static boolean smart;
	
	public Televisori(String nome, String marca, float prezzo, int dimensioni, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}
		
		public int getDimensioni() {
			return this.dimensioni;
		}
		
		public boolean getSmart() {
			return this.smart;
		}
		
		public static void shop() {
			System.out.println("Dimensioni: p" + dimensioni);
			System.out.println("E' Smart?: " + smart);
			
		}
		
	}


