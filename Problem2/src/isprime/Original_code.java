package isprime;

// Original code  

public class Original_code 
{
	/*
	 * This  variable of type integer it checks prime till number 50 & private to protect attribute  
	 * Note that this value "50" is fixed while checking if the code doing write functionality or not  
	 */
	private int nValues = 50;
	// This a setter function to 
	void Set_max_value(int x) 
	{
		nValues=x;
	}
	public void Code1() 
	{
	boolean isPrime = true;
	System.out.println("Original Code :");
	for(int i = 2; i <= nValues; i++)
	{
	isPrime = true;
	for (int j = 2; j < i; j++)
	{
	if (i % j == 0)
	{
	isPrime = false;
	break;
	}
	}
	if (isPrime)
	System.out.println(i);
	}
	System.out.println("==============================================");
	}
}
