package exercicioCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.printf("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		if((numero % 2 == 0) && (numero > 0)) {
			System.out.printf("O número %d é par e positivo", numero);
		} else if ((numero % 2 == 0) && (numero < 0)){
			System.out.printf("O número %d é par e negativo", numero);
		}else if ((numero % 2 == 0) && (numero > 0)) {
			System.out.printf("O número %d é impar e positivo", numero);
		}else {
			System.out.printf("O número %d é impar e negativo", numero);
		}
		
		leia.close();

	}

}
