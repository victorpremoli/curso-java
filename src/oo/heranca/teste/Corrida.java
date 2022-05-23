package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Gol;

public class Corrida {
	public static void main(String[] args) {
		Gol gol = new Gol();
		Ferrari ferrari = new Ferrari();
		
		System.out.println("Velocidade do Gol: " + gol.velocidade);
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidade);
		
		gol.acelerar();
		gol.acelerar();
		
		System.out.println("Velocidade do Gol: " + gol.velocidade);
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidade);
		
		gol.frear();
		gol.frear();
		gol.frear();
		gol.frear();
		
		System.out.println("Velocidade do Gol: " + gol.velocidade);
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidade);
		
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println("Velocidade do Gol: " + gol.velocidade);
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidade);
		System.out.println(ferrari.nivelDoAr());
	}
}
