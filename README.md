# Task1_ABCProblem2
# Name : ismail Osama Fathy Ali Elsayed
# Matriculation number : 7219301
# IDE:Eclipese
# This Home task 1 problem 2 it says to find Prime numbers in three diffrent ways

Description :
1- At first I created 5 different classes :

a-All classes has setter method name "Set_max_value" .This method just catches initial Maximum value entered by user .

b- class named "Original_code" which contain code example ,I used as reference to observe output displayed 

c-Class named "TaskA" this class has the solution of required "a" . In the method named "With_Contiue ()"I replaced break "keyword" with continue with label name OuterLoop .to get out from inner & go to outer loop if the number is not prime number . If not the inner loop finishes & the number is printed 

d- -Class named "TaskB" this class has the solution of what is required "b".In the method "Get_prime_Number_Func" I created Variable of type integer to count if 

the number is not prime one then value will not be zero . So , I have to loops (inner one & outer one ) , in the inner one I check if the number is prime , if it 

is not the counter will incremnt . After inner finishes its loop code get out of it & check if the counter is zero , if so then it is  prime number & is printed 

.Finally, after the outrer loop finishes it I print dash line to seperate output that is displayed & return from function.  

e-Class named "TaskC"this class has the solution of what is required "c".In th method name"Check_Prime_using_Sqrt_mth", I am using this private function that has 

return type is boolean & take integer value .  It is used to increase readability & maintainability ,Also I created boolean variable to get return of function .If 

the return is true then it is prime number . This function has local variable to that will store return value assumed first it is not prime number . At first  

Checking special case as in my solution I start iterating from 2 so 1 will not be includes. Then , if the square of i is less than number it will be checked

if it is bigger it is not logical to be checked .If number of x divisible by i then it is not prime & function return false to  save time complexity.

If it is prime it will wait until number passes all acceptable number .Finally after checking in for loop , if it prime number it returns true .   



