package Lab3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		s = sc.next();
		
		System.out.println(alterString(s));
		
		sc.close();
		
	}

	static String alterString(String s) {
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		
		for(int i=0;i<sb.length();i++)
		{
			char c = sb.charAt(i);
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U')
			{
				c+=1;
				sb.replace(i, i+1, Character.toString(c));
			}
		}
		return sb.toString();
	}
	
}
