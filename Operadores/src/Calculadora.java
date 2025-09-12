import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		// Instanciar um objeto da classe Scanner (Entrada de Dados)
		
		Scanner leia = new Scanner(System.in);
		
		//Definir variaveis
		
		double numero1, numero2;
		
		// Entrada de dados
		
		System.out.println("*** Calculadora ***");
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextDouble();
		
		// Efetuar os calculos
		
		System.out.printf("\n%.2f + %.2f = %.2f\n", numero1, numero2, numero1 + numero2);
		System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, numero1 - numero2);
		System.out.printf("%.2f x %.2f = %.2f\n", numero1, numero2, numero1 * numero2);
		System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, numero1 / numero2);
		
		// Operações matematicas com o Math
		System.out.printf("%.2f ^ %.2f = %.2f", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("%nRaiz quadrada de %.2f = %.2f", numero1, Math.sqrt(numero1));







	}

}
