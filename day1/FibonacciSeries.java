package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
        int range = 8, a = 0, b = 1;
        System.out.println("fibanocci series is:"+range);
        for (int i = 1; i <= range; i++)
        {
        	System.out.print(a+" ");
            int sumOfIntegers = a + b;
            a = b;
            b = sumOfIntegers;
           
        }
    }
}
