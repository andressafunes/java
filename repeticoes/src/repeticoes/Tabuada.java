package repeticoes;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o número da tabuada: ");
		numero = leia.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.printf("%d x %d = %d%n", numero, i, numero * i);
		}
		
		leia.close();

	}

}
