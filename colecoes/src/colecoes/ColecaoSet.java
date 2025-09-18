package colecoes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.add("Abacaxi");
		
		System.out.println(frutas);
		
		for(String fruta : frutas) {
			System.out.println(fruta.hashCode());
		}
		
		frutas.remove("Abacate");
		
		System.out.println(frutas);
		
		Iterator<String> itFrutas = frutas.iterator();
		
		while(itFrutas.hasNext()) {
			System.out.println(itFrutas.next());
		}
		
		//Ordenar
		
		
		// Criar o array
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//Adicionar os dados no array
		frutasList.addAll(frutas);
		
		//Ordena de forma crescente
		frutasList.sort(null);
		
		//Lista dos dados do array
		System.out.println(frutasList);
		
		//Ordena de forma decrescente
		frutasList.sort(Comparator.reverseOrder()); // Só funciona depois de ter os dados da forma crescente primeiro
		
		System.out.println(frutasList);
		
		

	}

}
