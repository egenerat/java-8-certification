package offTopicExam.reflectionUnusedImports;

public class ReflectionUnusedImport {
	public static void main(String ... args) {
		Class cls = Class.forName("abc.MyClass");

		String v = String.class.getConstructor().newInstance();
	}
}