package isprime;

/*
 * This class has only one method 
 * Code is executed as it was asked in the task without break key word
 */

public class TaskA 
{
	/*
	 * This  variable of type integer it checks prime till number 50 & private to protect attribute  
	 * Note that this value "50" is fixed while checking if the code doing write functionality or not  
	 */
	private int nValues = 50;
	
	void Set_max_value(int x) 
	{
		nValues=x;
	}
	public void With_Contiue () 
	{
		 System.out.println("Prime numbers with continue instead of break");

		 
		 
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
