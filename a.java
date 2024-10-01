package weekOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionalLogic {
	public static void preAndPostDifference() {
		int x = 5, y = 10;
		System.out.println("The value of x is "+x);
		System.out.println("The value of ++x is "+(++x));
		System.out.println("The value of x++ is "+x++);
		System.out.println("The value of x is " + x);
		
		System.out.println("The value of y is "+y);
		System.out.println("The value of --y is "+(--y));
		System.out.println("The value of y-- is "+y--);
		System.out.println("The value of y is " + y);
	}
	
	public static void booleanLogicShortCircuitOps() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter the first number");
			int num1 = sc.nextInt();
			System.out.println("Please enter the second number");
			int num2 = sc.nextInt();
			if(num1 < 0 && num2++ < 0){ 
				System.out.println(num2);
			}
			else if(num1 > 0 && num2++ > 0) {
				System.out.println(num2);
			}
			else if (num1 == 0 || num2++ == 0) { 
				System.out.println(num2);
			}
			else if (num1 < 0 || num2++ < 0) { 
				System.out.println(num2);
			} 
			else {
				System.out.println(num2);
			}
		} catch(InputMismatchException err) {
			err.printStackTrace();
		}
	}
	public static void booleanBitwiseOps() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter the first number");
			int num1 = sc.nextInt();
			System.out.println("Please enter the second number");
			int num2 = sc.nextInt();
			if(num1 < 0 & num2++ < 0){ 
				System.out.println(num2);
			}
			else if(num1 > 0 & num2++ > 0) {
				System.out.println(num2);
			}
			else if (num1 == 0 | num2++ == 0) { 
				System.out.println(num2);
			}
			else if (num1 < 0 | num2++ < 0) { 
				System.out.println(num2);
			} 
			else {
				System.out.println(num2);
			}
		} catch(InputMismatchException err) {
			err.printStackTrace();
		}
	}
	public static void compareStrings() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string");
		String s2 = sc.nextLine();
		
		System.out.println("Using s1===s2 returns " + (s1==s2));
		System.out.println("Using equals() returns " + s1.equals(s2));
		
		String name1 = "Sean", name2 = "Sean";
		System.out.println("Using name1===name2 returns " + (name1==name2));
		System.out.println("Using equals() returns " + name1.equals(name2));
		
		String name3 ="John", name4 = new String("John");
		System.out.println("Using name3===name4 returns " + (name3==name4));
		System.out.println("Using equals() returns " + name3.equals(name4));
		
	}
	public static boolean admitToFilm(int certification, int age) {
		return (age >= certification) ? true : false;
	}
	public static void ternaryOperator() {
		boolean isHappy = true;
		String mood = (isHappy = true) ? "I am happy!" : "I am not happy!";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int x = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int y = sc.nextInt();
		int minVal = x < y ? x : y;
		System.out.println("The minimum value is "+minVal);
	}
	public static void switchVowelOrConsonant() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter");
		char letter = sc.next().charAt(0);
		switch (letter) {
	        default:
	            System.out.println(letter + " is a consonant");
	            break;
	        case 65: case 69: case 73: case 79: case 85: case 'a': case 'e': case 'i': case 'o': case 'u': 
	        	System.out.println(letter + " is a vowel");
	            break;
		}

	}
	public static void ifMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month from 1 to 12");
		final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUN = 6, JUL = 7, AUG = 8, SEP = 9, OCT = 10, NOV = 11, DEC = 12;
		try {
			int month = sc.nextInt();
			if (month==JAN) {
				System.out.println("January");
			} else if (month == FEB) {
				System.out.println("February");
			}  else if (month == MAR) {
				System.out.println("March");
			} else if (month == APR) {
				System.out.println("April");
			} else if (month == MAY) {
				System.out.println("May");
			} else if (month == JUN) {
				System.out.println("June");
			} else if (month == JUL) {
				System.out.println("July");
			} else if (month == AUG) {
				System.out.println("August");
			} else if (month == SEP) {
				System.out.println("September");
			} else if (month == OCT) {
				System.out.println("October");
			} else if (month == NOV) {
				System.out.println("November");
			} else if (month == DEC) {
				System.out.println("December");
			} else {
				System.out.println(month+" is out of range");
			}
		} catch(InputMismatchException err) {
			System.out.println("Exception caught!");
			err.printStackTrace();
		}
	}
	public static void ifGrade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		try {
			int marks = sc.nextInt();
			if(marks > 100) {
				System.out.println("Out of range");
			} else if(marks >= 70 && marks <= 100) {
				System.out.println("A");
			} else if(marks >= 60 && marks <= 69) {
				System.out.println("B");
			} else if(marks >= 50 && marks <= 59) {
				System.out.println("C");
			} else if(marks >= 40 && marks <= 49) {
				System.out.println("D");
			} else {
				System.out.println("Fail");
			}
		} catch(InputMismatchException err) {
			System.out.println("Exception caught!");
			err.printStackTrace();
		}
	}
	public static void switchMathOperation() {
		Scanner sc = new Scanner(System.in);
		double answer = 0.0;
		boolean charOK = true;
		System.out.println("Enter the first double number");
		double num1 = sc.nextDouble();
		System.out.println("Enter the second double number");
		double num2 = sc.nextDouble();
		System.out.println("Enter the operation");
		char operation = sc.next().charAt(0);
		switch(operation) {
			case '+': answer = num1 + num2;
			break;
			case '-': answer = num1 - num2;
			break;
			case '*': answer = num1 * num2;
			break;
			case '/': answer = num1 / num2;
			break;
			default: 
			charOK = false;
			System.out.println("Unknown mathematical operator");

		}
		if (charOK == true) {
			System.out.println(answer);
		} 

	}
	public static void ifTemperature() {
		int temperature = 0;
		final int COLD = 0, MILD = 15, WARM = 20, VERY_WARM = 25, HOT = 30;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature");
		try {
			temperature = sc.nextInt();
			if(temperature <= COLD) {
				System.out.println("Cold");
			} else if (temperature > COLD && temperature < MILD) {
				System.out.println("A little cold but ok");
			} else if (temperature >= MILD && temperature < WARM) {
				System.out.println("Mild");
			} else if (temperature >= WARM && temperature < VERY_WARM) {
				System.out.println("Warm");
			} else if(temperature >= VERY_WARM && temperature < HOT) {
				System.out.println("Hot");
			} else {
				System.out.println("hot");
			}
		} catch(InputMismatchException err) {
			System.out.println("Exception caught!");
			err.printStackTrace();
		}
	}
	public static void switchDaysInMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		try {
			int year = sc.nextInt();
			System.out.println("Enter a month");
			int month = sc.nextInt();
			int numDays = 0;
			final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUN = 6, JUL = 7, AUG = 8, SEP = 9, OCT = 10, NOV = 11, DEC = 12;
			switch(month) {
				case JAN: case MAR: case MAY: case JUL: case AUG: case OCT: case DEC: numDays = 31;
				break;
				case APR: case JUN: case SEP: case NOV: numDays = 30;
				break;
				case FEB: 
					if(year%400 == 0 || (year%4==0 && year%100 != 0)) {
						numDays = 29;
					} else {
						numDays = 28;
					}
				break;
				default: System.out.println("Invalid month");
			}
			System.out.println("Number of days: "+ numDays);
		}  catch(InputMismatchException err) {
			System.out.println("Exception caught!");
			err.printStackTrace();
		}
	}
	public static void main(String args[]) {
		
		compareStrings();
		Scanner sc = new Scanner(System.in);
		System.out.println("What's the certification of the film?");
		int certification = sc.nextInt();
		System.out.println("What's your age?");
		int age = sc.nextInt();
		boolean allowedToSeeFilm = admitToFilm(certification, age);
		if(allowedToSeeFilm) {
			System.out.println("You are allowed to see the film");
		} else {
			System.out.println("You are not allowed to see the film");
		}
	}
}
