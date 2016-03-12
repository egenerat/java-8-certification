package ocp.chap1AdvancedClassDesign.enumExamples;

public enum Affluence {
	LOW {
		public void myMethod () {

		}
	},
	HIGH {
		public void myMethod () {

		}
	};

	public abstract void myMethod();
}