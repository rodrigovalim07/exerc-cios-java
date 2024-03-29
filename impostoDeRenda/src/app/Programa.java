package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.Empresa;
import entidades.PessoaFisica;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<Contribuinte> lista = new ArrayList<>();

		System.out.print("Quantos contribuíntes? ");
		int n = teclado.nextInt();
		
		for (int i=1; i<=n; i ++) {
			System.out.println("Dados do contribuinte Nº" + i);
			System.out.print("Pessoa física ou Empresa (f/e): ");
			char x = teclado.next().charAt(0);
			teclado.nextLine();
			System.out.print("Nome: ");
			String nome = teclado.nextLine();
			System.out.print("Rendimento anual: ");
			double rendimentoAnual = teclado.nextDouble();
			
			if (x == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastoSaude = teclado.nextDouble();
				lista.add(new PessoaFisica(nome, rendimentoAnual, gastoSaude));
			}
			else {
				System.out.print("Número de funcionários: ");
				int nFuncionarios = teclado.nextInt();
				lista.add(new Empresa(nome, rendimentoAnual, nFuncionarios));
			}
		}
		System.out.println();
		
		System.out.println("IMPOSTOS PAGOS:");
		double soma = 0.0;
		for (Contribuinte contribuinte : lista) {
			System.out.println(contribuinte.getNome() + ": $" + String.format("%.2f", contribuinte.impostoDeRenda()));
			soma += contribuinte.impostoDeRenda();
		}
		System.out.println();
		
		System.out.println("TOTAL DE TAXAS:");
		System.out.printf("%.2f", soma);
		
		teclado.close();
	}

}
