package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.14; //Letras maiusculas em constantes por convenção.
	//modificador STATIC faz o atributo pertencer a classe e não a,
	//novas instancias dela, como se fosse uma variavel global.
	
	//modificador FINAL faz o valor de PI ser uma constante,
	//e não pode ser alterado.

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	//método com modificador STATIC, não precisa criar uma nova instancia da classe.
	static double area(double raio) {
		return PI * Math.pow(raio, 2); 
	}
}
