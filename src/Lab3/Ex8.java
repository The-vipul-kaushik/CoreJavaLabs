package Lab3;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s ;
		s = sc.next();
		
		System.out.println(Ex8.isPositive(s));
		
		sc.close();
		
	}

	static boolean isPositive(String s) {
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		
		for(int i=1;i<sb.length();i++)
		{
			char c=sb.charAt(i), d=sb.charAt(i-1);
			if(c<d)
				return false;
		}
		return true;
	}
}
