import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("digite um numero que sera fatorado: ");
		int n = sc.nextInt();
		int fat = 1;
		
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println("resultado: " + fat);
		
		sc.close();

	}
}
