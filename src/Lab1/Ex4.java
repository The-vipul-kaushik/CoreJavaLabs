package Lab1;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Ex4.primes(n);
		
		sc.close();
	}

	static void primes(int n) {
		for(int i=2;i<=n;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
				System.out.println(i);
		}
	}
	
}
