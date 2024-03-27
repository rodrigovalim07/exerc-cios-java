package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> lista = new ArrayList<>();

		System.out.print("Quantos produtos deseja cadastrar? ");
		int n = teclado.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do " + i + "º produto:");
			System.out.print("Produto Comum, Usado ou Importado (c/u/i): ");
			char p = teclado.next().charAt(0);
			teclado.nextLine();
			System.out.print("Nome: ");
			String nome = teclado.nextLine();
			System.out.print("Preço: ");
			double preco = teclado.nextDouble();
			if (p == 'c') {
				lista.add(new Produto(nome, preco));
			}
			else if (p == 'i') {
				System.out.print("Taxa alfandegária: ");
				double taxaAlfandega = teclado.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			}
			else {
				System.out.print("Data de fabricação: ");
				Date fabricacao = sdf.parse(teclado.next());
				lista.add(new ProdutoUsado(nome, preco, fabricacao));
			}
		}
		
		System.out.println();
		for (Produto item : lista) {
			System.out.println(item.etiquetaPreco());
		}
		
		teclado.close();
	}

}
