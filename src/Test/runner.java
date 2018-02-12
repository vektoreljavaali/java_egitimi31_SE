package Test;

import islemler.komutlar;
import islemler.matematikselislemler;

public class runner {

	
	public static void main(String[] args) {
		
		matematikselislemler islem = new matematikselislemler();
		matematikselislemler islem2 = new matematikselislemler();
		
		
		//islem.topla();
		
		//islem.topla2();
	
		//islem.topla3(5, 16);
		
		//System.out.println("Toplamanýn sonucu....:"+islem.topla6());
		 
		//komutlar islem2 = new komutlar();
	//	System.out.println(islem2.carpma(12, 43));
	//	System.out.println(islem2.toplama(12, 3, 4));
	//	System.out.println(islem2.kareal(99));
		
		islem.degisken=10;
		islem2.degisken=12;
		islem.degisken2=3;
		islem2.degisken2=5;
		
		//islem.degismezdeger=33;
		
		//System.out.println(matematikselislemler.degisken);
		System.out.println(islem.degisken);
		System.out.println(islem2.degisken);
		
		
		
		
		
		
	}//main method u bitiþi.
	
}
