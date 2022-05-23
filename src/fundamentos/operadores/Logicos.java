package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean cond1 = true;
		boolean cond2 = 3 > 7;
		
		System.out.println( cond1 && !cond2 ); //and
		System.out.println( cond1 || cond2 ); //or
		System.out.println( cond1 ^ cond2 ); //xor
		System.out.println(!!cond1); //not
		System.out.println(!cond2); //not
		
	}
}
