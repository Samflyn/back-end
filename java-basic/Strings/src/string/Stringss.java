package string;

//String is immutable. Pooling is only available for Strings.
public class Stringss {
	public static void main(String[] args) {
		String[] sb = new String[] { "anything", "again", "agaon" };
		String s1;
		s1 = " hello ";
		String s2 = " hello there ";
		String s3 = new String("hello");
		String s4;
		s4 = new String("hello");
		String s5 = s4;
		String s6 = new String(s4);
		char ch = s1.charAt(1);// Index of char in the String.
		s1.length();// get string length.
		byte[] b = s1.getBytes();// convert string to byte array.
		int index = s1.indexOf('o');// get the position of char in string.
		String s7 = "";// returns true if string is empty. null can be used too.
		if (s7.isEmpty())
			;
		s1.replace("hello", "mello");// replace text in string.
		s2.trim();// trim only first and last space.
		s1.toUpperCase();
		s1.toLowerCase();
		s1.contains("hello");// returns true if string contains specified string.
		s1.equals(s2);// returns true if Strings match.
		s1.equalsIgnoreCase(s2);// case ignore.
		if (s1 == s2)
			;// checks for address not the string.
		s1.compareTo(s2);// checks chars of string and returns 0 if equal, +ve if s1>, -ve if s1<.
		s1.replaceAll("hello", "mello");// replaces all occurrences in string.
		s1.split(" ");// used to split string.
	}
}