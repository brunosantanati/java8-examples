package br.com.bruno.lambdaexamples.example3;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		int miles = 3;
		double kilometers = convertMilesToKilometers(miles);
		System.out.printf("%d miles = %3.2f kilometers\n", miles, kilometers);
	}

	private static double convertMilesToKilometers(int miles) {
		/*
		 *  Utilizando a interface Function
		 *  que é usada para criar uma função que recebe um argumento e retorna um valor.
		 *  Nesse exemplo recebe um Integer e retorna um Double.
		 *  Unboxing e Autoboxing ocorrem sem problemas nesse código.
		 */
		Function<Integer, Double> milesToKilometers = (m) -> 1.6 * m;
		return milesToKilometers.apply(miles);
	}

}
