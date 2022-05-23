package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		//Tipos numéricos inteiros
		byte anosDeEmpremsa = 21;
		short numerosDeVoos = 456;
		int id = 464545;
		long pontosAcumulados = 3123121337L;
		
		//Tipos numéricos reais
		float salario = 11445.44F;
		double vendasAcumuladas = 2991798133.05;
		
		//Tipo booleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpremsa * 365);
		
		//Números de viagens
		System.out.println(numerosDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": Ganha -> " + salario );
		System.out.println(id + ": Ferias -> " + estaDeFerias );
		System.out.println("Status: " + status);
	}
}
