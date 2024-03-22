package aplicativo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas alturas deseja calcular a média? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];	//criando o objeto do tipo vetor com o tamanho n
		
		for (int i = 0; i < n; i++) {	//percorrendo as posições do vetor, uma a uma
			System.out.print("Altura: ");
			vetor[i] = sc.nextDouble();	//alocando o valor digitado na posição do vetor
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		
		double avg = soma / n;
		
		System.out.printf("Altura média: %.2f%n", avg);
		sc.close();
	}
}