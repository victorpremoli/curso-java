package classe;

public class AreaCircTest {

	public static void main(String[] args) {

		
		AreaCirc a = new AreaCirc(5.6); //area()

//		AreaCirc.PI = 3.1415; valor não pode ser mais alterado
//      pois PI é uma constante.
		
		
		System.out.println(AreaCirc.area(7)); //static area()
		
		
		System.out.println(AreaCirc.PI);
		System.out.println(a.area());
	}

}
