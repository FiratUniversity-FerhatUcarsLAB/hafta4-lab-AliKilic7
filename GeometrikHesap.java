***KOD***
package Hafta4;

import java.util.Scanner;

public class GeometrikHesap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("=====Geometrik Hesaplayıcı=====");
		//Dairenin yarıçapı alınıyor.
		System.out.println("Hesaplamaları yapılacak dairenin yarıçapını belirleyiniz");
		double ycap = input.nextDouble();
		
		//PI sayısı tanımlanıyor
		final double pi = 3.14159;
				
		//Hesaplamalar
		double dairealan = pi*Math.pow(ycap, 2);
		double dairecevre = 2*pi*ycap;
		double dairecap = 2*ycap;
		double kurehacim = (4.0/3.0)*pi*Math.pow(ycap, 3);
		double kureyuzeyalan = 4*pi*Math.pow(ycap, 2);
		
		//Tablo yazdırılıyor
		System.out.println("      ***SONUÇLAR***      ");
		System.out.println("      --------------");
		System.out.printf("Dairenin Alanı: %.2f cm^2",dairealan);
		System.out.printf("\nDairenin Çevresi: %.2f cm",dairecevre);
		System.out.printf("\nDairenin Çapı: %.2f cm",dairecap);
		System.out.printf("\nKürenin Hacmi: %.2f cm^3",kurehacim);
		System.out.printf("\nKürenin Yüzey Alanı: %.2f",kureyuzeyalan);
		System.out.println("\n      --------------");
		
		input.close();
	}

}



***ÇIKTI***
=====Geometrik Hesaplayıcı=====
Hesaplamaları yapılacak dairenin yarıçapını belirleyiniz
5
      ***SONUÇLAR***      
      --------------
Dairenin Alanı: 78,54 cm^2
Dairenin Çevresi: 31,42 cm
Dairenin Çapı: 10,00 cm
Kürenin Hacmi: 523,60 cm^3
Kürenin Yüzey Alanı: 314,16
      --------------
