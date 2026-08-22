# Notes — CJ-015 Prime Number Checker

## Concepts Learned

- Scanner
- for loop
- if / else
- boolean
- Modulus operator
- Divisibility
- break
- Conditional logic

## Key Learning

A prime number is greater than 1 and has no divisor other than 1 and itself.

The modulus operator can be used to check divisibility.

Example:

number % divisor == 0

If this condition is true, the number has a divisor and is not prime.

A boolean variable can store whether a divisor was found.

## Interview Questions & Answers

### 1. What is a prime number?

A prime number is a number greater than 1 that has exactly two factors: 1 and itself.

### 2. Why are 0 and 1 not prime?

Prime numbers must be greater than 1, so 0 and 1 are not prime.

### 3. How can `%` help in checking prime numbers?

If `number % divisor == 0`, the number is completely divisible by that divisor.

### 4. Why do we use `break`?

Once a divisor is found, there is no need to continue checking other divisors, so `break` stops the loop.

### 5. Why is a boolean useful here?

A boolean can store whether a divisor was found or whether the number is still considered prime.

### 6. What happens when the input is 2?

2 is prime because it has no divisor other than 1 and itself.

### 7. Why do we start checking from 2?

Every number is divisible by 1, so checking from 2 avoids an unnecessary check.

### 8. What is the time complexity of this approach?

The loop can check approximately half of the number's values, so the time complexity is O(n).