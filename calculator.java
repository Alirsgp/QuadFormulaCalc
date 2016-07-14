import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class calculator {
    private static DecimalFormat formatter = new DecimalFormat(".####");


	public static void main (String [] args) {
     
		Scanner shirin = new Scanner(System.in);
		boolean choicechecker = false;
		boolean exceptionchecker = false;
		System.out.println("Please enter your choice of operator:\n Enter 'add', 'subtract', 'multiply', 'divide', 'MagicBall', 'quadFormula', or 'Compound Interest'. \nEnter any letter to choose a new operator after selecting your operator, granted you chose the wrong operator.\n To exit the program, type 'exit'.");
		
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
	  

	    else if (choice.equals("exit")) {
	    System.out.println("The program will now exit, bye!");
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

	    else if (choice.equals("MagicBall")) {
	    System.out.println("You chose: Magic Ball; please ask a Yes/No question, and the ball will tell you what your decision should be. \nEnter any letter to choose another operator");
		System.out.println("Please enter your Yes/No question");
		String question = shirin.nextLine();
		double answer = MagicBall();
		if (answer > 50) {
			System.out.println("Yes");
			System.out.println(answer);
		} else if (answer < 50) {
			System.out.println(answer);
			System.out.println("No");
		}
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

	    else if (choice.equals("Compound Interest")) {
	    System.out.println("You chose: Compound Interest; Please enter P for Principal, r for rate of return, \nn for number of times compounded per year, and t for number of years borrowed. \nEnter any letter to choose another operator");
		System.out.println("Please enter the Principal starting amount");
		double principal = shirin.nextDouble();
		System.out.println("Please enter the rate of return");
		double rateOfReturn = shirin.nextDouble();
		System.out.println("Please enter the number of times compounded per year");
		double numberOfTimesCompounded = shirin.nextDouble();
		System.out.println("Please enter the time in years, representing t");
		double timeCompounded = shirin.nextDouble();
		double accumulated = Compounding(principal, rateOfReturn, numberOfTimesCompounded, timeCompounded);
		System.out.println("The accumulated amount is " + accumulated);
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
	public static double Compounding(double n1, double n2, double n3, double n4) {
		double amountAccumulated;
		
		amountAccumulated = n1*Math.pow((1+(n2/n3)), n4*n3);
		//P = n1, r = n2, n = n3, t = n4
		
		
		return amountAccumulated;
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
	public static double MagicBall(){
         double MagicNumber;
         MagicNumber = Math.random()*100;
         return MagicNumber;
         // 0 and 1 ----- magicnumber > .9 * -> 90

	}
}
