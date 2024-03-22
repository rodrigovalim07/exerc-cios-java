package aplicativo;

import java.util.Scanner;

import entidade.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura do retangulo: ");
		retangulo.altura = teclado.nextDouble();
		System.out.println("Digite a largura do retangulo: ");
		retangulo.largura = teclado.nextDouble();
		
		System.out.println(retangulo);
	}

}
