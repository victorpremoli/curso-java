package classe;

//import java.util.Date;

public class Equals {
	public static void main(String[] args) {
		
		//Criando 2 objetos com os mesmos atributos.
		Usuario u1 = new Usuario();
		u1.nome = "Victor Premoli";
		u1.email = "victopremoli@outlook.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Victor Premoli";
		u2.email = "victopremoli@outlook.com";
		
		//Comparando objetos criados.
		System.out.println(u1 == u2); //false
		System.out.println(u1.equals(u2)); //false
		System.out.println(u2.equals(u1)); //false
		
//		System.out.println(u2.equals(new Date()));
		
	}
}
