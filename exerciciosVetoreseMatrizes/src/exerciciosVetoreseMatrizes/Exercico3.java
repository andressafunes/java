package exerciciosVetoreseMatrizes;

import java.util.Scanner;

public class Exercico3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matriz [][] = new int [3][3];
		String diagonalPrincipal = "", diagonalSecundaria = "";
		int somaPrincipal = 0, somaSecundaria = 0;
		
		System.out.println("Prencha a Matriz");
		
		for(int l = 0; l < matriz.length; l++) {
			
			for(int c = 0; c <matriz[l].length; c++) {
				
				System.out.printf("Matriz [%d][%d] = ", l, c);
				matriz[l][c] = leia.nextInt();				
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			
			diagonalPrincipal += matriz[i][i] + " ";
			
			somaPrincipal += matriz[i][i];
		}
		
				
		for(int i = 0; i < matriz.length; i++) {
			
			diagonalSecundaria += matriz[i][matriz.length - 1 - i] + " ";
			
			somaSecundaria += matriz[i][matriz.length - 1 - i];
		} 
		
		System.out.println("Diagonal Principal: " + diagonalPrincipal);
		
		System.out.println("Diagonal Secundária: " + diagonalSecundaria);
		
		System.out.println("Soma dos elementos da Diagonal Principal: " + somaPrincipal);
		
		System.out.println("Soma dos elementos da Diagonal Secundária: " + somaSecundaria);
		
		leia.close();

	}

}
