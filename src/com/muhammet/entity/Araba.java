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
		 * dahi o orada vard�r ve �a��r�l�r.
		 */
		/**
		 * Burada miras al�nan s�n�ftaki de�i�kenleri de�i�tirmenin 2 yolu var
		 */
		//1. y�ntem this.kdv = kdv;
		// 2. y�ntem
		// super(); -> miras ald���n�z s�n�f�n default constructor u nu i�aret eder ve onu �al��t�r�r.
		//System.out.println("Parent Olu�madan �nce"+ this.hiz);// Error
		//super(kdv);
		
		super(5,kdv);
		System.out.println("ffssdfsf");
		System.out.println("Parent olu�tu");
	}
	
	/**
	 * Overloading -> Methodlar�n a��r� y�klenmesi.
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
