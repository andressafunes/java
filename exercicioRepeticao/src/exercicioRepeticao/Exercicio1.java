package exercicioRepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Dgite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		
		System.out.println("Dgite o segundo número do intervalo: ");
		n2 = leia.nextInt();
		
		System.out.println(" ");
		
		if (n1 < n2) {
			
			System.out.printf("No intervalo entre %d e %d:%n", n1,n2);
			System.out.println(" ");
			for(int i = n1; i <= n2; i++) {
				
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.printf("%d é multiplo de 3 e 5%n", i);
				}
			}
						
		}else {
			System.out.println("Intervalo Inválido");
		}

		
		
		leia.close();

	}

}
