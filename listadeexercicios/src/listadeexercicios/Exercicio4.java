package listadeexercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.printf("Digite o primeiro valor: %n");
		n1 = leia.nextFloat();
		
		System.out.printf("Digite o segundo valor: %n");
		n2 = leia.nextFloat();
		
		System.out.printf("Digite o terceiro valor: %n");
		n3 = leia.nextFloat();
		
		System.out.printf("Digite o quarto valor: %n");
		n4 = leia.nextFloat();
		
		System.out.printf("A diferencia entre o produto de %.1f * %.1f e %.1f * %.1f é: %.1f",n1 ,n2, n3, n4, (n1 * n2) - (n3 * n4));
		
		leia.close();
		

	}

}
