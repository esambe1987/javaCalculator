package javaCalculator;

public class SimpleCalculator {

	//add method
	public static int add (int num1, int num2){
	return num1 + num2;
	}
	
	//subtract method
	public static int subtract(int num1, int num2){
	return num1 - num2;
	  
	}
	
	//multiply method
	public static int multiply(int num1, int num2) {
		 
	return num1 * num2;
	}
	
	//divide method
	public static int divide(int num1, int num2){
	   
	if (num2 == 0)
	{
	System.out.println ("num2 cannot be zero");
	return 0;
	}
	else
	return num1 / num2;
	}
	  
	//square method
	public static int square (int num1)
	{
	return num1 * num1;
	}

	
	}

	
	
	

