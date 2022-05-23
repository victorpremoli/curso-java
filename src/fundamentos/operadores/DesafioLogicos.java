package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na terça (V ou F);
		//Trabalho na quinta (V ou F);
		
		boolean t1 = true;
		boolean t2 = false;
		
		if(t1 && t2) {
			System.out.println("compra tv de 55 e toma sorvete");
		}
		else if (t1 || t2) {
		    System.out.println("compra tv de 32 e toma soverte");
		} else {
			System.out.println("no compra tv nem toma sorverte");
		}
	}
}
