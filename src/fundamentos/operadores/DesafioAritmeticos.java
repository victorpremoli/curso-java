package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double p1 = Math.pow((6*(3+2)), 2) / (3*2);
		
		double p2 = Math.pow(((1-5)*(2-7)/2), 2);
		
		double p3 = Math.pow((p1-p2), 3);
		
		double p4 = Math.pow(10, 3);
		
		int total = (int) (p3/p4);
		System.out.printf("Resultado: %d", total);
		
		
		
	}
}
