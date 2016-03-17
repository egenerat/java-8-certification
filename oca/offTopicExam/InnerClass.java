package oca.offTopicExam;

public class InnerClass {

	class Parent{
		private void privateMethod() {
		System.out.println("say hello");
	}

		public void publicMethod(){
			privateMethod();
		}
	}

	class Child extends Parent {}

	public static void main(String... args){
		Child a = new InnerClass().new Child();
		// Does not compile, privateMethod is private
		// a.privateMethod();
		a.publicMethod();
		//Parent b = a;
		//b.method1();
	}
}