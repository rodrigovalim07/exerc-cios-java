package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entidades.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		List<Funcionarios> funcionarios = new ArrayList<>();
		
		System.out.print("Informe o caminho do arquivo: ");
		String caminho = teclado.nextLine();
		System.out.print("Informe o salário: ");
		Double minSalario = teclado.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] partes = linha.split(",");
				String nome = partes[0];
				String email = partes[1];
				Double salario = Double.parseDouble(partes[2]);
				funcionarios.add(new Funcionarios(nome, email, salario));
				linha = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.print("Erro: " + e.getMessage());
		}
		
		List<String> emails = funcionarios.stream()
				.filter(p -> p.getSalario() > minSalario)
				.map(p -> p.getEmail())
				.sorted((x , y) -> x.toUpperCase().compareTo(y.toUpperCase()))
				.collect(Collectors.toList());
		
		Double soma = funcionarios.stream()
				.filter(p -> p.getNome().charAt(0) == 'M')
				.map(p -> p.getSalario())
				.reduce((double) 0, (x, y) -> x + y);
		
		System.out.printf("Email de funcionários cujo o salário é superior a %.2f:\n", minSalario);
		emails.forEach(System.out::println);
		
		System.out.println("Soma dos salários dos funcionários cujo o nome começa com 'M': " + String.format("%.2f", soma));

		teclado.close();
	}
}
