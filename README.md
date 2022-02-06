# Fibonocci-Recursion-with-Memorization

## Overview
This project demonstrated the time complexity of Fibonacci Recursion algorithm and how memorization technique can implemented and reduce the time complexity from O(2^n) down to O(n).
![Screen Shot 2022-02-05 at 4 50 35 PM](https://user-images.githubusercontent.com/84875731/152663996-5de0f160-b7e9-46ce-9a5a-b5cc729d35d2.png)


## Theory
With traditional recursive algorithm of Fibonacci, the method is recursively called by adding nth number minus one and nth number minus two. Results a complete binary tree with nth level. Therefore, the time complexity of a traditional recursion would be O(2^n).

<img width="548" alt="Screen Shot 2022-02-05 at 4 09 24 PM" src="https://user-images.githubusercontent.com/84875731/152663202-32fe54dd-df33-4c85-aa32-cc2272bdf6bd.png">
    
If we take a look at the complete binary tree of Fibonacci Recursion, we will notice that all the left recursion method in each level calculates the nth Fibonacci number all the way to 1. For example, Fibonacci(n), Fibonacci(n-1), Fibonacci(n-2), Fibonacci(n-3), ........Fibonacci(1).

![Screen Shot 2022-02-05 at 4 43 04 PM](https://user-images.githubusercontent.com/84875731/152663837-dd9e8197-d752-464e-a7cf-45a39efe85b7.png)

Since the computer will calculate the first(left) recursive method in each level first, we can save the Fibonacci numbers into an array, then reuse the numbers instead of recalculated that same number again. Which means, each Fibonacci number only has to be calculated once and so the time complexity is O(n).


## Conclusion
By using memorization, the time complexity went from the worst O(2^n) to the best possible outcome O(n). 

![Screen Shot 2022-02-05 at 4 57 05 PM](https://user-images.githubusercontent.com/84875731/152664103-908e29e2-132e-4b10-baa4-57955f772770.png)

