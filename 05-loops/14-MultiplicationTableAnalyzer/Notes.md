# Notes — CJ-014 Multiplication Table Analyzer

## Concepts Learned

- Scanner
- for loop
- Counters
- Accumulator
- Arithmetic operators
- Modulus operator
- Conditional logic

## Key Learning

A loop can be used to repeatedly perform a calculation for a fixed range.

The accumulator keeps a running total:

sum += result

The modulus operator can be used to determine whether each multiplication result is even or odd.

## Interview Questions & Answers

### 1. Why does the loop run from 1 to 10?

Because a standard multiplication table in this problem requires ten results.

### 2. What is an accumulator?

An accumulator stores a running value such as a sum.

Example:

sum += result

### 3. How do you check whether the multiplication result is even?

Use:

result % 2 == 0

### 4. Why can the same loop calculate both the sum and the counts?

Each result is already available inside the loop, so we can perform multiple calculations on it during the same iteration.

### 5. What happens when the input is 0?

Every multiplication result is 0, so the sum is 0 and all 10 results are even.

### 6. Does a negative number change the even/odd logic?

No. The modulus operator can still determine whether the result is even or odd.

### 7. Why is the result stored in a variable?

It avoids repeatedly calculating `number * multiplier` and makes the code easier to read.

### 8. What is the time complexity?

The loop always runs 10 times, so the time complexity is O(1).