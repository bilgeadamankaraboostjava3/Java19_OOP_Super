package com.muhammet.entity;

public class Ucak extends Arac{

	public int kanatuzunlugu;
	public int hostessayisi;
	
	/**
	 * Method Overriding -> Metodların ezilmesi
	 */
	@Override
	public void hizlan() {
		this.hiz += 30;
	}
	
}
