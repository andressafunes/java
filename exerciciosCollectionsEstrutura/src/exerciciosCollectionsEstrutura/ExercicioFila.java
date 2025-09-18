package exerciciosCollectionsEstrutura;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		String nome = new String();
		int opc = 0;
		
		do {
			
			System.out.println("                                     ");
			System.out.println("*************************************");
			System.out.println("                                     ");
			System.out.println("                Menu                 ");
			System.out.println("                                     ");
			System.out.println("    1 - Adicionar Cliente na Fila    ");
			System.out.println("    2 - Listar todos os Clientes     ");
			System.out.println("    3 - Retirar Cliente da Fila      ");
			System.out.println("    0 - Sair                         ");
			System.out.println("                                     ");
			System.out.println("*************************************");
			System.out.println("                                     ");
			System.out.printf("Entre com a opção desejada: ");
			opc = leia.nextInt();
		
			switch(opc) {
		
				case 1:
			
					System.out.println("Digite o nome do cliente: ");
					leia.skip("\\R");
					nome = leia.nextLine(); 
			
					fila.add(nome);
					
					System.out.println("Cliente Adicionado!\n");
					
					for(var pessoa : fila) {
						
						System.out.println(pessoa);
						
					}					
					break;	
					
				case 2:
					
					if (!fila.isEmpty()){ 
						for(var pessoa : fila) {
							
							System.out.println(pessoa);
							
						}
					} else {
						System.out.println("A fila esta vazia");
					}
					break;
		
				case 3:
					if(!fila.isEmpty()) {
						System.out.println("Cliente " + fila.poll() + " foi chamado\n");
						
						for(var pessoa : fila) {
							
							System.out.println(pessoa);
							
						}
					}else {
						System.out.println("A fila esta vazia");
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
