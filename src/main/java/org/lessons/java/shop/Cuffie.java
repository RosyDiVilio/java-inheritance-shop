package org.lessons.java.shop;

public class Cuffie extends Prodotto{
	
	protected static String colore;
	protected static boolean wireless;
	protected static boolean cablate;
	
	public Cuffie(String nome, String marca, float prezzo, String colore, boolean wireless, boolean cablate) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
		this.cablate = cablate;
		
	}
	
	public String getColore() {
		return this.colore;
	}
	
	public boolean getWireless() {
		return this.wireless;
	}
	
	public boolean getCablate() {
		return this.cablate;
	}
	
	public static void shop() {
		System.out.println("Colore: " + colore);
		System.out.println("Wireless: " + wireless);
		System.out.println("Cablate: " + cablate);
		
	}

}
