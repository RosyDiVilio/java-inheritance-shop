package org.lessons.java.shop;

public class Prodotto {
	
	protected int codice;
	protected String nome;
	protected String marca;
	protected int prezzo;
	protected int iva;
	
	public Prodotto(int codice, String nome, String marca, int prezzo, int iva) {
		
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
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

	public void setIva(int iva) {
		this.iva = 5;
	}
	
	@Override
	public String toSring() {
		return "Codice: " + this.codice + "Nome: " + this.nome + "Marca: " + this.marca + "Prezzo: " + this.prezzo + "IVA: " + this.iva;
	}

}

