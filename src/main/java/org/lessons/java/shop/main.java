package org.lessons.java.shop;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		Smartphone smartphone = new Smartphone("iPhone", "Apple", 700, 128);
		Televisori televisori = new Televisori("Neo QLed", "Samsung", 900, 45, true);
		Cuffie cuffie = new Cuffie("SOLO3", "Beats", 150, "nero", true, false);
		
		Prodotto.shop();
		
		System.out.println(smartphone.shop());
		System.out.println(televisori.shop());
		System.out.println(cuffie.shop());
		
	}

}
