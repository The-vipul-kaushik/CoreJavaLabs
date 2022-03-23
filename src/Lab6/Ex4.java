package Lab6;

import java.util.HashMap;

public class Ex4 {

	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hm) {
		HashMap<Integer, String> stud = new HashMap<>();
		hm.forEach((k,v) ->{
			if(v>=90)
				stud.put(k, "Gold");
			else if(v>=80 && v<=90)
				stud.put(k, "Silver");
			else if(v>=70 && v<=80)
				stud.put(k, "Bronze");
			
		}
		);
		return stud;
	}
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(101,90);
		hm.put(102,85);
		hm.put(103,60);
		hm.put(104,75);
		hm.put(105,40);
		hm.put(106,72);
		
		HashMap<Integer, String> ans = Ex4.getStudents(hm);
		
		ans.forEach((k,v) -> System.out.println(k+" "+v));
		
	}
}
