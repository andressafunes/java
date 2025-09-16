package repeticoes;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opc = 0;
		
		do {
			
			System.out.println("Digite a opção desejada: ");
			opc = leia.nextInt();
			
		}while (opc == 0);
		
		
		leia.close();

	}

}
