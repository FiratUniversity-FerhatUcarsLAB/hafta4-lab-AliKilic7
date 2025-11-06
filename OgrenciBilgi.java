***KOD***

package Hafta4;

import java.util.Scanner;

public class OgrenciBilgi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Kullanıcıdan veri alınıyor
		System.out.println("Lütfen adınızı giriniz.");
		String ad = input.nextLine();
		
		System.out.println("Lütfen soyadınızı giriniz.");
		String soyad = input.next();
		
		System.out.println("Lütfen öğrenci numarınızı giriniz.");
		int ogrenciNo = input.nextInt();
		
		System.out.println("Lütfen yaşınızı giriniz.");
		int yas = input.nextInt();
		
		System.out.println("Lütfen GPA giriniz(0.00-4.00).");
		double gpa = input.nextDouble();
		
		//Alınan veriler yazdırılıyor
		System.out.println("=========ÖĞRENCİ BİLGİLERİ=========");
		System.out.println("-----------------------------------");
		System.out.printf("Ad Soyad   : %s %s",ad,soyad);
		System.out.printf("\nÖğrenci NO.: %d",ogrenciNo);
		System.out.printf("\nYaş        : %d",yas);
		System.out.printf("\nGPA        : %f",gpa);
		System.out.println("\n-----------------------------------");

		input.close();
	}

}



***ÇIKTI***

Lütfen adınızı giriniz.
Selahattin Ali
Lütfen soyadınızı giriniz.
KILIÇ
Lütfen öğrenci numarınızı giriniz.
250541036
Lütfen yaşınızı giriniz.
17
Lütfen GPA giriniz(0.00-4.00).
3,36
=========ÖĞRENCİ BİLGİLERİ=========
-----------------------------------
Ad Soyad   : Selahattin Ali KILIÇ
Öğrenci NO.: 250541036
Yaş        : 17
GPA        : 3,360000
-----------------------------------    
