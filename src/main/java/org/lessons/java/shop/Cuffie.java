package org.lessons.java.shop;

public class Cuffie extends Prodotto{
	
	protected String colore;
	protected boolean wireless;
	protected boolean cablate;
	
	public Cuffie(int codice, String nome, String marca, int prezzo, int iva, String colore, boolean wireless, boolean cablate) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
		this.cablate = cablate;
		
	}
	
	public String getColore() {
		return this.colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public boolean getWireless() {
		return this.wireless;
	}
	
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	public boolean getCablate() {
		return this.cablate;
	}
	
	public void setCablate(boolean cablate) {
		this.cablate = cablate;
	}
	
	public void shop() {
		System.out.println("Colore: " + colore);
		System.out.println("Wireless: " + wireless);
		System.out.println("Cablate: " + cablate);
		
	}

}
