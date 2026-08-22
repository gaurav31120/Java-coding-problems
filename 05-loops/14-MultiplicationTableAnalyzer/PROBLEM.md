# Problem CJ-014 — Multiplication Table Analyzer

## Difficulty

Medium — 15–20 Minute Interview Practice

## Topic

Loops

## Subtopic

for loop

## Objective

Build a multiplication table analyzer that prints the table of a number from 1 to 10 and analyzes the generated results.

## Problem Statement

Take an integer n from the user.

Print the multiplication table of n from 1 to 10.

After printing the table, calculate:

- Sum of all 10 results
- Count of even results
- Count of odd results

## Rules

1. The table must run from 1 to 10.
2. Calculate each multiplication result.
3. Add every result to the total sum.
4. Count even results separately.
5. Count odd results separately.
6. Correctly handle zero and negative numbers.

## Requirements

- Use Scanner.
- Use a for loop.
- Use if / else.
- Use a counter.
- Use an accumulator.
- Handle zero.
- Handle negative numbers.
- Do not use arrays.
- Do not use streams.
- Do not create additional methods.

## Example

Input:

Enter number: 7

Expected Output:

===== Multiplication Table =====
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70

Sum: 385
Even Results: 5
Odd Results: 5

## Test Cases

### Test Case 1

Number: 7

Expected:

Sum: 385
Even Results: 5
Odd Results: 5

### Test Case 2

Number: 5

Expected:

Sum: 275
Even Results: 5
Odd Results: 5

### Test Case 3

Number: 0

Expected:

Sum: 0
Even Results: 10
Odd Results: 0

### Test Case 4

Number: -3

Expected:

Sum: -165
Even Results: 5
Odd Results: 5

## Learning Outcome

Practice for loops, counters, accumulators, arithmetic operations, modulus, and analyzing values generated inside a loop.