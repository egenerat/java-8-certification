package chap5ClassDesign;

class Parent{
	public int var = 1;
}

public class HidingVariables extends Parent{
	public int var = 2;

	public int getVariable(){
		return super.var;
	}

	public static void main(String[] args){
		Parent p = new Parent();
		HidingVariables hv = new HidingVariables();
		System.out.println("Parent: " + p.var);
		System.out.println("Hiding in child: " + hv.var);
		System.out.println("Accessing from child with super: " + hv.getVariable());
	}
}