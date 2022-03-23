package Lab1;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n=sc.nextInt();
		
		System.out.println(Ex7.checkNumber(n));
	}

	static boolean checkNumber(int n) {
		
		int x=Integer.MAX_VALUE;
		while(n>0)
		{
			int a = n%10;
			
			if(a>x)
				return false;
			x=a;
			n=n/10;
		}
		return true;
	}
}
