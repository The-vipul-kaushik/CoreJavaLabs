package Lab2;

import java.util.Scanner;

public class Ex4 {
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
		int s[] = Ex4.modifyArray(A);
		
		for(int x:s)
			System.out.println(x);
	}

	static int[] modifyArray(int[] a) {
		
		int n=a.length;
		
      
        int[] temp = new int[n];
         
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (a[i] != a[i+1])
                temp[j++] = a[i];
         
        temp[j++] = a[n-1];  
         int[] newA = new int[j];
         int k=0;
        for (int i=j-1; i>=0; i--)
            newA[k++] = temp[i];
      
        return newA;
	}

}
