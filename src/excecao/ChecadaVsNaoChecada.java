package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();			
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		
		// Bloco try/catch obrigatorio pois é uma exceção checada.
		try {
			geraErro2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Fim");
	}

	// Exceção não checada.
	static void geraErro1() {
		throw new RuntimeException("Erro 1");
	}

	//Exeção checada
	static void geraErro2() throws Exception {
		throw new Exception("Erro 2");
	}
}
