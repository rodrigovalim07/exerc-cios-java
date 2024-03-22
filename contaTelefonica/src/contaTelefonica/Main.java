package contaTelefonica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int minutos = teclado.nextInt();
		int acrescimo = 2;
		
		if (minutos > 50) {
			minutos = 50 + acrescimo * (minutos - 50);
			System.out.println("total a pagar: " + minutos);
			acrescimo = minutos - 50;
			System.out.println("o acrescimo foi de : " + acrescimo);
		}
		else {
			System.out.println("total a pagar: " + minutos);
		}

	}

}
