package com.muhammet.entity;

public class Araba extends Arac{

	public int kapisayisi;
	public String plaka;
	public int vites;
	
	public Araba() {
		
	}
	
	public Araba(int kdv) {
		
		/**
		 * Super 
		 * siz bir constructor a super ifadesini girmezseniz
		 * dahi o orada vardýr ve çaðýrýlýr.
		 */
		/**
		 * Burada miras alýnan sýnýftaki deðiþkenleri deðiþtirmenin 2 yolu var
		 */
		//1. yöntem this.kdv = kdv;
		// 2. yöntem
		// super(); -> miras aldýðýnýz sýnýfýn default constructor u nu iþaret eder ve onu çalýþtýrýr.
		//System.out.println("Parent Oluþmadan önce"+ this.hiz);// Error
		//super(kdv);
		
		super(5,kdv);
		System.out.println("ffssdfsf");
		System.out.println("Parent oluþtu");
	}
	
	/**
	 * Overloading -> Methodlarýn aþýrý yüklenmesi.
	 */
	public void hizlan() {
		if(vites<1)
			this.hiz += 5;
		else
			this.hiz += 5*vites;
	}
	public void hizlan(int vites) {
		this.hiz += 5*vites;
		this.vites = vites;
	}
	
}
