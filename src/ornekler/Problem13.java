package ornekler;

import java.util.Scanner;

public class Problem13 {
	
	public static void main(String[] args) {
		// Döngü ile bir sayının belirli bir üs kuvvetini hesaplama
		Scanner scn = new Scanner(System.in);
		int taban, kuvvet, sonuc = 1;
		System.out.println("lütfen bir sayı giriniz:");
		taban = scn.nextInt();
		System.out.println("lütfen bir üs giriniz:");
		kuvvet = scn.nextInt();
		
		for (int i = 1; i <= kuvvet; i++) {
			sonuc *= taban;
		}
		System.out.println("Sonucunuz:" + sonuc);
	}
	
}
