public class PracticeProblem {
	//Create a method called pluralize() that takes in a String as a paramter. do the following:
	//If the word ends in "y", return "ies"
	//If the word ends in "ey", return "eys"
	//If the word ends in "ife", return "ives"
	//If none of the above are true, return "s"	
	//Accept any casing.
	public static String pluralize(String word) {
		word = word.toLowerCase();
		if (word.endsWith("ey")) 	{
			return "eys";
		} else if (word.endsWith("y")) {
			return "ies";
		} else if (word.endsWith("ife")) {
			return "ives";
		} else {
			return "s";
		}
	}

	//Create a method called min() that takes in 3 integers. Return the smallest of the three integers.
	public static int min(int num1, int num2, int num3) {
		return Math.min(Math.min(num1, num2),num3);
	}
	
	//Create a method called isLeapYear() that takes in an integer as a parameter. Check if the year is a leap year. To figure out if it is a leap year follow the following steps.
	
	 //1. If the year is evenly divisible by 4 go to step 2. else go to step 4.
	 //2. If the year is evenly divisible by 100 go to step 3. else go to step 5.
	 //3. If the year is evenly divisible by 400 go to step 5. else go to step 4.
	 //4. Not a leap year.
	 //5. Is a leap year.
	//Return true if the year is a leap year, false if it is not.
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
		
				} else {
					return false;
				}
			} else {
				return true;
			}
		
		} else {
			return false;
		}
		

		
	}
	

}
