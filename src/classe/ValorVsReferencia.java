package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor. ( Tipo Primitivo )
		
		a++; //valor de A deve ser 3
		b--;//valor de B deve ser 1
		
		System.out.println(a + "\n" + b);
		
		Data d1 = new Data(20,11,1996);
		Data d2 = d1; //atribuição por referencia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12; //Altera tambem o valor de d1 pois d2 está apontando,
		//para os mesmso valores de d1.
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d2); //altera o valor de d1 e d2;
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);//metodo não altera o valor de c pois 
		//foi passado uma cópia do valor e não sua referencia.
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
