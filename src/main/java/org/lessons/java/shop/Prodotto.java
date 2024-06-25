package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	protected int codice;
	protected String nome;
	protected String marca;
	protected int prezzo;
	protected float iva;
	
	public Prodotto(int codice, String nome, String marca, float prezzo, float iva) {
		
		//this.codice;
		//this.nome;
		//this.marca;
		//this.prezzo;
		//this.iva;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		Random random = new Random();
		int numero = random.nextInt(999999);
		codice = numero;
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = 5;
	}
	
	public void shop() {
		System.out.println("Elenco dettagli del prodotto ->");
		System.out.println("Codice: " + codice);
		System.out.println("Nome: " + nome);
		System.out.println("Marca: " + marca);
		System.out.println("Prezzo: €" + prezzo);
		System.out.println("Iva: %" + iva);
	}

}
