public class Fibonacci {
    //A typical recursion of a fibonacci requires the computer to compute two sets of fibonacci numbers (n-1) and (n-2).
    // To avoid the redundancy of computing the same numbers twice, the memorization technique is utilized to reduce the time

    public static void main(String[] args) {
        //Finding the nth Fibonacci number
        int n = 50;

        //initiate the memorization of fibonacci numbers from 0 to nth number
        fibonacciCache = new long[n+1];

        System.out.println(fibonacci(n));
    }

    //This array of long integers stores all fibonacci numbers
    private static long[] fibonacciCache;

    //Recursion
    public static long fibonacci(int n) {
        //Base case
        if (n <= 1) {
            return n;
        }

        //Updating the nth Fibonacci number if it hasn't been updated
        if (fibonacciCache[n] == 0) {             //primitive type can't be null, can only be zeros
            fibonacciCache[n] = fibonacci(n-1)+ fibonacci(n-2);
        }

        // Each recursion will return the nth integer from the memorization. Therefore, each nth number only has to be calculated once.
        return (fibonacciCache[n]);
    }
}
