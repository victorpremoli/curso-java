package lambdas;

//The down annotation, does not allow to declare more than one function
@FunctionalInterface
public interface Calculo {
	
	double executar(double a, double b);
	
}
