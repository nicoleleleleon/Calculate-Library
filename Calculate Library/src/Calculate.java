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
	public static double discriminant(double numA,double numB,double numC) {
		return (numB * numB) - 4*(numA * numC);
	}
	public static String toImproperFrac(int numWhole,int numNum,int numDen) {
		return ((numWhole*numDen) + numNum) + "/" + numDen;
	}
	public static String toMixedNum(int numTop, int numBott) {
		return (numTop / numBott) + "_" + (numTop % numBott) + "/" + numBott; 
	}
	public static String foil(int aOne, int bOne, int aTwo, int bTwo, String n) {
		return aOne*aTwo + n + "^2 + " + ((aOne*bTwo)+(bOne*aTwo)) + n + "+ " + (bOne*bTwo);
	}
	//determines if int is evenly divisible by another//returns boolean
	public static boolean isDivisibleBy(int numerator, int denominator) {
		return (numerator/denominator) - (numerator % denominator) == (numerator/denominator);
	}
	//returns abs Value of double NOT DONNENEEE
	public static double absValue(double value) {
		return +value;
	}
}
