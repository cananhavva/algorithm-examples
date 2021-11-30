package ornekler;

import java.util.Scanner;

public class Problem8 {
	
	public static void main(String[] args) {
		try (// girilen iki sayıyı karşılaştırma
				Scanner scn = new Scanner(System.in)) {
			System.out.println("Lütfen birinci sayıyı giriniz:");
			int sayi1 = scn.nextInt();
			System.out.println("lütfen ikinci sayıyı giriniz:");
			int sayi2 = scn.nextInt();
			if (sayi1 > sayi2) {
				System.out.println("BİRİNCİ SAYI İKİNCİ SAYIDAN BÜYÜKTÜR.");
			} else if (sayi1 < sayi2) {
				System.out.println("ikinci sayı birinci sayıdan büyüktür.");
			} else {
				System.out.println("iki sayı birbirine eşittir.");
			}
		}
	}
	
}
