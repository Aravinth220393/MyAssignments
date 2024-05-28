package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		 int n = 97;
		    int isPrime = 0;
		    for (int i = 1;i <= n / 2; i++) {
		      if (n % i == 0) {
		        isPrime++;
		      }
		    }
		    if (isPrime > 1) {
		        System.out.println("the given number is not prime number");
		    }
		    else {
		      System.out.println("The given number is prime number");
		    }
		  }

}
