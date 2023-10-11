package isprime;

/*
 * This class has only one method 
 * Code is executed as it was asked in the task without break key word
 */

public class TaskA 
{
	
	public void With_Contiue () 
	{
		 System.out.println("Prime numbers with continue instead of break");
		/*
		 * This  variable of type integer it checks prime till number 50  
		 * Note that this value "50" is fixed while checking if the code doing write functionality or not  
		 */
		 int nValues = 50;
		 
	    OuterLoop: for (int i = 2; i <= nValues; i++) {
	      //Nested for loop to check number is prime or not
	    	for (int j = 2; j < i; j++) {
	    	  /* 
	    	   * Checking number is prime or not if so the code will get out inner loop  
	    	   * Go to outer loop  & print the number
	    	   * It then continue to the next number 
	    	   */
	        if (i % j == 0) {
	          continue OuterLoop;
	        }
	      }
	      System.out.println(i);
	    }
	    System.out.println("==============================================");
	}

}
