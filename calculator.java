import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class calculator {
    private static DecimalFormat formatter = new DecimalFormat(".####");


	public static void main (String [] args) {
     
		Scanner shirin = new Scanner(System.in);
		boolean choicechecker = false;
		boolean exceptionchecker = false;
		System.out.println("Please enter your choice of operator; enter 'add', 'subtract', 'multiply', 'divide', or 'quadFormula'. \nEnter any letter to choose a new operator after selecting your operator, granted you chose the wrong operator");
		
		while(exceptionchecker == false) {
			try {
			while(choicechecker == false) {
		String choice = shirin.nextLine();
			
		if(choice.equals("add")) {
        System.out.println("You chose: addition; please enter two numbers to add. \nEnter any letter to choose another operator");
		System.out.println("Please enter the first number");
		double firstNumberToAdd = shirin.nextDouble();
		System.out.println("Please enter the next number");
		double secondNumberToAdd = shirin.nextDouble();
		double sumofnumb = Adding(firstNumberToAdd, secondNumberToAdd);
		System.out.println("The sum of the two numbers entered is " + sumofnumb);
		choicechecker = true;
		exceptionchecker = true;
	    } 


	    else if (choice.equals("subtract")) {
	    System.out.println("You chose: subtraction; please enter two numbers to subtract. \nEnter any letter to choose another operator");
		System.out.println("Please enter the first number");
		double firstNumberToSubtract = shirin.nextDouble();
		System.out.println("Please enter the next number");
		double secondNumberToSubtract = shirin.nextDouble();
		double differenceOfNumb = Subtracting(firstNumberToSubtract, secondNumberToSubtract);
		System.out.println("The difference of the two numbers entered is " + differenceOfNumb);
		choicechecker = true;
		exceptionchecker = true;
	    } 

	    else if (choice.equals("multiply")) {
        System.out.println("You chose: Multiplication; please enter two numbers to multiply. \nEnter any letter to choose another operator");
		System.out.println("Please enter the first number");
		double firstNumberToMultiply = shirin.nextDouble();
		System.out.println("Please enter the next number");
		double secondNumberToMultiply = shirin.nextDouble();
		double productofnumb = Multiply(firstNumberToMultiply, secondNumberToMultiply);
		System.out.println("The product of the two numbers entered is " + productofnumb);
		choicechecker = true;
		exceptionchecker = true;
	    } 

	    else if (choice.equals("divide")) {
	    System.out.println("You chose: Division; please enter two numbers to divide. \nEnter any letter to choose another operator");
		System.out.println("Please enter the first number");
		double firstNumberToDivide = shirin.nextDouble();
		System.out.println("Please enter the next number");
		double secondNumberToDivide = shirin.nextDouble();
		double quotientofnumb = Divider(firstNumberToDivide, secondNumberToDivide);
		System.out.println("The quotient of the two numbers entered is " + quotientofnumb);
		choicechecker = true;
		exceptionchecker = true;
	
	    }

	    else if (choice.equals("quadFormula")) {
        System.out.println("You chose: Quadratic Formula; \nplease enter three numbers; A, B, and C, the coefficients of X^2+X+(C). \nEnter any letter to choose another operator");
		System.out.println("Please enter coefficient A");
		double coefficientXSquared = shirin.nextDouble();
		System.out.println("Please enter coefficient B");
		double coefficientX = shirin.nextDouble();
		System.out.println("Please enter coefficient C");
		double constantnum = shirin.nextDouble();
		double quadraticproduct = QuadraticFormula(coefficientXSquared, coefficientX, constantnum);
		double quadraticproduct2 = QuadraticFormula2(coefficientXSquared, coefficientX, constantnum);
		if(coefficientX*coefficientX - 4*coefficientXSquared*constantnum > 0) {
		System.out.println("The X values are: X = " + formatter.format(quadraticproduct) + " and \nX = " + formatter.format(quadraticproduct2));
	    } else {
	    	System.out.println("No real roots for X");
	    }
		choicechecker = true;
		exceptionchecker = true;
	           } 

	        }
        } catch(Exception e) {
        	System.out.println("Try Again, enter the operator of your choice again and then only enter numbers");
        }
    }
	}
	public static double Adding(double n1, double n2) {
		double sum;
		sum = n1 + n2;
		
		
		return sum;
	}
	public static double Subtracting(double n1, double n2) {
		double difference;
		difference = n1 - n2;
		
		
		return difference;
	}
	public static double Multiply(double n1, double n2) {
		double product;
		product = n1 * n2;
		
		
		return product;
	}
	public static double QuadraticFormula(double n1, double n2, double n3) {
		double xValueOne;
		if(n2*n2-4*n1*n3 > 0){
		xValueOne = (-1*n2+Math.sqrt(n2*n2-4*n1*n3))/(2*n1);
		return xValueOne;
	    } else {
	    	System.out.println("(-b + The square root of b squared - 4(a)(c)) / 2(a) is not a real root");
	    	return -1;
	    	
	    }
	}
	public static double QuadraticFormula2(double n1, double n2, double n3) {
	    double xValueTwo;
	    if(n2*n2-4*n1*n3 > 0) {
	    xValueTwo = (-1*n2-Math.sqrt(n2*n2-4*n1*n3))/(2*n1);
		return xValueTwo;
	    } else {
	    	System.out.println("(-b - The square root of b squared - 4(a)(c)) / 2(a) is not a real root");
	    	return -1;
	    	
	    }
	}
	public static double Divider(double n1, double n2) {
	    double quotient;
	    quotient = n1 / n2;
		
		
		return quotient;
	}
}