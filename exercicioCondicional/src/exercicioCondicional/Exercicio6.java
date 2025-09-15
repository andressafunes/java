package exercicioCondicional;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int codigo;
		float salario, porcentagem;
		
		System.out.println("Digite seu nome completo: ");
		nome = leia.nextLine();
				
		System.out.printf("Digite seu salário :");
		salario = leia.nextFloat();
		
		System.out.println(" ____________________________________________________________ ");
		System.out.println("                                                              ");
		System.out.println("| Código do Cargo |      Cargo      | Percentual do Reajuste |");
		System.out.println("|         1       |     Gerente     |            10%         |");
		System.out.println("|         2       |     Vendedor    |             7%         |");
		System.out.println("|         3       |    Supervisor   |             9%         |");
		System.out.println("|         4       |     Motorista   |             6%         |");
		System.out.println("|         5       |    Estoqista    |             5%         |");
		System.out.println("|         6       |  Técnico de TI  |             8%         |");
		System.out.println(" ____________________________________________________________ ");
		System.out.println("                                                              ");
		
		System.out.println("Digite o codigo do seu cargo:");
		codigo = leia.nextInt();
		
		switch(codigo) {
		
		case 1:
			System.out.printf("Nome do colaborador: "+ nome + "%n");
			System.out.println("Cargo: Gerente");
			porcentagem = 10;
			salario = salario*(1 + porcentagem/100);
			System.out.printf("Salário: %.2f", salario);
			break;
	
		case 2:
			System.out.printf("Nome do colaborador: "+ nome + "%n");
			System.out.println("Cargo: Vendedor");
			porcentagem = 7;
			salario = salario*(1 + porcentagem/100);
			System.out.printf("Salário: %.2f", salario);
			break;
			
		case 3:
			System.out.printf("Nome do colaborador: "+  nome + "%n");
			System.out.println("Cargo: Supervisor");
			porcentagem = 9;
			salario = salario*(1 + porcentagem/100);
			System.out.printf("Salário: %.2f", salario);
			break;
			
		case 4:
			System.out.printf("Nome do colaborador: "+ nome + "%n");
			System.out.println("Cargo: Motorista");
			porcentagem = 6;
			salario = salario*(1 + porcentagem/100);
			System.out.printf("Salário: %.2f", salario);
			break;
			
		case 5:
			System.out.printf("Nome do colaborador: " + nome + "%n");
			System.out.println("Cargo: Estoquista");
			porcentagem = 5;
			salario = salario*(1 + porcentagem/100);
			System.out.printf("Salário: %.2f", salario);
			break;
			
		case 6:
			System.out.printf("Nome do colaborador: "+ nome + "%n");
			System.out.println("Cargo: Técnico de TI");
			porcentagem = 8;
			salario = salario*(1 + porcentagem/100);
			System.out.printf("Salário: %.2f", salario);
			break;
		
		default:
			System.out.println("Opção inválida");	
			
	
			}
	
		
		leia.close();
	}

}
