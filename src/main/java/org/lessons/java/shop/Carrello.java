package org.lessons.java.shop;

public class Carrello {
		
		Prodotto[] prodotti;
		int nuoviProdotti;
		
		public Carrello() {
			this.prodotti = new Prodotto[0];
			this.nuoviProdotti = 0;
		}
		
		public void inserisciProdotto(Prodotto prodotto) {
			Prodotto[] arrayProdotti = new Prodotto[nuoviProdotti + 1];
			
			for (int i = 0; i < nuoviProdotti; i++) {
				arrayProdotti[i] = prodotti[i];
			}
			
			arrayProdotti[nuoviProdotti] = prodotto;
			prodotti = arrayProdotti;
			nuoviProdotti++;
			
			System.out.println(prodotti[nuoviProdotti]);
		}

}
