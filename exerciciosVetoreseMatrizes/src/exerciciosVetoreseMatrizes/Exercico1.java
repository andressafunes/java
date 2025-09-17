package exerciciosVetoreseMatrizes;

import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		boolean achou = false;
		
		System.out.println("Digite o numero que deseja buscar:");
		numero = leia.nextInt();
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] == numero) {
				
				System.out.printf("O número %d se encontra na posição: %d", numero, i);
				achou = true;						
			}
		}
		
		if(!achou) {
			
			System.out.printf("O número %d não foi encontrado!", numero);
			
		}
		
		leia.close();

	}

}
