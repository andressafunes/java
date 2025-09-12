
public class Unario {

	public static void main(String[] args) {


		int preIncrementoOriginal = 8, preIncrementoResultado;
		int posIncrementoOriginal = 8, posIncrementoResultado;
		
		// Pré Incremento
		
		System.out.printf("Pre Incremento: valor original = %d%n", preIncrementoOriginal);
		preIncrementoResultado = ++preIncrementoOriginal;
		System.out.printf("Após pré incrementar a veriavel original: resultado = %d, valor Atualizado = %d%n", preIncrementoResultado, preIncrementoOriginal);
		
		//Pós Incremento
		
		System.out.printf("Pre Incremento: valor original = %d%n", posIncrementoOriginal);
		posIncrementoResultado = posIncrementoOriginal++;
		System.out.printf("Após pré incrementar a veriavel original: resultado = %d, valor Atualizado = %d%n", posIncrementoResultado, posIncrementoOriginal);


	}

}
