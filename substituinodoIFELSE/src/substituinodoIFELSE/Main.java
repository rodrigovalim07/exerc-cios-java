package substituinodoIFELSE;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
		desconto = preco * 0.1;			//ao invés disso
		}
		else {
		desconto = preco * 0.05;
		}*/
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
	}

}
