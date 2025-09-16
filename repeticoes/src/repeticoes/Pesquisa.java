package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, esporte, totalRespostas = 0, futebol = 0, voleiM18 = 0, basquetem18 = 0 ;
		long somaIdades = 0;
		double mediaIdade = 0;
		String continua ="S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Pesquisa - Esporte Favorito");
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("1 - Futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquetebol");
			
			System.out.println("Digite seu esporte favorito: ");
			esporte = leia.nextInt();
			
			//Total de pessoas que gostam de futebol
			if(esporte == 1) {
				futebol++;
			}
			
			//Total de pessoal que gostam de Volei e tem + de 18 anos
			
			if (esporte == 2 && idade>= 18) {
				voleiM18++;
			}
			
			// Total de pessoas que gostam de Basquete e tem - de 18 anos
			
			if (esporte == 3 && idade < 18) {
				basquetem18++;
			}
			
			somaIdades += idade;
			
			totalRespostas ++;
			
			System.out.println("Deseja continuar (S/N)?");
			leia.skip("\\R"); //Ignora o pulo de linha para guardar a informação digitada usada somente em String
			continua = leia.nextLine().toUpperCase(); // toUpperCase serve para ignorar leitra maiuscula ou minuscula
	
		}
		
		mediaIdade = Math.round(somaIdades / totalRespostas);
		
		System.out.printf("Total de pessoas que gostam de Futebol: %d%n", futebol);
		System.out.printf("Total de pessoas que gostam de Voleibol maiores de 18 anos: %d%n", voleiM18);
		System.out.printf("Total de pessoas que gostam de Basquetebol menores de 18 anos: %d%n", basquetem18);
		System.out.printf("Média das idade: %.2f%n", mediaIdade);
		
		leia.close();
		
		// atalho para edentar ctrl + shift + f

	}

}
