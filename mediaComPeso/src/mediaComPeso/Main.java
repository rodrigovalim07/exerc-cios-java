package mediaComPeso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		float nota1, nota2, nota3, media = 0;
		
		System.out.print("digite quantos casos quer ver a nota média: ");
		n = teclado.nextInt();
		
		for (int i =0; i < n; i ++) {
			System.out.print("digite a primeira nota com peso 2: ");
			nota1 = teclado.nextFloat();
			System.out.print("digite a segunda nota com peso 3: ");
			nota2 = teclado.nextFloat();
			System.out.print("digite a primeira nota com peso 5: ");
			nota3 = teclado.nextFloat();
			
			media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
			
			System.out.printf("a média das notas é: %.2f %n", media);
		}

		
	}

}
