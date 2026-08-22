# Problem CJ-015 — Prime Number Checker

## Difficulty

Medium — 15–20 Minute Interview Practice

## Topic

Loops

## Subtopic

for loop + Conditional Logic

## Objective

Determine whether a given integer is a prime number.

## Problem Statement

Take an integer from the user and determine whether it is prime.

A prime number is greater than 1 and has exactly two factors:

- 1
- Itself

## Rules

1. Numbers less than or equal to 1 are not prime.
2. Check whether the number has any divisor other than 1 and itself.
3. If a divisor is found, the number is not prime.
4. If no divisor is found, the number is prime.

## Requirements

- Use Scanner.
- Use a for loop.
- Use if / else.
- Use the modulus `%` operator.
- Do not use a separate method.
- Do not use arrays.
- Do not use any built-in prime-number function.

## Example

Input:

Enter a number: 29

Expected Output:

===== Prime Number Check =====
Number: 29
Result: Prime

## Test Cases

### Test Case 1

Number: 29

Expected:

Number: 29
Result: Prime

### Test Case 2

Number: 20

Expected:

Number: 20
Result: Not Prime

### Test Case 3

Number: 2

Expected:

Number: 2
Result: Prime

### Test Case 4

Number: 1

Expected:

Number: 1
Result: Not Prime

### Test Case 5

Number: -7

Expected:

Number: -7
Result: Not Prime

## Learning Outcome

Practice loops, divisibility checks, modulus, conditional logic, and identifying prime numbers.