package br.com.bruno.lambdaexamples.example2;

public class LambdaTest {

	public static void main(String[] args) {
		anonymousClassTest();
		lambdaTest1();
		lambdaTest2();
	}

	private static void anonymousClassTest() {
		ValidatorInterfaceExample<String> zipCodeValidator = new ValidatorInterfaceExample<>() {

			@Override
			public boolean validate(String zipCode) {
				return zipCode.matches("[0-9]{5}-[0-9]{3}");
			}
			
		};
		
		System.out.println(zipCodeValidator.validate("06455-906"));
	}
	
	private static void lambdaTest1() {
		/*
		 * Aqui informamos o tipo do argumento(nesse caso String) dentro dos parênteses
		 * utilizamos return
		 * delimitamos o bloco com chaves { }
		 * e utilizamos ponto e vírgula ao final da instrução dentro do bloco.
		 */
		ValidatorInterfaceExample<String> zipCodeValidator = 
				(String zipCode) -> {return zipCode.matches("[0-9]{5}-[0-9]{3}");};
		System.out.println(zipCodeValidator.validate("06455-906"));
	}
	
	private static void lambdaTest2() {
		/*
		 * Aqui deixamos o compilar inferir qual o tipo do argumento e retiramos os parênteses
		 * como o bloco tem apenas uma linha, retiramos o return, as chaves e o ponto e vírgula
		 * Muito menos verboso esse código comparado ao código equivalente antes do Java 8. =)
		 */
		ValidatorInterfaceExample<String> zipCodeValidator = 
				zipCode -> zipCode.matches("[0-9]{5}-[0-9]{3}");
		System.out.println(zipCodeValidator.validate("06455-906"));
	}	

}
