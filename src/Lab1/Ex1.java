package Lab1;

import java.util.Scanner;

public class Ex1 {

	static int sumOfCubes(int num)
	{
		int sum=0;
		while(num>0)
		{
			int a = num%10;
			sum+=(a*a*a);
			num=num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		n = sc.nextInt();
		
		System.out.println(Ex1.sumOfCubes(n));
		
	}
}
