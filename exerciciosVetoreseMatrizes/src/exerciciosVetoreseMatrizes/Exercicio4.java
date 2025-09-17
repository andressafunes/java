package exerciciosVetoreseMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double notas [][] = new double[2][4];
		double media [] = new double[2];
		double soma = 0;
		
		for (int l = 0; l < notas.length; l++) {
			
            System.out.println("Digite as 4 notas do aluno " + (l + 1) + ":");
            
            for (int c = 0; c < notas[l].length; c++) {
            	
                System.out.print("Nota " + (c + 1) + ": ");
                notas[l][c] = leia.nextDouble();
                
                soma += notas[l][c];
            }
            
            media[l] = soma / 4;
            soma = 0.0f;
        }

        for (int i = 0; i < media.length; i++) {
            System.out.printf("Aluno " + (i + 1) + ": %.1f%n", media[i]);
        }

        leia.close();

	}

}
