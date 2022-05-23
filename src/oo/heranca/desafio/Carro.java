package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	public int velocidade;
	private int aceleracao = 5;

	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidade + getAceleracao() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += getAceleracao();
		}
	}

	public void frear() {
		if (velocidade > 0) {
			velocidade -= 5;
		}
	}

	public int getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(int aceleracao) {
		this.aceleracao = aceleracao;
	}
	
	
}
