package fundamentos;

public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		
		// converteu implicitamente o valor 1 para 1.0
		double a = 1; 
		System.out.println(a);
		
		//float b = 1.0F; Tem o mesmo efeito da linha abaixo. 
		float b = (float) 1.0; // conversão explicita (CAST)
		System.out.println(b);
		
		int c = 1;
		//byte d = c; Dessa forma o java acusa erro. 
		byte d = (byte) c; // conversão explicita (CAST)
		System.out.println(d);
		
		
	}
}
