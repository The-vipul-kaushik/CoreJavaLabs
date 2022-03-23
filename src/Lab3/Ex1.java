package Lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

//Exercise 1: Write a Java program that reads a line of integers 
// and then displays each integer and the sum of all integers. 
// (Use String Tokenizer class)?

// using String split() method

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integers saperated by commas:");

		String input = sc.nextLine();

//		String[] elements = input.split(",");
//
//		System.out.println(input);
//
//		int num = 0, sum = 0;
//
//		for (String s : elements) {
//			num = Integer.parseInt(s);
//			System.out.println(num);
//			sum += num; // sum = sum + num;
//		}
//
//		System.out.println(sum);
//
//		sc.close();
		
		StringTokenizer tokenizer = new StringTokenizer(input, ",");

		System.out.println(input);

		int num = 0, sum = 0;

		while (tokenizer.hasMoreTokens()) {
			String str = tokenizer.nextToken();
			num = Integer.parseInt(str);
			System.out.println(num);
			sum = num + sum;
		}
		System.out.println(sum);

		sc.close();
	}

}
