package org.lessons.java.shop;

public class Televisori extends Prodotto{
	
	protected int dimensioni;
	protected boolean smart;
	
	public Televisori(int codice, String nome, String marca, int prezzo, float iva, int dimensioni, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}
		
		public int getDimensioni() {
			return this.dimensioni;
		}
		
		public void setDimensioni(int dimensioni) {
			this.dimensioni = dimensioni;
		}
		
		public boolean getSmart() {
			return this.smart;
		}
		
		public void setSmart(boolean smart) {
			this.smart = smart;
		}
		
		public void shop() {
			System.out.println("Dimensioni: p" + dimensioni);
			System.out.println("E' Smart?: " + smart);
			
		}
		
	}


