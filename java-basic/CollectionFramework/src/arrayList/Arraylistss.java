package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistss {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("hell");
		al.add("is");
		al.add("a nice");
		al.add("place");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList<String> al1 = (ArrayList<String>) al.clone();
		System.out.println(al1);
	}
}
