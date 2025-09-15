package exercicioCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.printf("Digite o valor de A : ");
		a = leia.nextInt();
		
		System.out.printf("%nDigite o valor de B : ");
		b = leia.nextInt();
		
		System.out.printf("%nDigite o valor de C : ");
		c = leia.nextInt();
		
		soma = a + b;
		
		if (soma > c) {
			
			System.out.printf("%d + %d = %d > %d%n", a, b, soma, c);
			System.out.println("A soma de A + B é maior que C");
			
		}else if (soma < c) {
			
			System.out.printf("%d + %d = %d < %d%n", a, b, soma, c);
			System.out.println(" A soma de A + B é menor que C");
			
		}else if (soma == c) {
			
			System.out.printf("%d + %d = %d == %d%n", a, b, soma, c);
			System.out.println("A soma de A + B é igual a C");
			
		}
		
		leia.close();
		
	}

}
