package Lab1;

import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(Ex6.calculateDifference(n));
		
		sc.close();
	}

	static int calculateDifference(int n) {
		int sqSum=0, sumSq=0;
		
		for(int i=1;i<=n;i++)
		{
			sqSum+=(i*i);

			sumSq+=i;
		}
		
		sumSq*=sumSq;
		
		return sqSum-sumSq;
	}
	
}