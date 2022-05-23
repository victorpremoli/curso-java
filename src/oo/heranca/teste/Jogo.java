package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro(10,10);
		
		Heroi heroi = new Heroi(10,11);
		
		System.out.println(heroi.vida);
		System.out.println(monstro.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Vida do monstro: " + monstro.vida);
		System.out.println("Vida do heroi: " + heroi.vida);
	}
}
