package br.com.bruno.lambdaexamples.example2;

@FunctionalInterface
public interface ValidatorInterfaceExample<T> {
	boolean validate(T t);
}
