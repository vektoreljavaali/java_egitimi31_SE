package com.degiskenler;



public class Runner {
	
	
	
	public static void main(String[] args) {

	 	
 	
	
	}

	public static void ornekString2() {
		String ifade = "Yen� java grubu 31. Donem ders�";
		String ifade2 = "yeni ifade";
		// �ki string katar�n� birle�tirir.
	System.out.println(ifade.concat(". Bug�n Ba�lad�"));
	System.out.println(ifade+". yeni ekleme");	
	//String dizisi i�inde, istenen index e ait karakteri verir. 
	System.out.println(ifade.charAt(5));
	
	System.out.println(ifade.compareTo("Yeni java grubu 31. D�nem dersi "));
	
	//ilgili ifadenin String katar� i�inde olup olmad���n� sorgular
	System.out.println(ifade.contains("Yeni ja"));
	
	System.out.println(ifade.isEmpty());
	
	System.out.println(ifade);
	System.out.println(ifade.replace('�', 'i').replace('o', '�'));
	
 	System.out.println(ifade.split(" ")[4]);
 	
 	System.out.println(ifade.toLowerCase());
 	System.out.println(ifade.toUpperCase());
 	
		
	}
	
	public static void ornekString1() {
		String ifade = "Yeni java grubu 31. D�nem dersi";
		String ilkifade = ifade.substring(0, 9);
		String ikinciifade = ifade.substring(10, 15);
		String ucuncuifade = ifade.substring(16, 31);
		System.out.println(ilkifade);
		System.out.println(ikinciifade);
		System.out.println(ucuncuifade);
		
	}
	
	public static void orneklerString() {
		
		String ifade = "ali bize gel";
		String ifade2 = " ali ";
		
		System.out.println("ali"==ifade2);
		//equals => iki string ifadeyi kar��la�t�r�r
		//trim   => bir ifade de bulunan ba�taki ve sonraki bo�luklar� siler.
		System.out.println(ifade2.trim().equals("ali"));
		//substring ifadenin igili indexinden ba�layarak ilgili indexe 
		//kadar olan k�sm�n� al�r.
		System.out.println(ifade.substring(4, 12));
		// indexof => talep edilen karakterin indis numaras�n� verri
		System.out.println(ifade.indexOf('i'));
		
		
		int ilki,ifadeninuzunlugu,kesilenuzunluk;
		ilki =ifade.indexOf('i');//2
		kesilenuzunluk = ifade.indexOf('i')+1;//2
		ifadeninuzunlugu = ifade.length();
		
		System.out.println(ifade.substring(ilki+1, ifadeninuzunlugu).indexOf('i')+kesilenuzunluk);
		
		
		
	} 
		
    public static void ornekler1() {
		//Tam say� De�i�kenleri
		byte sayi1; // -128 den 127
		short sayi2;// -32.768 den 32.767
		int sayi3;  // -2,147,483,648 den 2,147,483,647
		long sayi4; // -9,223,372,036,854,775,808 den 9,223,372,036,854,775,807
		// Kesirli de�i�kenler
		float fsayi1;
		double dsayi1;
		// Karakter de�i�ken
		char karakter1;
		char karakter2;
		char karakter3;
		
		// swich de�i�ken
		boolean dogruyanlis;
		
		sayi1 = 127;
		sayi1 = -12;
		sayi2 = 3276;
		
		fsayi1 = 235.5f;
		dsayi1 = 235.5f;
		
		karakter1 = 'a';
		karakter2 = 'l';
		karakter3 = 'i';
		
		System.out.print(karakter1);
		System.out.print(karakter2);
		System.out.print(karakter3);
		System.out.println("");
		
		int a = 5;
		int b =6;
		
		System.out.println(a==b);
		
	}
	
	
}
