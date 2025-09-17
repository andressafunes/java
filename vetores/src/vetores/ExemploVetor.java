package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		String nomes[] = {"Cintia", "Stella", "Patricia", "Rafaela", "Leticia", "Jamila"};
		
		int numeros[] = new int[5];
		
		System.out.println("Listagem - Vetor de Nomes");
		
		// Ordenar vetor
	
		Arrays.sort(nomes);// ordem crescemte
		
		for (int i =0; i < nomes.length; i++) {
			
			System.out.printf("Nomes [%d] - %s%n", i, nomes[i]);
		}
		
		System.out.println("Entrada de dados - Vetor de Números");
		
		for (int i =0; i < numeros.length; i++) {
			
			System.out.printf("Digite um numero: ");
			numeros[i] = leia.nextInt();
		}
		
		System.out.println("Listagem - Vetor de Números");
		
		for (int i =0; i < numeros.length; i++) {
			
			System.out.printf("Numeros [%d] - %d%n", i, numeros[i]);
		}
		
		
		leia.close();
		

	}

}
