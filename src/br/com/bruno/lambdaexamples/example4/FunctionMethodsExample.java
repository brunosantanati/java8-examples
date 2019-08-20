package br.com.bruno.lambdaexamples.example4;

import java.util.function.Function;

public class FunctionMethodsExample {

	public static void main(String[] args) {
		/*
		 * Function � uma interface funcional
		 * apesar de ter dois m�todos default(compose e andThen)
		 * e um m�todo est�tico(identity)
		 */
		defaultMethodsTest();
		staticMethodTest();
	}

	private static void defaultMethodsTest() {
		Function<Integer, Integer> multiply = (value) -> value * 2;
		Function<Integer, Integer> add = (value) -> value + 3;

		Function<Integer, Integer> addThenMultiply = multiply.compose(add);

		System.out.println(addThenMultiply.apply(3)); //Imprime 12
		
		Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);

		System.out.println(multiplyThenAdd.apply(3)); //Imprime 9
	}
	
	private static void staticMethodTest() {
		Function<Integer,Integer> theSame = Function.identity();
	    System.out.println(theSame.apply(5)); //Imprime 5, pois essa Function retorna o pr�prio argumento que recebeu
	}

}
