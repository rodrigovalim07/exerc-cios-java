package aplicativo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double soma = 0;
		
		System.out.print("Quantos números reais para ver média e soma: ");
		int n = teclado.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < n; i ++) {
			System.out.print("Digite o número: ");
			vetor[i] = teclado.nextInt();
			soma += vetor[i];
		}
		
		System.out.print("Valores: ");
		for (int i = 0; i < n; i++) {
		    System.out.print(vetor[i] + ", ");
		}
		System.out.println();
		
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("Média: %.2f", soma / n);
	}

}
