# Problem CJ-016 — Prime Numbers in a Range

## Difficulty

Medium — 15–20 Minute Interview Practice

## Topic

Loops

## Subtopic

Nested loops + Prime Number Logic

## Objective

Find all prime numbers within a given range and calculate their count and sum.

## Problem Statement

Take two integers from the user:

- Start number
- End number

Find and print all prime numbers between the start and end values, including both boundaries.

Also calculate:

- Total number of prime numbers
- Sum of all prime numbers

## Rules

1. If start is greater than end, print:

Invalid range

2. Numbers less than or equal to 1 are not prime.

3. Check every number in the given range.

4. Print each prime number in the same line.

5. Calculate the total count and sum of prime numbers.

## Requirements

- Use Scanner.
- Use nested for loops.
- Use % for divisibility.
- Use if / else.
- Use a boolean for prime checking.
- Use counters and accumulators.
- Do not use arrays.
- Do not use streams.
- Do not create additional methods.

## Example

Input:

Start number: 10
End number: 30

Expected Output:

===== Prime Numbers =====
Primes: 11 13 17 19 23 29
Prime Count: 6
Prime Sum: 112

## Test Cases

### Test Case 1

Start: 10
End: 30

Expected:

Primes: 11 13 17 19 23 29
Prime Count: 6
Prime Sum: 112

### Test Case 2

Start: 1
End: 10

Expected:

Primes: 2 3 5 7
Prime Count: 4
Prime Sum: 17

### Test Case 3

Start: 2
End: 2

Expected:

Primes: 2
Prime Count: 1
Prime Sum: 2

### Test Case 4

Start: 8
End: 10

Expected:

Prime Count: 0
Prime Sum: 0

### Test Case 5

Start: 20
End: 10

Expected:

Invalid range

## Learning Outcome

Practice nested loops, prime-number logic, divisibility checks, counters, accumulators, and processing every number within a range.