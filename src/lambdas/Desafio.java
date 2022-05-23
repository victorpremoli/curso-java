package lambdas;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("ipad", 3235.89, 0.13);
		
		Function<Produto, Double> calculaPrecoComDesconto = 
				item -> item.preco * (1 - item.desconto);
		
		UnaryOperator<Double> calculaImposto =
				valor -> valor >= 2500 ? (valor * 1.085) : valor;
		
		UnaryOperator<Double> calculaFrete = 
				valor -> valor >= 3000 ? valor + 100 : valor + 50;
				
		Function<Double, String> trucarPara2Casas = valor -> {
			DecimalFormat df = new DecimalFormat("#,##0.00");
			df.setRoundingMode(RoundingMode.DOWN);
			return df.format(valor);
		};
		
		UnaryOperator<String> formataValor = 
				valor -> "R$" + valor;
				
		var valorFinal = 
				calculaPrecoComDesconto
				.andThen(calculaImposto)
				.andThen(calculaFrete)
				.andThen(trucarPara2Casas)
				.andThen(formataValor)
				.apply(p);
		
		System.out.println(valorFinal);
	}
}
