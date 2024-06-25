package org.lessons.java.shop;

import java.util.Random;

public class main {
	
	public static void main(String[] args) {
		
		Smartphone iphone = new Smartphone("iPhone", "Apple", 700, 5, 128);
		
		iphone.shop();
		System.out.println(iphone.getCodice());
		System.out.println(iphone.getNome());
		System.out.println(iphone.getMarca());
		System.out.println(iphone.getPrezzo());
		System.out.println(iphone.getIva());
		System.out.println(iphone.getCodiceImei());
		System.out.println(iphone.getMemoria());
		
		Televisori samsungTV = new Televisori("Neo QLed", "Samsung", 900, 45, true);
		
		samsungTV.shop();
		System.out.println(samsungTV.getCodice());
		System.out.println(samsungTV.getNome());
		System.out.println(samsungTV.getMarca());
		System.out.println(samsungTV.getPrezzo());
		System.out.println(samsungTV.getIva());
		System.out.println(samsungTV.getDimensioni());
		System.out.println(samsungTV.getSmart());
		
		Cuffie cuffieB = new Cuffie("SOLO3", "Beats", 150, "nero", true, false);
		
		cuffieB.shop();
		System.out.println(cuffieB.getCodice());
		System.out.println(cuffieB.getNome());
		System.out.println(cuffieB.getMarca());
		System.out.println(cuffieB.getPrezzo());
		System.out.println(cuffieB.getIva());
		System.out.println(cuffieB.getColore());
		System.out.println(cuffieB.getWireless());
		System.out.println(cuffieB.getCablate());
		
	}

}
