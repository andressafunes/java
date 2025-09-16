package exercicioRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, menor21 = 0, maior50 = 0;
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
			
		while(idade >= 0) {
					
			if (idade < 21) {
				
				menor21++;
				
			}else if (idade > 50) {
				
				maior50++;
				
			}
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
		}
		
		System.out.printf("Total de pessoas menores de 21 anos: %d%n",menor21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d%n",maior50);
		
		leia.close();

	}

}
