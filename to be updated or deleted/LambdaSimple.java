package oca.chap4MethodsAndEncapsulation;

import java.util.function.Predicate;

class SimpleBean {

	public int getValue() {
		return 5;
	}
}

class Checker {
	public static boolean testMethod(Predicate<SimpleBean> param){
		return param.test(5);
	}
}

public class LambdaSimple {
	public static void main(String... args){
		SimpleBean a = new SimpleBean();
		System.out.println(Checker.testMethod(b -> b.getValue() > 5));
	}
}