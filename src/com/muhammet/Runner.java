package com.muhammet;

import com.muhammet.entity.Araba;
import com.muhammet.entity.Arac;
import com.muhammet.entity.Ucak;

public class Runner {

	public static void main(String[] args) {
		
		Arac arac = new Arac(25);
		System.out.println("Ara� id....: "+ arac.uuid);
		System.out.println("Ara� kdv...: "+ arac.kdv);
		
		
		Araba araba = new Araba(190);
		System.out.println("Araba id...: "+ araba.uuid);
		System.out.println("Araba kdv..: "+ araba.kdv);
		System.out.println("Araba yolcu.: "+ araba.yolcukapasitesi);
		Ucak ucak = new Ucak();
		System.out.println("U�ak id....: "+ ucak.uuid);
		System.out.println("U�ak kdv...: "+ ucak.kdv);
		System.out.println("U�ak yolcu.: "+ ucak.yolcukapasitesi);
		
	}

}
