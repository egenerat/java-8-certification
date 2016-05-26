package ocp.chap2DesignPatternsAndPrinciples.immutable;

import java.util.List;

public class Immutable {

	private List<String> objects;

	public Immutable(List<String> objects) {
		this.objects = objects;
		// this is not correct since the caller has a reference on the list !
		// TODO find the methods on Collection to copy a list
	}

	public getObjects() {
		List<String> copyList;
		for (String i : objects) {
			copyList.add(i);
		}
	}
}
