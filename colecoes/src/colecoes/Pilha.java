package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("Duna");
		pilha.push("Pai Rico Pai Pobre");
		pilha.push("Maus");
		pilha.push("Crime e Castigo");
		pilha.push("Quarto de Despejo");
		
		System.out.println(pilha);
		
		//remove da pilha
		pilha.pop();
		
		//pesquisa o item na pilha
		System.out.println("O livro Guia dos Mochileiros das Galáxias está na pilha? " + pilha.contains("Guia dos Mochileiros das Galáxias"));
		

	}

}
