package buffer;

//It is mutable and default size is 16bytes.
public class StringBufferss {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(100);
		sb.append("hello");// adding at end.
		sb.insert(1, "there");// at specified location.
		sb.replace(0, 1, "hello");// from start to end specified.
		sb.delete(0, 1);
		sb.reverse();
		sb.capacity();// return the length.
		sb.ensureCapacity(50);
		sb.charAt(0);// return the char at specified location.
		sb.length();
		sb.substring(0, 1);// return string from specified index.
		sb.toString();// to convert StringBuffer to String.
	}
}