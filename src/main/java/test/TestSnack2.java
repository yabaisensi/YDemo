package test;

import java.util.Scanner;

public class TestSnack2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		while(sc.hasNextLine() && !(input = sc.nextLine()).equals("")) {
		    //Now you have your input and you need to parse it.
		    //There are many ways to parse a string.
		    String[] numbers = input.split(" ");
		    int num1 = Integer.parseInt(numbers[0]);
		    int num2 = Integer.parseInt(numbers[1]);
		    
		    System.out.println( num1 > num2 ? num1 - num2 : num2 - num1);
		}
	}

}
