package condicional;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		
		System.out.println("Digite a 1ª nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a 2ª nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a 3ª nota: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite a 4ª nota: ");
		n4 = leia.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		if(media >= 7) {
			
			System.out.printf("Você foi aprovado com a média: %.2f", media);
		}
		
		else if(media >= 5 && media < 7) {
			
			System.out.printf("Você esta de recuperação! Sua média é: %.2f", media);			
		}
		
		else {
			
			System.out.printf("Você foi reprovado com a média : %.2f", media);
		}
		
		
		
		
		leia.close();
	}

}
