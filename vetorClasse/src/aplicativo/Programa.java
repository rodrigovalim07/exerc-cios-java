package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos produtos deseja cadastrar: ");
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String name = sc.nextLine();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			vect[i] = new Produto(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPreco();
		}
		double avg = sum / vect.length;
		
		System.out.printf("Preço médio = %.2f%n", avg);
		
		sc.close();
	}
}