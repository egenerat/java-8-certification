package package1;

public class ClassA{

	private int aNumber = 1;

	public ClassA(){
		System.out.println("before construct" +aNumber);
		aNumber = 45;
	}

	public static void main(String[] args){
		//System.out.println("before construct" + aNumber); // does not compile
		ClassA anInstance = new ClassA();
		System.out.println("after construct" + anInstance.aNumber); // not possible to reference non static fields from stsatic methods
		//System.out.println("after construct" + anInstance.aNumber); // 45

	}


	{
		aNumber = 2;
	}
}