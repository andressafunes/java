package helloworld;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		int peso = leia.nextInt();
		
		System.out.println("Digite uma opção: ");
		char opcao = leia.next().charAt(0);
		
		System.out.println("Digite um valor: ");
		float valor = leia.nextFloat();
		
		System.out.println("Digite seu nome: ");
		String nome = leia.next();
		
		System.out.println("O valor do peso é: "+peso);
		System.out.println("A opção é: "+opcao);
		System.out.printf("O valor de float é: %.2f\n",valor);
		System.out.printf("Meu nome é: %s", nome);
		
		leia.close();

	}

}
