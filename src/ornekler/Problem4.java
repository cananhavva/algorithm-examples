package ornekler;

import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("kilometre cinsinden uzunluğu giriniz:");
			double x = scn.nextDouble();
			double Mil = (0.621) * x;
			System.out.println("Mil:" + Mil);
		}
		
	}
	
}
