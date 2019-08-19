package br.com.bruno.lambdaexamples.example1;

import br.com.bruno.lambdaexamples.interfaces.RunnableExample;

public class LambdaTest {

	public static void main(String[] args) {
		usualImplementationTest();
		anonymousClassTest1();
		anonymousClassTest2();
		lambdaTest1();
		lambdaTest2();
	}

	private static void usualImplementationTest() {
		/*
		 * Usando classe RunnableExample que implementa Runnable
		 */
		Runnable runnable = new RunnableExample();
		Thread thread = new Thread(runnable);
        thread.start();
	}
	
	private static void anonymousClassTest1() {
		/*
		 * Usando classe anônima que implementa Runnable
		 */
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Running anonymous 1...");
			}
		};
		
		Thread thread = new Thread(runnable);
        thread.start();
	}
	
	private static void anonymousClassTest2() {
		/*
		 * Usando classe anônima que implementa Runnable
		 */
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Running anonymous 2...");
			}
		});
        thread.start();
	}
	
	private static void lambdaTest1() {
		/*
		 * Usando lambda no lugar de classe anônima
		 */
		Runnable runnable = () -> { System.out.println("Running lambda 1..."); };
		Thread thread = new Thread(runnable);
        thread.start();
	}

	private static void lambdaTest2() {
		/*
		 * Usando lambda no lugar de classe anônima
		 * Caso o bloco do lambda entre { } tenha apenas uma instrução
		 * podemos retirar essas chaves e o ponto e vírgula como abaixo
		 */
		Thread thread = new Thread(() -> System.out.println("Running lambda 2..."));
        thread.start();
	}
}
