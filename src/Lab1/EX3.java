package Lab1;

import java.util.Scanner;

public class EX3 {

	static int NthFibo(int num)
	{
		if(num==1)
			return 1;
		else if(num==2)
			return 1;
		
		return NthFibo(num-1)+NthFibo(num-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		n = sc.nextInt();

		System.out.println("USING RECURSSION ");
		System.out.println(EX3.NthFibo(n));
		
		System.out.println("WITHOUT RECURSSION");
		
		int a=1,b=1,c=1;
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		
	}
}