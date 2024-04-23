package app;

import java.util.Scanner;

import servicos.PrintService;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();	// printservice sendo do tipo generics, ele pode ser declarado com qualquer tipo de variavel
		
		System.out.print("Deseja entrar com quantos valores? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("Primeiro: " + x);
		
		sc.close();
	}
}