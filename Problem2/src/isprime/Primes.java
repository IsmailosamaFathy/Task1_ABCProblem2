package isprime;

/*
 * This is the main class 
 * You just need to press run button , there is no input 
 * Out put displayed after execution please compare it with the result of original code
 */

public class Primes {
	public static void main(String[] args) {
		/*
		 * At first we will create object of different classes
		 */
		Original_code obj1 = new Original_code();
		TaskA obj2 = new TaskA();
		TaskB obj3 = new TaskB();
		Taskc obj4 = new Taskc();
		/*
		 * Then we will run each class First we will run the original code which its
		 * result is a reference for me Then I will run the code of requirement "a" Uses
		 * labeled continue instead of break. After that I run the code which is not
		 * using "isprime" flag Finally ,I run my code When testing whether an integer
		 * is prime, it is sufficient to try and divide by integers up to the square
		 * root of the number being tested
		 */
		obj1.Code1();
		obj2.With_Contiue();
		obj3.Get_prime_Number_Func();
		obj4.Check_Prime_using_Sqrt_mth();
	}

}