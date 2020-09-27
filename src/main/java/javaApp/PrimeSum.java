package javaApp;

public class PrimeSum {

    public static void main(String[] args) {
        System.out.println(primesum(20));
    }

    static long primesum(int maxNum) {
        int sum = 0, num;
        //insert your code here
        if(maxNum<=0)
        {
        	return sum;
        }
        for(int number = 1; number <= maxNum; number++)
        {
        	boolean isPrime = checkPrime(number); 
            if (isPrime) { 
      
                // Sum the prime number 
                sum = sum + number; 
            } 
        }
        

        return sum;
    }
    static boolean checkPrime(int numberToCheck) 
    { 
        if(numberToCheck == 1) { 
            return false; 
        } 
        for (int i = 2; i*i <= numberToCheck; i++) { 
            if (numberToCheck % i == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 
} 