package app;

import java.util.Scanner;

import entidades.Quarto;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Quarto[] quarto = new Quarto[10];
		
		System.out.print("Quantos quartos irão ser alugados? ");
		int n = teclado.nextInt();
		teclado.nextLine();
		
		for (int i=0; i<n; i++) {
			System.out.printf("Aluguel %d:%n", i+1);
			System.out.print("Nome: ");
			String nome = teclado.nextLine();
			System.out.print("Email: ");
			String email = teclado.nextLine();
			System.out.print("Quarto: ");
			int numero = teclado.nextInt();
			quarto[numero] = new Quarto(numero, email, nome);
			teclado.nextLine();
		}
		
		System.out.println("Quartos alugados:");
		for (int i=0; i<quarto.length; i++) {
			if (quarto[i] != null) {
				System.out.println(quarto[i]);
			}
		}
		
		teclado.close();
	}

}
