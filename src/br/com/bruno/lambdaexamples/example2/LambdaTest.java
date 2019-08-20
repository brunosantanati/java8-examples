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
		 * Aqui informamos o tipo do argumento(nesse caso String) dentro dos par�nteses
		 * utilizamos return
		 * delimitamos o bloco com chaves { }
		 * e utilizamos ponto e v�rgula ao final da instru��o dentro do bloco.
		 */
		ValidatorInterfaceExample<String> zipCodeValidator = 
				(String zipCode) -> {return zipCode.matches("[0-9]{5}-[0-9]{3}");};
		System.out.println(zipCodeValidator.validate("06455-906"));
	}
	
	private static void lambdaTest2() {
		/*
		 * Aqui deixamos o compilar inferir qual o tipo do argumento e retiramos os par�nteses
		 * como o bloco tem apenas uma linha, retiramos o return, as chaves e o ponto e v�rgula
		 * Muito menos verboso esse c�digo comparado ao c�digo equivalente antes do Java 8. =)
		 */
		ValidatorInterfaceExample<String> zipCodeValidator = 
				zipCode -> zipCode.matches("[0-9]{5}-[0-9]{3}");
		System.out.println(zipCodeValidator.validate("06455-906"));
	}	

}
