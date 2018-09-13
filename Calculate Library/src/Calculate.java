// this class contains the methods to do various math related tasks
//author: Nicole Leon
//Version 0; 9/6/2018

public class Calculate {
//returns square of integer
	public static int square(int number) { //int means return an integer
	return number*number; //OR answer= number*number; return answer
	
	}
	
	public static int cube(int number) { //cube returns cube of value passed
		return number*number*number;
	}
	
	
	public static double average(int num1,int num2) {
		return (num1 + num2)/2.0;
		
	}
	
	public static double toDegrees(int number) {
		return number*180/3.14159;
		
	}
	
	public static double toRadians(int number) {
		return number*3.14159/180; 
		
	}
	
	public static double discriminant(int numA,int numB,int numC) {
		return (numB * numB) - 4*(numA * numC);
	}
	
	public static int discriminant(int numWhole,int numNum,int numDen) {
		
	}
}
