package aplicativo;

import java.util.Scanner;

public class Porgrama {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = 1;
		float menores = 0;
		double somalt = 0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = teclado.nextInt();
		teclado.nextLine();
		String nome[] = new String[n];
		int idade[] = new int[n];
		double altura[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %dª pessoa%n", x);
			System.out.print("Digite o nome: ");
			nome[i] = teclado.nextLine();
			System.out.print("Digite a idade: ");
			idade[i] = teclado.nextInt();
			if (idade[i] < 16) {
				menores += 1;
			}
			System.out.print("Digite a altura: ");
			altura[i] = teclado.nextDouble();
			x += 1;
			somalt += altura[i];
			teclado.nextLine();
		}
		System.out.println();
		
		System.out.printf("Altura média: %.2f%n", somalt / n);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (menores / n) * 100);
		for (int i = 0; i < n; i++) {
		    if (idade[i] < 16) {
		    	System.out.println(nome[i]);
		    }
		}

		teclado.close();
	}

}
