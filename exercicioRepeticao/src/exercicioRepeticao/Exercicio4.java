package exercicioRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade, genero, funcao, totalRespostas = 0;
		int backend = 0, metfrontend = 0, hetmobiM40 = 0, nbfullm30 = 0;
		long somaIdades = 0;
		double mediaIdade = 0;
		String continua ="S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			
			System.out.println("Digite seu Gênero: ");
			genero = leia.nextInt();
			
			
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			
			System.out.println("Digite sua Função: ");
			funcao = leia.nextInt();
			
			//Total de pessoas que gostam de futebol
			if(funcao == 1) {
				backend++;
			}
			
			//Total de pessoal que gostam de Volei e tem + de 18 anos
			
			if (genero == 2 || genero == 4 && funcao == 2 ) {
				metfrontend++;
			}
			
			// Total de pessoas que gostam de Basquete e tem - de 18 anos
			
			if (genero == 2 || genero == 5 && idade < 40) {
				hetmobiM40++;
			}
			
			if (genero == 3 && funcao == 4 && idade > 30) {
				nbfullm30++;
			}
			
			
			somaIdades += idade;
			
			totalRespostas ++;
			
			System.out.println("Deseja continuar (S/N)?");
			leia.skip("\\R"); //Ignora o pulo de linha para guardar a informação digitada usada somente em String
			continua = leia.nextLine().toUpperCase(); // toUpperCase serve para ignorar leitra maiuscula ou minuscula
	
		}
		
		mediaIdade = Math.round(somaIdades / totalRespostas);
		
		System.out.printf("Total de pessoas desenvolvedoras Backend: %d%n", backend);
		System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d%n", metfrontend);
		System.out.printf("Total de Homens Cis e Trans desenvolvedoras Mobile maiores de 40 anos: %d%n", hetmobiM40);
		System.out.printf("Total de Não Binariops desenvolvedores FullStack menores de 30 anos: %d%n", nbfullm30);
		System.out.printf("Total de pessoas que respoderam à pesquisa: %d%n", totalRespostas);
		System.out.printf("Média das idade: %.2f%n", mediaIdade);
		
		leia.close();


	}

}
