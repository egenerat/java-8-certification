package oca.chap5ClassDesign.trickyAccessModifiers.other;

import oca.chap5ClassDesign.trickyAccessModifiers.animal.*;

public class Tadpole extends Frog{
	public static void main(String... args){
		// Commented lines do not compile! => Privilege issues
		Tadpole t = new Tadpole();
		t.ribbit();
		//t.jump();
		Frog f = new Tadpole();
		//f.ribbit();
		//f.jump();
	}
}