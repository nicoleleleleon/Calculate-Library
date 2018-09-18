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
	public static double average(int num1,int num2) { //accepts two double and returns a double
		return (num1 + num2)/2.0;	
	}
	public static double average(int num1,int num2, int num3) { //overload of average
		return (num1 + num2 + num3)/3.0;
	}
	public static double toDegrees(int number) { //converts angle measure in Radians into degrees-- double to double
		return number*180/3.14159;	//3.14159 approx for pi
	}
	
	public static double toRadians(int number) { //degrees to radians
		return number*3.14159/180; 
	}
	public static double discriminant(double numA,double numB,double numC) { //3 doubles to 1 double
		return (numB * numB) - 4*(numA * numC);
	}
	public static String toImproperFrac(int numWhole,int numNum,int numDen) { //mixed number to improper fraction-- 3 ints to string
		return ((numWhole*numDen) + numNum) + "/" + numDen;
	}
	public static String toMixedNum(int numTop, int numBott) { //improper fraction to mixed number-- 2 ints to string
		return (numTop / numBott) + "_" + (numTop % numBott) + "/" + numBott; 
	}
	public static String foil(int a, int b, int c, int d, String n) { //binomial multiplication (ax+b)(cx+d) into quadratic equation-- 4 ints to String
		return a*c + n + "^2 + " + ((a*d)+(b*c)) + n + " + " + (b*d);
	}
	//determines if int is evenly divisible by another//returns boolean
	public static boolean isDivisibleBy(int numerator, int denominator) {
		return (numerator/denominator) - (numerator % denominator) == (numerator/denominator);
	}
	//returns abs Value of double
	public static double absValue(double value) {
		if(value<=0) {
			return value*(-1);
		}else{
			return value; 
		}
	}
	public static double max(double first, double second) { //returns larger of values passed, returns a double
		if(first>=second) {
			return first;
		}else{
			return second;
		}
	}
	public static double max(double first, double second, double third) { //overload of max method
		if(first>second && first>third) {
			return first;
		}else if (second>third && second>first) {
			return second;
		}else {
			return third;		
		}
	}
	public static int min(int one, int two) { //returns smallest, accepts 2 int returns int
		if(one>=two) {
			return two;
		}else {
			return one;
		}
	}

	public static double round2(double numUnround) { //rounds double to 2 decimal places, returns double
		int lastNum= (int)(numUnround*1000%10);
		int answer= (int)(100*numUnround);
		if(lastNum>= 5) {
			return ((answer+1)/100.0);
		}else {
			return answer/100.0;
	}
}
	//public static double exponent(double base, int power) {
	//	double answer=1.0;
	//	int i=0;
	//	while(i<=power) {
	//	answer *= base;
	//	i++;	
	//	return answer;
	//}  saying I must return a double??
	}
//	public static int factorial(int numStart) {
//		for(int i=0;i<=numStart;i++){
//			return numStart*i;
	
//	public static boolean isPrime(int num) {
//		public static double isDivisibleBy();
//		for(i=0; i<1000; i++) {
//			{
//				for(num=0; num<i; num++)
//					if(num%i!=0){
//						return false;
//			}else {
//				return true;
//			}
//			}
//	public static int gcf(int num1, int num2) {
//		public static int isDivisibleBy();
//
//		Using Newton's method for approximating square roots, iterative calculations
//	public static double sqrt(double num){
// 			double ans= .5(num/guess+guess);\
// use for stmt for guess? then if and else until approximation is close enough?
	

	}
	
	

		
		
		
