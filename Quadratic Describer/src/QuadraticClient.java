//Takes the input from user
//author: Nicole Leon
//Version 2; 10/9/18

import java.util.*;
public class QuadraticClient {
	public static void main(String[] args) {
		System.out.println("Hello! Welcome to Quadratic Describer.\n Please give me values for the coefficients a, b, and c!");
		Scanner userInput = new Scanner(System.in);
		double a=0;
		double b = 0;
		double c =0;
		boolean done =false;
		String response ="";
		while (!done) {//while still want to describe
			a = userInput.nextDouble(); //gets variables
			b = userInput.nextDouble();
			c = userInput.nextDouble();
			//do the calculatiions
			Quadratic.quadrDescriber( a, b, c);
			System.out.println("Do you want to keep going? Type \"quit\" to end");
			response = userInput.next();//they'll type something
			if (response.equals("quit")) { //if it is "quit"...
				done = true;
				System.out.println("Have a nice day!");
			}else {
				System.out.println("Please give me values for the coefficients a, b, and c!");
			}
		
		}
	}
}
