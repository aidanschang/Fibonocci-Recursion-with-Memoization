import java.util.*;

public class Fibonacci {
    //A typical recursion of a fibonacci requires the computer to compute two sets of fibonacci numbers (n-1) and (n-2).
    // To avoid the redundancy of computing the same numbers twice, the memorization technique is utilized to reduce the time

    public static void main(String[] args) {
        //Finding the nth Fibonacci number

        for (int n=25; n<44; n++) {
            Random r = new Random(System.currentTimeMillis());

            //initiate the memorization of fibonacci numbers from 0 to nth number
            fibonacciCache = new long[n + 1];

//            **Fibonacci Recursion with Memorization**
            long FibonacciRecursionMemoStart = System.currentTimeMillis();
            //System.out.println(FibonacciWithMemo(n));
            FibonacciWithMemo(n);
            long FibonacciRecursionMemoEnd = System.currentTimeMillis();
            long RecursionMemoTimeSpent = FibonacciRecursionMemoEnd - FibonacciRecursionMemoStart;
            System.out.println("Recursion with Memorization Time Used at " + n + ": " + RecursionMemoTimeSpent + " milliseconds");

//            **Fibonacci Recursion without Memorization**
            long FibonacciRecursionStart = System.currentTimeMillis();
            //System.out.println(FibonacciRecursion(n));
            FibonacciRecursion(n);
            long FibonacciRecursionEnd = System.currentTimeMillis();
            long FibonacciRecursionTimeSpent = FibonacciRecursionEnd - FibonacciRecursionStart;
            System.out.println("Recursion without Memorization Time Used at " + n + ": " + FibonacciRecursionTimeSpent + " milliseconds" + "\n");

            r.setSeed(System.currentTimeMillis()); //Resetting currentTime
        }


    }

    //This array of long integers stores all fibonacci numbers
    private static long[] fibonacciCache;

//    **Recursion with Memorization**
    public static long FibonacciWithMemo(int n) {
        //Base case when n reaches down to 1
        if (n <= 1) {
            return n;
        }

        //Updating the nth Fibonacci number if it hasn't been updated
        if (fibonacciCache[n] == 0) {             //primitive type can't be null, can only be zeros
            fibonacciCache[n] = FibonacciWithMemo(n - 1) + FibonacciWithMemo(n - 2);
        }

        // Each recursion will return the nth integer from the memorization. Therefore, each nth number only has to be calculated once.
        return (fibonacciCache[n]);
    }

//    **Recursion without Memorization**
    public static long FibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return (FibonacciRecursion(n-1)+ FibonacciRecursion(n-2));
    }
}