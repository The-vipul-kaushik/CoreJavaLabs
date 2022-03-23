package Lab3;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		s = sc.next();
		
		System.out.println(getImage(s));
		
		sc.close();
		
	}

	static String getImage(String s) {
		StringBuffer sb = new StringBuffer();
		StringBuffer rev = new StringBuffer();
		sb.append(s);
		rev.append(sb.reverse());
		sb.reverse();
		sb.append("|");
		sb.append(rev);
		 return sb.toString();
	}
}
