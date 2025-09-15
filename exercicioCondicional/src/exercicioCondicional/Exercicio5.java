package exercicioCondicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int codigo, qtd;
		float total = 0;
		
		System.out.println(" ------------------------------------------------------ ");
		System.out.println("                           Menu                         ");
		System.out.println(" ______________________________________________________ ");
		System.out.println("                                                        ");
		System.out.println("| Código do Produto |     Produto     | Preço Unitario |");
		System.out.println("|         1         | Cachorro Quente |   R$ 10,00     |");
		System.out.println("|         2         |   X - Salada    |   R$ 15,00     |");
		System.out.println("|         3         |   X - Bacon     |   R$ 18,00     |");
		System.out.println("|         4         |       Bauru     |   R$ 12,00     |");
		System.out.println("|         5         |   Refrigerante  |   R$  8,00     |");
		System.out.println("|         6         | Suco de Laranja |   R$ 13,00     |");
		System.out.println(" ______________________________________________________ ");
		System.out.println("                                                        ");		
		
			
		
			System.out.println("Digite o código: ");
			codigo = leia.nextInt();
			
			System.out.println("Digite a quantidade consumida: ");
			qtd = leia.nextInt();
					
		switch(codigo) {
		
			case 1:
				System.out.printf("Seu pedido foi de %d - Cachorro Quente%n",qtd);
				total = 10 * qtd;
				break;
		
			case 2:
				System.out.printf("Seu pedido foi de %d - X-Salada%n",qtd);
				total = 15 * qtd;
				break;
				
			case 3:
				System.out.printf("Seu pedido foi de %d - X-Bacon%n",qtd);
				total = 18 * qtd;
				break;
				
			case 4:
				System.out.printf("Seu pedido foi de %d - Bauru%n",qtd);
				total = 12 * qtd;
				break;
				
			case 5:
				System.out.printf("Seu pedido foi de %d - Refrigerante%n",qtd);
				total = 8 * qtd;
				break;
				
			case 6:
				System.out.printf("Seu pedido foi de %d - Suco de Laranja%n",qtd);
				total = 13 * qtd;
				break;
			
			default:
				System.out.println("Opção inválida");	
				
		
				}
		System.out.printf("Total do pedido é: %.2f ", total);
		leia.close();
	}
}
