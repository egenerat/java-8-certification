package chap4MethodsAndEncapsulation;

class SimpleBean{

	public int getValue(){
		return 5;
	}
}

class Checker{
	public static testMethod(Predicate<SimpleBean> param){
		param.test(5);
	}
}

public class LambdaSimple{
	public static void main(String... args){
		SimpleBean a = new SimpleBean();
		System.out.println(Checker.testMethod(a->a.getValue()>5);
	}
}