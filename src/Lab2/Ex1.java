package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
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
		System.out.println(Ex1.getSecondSmallest(A));
		
		
	}

	static int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		return a[1];
	}

}
