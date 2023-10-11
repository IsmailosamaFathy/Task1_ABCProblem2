package isprime;

/*
 * This class has only one method 
 * Code is executed as it was asked does not require the isPrime variable
 */

public class TaskB {

	public void Get_prime_Number_Func() {

		System.out.println("Get prime number without using flag");
		/*
		 * This variable of type integer it checks prime till number 50 Note that this
		 * value "50" is fixed while checking if the code doing write functionality or
		 * not
		 */
		int num = 50;
		/*
		 * This variable is used to check if the number is prime by counting the number
		 * if it is divisible If it is "0" then it is prime In every out loop will be
		 * initiated with zero in order to check every number independtly
		 */
		int count;

		for (int i = 2; i <= num; i++) {
			count = 0;
			/*
			 * The condition in the inner loop is that j<=i/2 in order less time complexity
			 * Also, we assume count value if prime number to be zero
			 */
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
// If count = 0 then number is prime
			if (count == 0) {
				System.out.println(i);
			}
		}

		System.out.println("==============================================");
	}
}
