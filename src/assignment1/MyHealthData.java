/*
 * Student name: Joseph Garwood
 * Student number: 041085246
 * Date: February 2 2024
 * Professor: Sandra Iroakazi
 */

package assignment1;

/**
 * This class represents a system that maintains important health information about a patient.
 * This MyHealthData class extends the MyHealthDataBase superclass, in order to use the calculateBMI() method.
 */
public class MyHealthData extends MyHealthDataBase
{

	/**
	 * Declare and initialize the variables used in this class.
	 * The variables declared here will be used as parameters in the MyHealthData object,
	 * or will be used in the various get/set methods throughout the class.
	 */
	
	/**
	 * the first name of the patient.
	 */
    private String firstName = "";
    
    /**
     * the last name of the patient.
     */
    private String lastName = "";
    
    /**
     * the gender of the patient.
     */
    private String gender = "";
    
    /**
     * the year the patient was born.
     */
    private int birthYear = 0;
    
    /**
     * the current year.
     */
    private int currentYear = 0;
    
    /**
     * the height of the patient.
     */
    private double height = 0.0;
    
    /**
     * the weight of the patient.
     */
    private double weight = 0.0;
    
    /**
     * the age of the patient.
     */
    private int age = 0;
    
    /**
     * the maximum heart rate of the patient.
     */
    private int maxHeartRate =0;
    
    /**
     * the minimum target heart rate of the patient.
     */
    private double minTargetRate = 0.0;
    
    /**
     * the maximum target heart rate of the patient.
     */
    private double maxTargetRate = 0.0;
    

    /**
     * This constructor creates a 'MyHealthData' object with the provided parameters.
     * @param firstName - this will hold a String value of the patients first name.
	 * @param lastName - this will hold a String value of the patients last name.
	 * @param gender - this will hold a String value of the patients gender.
	 * @param height - this will hold a double value of the patients height.
	 * @param weight - this will hold a double value of the patients weight.
	 * @param birthYear - this will hold an integer value of the year the patient was born.
	 * @param currentYear  - this will hold an integer value of the year the current year.
     * 
     * This constructor allows the storage of a patients information, in the form of the listed parameters.
     * This will allow the creation of a report specific to a patient.
     */ 
    public MyHealthData(String firstName, String lastName, String gender, double height, double weight, int birthYear, int currentYear){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.height=height;
        this.weight=weight;
        this.birthYear=birthYear;
        this.currentYear=currentYear;
    }


    //Listed below are all the get/set methods used throughout the program.

    /**
     * This method is used to store a string value as the firstName variable.
     * This will be used in the test class, where a user will enter a String as a first name and it will be stored.
     * 
     * @param firstName - the first name of the patient.
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * This method returns the current stored value of the firstName String variable.
     * @return firstName - the first name of the patient.
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * This method is used to store a string value as the lastName variable.
     * This will be used in the test class, where a user will enter a String as a last name and it will be stored.
     * 
     * @param lastName - the last name of the patient.
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * This method returns the current stored value of the lastName String variable.
     * @return lastName - the last name of the patient.
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * This method is used to store a string value as the gender variable.
     * 
     * @param gender - the gender of the patient.
     */
    public void setGender(String gender){
        this.gender = gender;
    }

    /**
     * This method returns the current stores value of the gender String variable.
     * @return gender - the gender of the patient.
     */
    public String getGender(){
        return gender;
    }

    /**
     * This method is used to store an integer value as the birthYear variable.
     * 
     * @param birthYear - the year the patient was born.
     */
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    /**
     *  This method returns the current stored value of the birthYear integer variable.
     * @return birthYear - the year the patient was born.
     */
    public int getBirthYear(){
        return birthYear;
    }

    /**
     * This method is used to store an integer value as the currentYear variable.
     * 
     * @param currentYear - the current year.
     */
    public void setCurrentYear(int currentYear){
        this.currentYear = currentYear;
    }

    /**
     * This method returns the current stored value of the currentYear integer variable.
     * @return currentYear - the current year.
     */
    public int getCurrentYear(){
        return currentYear;
    }

    /**
     * This method is used to store a double value as the height variable.
     * 
     * @param height - the height of the patient.
     */
    public void setHeight(double height){
        this.height = height;
    }

    /**
     * this method returns the current stored value of the height double variable.
     * @return height - the height of the patient.
     */
    public double getHeight(){
        return height;
    }

    /**
     * This method is used to store a double value as the weight variable.
     * 
     * @param weight - the weight of the patient.
     */
    public void setWeight(double weight){
        this.weight=weight;
    }

    /**
     * This method returns the current stored value of the weight double variable.
     *  
     * @return weight - the weight of the patient.
     */
    public double getWeight(){
        return weight;
    }

    /**
     * This method is used to find the patients age.
     * This is done by subtracting the year the patient was born, from the current year.
     * This is done by using the getCurrentYear() and getBirthYear() methods.
     * 
     * This is done to complete the different methods for patients heart rates later, 
     * using the patients age in the methods equations.
     * 
     * @return age - the patients current age stored in an integer variable.
     */
    public int getAge(){
        age = (getCurrentYear() - getBirthYear());
        return age;
    }
    
    /**
     * This method calculates the patients maximum heart rate.
     * This is done by using the equation [maxHeartRate = (220 - age)], 
     * subtracting the patients age (using getAge() method) from the constant 220.
     * 
     * @return maxHeartRate - the patients maximum heart rate, stored as an integer variable.
     */
    public int getMaxHeartRate(){
        maxHeartRate = (220 - getAge());
        return maxHeartRate;
    }

    /**
     * this method calculates the patients minimum target heart rate.
     * this is done by using the equation [minimum target heart rate = maxHeartRate / 2],
     * dividing the current patients maximum heart rate, stored as double maxHeartRate, by 2.
     * 
     * @return minTargetRate - the patients minimum target heart rate, stored as a double variable.
     */
    public double getMinTargetRate(){
        minTargetRate = (getMaxHeartRate() / 2);
        return minTargetRate;
    }

    /**
     * This method calculates the patients maximum target heart rate.
     * This is done by using the equation [maximum target heart rate = (maxHeartRate * 0.85)],
     * multiplying the current patients maximum heart rate, stored as double maxHeartRate, by 0.85.
     * 
     * @return maxTargetRate - the patients maximum target heart rate, stored as an integer variable.
     */
    public double getMaxTargetRate(){
        maxTargetRate = (getMaxHeartRate() * 0.85);
        return maxTargetRate;
    }


    /**
     * This method is used to create a final report of the patients information. 
     * The method will use all of the get/set methods within the program to retrieve stored values of a patient
     * and will display the values into the console.
     */
    public void displayMyHealthData(){ 
    
    System.out.printf("Name: %s %s\n", getFirstName(), getLastName());
    System.out.printf("Gender: %s\n", getGender() );
    System.out.printf("Height: %.2f inches \n", getHeight() );
    System.out.printf("Weight: %.2f pounds \n", getWeight() );
    System.out.printf("Birth Year: %d\n" , getBirthYear() );
    System.out.printf("Current Year: %d\n", getCurrentYear() );
    System.out.printf("Age: %d\n", getAge() );
    System.out.printf("Maximum Heart Rate: %d\n" , getMaxHeartRate() );
    System.out.printf("Maximum Target Heart Rate: %.2f\n" , getMaxTargetRate() );
    System.out.printf("Minumum Target Heart Rate: %.2f\n", getMinTargetRate() );
    
    /**
     * Use calculateBMI() method, inherited from MyHealthDataBase superclass with parameters weight and height 
     * to find the patients BMI and print it to console.
     * 
     * @param height - the height of the patient.
     * @param weight - the weight of the patient.
     * @return the BMI of the patient.
     */
    System.out.printf("BMI: %.2f\n" , calculateBMI(weight, height));

    //You do not need to modify this piece of code, it is fine as it is.

       System.out.println("BMI VALUES");
       System.out.println("Underweight: less than 18.5");
       System.out.println("Normal:      between 18.5 and 24.9");
       System.out.println("Overweight:  between 25 and 29.9");
       System.out.println("Obese:       30 or greater");   
    } 

} // end class MyHealthData