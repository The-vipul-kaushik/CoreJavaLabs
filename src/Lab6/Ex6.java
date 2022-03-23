package Lab6;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex6 {
	
	public static ArrayList<Integer>voterList(HashMap<Integer, Integer> h){
		ArrayList<Integer> ans = new ArrayList<>();
		
		h.forEach((k,v) ->{
			if(v>=18)
				ans.add(k);
		});
		return ans;
		
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(101, 18);
		hm.put(102, 11);
		hm.put(103, 24);
		hm.put(104, 56);
		hm.put(105, 23);
		hm.put(106, 4);
		
		ArrayList<Integer> EligibleVoters = Ex6.voterList(hm);
		EligibleVoters.forEach(e -> System.out.println(e));
	}
}
