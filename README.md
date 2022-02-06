# Fibonocci-Recursion-with-Memorization

## Overview
This project demonstrated the time complexity of Fibonacci Recursion algorithm and how memorization technique can implemented and reduce the time complexity from O(2^n) down to O(n).
![Screen Shot 2022-02-05 at 3 56 20 PM](https://user-images.githubusercontent.com/84875731/152662995-700fef75-6ca0-4dc2-bb36-8fcffa03717b.png)
## Theory
With traditional recursive algorithm of Fibonacci, the method is recursively called by adding nth number minus one and nth number minus two. Results a complete binary tree with nth level. Therefore, the time complexity of a traditional recursion would be O(2^n).

public static long FibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return (FibonacciRecursion(n-1)+ FibonacciRecursion(n-2));
    }
    
If we take a look at the complete binary tree, we will notice that each of the left method is 
