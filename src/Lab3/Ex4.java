package Lab3;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		s=sc.next();
		
		System.out.println(Ex4.modifyNumber(s));
		
		sc.close();
	}

	static String modifyNumber(String s) {
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<s.length()-1;i++)
		{
			char c1 = s.charAt(i), c2 = s.charAt(i+1);
			int x = Math.abs((c1 - '0') - (c2-'0'));
			
			sb.append(Integer.toString(x));
		}
		sb.append(Character.toString(s.charAt(s.length()-1)));
		
		return sb.toString();
	}
}
	