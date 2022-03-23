package Lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size: ");
		n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter characters");
		
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm = Ex3.getSquares(a);
		
		System.out.println(hm);
//		for(char c:ch)
//			System.out.println(c);
		sc.close();
	}
	
	public static HashMap<Integer, Integer> getSquares(int[] arr){
		HashMap<Integer, Integer> h = new HashMap<>();
		
		for(int x:arr)
		{
			if(h.containsKey(x))
			{
				continue;
			}
			else
				h.put(x, x*x);
		}
		
		return h;
	}
}
