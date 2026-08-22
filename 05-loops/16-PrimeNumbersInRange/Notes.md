# Notes — CJ-016 Prime Numbers in a Range

## Concepts Learned

- Scanner
- Nested for loops
- Boolean flag
- Prime number logic
- Modulus operator
- break
- Counter
- Accumulator
- Range processing

## Key Learning

When checking multiple numbers, the prime-checking state must be reset for every new number.

For each number:

number <= 1 → Not Prime

Otherwise, check whether any divisor exists.

Only numbers with no divisor should be added to the prime count and prime sum.

## Interview Questions & Answers

### 1. Why do we need nested loops?

The outer loop processes every number in the range, while the inner loop checks whether the current number has a divisor.

### 2. Why must the prime flag be reset for every number?

Each number needs its own prime status. A divisor found for one number should not affect the next number.

### 3. Why are numbers less than or equal to 1 not prime?

A prime number must be greater than 1.

### 4. Why do we use `%`?

The modulus operator checks whether a number is completely divisible by another number.

### 5. Why do we use `break`?

Once a divisor is found, the current number is known to be non-prime, so further checking is unnecessary.

### 6. What is an accumulator?

An accumulator stores a running value.

Here, `primeSum` maintains the sum of all prime numbers found.

### 7. What happens if the range contains no prime numbers?

The prime count and prime sum remain `0`.

### 8. What is the main difference between CJ-015 and CJ-016?

CJ-015 checks one number, while CJ-016 applies the same prime-checking logic to every number in a range.