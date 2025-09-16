package exercicioRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int par = 0 , impar = 0, numero;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.printf("Dgite o %d° número: ", i);
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				
				par++;
				
			}else {
				impar++;
			}
		}
		
		System.out.printf("Total de números pares: %d%n",par);
		System.out.printf("Total de números impares: %d",impar);
		
		leia.close();

	}

}
