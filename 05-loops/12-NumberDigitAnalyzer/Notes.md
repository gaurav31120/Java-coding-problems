# Notes — CJ-012 Number Digit Analyzer

## Concepts Learned

- Scanner
- while / do-while loop
- Digit extraction
- Modulus operator
- Integer division
- Counters
- Accumulators
- Number reversal

## Key Learning

The last digit of a number can be extracted using `% 10`.

Example:

482 % 10 = 2

The last digit can be removed using integer division by 10.

Example:

482 / 10 = 48

The reverse can be built using:

reverse = reverse * 10 + digit

A `do-while` loop is useful when the code must execute at least once, which helps handle the input `0`.

## Interview Questions & Answers

### 1. How do you extract the last digit of a number?

Use the modulus operator:

number % 10

### 2. How do you remove the last digit?

Use integer division:

number / 10

### 3. Why did we use a `do-while` loop?

Because the loop must execute at least once. This allows the input `0` to be processed correctly.

### 4. How do you reverse a number mathematically?

Use:

reverse = reverse * 10 + digit

and repeatedly extract digits using `% 10`.

### 5. Why is `digitProduct` initialized to 1?

Because 1 is the multiplicative identity. Starting with 0 would make every product zero.

### 6. What happens when the number is 120?

The digits are processed as 0, 2, and 1.

Therefore:

Digit Sum = 3
Digit Product = 0
Reverse = 21

### 7. What is the difference between `/` and `%`?

`/` gives the quotient, while `%` gives the remainder.

Example:

120 / 10 = 12
120 % 10 = 0

### 8. Why does the reverse of 120 become 21?

The leading zero is not stored in an integer, so the mathematical reverse is `21`.