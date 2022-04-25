package sample;

public class String1 {
	public static void main(String[] args) {

		String s = "Always Welcome";
		System.out.println(s);
		int length = s.length();
		System.out.println(length);
		boolean startsWith = s.startsWith("Always");
		System.out.println(startsWith);
		boolean endsWith = s.endsWith("Welcome");
		System.out.println(endsWith);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		int indexOf = s.indexOf("o");
		System.out.println(indexOf);
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		char charAt = s.charAt(7);
		System.out.println(charAt);
		boolean empty = s.isEmpty();
		System.out.println(empty);
		boolean contains = s.contains("s");
		System.out.println(contains);
		String replace = s.replace("W", "s");
		System.out.println(replace);

	}
}
