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
	public static boolean isDivisibleBy(int num, int deno) {
		if(deno==0) {
			return false;
		}else {
		return (num/deno) - (num % deno) == (num/deno);
	}
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
	public static double exponent(double base, int power) { //raises val to +int, double and int to double
		double answer=1.0;
		int i=0;
		while(i<power) {
		answer *= base;
		i++;	
	}
		return answer;
	}
	public static int factorial(int numStart) { //returns factorial, int to int
		int answer=1;
		for(int i=1;i<=numStart;i++) {
			answer= answer*=i;
		}
			return answer;
	}

	public static boolean isPrime(int num) { //prime? int to boolean         
		boolean answer= true;
		if(num<4) { //1,2,3 is prime
			return answer;
		}else if (num==5) { //5 and 7 are prime
			return answer;
		}else if (num==7) {
			return answer;
		}else {
			for(int deno=2;deno<=7;deno++) { //if can be divided by 3-7, not prime
			if(Calculate.isDivisibleBy(num, deno)) {
			answer= false; 
			}
		}			
	}return answer;
}
	
	public static int gcf(int num1, int num2) { //finds gcf, two int to int
		int answer= num1; //if they don't share any factors then gcf is one
		if(num1>num2) {
			//answer =1;
				for(int i=num2;num2>=1;i--) {
					//working backwards starting from bigger number to get largest number
					if(Calculate.isDivisibleBy(num1,i)&&Calculate.isDivisibleBy(num2,i)) {
						//so that divisible for both numbers
						return i; //so that it stops instead of continuously looping
						}
				} 
		}else if(num1<num2){
						// since don't want to divide smaller# by bigger#
							for(int i=num1;num1>=1;i--) {
								if((Calculate.isDivisibleBy(num1,i))&&(Calculate.isDivisibleBy(num2,i))) {
									return i;		
						}		
					}
	}
	return answer;
	}
				
		//Using Newton's method for approximating square roots, iterative calculations
	public static double sqrt(double num){
		if(num<0) {
			System.out.println("Negative numbers don't have square roots you ~fool~");
		}
		double guess= 1.00;
		double diff= 1;
			while(diff>=.005) {
				guess= ((num/guess)+guess)/2;
				diff= Calculate.absValue(num-(guess*guess));
				}
			return Calculate.round2(guess);
		}
}
	

		
		
		
