package isprime;

public class Original_code 
{
	public void Code1() 
	{
	int nValues = 50;
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
