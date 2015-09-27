package offTopicExam;

import java.util.HashMap;

public class UpdateObjectParameter {
	public static void main(String... args) {
		HashMap<String, String> map = new HashMap<>();
		System.out.println("Size before: " + map.size());
		new UpdateObjectParameter().method(map);
		System.out.println("Size after: " + map.size());
	}

	public void method(HashMap<String, String> param) {
		param.put("Key", "value");
	}
}
