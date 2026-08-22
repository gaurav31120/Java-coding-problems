# Notes — CJ-011 Range Number Analyzer

## Concepts Learned

- Scanner
- for loop
- Loop boundaries
- if / else
- Modulus operator
- Counters
- Accumulator variables
- Input validation

## Key Learning

A `for` loop is useful when we need to process values from a starting point to an ending point.

The condition:

i <= end

ensures that the end value is also processed.

The modulus operator can be used to determine whether a number is even or odd.

Example:

number % 2 == 0

A counter keeps track of how many values are processed, while an accumulator maintains a running total.

## Interview Questions & Answers

### 1. Why did we use a `for` loop?

A `for` loop is suitable when we know the starting value, ending condition, and how the value should change after every iteration.

### 2. How do you check whether a number is even?

Use:

number % 2 == 0

If the remainder is zero, the number is even.

### 3. Is zero an even number?

Yes. Zero is even because:

0 % 2 == 0

### 4. What is a counter?

A counter keeps track of how many times something occurs.

Example:

evenCount++

### 5. What is an accumulator?

An accumulator stores a running value such as a sum.

Example:

evenSum += number

### 6. Why is `i <= end` used instead of `i < end`?

Because the problem requires the end value to be included in the range.

### 7. What happens if `start > end`?

The range is invalid, so the program prints `Invalid range` instead of executing the loop.

### 8. Can this logic handle negative numbers?

Yes. The modulus operation works with negative integers, and the loop can process negative values correctly.