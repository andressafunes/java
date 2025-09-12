package listadeexercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.printf("Digite a nota do primeiro bimestre: %n");
		n1 = leia.nextFloat();
		
		System.out.printf("Digite a nota do segundo bimestre: %n");
		n2 = leia.nextFloat();
		
		System.out.printf("Digite a nota do terceiro bimestre: %n");
		n3 = leia.nextFloat();
		
		System.out.printf("Digite a nota do quarto bimestre: %n");
		n4 = leia.nextFloat();
		
		System.out.printf("Sua média final é: %.1f", (n1 + n2 + n3 + n4)/4);
		

	}

}
