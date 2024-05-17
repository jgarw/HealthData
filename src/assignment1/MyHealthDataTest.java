/*
 * Student name: Joseph Garwood
 * Student number: 041085246
 * Date: February 2 2024
 * Professor: Sandra Iroakazi
 */
package assignment1;

import java.util.Scanner;

/** 
 * This is the driver class for this program.This class will be used to test the functionality of the MyHealthData class.
 * @author Joseph Garwood 
 * @see MyHealthData
 * 
 */
public class MyHealthDataTest {
	
	/**
	 * Main method where MyHealthData will be tested
	 * 
	 * @param args - default main method parameter. No command line arguments
	 */
	public static void main (String[] args) {
		
		/**
		 * Declare and initialize the variables used in this class.
		 * These variables will be passed through the healthData object as parameters to hold values 
		 * associated to a patient, and test the programs functionality.
		 */
		String firstName = "";
		String lastName = "";
		String gender = "";
		double height = 0.0;
		double weight = 0.0;
		int birthYear = 0;
		int currentYear = 0;
		
		/**
		 * Initializes a Scanner object to take input from the user, 
		 * and store it as variables in a MyHealthData object
		 * 
		 * @param System.in - This parameter will allow the user to enter information, and the program to manipulate
		 * and store it.
		 */
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * Initializes a MyHealthData object with the variables passed through as parameters.
		 *
		 * @param firstName - this will hold a String value of the patients first name.
		 * @param lastName - this will hold a String value of the patients last name.
		 * @param gender - this will hold a String value of the patients gender.
		 * @param height - this will hold a double value of the patients height.
		 * @param weight - this will hold a double value of the patients weight.
		 * @param birthYear - this will hold an integer value of the year the patient was born.
		 * @param currentYear  - this will hold an integer value of the year the current year.
		 */
		MyHealthData healthData = new MyHealthData(firstName, lastName, gender, height, weight, birthYear, currentYear);
		
		/**
		 * This line prompts the user to enter the patients first name.
		 */
		System.out.println("Please enter patient first name:");
		
		/**
		 * This line uses the setFirstName() method from MyHealthData to set the patients first name 
		 * to the String line entered by the user.
		 */
		healthData.setFirstName(scanner.next());
		
		
		/**
		 * This line prompts the user to enter the patients last name.
		 */
		System.out.println("Please enter patient last name:");
	
		/**
		 * This line uses the setLastName() method from MyHealthData to set the patients first name 
		 * to the String line entered by the user.
		 */
		healthData.setLastName(scanner.next());
		
		
		/**
		 * This line prompts the user to enter the patients gender.
		 */
		System.out.println("Please enter patient gender:");
	
		/**
		 * This line uses the setGender() method from MyHealthData to set the patients gender 
		 * to the String line entered by the user.
		 */
		healthData.setGender(scanner.next());
		
		
		/**
		 * This line prompts the user to enter the patients height.
		 */
		System.out.println("Please enter patient height (inches):");
	
		/**
		 * This line uses the setHeight() method from MyHealthData to set the patients first name 
		 * to the Double value entered by the user.
		 */
		healthData.setHeight(scanner.nextDouble());
		
		
		/**
		 * This line prompts the user to enter the patients weight.
		 */
		System.out.println("Please enter patient weight (pounds):");
	
		/**
		 * This line uses the setWeight() method from MyHealthData to set the patients first name 
		 * to the String line entered by the user.
		 */
		healthData.setWeight(scanner.nextDouble());
		
		/**
		 * This line prompts the user to enter the patients birth year.
		 */
		System.out.println("Please enter patient birth year:");
	
		/**
		 * This line uses the setBirthYear() method from MyHealthData to set the patients first name 
		 * to the integer entered by the user.
		 */
		healthData.setBirthYear(scanner.nextInt());
		
		/**
		 * This line prompts the user to enter the current year.
		 */
		System.out.println("Please enter the current year:");
	
		/**
		 * This line uses the setCurrentYear() method from MyHealthData to set the patients first name 
		 * to the integer entered by the user.
		 */
		healthData.setCurrentYear(scanner.nextInt());
		
		
		/**
		 * Display a full report of patient information
		 * including first name, last name, height, weight, age, maximum heart rate, target heart rates, BMI
		 */
		healthData.displayMyHealthData();
		
		/**
		 * This line closes the scanner to prevent errors.
		 */
		scanner.close();
		
	}

}
