package exercicioRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		int numero, contador = 0; 
		double media = 0, soma = 0;
			
		do {
			
			System.out.println("Digite um número:");
			numero = leia.nextInt();
			
			if (numero > 0 && numero % 3 == 0) {
				
				soma += numero;
				contador++;
			}
		 
		 
		} while (numero != 0);
		
		if(contador > 0) {
			
			media = soma / contador;
			
			System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", media);
		
		}else {
			
			System.out.printf("Nenhum múltiplo de 3 foi encontrado!");

		}

				
		leia.close();

	}


}
