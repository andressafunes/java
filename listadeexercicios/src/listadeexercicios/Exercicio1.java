package listadeexercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		
		System.out.printf("Digite o salário atual: %n");
		salario = leia.nextFloat();
		
		System.out.printf("Digite o valor do abono: %n");
		abono = leia.nextFloat();
		
		System.out.printf("Seu novo salario é: %.2f", salario + abono);
		
		leia.close();
		

	}

}
