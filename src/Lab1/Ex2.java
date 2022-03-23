package Lab1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c;
		System.out.println("Enter your choice");
		System.out.println("RED 1");
		System.out.println("YELLOW 2");
		System.out.println("GREEN 3");
		c=sc.nextInt();
		
		switch(c)
		{
		case 1:System.out.println("STOP");
				break;
		case 2:System.out.println("READY TO GO");
				break;
		case 3:System.out.println("GO");
				break;
		default:System.out.println("WRONG CHOICE");
		
		
		}
	}
}
