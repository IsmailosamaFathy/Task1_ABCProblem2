package isprime;

/*
 * This class has only one method 
 * Code is executed as it was asked When testing whether an integer is prime, it is sufficient to try and divide by integers up to
the square root of the number being tested.
 */

public class Taskc 
{
	
	public void Check_Prime_using_Sqrt_mth() 
	{
		/*
		 * This variable of type integer it checks prime till number 50 Note that this
		 * value "50" is fixed while checking if the code doing write functionality or
		 * not
		 */
	    int n=50;
		
	    System.out.println("Sqrt mth");
	    
	    // This variable of type boolean  will store return of private function check_Prime
	    
	    boolean ret_flag;
	    
	    for(int i=2;i<=n;i++) 
	    {
	    	// if return is true  then it is prime number  & it will print
	    	ret_flag=check_Prime(i);
	    	
	    	if(ret_flag==true) 
	    	{
	    		System.out.println(i);
	    	}
	    	
	    }
        System.out.println("========================");
        
	}
	private boolean check_Prime(int x) 
	{
		// local variable to that will store return value assumed first it is not prime number
		boolean flag=false;
	   // Checking special case as in my solution I start iterating from 2 so 1 will not be includes
		if(x == 1) {
           
            flag=false;
            return flag;
        }
       /*
        * if the square of i is less than number it will be checked
        * if it is bigger it is not logical to be checked
        * If number of x divisible by i then it is not prime & function return false to  save time complexity
        * If it is prime it will wait until number passes all acceptable number     
        */
        for(int i=2;i*i<=x;i++) {
            if(x % i == 0) {
            	flag=false;
                return flag;
            }
        }
        flag=true;
		return flag;
	}

}
