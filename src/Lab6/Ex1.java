package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Ex1 {

	public static ArrayList<Integer> getValues(HashMap<String, Integer> hm){
		 ArrayList<Integer> l = new ArrayList<>();
		 
		 hm.forEach((k,v) -> {
			 l.add(v);
		 });
		 
		 Collections.sort(l);
		 return l;
		}
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("A", 10);
		hm.put("B", 20);
		hm.put("C", 5);
		hm.put("D", 1);
		hm.put("E", 15);
		
		List<Integer> l = new ArrayList<Integer>();
		l = Ex1.getValues(hm);
		
		System.out.println(l);
		
	}
	
}
