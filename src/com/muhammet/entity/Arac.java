package com.muhammet.entity;

import java.util.UUID;

public class Arac {
	
	public String uuid;
	public String yakitturu;
	public int yolcukapasitesi;
	public int hiz;
	public int kdv;
	
	public void hizlan() {
		hiz +=5;
	}

	/**
	 * 
	 */
	public Arac() {
		uuid = UUID.randomUUID().toString();
		kdv = 18;
	}
	
	public Arac(int kdv) {
		this();
		this.kdv = kdv;
	}
	public Arac(int yolcukapasitesi, int kdv) {
		this(kdv);
		this.yolcukapasitesi = yolcukapasitesi;
	}
	
}
