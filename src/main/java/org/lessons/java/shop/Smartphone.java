package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto{
	
	protected int codiceIMEI;
	protected int memoria;
	
	public Smartphone(int codice, String nome, String marca, float prezzo, float iva,int codiceIMEI, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceIMEI = codiceIMEI;
		this.memoria = memoria;
		
		Random randomImei = new Random();
		int numeroImei = randomImei.nextInt(999999999);
		codiceIMEI = numeroImei;
		this.codiceIMEI = codiceIMEI;
	}
		
		public int getCodiceImei() {
			return this.codiceIMEI;
		}
		
		public void setCodiceImei(int codiceIMEI) {
			this.codiceIMEI = codiceIMEI;
		}
		
		public int getMemoria() {
			return this.memoria;
		}
		
		public void setMemoria(int memoria) {
			this.memoria = memoria;
		}
		
	
		public void shop() {
			System.out.println("Codice IMEI: " + codiceIMEI);
			System.out.println("Memoria: GB" + memoria);
			
		}
	}


