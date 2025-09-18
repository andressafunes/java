package exerciciosCollectionsEstrutura;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1List {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String nome = new String();
		
		for(int i = 1; i < 6; i++) {
			System.out.printf("Digite a %d° cor: ",i);
			nome = leia.nextLine();
			cores.add(nome);
		}
		
		System.out.println("Lista de cores digitadas"+ cores);
		
		cores.sort(null);
		
		System.out.println("Cores ordenadas: "+ cores);
		
		leia.close();

	}

}
