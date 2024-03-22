package dentroDoIntervalo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, n,dentro = 0,fora = 0;
		System.out.print("digite quantos numeros quer ver se estão no intervalo entre 10 a 20: ");
		x = teclado.nextInt();
		
		for (int i=0; i < x; i++) {
			System.out.print("digite o numero: ");
			n = teclado.nextInt();
			if (n>10 && n<20) {
				dentro += 1;
			} else {
				fora += 1;
			}
		}
		
		System.out.println(dentro + " in \n" + fora + " out");

	}

}
