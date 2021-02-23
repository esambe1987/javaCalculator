package javaCalculator;

public class Main{
	
	//MagicCalculator class extending calculator class
	
	//main functionality
	public static void main (String[]args){
	int int1 = 2;
	int int2 = 6;

		
	int answer = SimpleCalculator.add(int1, int2);
	int secondAnswer = SimpleCalculator.subtract(int2, int1);
	int multipliedAnswer = SimpleCalculator.multiply(int1, int2);
	int dividAnswer = SimpleCalculator.divide(int1, int2);
	int squareAnswer = SimpleCalculator.square(int1);


	
	System.out.println(answer);
	System.out.println(secondAnswer);
	System.out.println(multipliedAnswer);
	System.out.println(dividAnswer);
	System.out.println(squareAnswer);
	
	}
}

 
