package Lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size: ");
		n = sc.nextInt();
		
		char[] ch = new char[n];
		
		System.out.println("Enter characters");
		
		for(int i=0;i<n;i++)
		{
			ch[i] = sc.next().charAt(0);
		}

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm = Ex2.countChars(ch);
		
		System.out.println(hm);
//		for(char c:ch)
//			System.out.println(c);
		sc.close();
	}
	
	public static HashMap<Character, Integer> countChars(char[] c){
		HashMap<Character, Integer> h = new HashMap<>();
		
		for(char x:c)
		{
			if(h.containsKey(x))
			{
				h.put(x, h.get(x)+1);
			}
			else
				h.put(x, 1);
		}
		
		return h;
	}
}
