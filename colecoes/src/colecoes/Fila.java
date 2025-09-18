package colecoes;

import java.util.LinkedList;
import java.util.Queue;

//atalho ctrl + shift + o importa automaticamente as bibliotecas

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		
		// Adiciona dados
		fila.add("Maria");
		fila.add("Aline");
		fila.add("Letícia");
		fila.add("Cintia");
		fila.add("Rayssa");
		
		System.out.println(fila);
		
		// Retira um elemento da fila
		fila.remove();
		
		System.out.println(fila);
		
		// Adicionando para mostrar a logica de fila
		fila.add("Milena");
		fila.add("Nadia");
		
		System.out.println(fila);
		
		//Exibe tamanho da fila		
		System.out.println("Tamanho: " + fila.size());
		
		//Percorrer toda a lista
		for(var pessoa : fila) { //var vai reconhecer a variavel independente do seu tipo com referencia anterior
			
			System.out.println(pessoa);
		}
		
		//Mostra o elemento da fila sem remover
		System.out.println("Primeiro da fila: " + fila.peek());

	}

}
