package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32 ) * 5/9 = ºC 
		
		final double ajuste = 32;
		final double fator = 5.0/9;
		double fahrenheit = 200;
		double celcius = (fahrenheit - ajuste) * (fator);
		
		System.out.println(celcius);
 		
	}
}
 