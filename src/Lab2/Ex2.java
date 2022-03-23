package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		String[] A = new String[n];
		
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++)
		{
			A[i] = sc.next();
		}

		String s[] = Ex2.sortStrings(A);
		
		for(String x:s)
			System.out.println(x);
		
	}

	static String[] sortStrings(String[] a) {

		Arrays.sort(a);
		
		for(int i=0;i<Math.ceil(a.length/2.0);i++)
		{
			a[i]=a[i].toUpperCase();
		}
		for(int i=(int)(Math.ceil(a.length/2));i<a.length/2;i++)
		{
			a[i]=a[i].toLowerCase();
		}
		
		return a;
	}




}
