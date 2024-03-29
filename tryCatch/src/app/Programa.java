package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		metodo1();
		System.out.println("Fim do programa");
			
	}
	
	public static void metodo1() {
		System.out.println("***METODO1 INÍCIO***");
		metodo2();
		System.out.println("***METODO1 FIM***");
	}
		
	public static void metodo2() {
		System.out.println("***METODO2 INÍCIO***");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Digite nomes separados por espaço: ");
			String[] vect = sc.nextLine().split(" ");
			System.out.print("Qual posição deseja ver o conteúdo: ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();	// mostra o tipo da exceção e a pilha de chamada dos métodos (stack trace)
		}
		catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
		}
		sc.close();
		System.out.println("***METODO2 FIM***");
	}
}
