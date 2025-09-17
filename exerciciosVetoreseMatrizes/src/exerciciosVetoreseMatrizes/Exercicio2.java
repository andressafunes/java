package exerciciosVetoreseMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor [] = new int [10];
		double soma = 0, media;
		
		System.out.println("Preencha a lista do Vetor");
		
		for(int i = 0; i< vetor.length; i++) {
			System.out.printf("Número: ",i);
			vetor[i] = leia.nextInt();
			
			soma += vetor[i];
		}
		
		System.out.print("Elementos ímpares:");
		
		
			for (int i = 0; i < vetor.length; i++) {
				
				if (vetor[i] % 2 != 0) {
				System.out.printf(" %d", vetor[i]);
				
				}
			}
	
			System.out.printf("%nElementos Pares:");
						
			for (int i = 0; i < vetor.length; i++) {
				
				if (vetor[i] % 2 == 0) {
				System.out.printf(" %d", vetor[i]);
			
			}
		}
			
		System.out.printf("%nSoma: %.0f%n", soma);
		
		media = soma / vetor.length;
		
		System.out.printf("Média: %.2f", media);
		
		leia.close();

		}
	}

