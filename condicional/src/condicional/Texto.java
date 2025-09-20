package condicional;

import java.util.Scanner;

public class Texto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String texto = new String();
		
		System.out.println();
		leia.skip("\\R");
		texto = leia.nextLine();
		
		leia.close();

	}

}
