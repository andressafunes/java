package exercicioCondicional;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float saldo = 1000.00f, valor;
		int opc;
		
		System.out.println(" ---------------- ");
		System.out.println("     Operações    ");
		System.out.println(" _________________");
		System.out.println("                  ");
		System.out.println("    1 - Saldo     ");
		System.out.println("    2 - Saque     ");
		System.out.println("    3 - Deposito  ");
		System.out.println(" _________________");
		System.out.println("                  ");
		
		System.out.println("Digite a operação desejada: ");
		opc = leia.nextInt();
		
		switch(opc) {
		
		case 1:
			System.out.printf("Seu saldo atual é de: %.2f\n", saldo);
			break;
	
		case 2:
			System.out.printf("Digite o valor que deseja sacar: ");
			valor = leia.nextFloat();
			if(saldo >= valor) {
				saldo -= valor;
				System.out.printf("Seu saldo atual é de: %.2f", saldo);
			}else {
				System.out.println("Saldo insuficiente");
			}
			break;
			
		case 3:
			System.out.printf("Digite o valor que deseja depositar: ");
			valor = leia.nextFloat();
			saldo += valor;
			System.out.printf("Seu saldo atual é de: %.2f", saldo);

			break;
		
		default:
			System.out.println("Opção inválida");	
			
	
			}
	
		
		leia.close();


	}

}
