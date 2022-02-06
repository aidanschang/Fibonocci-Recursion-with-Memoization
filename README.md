# Fibonocci-Recursion-with-Memorization

## Overview
This project demonstrated the time complexity of Fibonacci Recursion algorithm and how memorization technique can implemented and reduce the time complexity from O(2^n) down to O(n).
![Screen Shot 2022-02-05 at 3 56 20 PM](https://user-images.githubusercontent.com/84875731/152662995-700fef75-6ca0-4dc2-bb36-8fcffa03717b.png)
## Theory
With traditional recursive algorithm of Fibonacci, the method is recursively called by adding nth number minus one and nth number minus two. Results a complete binary tree with nth level. Therefore, the time complexity of a traditional recursion would be O(2^n).

<img width="548" alt="Screen Shot 2022-02-05 at 4 09 24 PM" src="https://user-images.githubusercontent.com/84875731/152663202-32fe54dd-df33-4c85-aa32-cc2272bdf6bd.png">
    
If we take a look at the complete binary tree of Fibonacci Recursion, we will notice that all the left recursion method in each level calculates the nth Fibonacci number all the way to 1. For example, Fibonacci(n), Fibonacci(n-1), Fibonacci(n-2), Fibonacci(n-3), ........Fibonacci(1).

                           Fib(n)
                  /                     \
          Fib(n-1)                      Fib(n-2)
         /        \                     /       \
Fib((n-1)-1)    Fib((n-1)-2)   Fib((n-2)-1)     Fib(n-2)-2)



Further, we know that the computer will calculate the first(left) recursive method in each level first, which means that by archiving the Fibonacci numbers that the computer already calculated, it can be pulled
