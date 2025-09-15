package exercicioCondicional;

import java.util.Scanner;

public class Exercico7 {

	public static void main(String[] args) {
				
				Scanner leia = new Scanner(System.in);
				
				float numero1, numero2;
				int opc;
					
				System.out.println("Digite o primeiro numero: ");
				numero1 = leia.nextFloat();
				
				System.out.println("Digite o segundo numero: ");
				numero2 = leia.nextFloat();
				
				System.out.println(" ------------------- ");
				System.out.println("     Calculadora     ");
				System.out.println(" ___________________ ");
				System.out.println("                                                        ");
				System.out.println("    1 - Soma         ");
				System.out.println("   2 - Subtração     ");
				System.out.println("  3 - Multiplicação  ");
				System.out.println("    4 - Divisão      ");
				System.out.println(" ___________________ ");
				
				System.out.println("Digite o número da operação: ");
				opc = leia.nextInt();
										
				
				switch(opc) {
				
				case 1:
					System.out.printf("\n%.2f + %.2f = %.2f\n", numero1, numero2, numero1 + numero2);
					break;
			
				case 2:
					System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, numero1 - numero2);
					break;
					
				case 3:
					System.out.printf("%.2f x %.2f = %.2f\n", numero1, numero2, numero1 * numero2);
					break;
					
				case 4:
					System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, numero1 / numero2);
					break;
				
				default:
					System.out.println("Opção inválida");	
					
			
					}
			
				
				leia.close();

	}

}
