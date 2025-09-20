package listadeexercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioB, adicionalN, horasE, des;
		
		System.out.printf("Digite o valor do salario: %n");
		salarioB = leia.nextFloat();
		
		System.out.printf("Digite o valor do adicional noturno: %n");
		adicionalN = leia.nextFloat();
		
		System.out.printf("Digite o valor das horas extras: %n");
		horasE = leia.nextFloat();
		
		System.out.printf("Digite o valor que será descontado: %n");
		des = leia.nextFloat();
		
		System.out.printf("O valor do salário liquido é de: %.2f", (salarioB + adicionalN + (horasE * 5)) - des);
		
		leia.close();
		

	}

}
