# Fibonocci-Recursion-with-Memoization

## Overview
This project demonstrated the time complexity of Fibonacci Recursion algorithm and how memoization technique can implemented and reduce the time complexity from O(2^n) down to O(n).
![Screen Shot 2022-02-05 at 4 50 35 PM](https://user-images.githubusercontent.com/84875731/152663996-5de0f160-b7e9-46ce-9a5a-b5cc729d35d2.png)


## Theory
### Traditional Recursion
With traditional recursive algorithm of Fibonacci, the method is recursively called by adding (Fib n-1)and (Fib n-2), resulting a complete binary tree with n levels. Therefore, the time complexity of a traditional recursion would be O(2^n).

<img width="548" alt="Screen Shot 2022-02-05 at 4 09 24 PM" src="https://user-images.githubusercontent.com/84875731/152663202-32fe54dd-df33-4c85-aa32-cc2272bdf6bd.png">
    
### Memoization
If we take a step back and look at the Fibonacci binary tree, the recursion follows in-order tree traveral(left, root, right), which means that by saving the return values of the left children, the right children will always already be calculated except the very first right child a binary tree will accessed which is going to be the base case. That means, each Fibonacci number only has to be calculated once and so the time complexity is O(n).

![Screen Shot 2022-02-05 at 4 43 04 PM](https://user-images.githubusercontent.com/84875731/152663837-dd9e8197-d752-464e-a7cf-45a39efe85b7.png)

For example, if we assume n =3, when the recursion mehod colored in green reaches the base case, it returns 1 to previous function yellow. Then it calculates red, which returns 1 as well. Since we have the 0th and 1st Fibonacci numbers calculated and saved in an array, when the reucursion moves to purple(Fib n-2), we can see that it is the same value as (Fib 1) which is already saved in the array. Therefore, we can simply pull the answer instead recalculating the recursions of the purple, and this is the reason why that with memoization technique, every number only has to be calculated once.

![image](https://user-images.githubusercontent.com/84875731/152707917-d3eacfa2-d3f7-4e58-8efc-c15c9afc9354.png)


## Conclusion
By using memoization, the time complexity went from the worst O(2^n) to the best possible outcome O(n). 

![Screen Shot 2022-02-05 at 4 57 05 PM](https://user-images.githubusercontent.com/84875731/152664103-908e29e2-132e-4b10-baa4-57955f772770.png)

