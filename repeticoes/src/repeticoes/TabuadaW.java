package repeticoes;

import java.util.Scanner;

public class TabuadaW {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero, i = 0;

		System.out.println("Digite o número da tabuada: ");
		numero = leia.nextInt();

		while (i <= 10) {

			System.out.printf("%d x %d = %d%n", numero, i, numero * i);

			i++;
		}

		leia.close();

	}

}
