package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(5);
		
		System.out.println(numeros);
		
		System.out.println("Exibir elemento na posição 2: " + numeros.get(2));
		
		System.out.println("Exibir o indice do elemento 10: "+ numeros.indexOf(10));
		
		numeros.set(numeros.indexOf(10), 4);
		
		System.out.println(numeros);
		
		numeros.remove(numeros.indexOf(5));
		
		System.out.println(numeros);
		
		for(int numero : numeros) {
			
			System.out.println(numero);
			
		}
		
		System.out.println("Tamanho da lista: " + numeros.size()); // Verifica o tamanho da lista
		System.out.println("A lista está vazia? "+ numeros.isEmpty()); // Verifica se esta vazia
		System.out.println("O numero 8 esta na lista? "+ numeros.contains(8));
		
		

	}

}
