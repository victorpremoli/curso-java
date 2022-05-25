package generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "maria");
		resultadoConcurso.adicionar(2, "ana");
		resultadoConcurso.adicionar(2, "pri");
		resultadoConcurso.adicionar(3, "fer");
		resultadoConcurso.adicionar(4, "rebeca");
		
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(1));
			
	}
}
