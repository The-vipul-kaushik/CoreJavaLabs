package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int[] A = new int[n];
		
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++)
		{
			A[i] = sc.nextInt();
		}
		int s[] = Ex3.sortArray(A);
		
		for(int x:s)
			System.out.println(x);
	}

	static int[] sortArray(int[] a) {

		for(int i=0;i<a.length;i++)
		{
			String x=String.valueOf(a[i]);
			
			StringBuilder ip1 = new StringBuilder();
			
	        ip1.append(x);
	        
	        ip1=ip1.reverse();
	        
	        a[i] = Integer.parseInt(ip1.toString());
		}
		Arrays.sort(a);
		return a;
	}

}
