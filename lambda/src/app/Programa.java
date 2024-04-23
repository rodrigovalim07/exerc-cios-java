package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		
		// expressão lambda é uma função anônima de primeira classe, ou seja, ela é uma função sem nome (nao foi declarada)
		// e pode ser passada como parâmetro de outra função

		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD Case", 80.90));
		System.out.println("Lista padrão:");
		lista.forEach(System.out::println);
		System.out.println();

		double valorMax = 100;

		System.out.println("Removido os itens com valor acima de 100:");
		lista.removeIf(p -> p.getPreco() >= valorMax);	// removeIf removendo os elementos cujo o preço é maior ou igual ao valor máximo
		lista.forEach(System.out::println);
		System.out.println();

		double aumento = 1.1;

		System.out.println("Aumento de 10%:");
		lista.forEach(p -> p.setPreco(p.getPreco() * aumento));	// forEach percorre toda a lista e aplica a função/método em cada elemento
		lista.forEach(System.out::println);	// maneira mais fácil de dar print em todos os elementos da lista usando o forEach
		System.out.println();
		
		System.out.println("Nomes com letras maiúsculas:");
		lista.forEach(p -> p.setNome(p.getNome().toUpperCase()));		
		lista.forEach(System.out::println);
		System.out.println();
		
		System.out.println("Nova lista só com os nomes em maiúsculo:");
		// criando uma nova lista recebendo os nomes em maiúsculo da lista "lista"
		List<String> nomes = lista.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());	
		// A função "map" é uma função que aplica uma função a todos elementos de uma stream (mesma coisa que forEach, porém aplica em stream ao invés de lista)
		nomes.forEach(System.out::println);
	}
}
