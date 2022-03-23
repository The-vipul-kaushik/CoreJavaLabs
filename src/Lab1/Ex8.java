package Lab1;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(Ex8.checkNumber(n));
		
		sc.close();
	}

	static boolean checkNumber(int n) {
		if(n==0)
		    return false;
		 
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}
}
