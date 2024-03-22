import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		float numero, soma = 0;
		System.out.printf("digite quantas vezes deseja fazer uma soma: ");
		int n = teclado.nextInt();
		//a primeira parte "i=0" só executa quando o programa passa por ele pela primeira vez, depois ele só executa a condição (i<n) e o incremento (i++)
		for (int i=0; i<n; i++) {
			System.out.printf("digite os numeros que serão somados %d: ", n);
			numero = teclado.nextFloat();
			soma += numero;
		}
		
		System.out.println("o resultado da soma é: " + soma);
		
		teclado.close();
	}

}
