package exerciciosCollectionsEstrutura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3Set {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		int numero;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.printf("Digite um número: ");
			numero = leia.nextInt();
			numeros.add(numero);
		}
		
		Iterator<Integer> lisNumeros = numeros.iterator();
		
		while(lisNumeros.hasNext()) {
			
			System.out.println(lisNumeros.next());
		}
			
		leia.close();

	}

}
