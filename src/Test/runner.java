package Test;

import islemler.komutlar;
import islemler.matematikselislemler;

public class runner {

	
	public static void main(String[] args) {
		
		matematikselislemler islem = new matematikselislemler();
		
		//islem.topla();
		
		//islem.topla2();
	
		//islem.topla3(5, 16);
		
		//System.out.println("Toplamanýn sonucu....:"+islem.topla6());
		 
		komutlar islem2 = new komutlar();
		System.out.println(islem2.carpma(12, 43));
		System.out.println(islem2.toplama(12, 3, 4));
		System.out.println(islem2.kareal(99));
		
	}//main method u bitiþi.
	
}
