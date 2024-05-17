/*
 * Student name: Joseph Garwood
 * Student number: 041085246
 * Date: February 2 2024
 * Professor: Sandra Iroakazi
 */
package assignment1TEST;

import assignment1.MyHealthData;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This class is used to test the functionality of the getBMI() method from MyHealthData class.
 * This is done by using JUnit, and providing one test case that should fail, and one that should pass.
 * 
 * @author Joseph Garwood
 */
public class MyHealthDataTest2 {
	
	
	/**
	 * create constant double variable DELTA. This will be used as an allowable margin of error
	 * when comparing expected test results and actual test results.
	 * 
	 * a tolerance of 0.005 is allowable for these calculations in my program.
	 */
	final double DELTA = 0.005;
	
	/**
	 * this method is intentionally left blank, because there is no 
	 * set-up required at the class level for the methods tested.
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	/**
	 * this method is intentionally left blank, because there is no 
	 * set-up required for the methods tested.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}
	
	/**
	 * This test should pass.
	 */
	@Test // 1
	public void testBMIPass() {
		
		/**
		 * set the weight of the patient to 70 (pounds)
		 */
		double height = 70;
		
		/**
		 * set the height of the patient to 70 (pounds)
		 */
		double weight = 140;
		
		/**
		 * Initializes a MyHealthData object with pre-determined values.
		 * This MyHealthData object will be used to test the accuracy and functionality of the getBMI() method 
		 * from the MyHealthData class.
		 * 
		 * Pre-determined values were passed through to ensure the accurate testing of the getBMI() method by using calculated
		 * expected outcomes.
		 * 
		 * @param "Joseph" - the first name of the patient
		 * @param "Garwood" - the last name of the patient
		 * @param "Male" - the gender of the patient
		 * @param height - the height of the patient in inches
		 * @param weight - the weight of the patient in pounds
		 * @param 2000 - the year the patient was born
		 * @param 2024 - the current year
		 */
		MyHealthData bmiPass = new MyHealthData("Joseph", "Garwood", "Male", weight, height, 2000, 2024);
		
		/**
		 * the actual BMI value returned from the getBMI() method
		 */
		double actualBMI = bmiPass.calculateBMI(weight,height);
		/**
		 * The expected outcome of the getBMI() method.
		 */
		double expectedBMI = 20.09;
		
		Assert.assertEquals("The calculateBMI() method did not work as intended", expectedBMI, actualBMI, DELTA);
	}
	

	
	/**
	 * This test should fail.
	 */
	@Test // 2
	
	public void testBMIFail() {
		
		/**
		 * set the weight of the patient to 70 (pounds)
		 */
		double height = 70;
		
		/**
		 * set the height of the patient to 70 (pounds)
		 */
		double weight = 200;
		
		/**
		 * Initializes a MyHealthData object with pre-determined values.
		 * This MyHealthData object will be used to test the accuracy and functionality of the getBMI() method 
		 * from the MyHealthData class.
		 * 
		 * Pre-determined values were passed through to ensure the accurate testing of the getBMI() method by using calculated
		 * expected outcomes.
		 * 
		 * The same parameters were used here as in the previous test case, however the weight was changed from 140 to 200.
		 * This should provide a different result from the getBMI() method that when compared to the same actualBMI value from before (20.09)
		 * should guarantee a fail.
		 * 
		 * @param "Joseph" - the first name of the patient
		 * @param "Garwood" - the last name of the patient
		 * @param "Male" - the gender of the patient
		 * @param weight - the height of the patient in inches
		 * @param 200 - the weight of the patient in pounds
		 * @param 2000 - the year the patient was born
		 * @param 2024 - the current year
		 * 
		 */
	
		MyHealthData bmiFail = new MyHealthData("Joseph", "Garwood", "Male", height, weight, 2000, 2024);
		
		/**
		 * the actual BMI value returned from the getBMI() method
		 */
		double actualBMI = bmiFail.calculateBMI(weight,height);
		/**
		 * The expected outcome of the getBMI() method.
		 */
		double expectedBMI = 20.09;
		
		Assert.assertEquals("The calculateBMI() method did not work as intended", expectedBMI, actualBMI, DELTA);
	}
	
	/**
	 * this method is intentionally left blank, because there is no 
	 * tear-down required for the methods tested.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * this method is intentionally left blank, because there is no 
	 * tear-down required at the class level for the methods tested.
	 * 
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
