package Week04Project;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Week04Project{
	
	public static void main (String [] args) {
		
		// 1. Create an array of int called ages
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//a. Subtract the value of the first element from the last element without using [7]
		/* I assigned the elements value to new integers and continued to do the subtraction with the 
		 * new integer values.
		 */
		int subtract = ages[ages.length-1];
		int subtract2 = ages[0];
		int result = subtract - subtract2;
		//System.out.println(result);
		System.out.println("next");
		
		//b. Create a new array with 9 elements, repeat the step above;
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 13};
		int sub = ages2[ages2.length-1];
		int sub2 = ages2[0];
		int result2 = sub - sub2;
		//System.out.println(result2);
		System.out.println("next");
		
		//c. Use a loop to iterate through the array and calculate the average age.
		/* I created a new integer to put the array's length value into it
		 * Then since in order to find the average we need the sum of all elements in the array
		 * I created another integer to store the sum value to it.
		 * Used the for loop to find the sum, then used a double in case there were decimals 
		 * to divide the sum with the length of the array. 
		 */
		int sum = 0;
		int length = ages.length;
		for(int i = 0; i < ages.length; i++) {
			sum += ages[i];
		} 
		double average = sum / length;
		//System.out.println(average);
		System.out.println("next"); 
		
		// 2. Create an array of String
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a. Use a loop to iterate through the array and calculate the average number of letters per name.
		/*I'm using the variable sum2 to store the sum of characters
		 * Using the for loop to get the sum result
		 * Then divide the sum with the length to get the average. 
		 */
		int sum2 = 0;
		for(int i = 0; i < names.length; i++) {
			sum2 += names.length;
		}
		int nameAverage = sum2 / names.length;
		//System.out.println(nameAverage);
		System.out.println("next");
		
		//b. Use a loop to iterate through the array again and concatenate all the names together.
		/*I used a String Builder to append each element in my array
		 * then I stored it as a string in order to use the toString method
		 * 
		 */
		StringBuilder ab = new StringBuilder();
		ab.append(names[0]);
		for (int i = 0; i < names.length; i++) {
			ab.append(" " + names[i]);
		} 
		String a = ab.toString();
		//System.out.println(a);
		System.out.println("next");
		
		
		//3. How do you access the last element of any array?
		/*I can access it by typing "arrayName.length-1"
		 * 
		 */
		
		//4. How do you access the first element of any array?
		/*You can access it by reaching for the index ex: arrayName[i] or arrayName[0]
		 * 
		 */
		//5. Create a new array of int called nameLengths. 
		int[] nameLengths = new int [names.length];
		//Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		/*used a loop in order to get the length of the names out of the string and store it to the int
		 * 
		 */
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		} System.out.println("next");
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the 
		//elements in the array. Print the result to the console.
		/*Created a int to store the value of the letters sum 
		 * created a for loop to find the sum 
		 */
		int letterSum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			letterSum += nameLengths[i];
		}
		//System.out.println(letterSum);
		System.out.println("next");
	


		//7. Write a method that takes a String, word, and an int, n, as arguments and returns 
		//the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	    /*I stored the values of "food" and 4 on a string and int 
	     * used the .repeat method.
	     * 
	     */
		String word = "food";
	    int n = 4;
		System.out.println(word.repeat(n));
	    System.out.println("next");
	    //8. Write a method that takes two Strings, firstName and lastName, 
	    //and returns a full name (the full name should be the first and the last name as a String separated by a space).
	    String firstName = "Tom";
	    String lastName = "Lopez";
	    
	    System.out.println(firstName + " " + lastName);
	    System.out.println("next");
	    
	    //9. Write a method that takes an array of int and returns true if the sum of all the 
	    //ints in the array is greater than 100.
	    int[] question = {45, 30, 25}; 

	    //10. Write a method that takes an array of double and returns the average of all the 
	    //elements in the array.
	    double[] numberss = {55.5, 71.9, 45.9, 50.1};
	    System.out.println("next");
	    

	    //11. Write a method that takes two arrays of double and returns true if the average of the elements in 
	    //the first array is greater than the average of the elements in the second array.
	    double[] abc = {5.5, 10.9, 20.9};
	    double[] cde = {20.5, 10.3};
	    System.out.println("next");

	    //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	    //and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

	    //13. Create a method of your own that solves a problem. In comments, write what the 
	    //method does and why you created it
	    /*Write a method that returns the average of a double array
	     * The method returns the average of the number inside the double array 
	     * 
	     */





	}
	

	//8. public static 
	/*I created a static string and inside my 2 string values 
	 * returned them added up with a space between them
	 */
	public static String names(String first, String last) {
		return first + " " + last;
	}
	
	//Method 9:
	/*i created a variable to catch the sum from the array
	 * then used a for loop to iterate through it
	 */
	public static boolean nine(int[] array) {
		int sum = 0;
		for (int i =0; i > array.length; i++) {
		}
		return sum > 100;
	}

	//Method 10:
	/*I created an array of doubles on my main class called numberss
	 * in here i created a for loop to get the average from the array and 
	 * return it to the main class.
	 */
	public static double average1(double[] array) {
		double sum3 = 0;
		for(double number : array) {
			sum3 += number;
		}
		return sum3 / array.length;
	}
	//Method 11:
	/*I tried to access the average of each array and return the statement if the 
	 * average of array1 is greater than array2 return true.
	 * 
	 */
	public static boolean average2(double[] array1, double[] array2) {
		double sum4 = 0;
		for (double num: array1) {
			sum4 += num;
		} double sum5 = 0;
		for (double num2: array2) {
			sum5 += num2;
		if (array1.length > array2.length) {
			return true;
		}
		else {
			return false;
		}
		}
	}
	//Method 12:
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket ) {
		isHotOutside && moneyInPocket > 10.50;
			return true;
		
	}
	//Method 13:
		public static double average(double[] array) {
			double abc =0;
			for (double number : array) {
				abc += number;
						
			}
			return abc / array.length;
		}
	

		
}

	

				
		
	








	



