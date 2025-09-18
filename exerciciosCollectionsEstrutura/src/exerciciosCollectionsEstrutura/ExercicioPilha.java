package exerciciosCollectionsEstrutura;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		String nome = new String();
		int opc = 0;
		
		do {
			
			System.out.println("                                     ");
			System.out.println("*************************************");
			System.out.println("                                     ");
			System.out.println("                Menu                 ");
			System.out.println("                                     ");
			System.out.println("    1 - Adicionar Livro na pilha     ");
			System.out.println("    2 - Listar todos os Livros       ");
			System.out.println("    3 - Retirar livro da pila      ");
			System.out.println("    0 - Sair                         ");
			System.out.println("                                     ");
			System.out.println("*************************************");
			System.out.println("                                     ");
			System.out.printf("Entre com a opção desejada: ");
			opc = leia.nextInt();
		
			switch(opc) {
		
				case 1:
			
					System.out.println("Digite o nome do Livro: ");
					leia.skip("\\R");
					nome = leia.nextLine(); 
			
					pilha.push(nome);
					
					System.out.println("Livro adicionado!\n");
					
					for(var livro : pilha) {
						
						System.out.println(livro);
						
					}					
					break;	
					
				case 2:
					
					if (!pilha.isEmpty()){ 
						for(var livro : pilha) {
							
							System.out.println(livro);
							
						}
					} else {
						System.out.println("A pilha esta vazia");
					}
					break;
		
				case 3:
					if(!pilha.isEmpty()) {
						System.out.println("O livro " + pilha.pop() + " foi retirado da pilha!\n");
						
						for(var livro : pilha) {
							
							System.out.println(livro);
							
						}
					}else {
						System.out.println("A pilha esta vazia");
					}			
					break;
					
				case 0:
					System.out.println("Programa Finalizado!");
                    break;

				default:
					System.out.println("Opção inválida");
			
				}
			} while(opc != 0);
				
		leia.close();

	}

}
