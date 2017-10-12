package offTopicExam;

import java.nio.charset.Charset;

public class CharacterEncoding {

	public static void main(String... args) {
		String s = new String("你好".getBytes(), Charset.forName("iso-8859-1"));
		System.out.println(s);

		s = new String("你好".getBytes(), Charset.forName("utf-8"));
		System.out.println(s);

		// Charset.forName("charset does not exist");
		// Raises a java.nio.charset.IllegalCharsetNameException
	}
}