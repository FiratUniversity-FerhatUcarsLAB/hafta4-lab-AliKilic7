***KOD***
  
package Hafta4;

import java.util.Scanner;

public class MaasHesap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Sabit Tanımlama
		final double sgkOran, gelirVergiOran, damgaVergiOran;
		sgkOran = 0.14;
		gelirVergiOran = 0.15;
		damgaVergiOran = 0.00759;
		
		//Kullanıcı verileri alınıyor
		System.out.println("Adınızı ve soyadınızı giriniz");
		String adSoyad = input.nextLine();
		
		System.out.println("Aylık brüt maaşınızı giriniz");
		double bMaas = input.nextDouble();
		
		System.out.println("Haftalık çalışma saatinizi giriniz");
		int hftlkCalısmaSaat = input.nextInt();
		
		System.out.println("Fazla mesai saatinizi giriniz");
		int mesai = input.nextInt();
		
		//Gelirler
		double mesaiUcret, toplamGelir;
		mesaiUcret = (bMaas/160)*mesai*1.5;
		toplamGelir = bMaas + mesaiUcret;
		
		//Kesintiler
		double sgk, gelirVergi, damgaVergi, toplamKesinti;
		sgk = toplamGelir*sgkOran;
		gelirVergi = toplamGelir*gelirVergiOran;
		damgaVergi = toplamGelir*damgaVergiOran;
		toplamKesinti = sgk+gelirVergi+damgaVergi;
		
		//Net Maaş
		double netMaas = toplamGelir-toplamKesinti;
		
		//İstatistikler
		double kesintiOran, saatlikNetKazanc, gunlukNetKazanc;
		kesintiOran = (toplamKesinti/toplamGelir)*100;
		saatlikNetKazanc = netMaas/(hftlkCalısmaSaat/5)*22;
		gunlukNetKazanc = netMaas/22;
		
		//Maaş Bordrosu
		System.out.println("=========================================");
		System.out.println("              MAAŞ BORDROSU              ");
		System.out.println("=========================================");
		System.out.printf("Çalışan: %s\n\n",adSoyad);
		System.out.println("GELİRLER:");
		System.out.printf("Brüt Maaş             : %.2f",bMaas);
		System.out.printf("\nMesai Ücreti (%d saat): %.2f",mesai,mesaiUcret);
		System.out.println("\n_________________________________________\n");
		System.out.printf("TOPLAM GELİR          : %.2f\n",toplamGelir);
		System.out.println("\n==========================================\n");
		
		System.out.println("KESİNTİLER:");
		System.out.printf("SGK Kesintisi         : %.2f",sgk);
		System.out.printf("\nGelir Vergisi         : %.2f",gelirVergi);
		System.out.printf("\nDamga Vergisi         : %.2f",damgaVergi);
		System.out.println("\n_________________________________________\n");
		System.out.printf("TOPLAM KESİNTİ        : %.2f\n",toplamKesinti);
		System.out.println("\n==========================================\n");
		
		System.out.println("İSTATİSTİKLER:");
		System.out.printf("Kesinti Oranı         : %.2f",kesintiOran);
		System.out.printf("\nSaatlik Net Kazanç    : %.2f",saatlikNetKazanc);
		System.out.printf("\nGünlük Net Kazanç     : %.2f\n",gunlukNetKazanc);
		System.out.println("\n==========================================\n");
	
		System.out.printf("Net Maaş              : %.2f\n",netMaas);
		System.out.println("\n==========================================");
		
		
		input.close();
		
	}
	
}


***ÇIKTI***

Adınızı ve soyadınızı giriniz
Selahattin Ali KILIÇ
Aylık brüt maaşınızı giriniz
150000
Haftalık çalışma saatinizi giriniz
40
Fazla mesai saatinizi giriniz
10
=========================================
              MAAŞ BORDROSU              
=========================================
Çalışan: Selahattin Ali KILIÇ

GELİRLER:
Brüt Maaş             : 150000,00
Mesai Ücreti (10 saat): 14062,50
_________________________________________

TOPLAM GELİR          : 164062,50

==========================================

KESİNTİLER:
SGK Kesintisi         : 22968,75
Gelir Vergisi         : 24609,38
Damga Vergisi         : 1245,23
_________________________________________

TOPLAM KESİNTİ        : 48823,36

==========================================

İSTATİSTİKLER:
Kesinti Oranı         : 29,76
Saatlik Net Kazanç    : 316907,64
Günlük Net Kazanç     : 5238,14

==========================================

Net Maaş              : 115239,14

==========================================

