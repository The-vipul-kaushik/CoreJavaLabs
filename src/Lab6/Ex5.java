package Lab6;

import java.util.ArrayList;
import java.util.Collections;


public class Ex5 {

	public static int getSecondLargest(ArrayList<Integer> a) {
		
		Collections.sort(a);
		return a.get(a.size()-2);
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(90);
		l.add(9);
		l.add(-3);
		l.add(4);
		l.add(45);
		l.add(12);
		l.add(34);
		
		
		System.out.println(Ex5.getSecondLargest(l));
	}
}
