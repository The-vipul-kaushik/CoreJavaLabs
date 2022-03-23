package Lab5;

import java.util.Scanner;

public class Ex1 {
	
	public static void checkAge(int age) throws NotEligibleAgeException {
		
		if(age>=15)
			System.out.println("You are eligible");
		else
			throw new NotEligibleAgeException("Sorry u are not eligible");
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		age = sc.nextInt();
		
		try {
		Ex1.checkAge(age);
		}
		catch(NotEligibleAgeException e){
			System.out.println(e.getMessage());
		}
	}
}
