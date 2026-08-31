# Problem 33 — Second Largest

## Difficulty

Medium — 20–25 minutes

## Topic

Arrays

## Subtopic

Maximum and second maximum

## Objective

Find the largest and second largest distinct values in an array.

## Problem Statement

Create an integer array containing:

50000
75000
45000
90000
60000

Find:

1. Largest salary
2. Second largest salary

## Expected Output

===== Salary Analysis =====

Largest salary: 90000
Second largest salary: 75000

## Important Definition

Second largest means the second DISTINCT largest value.

Example:

10, 10, 8, 7

Largest:

10

Second largest:

8

## Bonus

Handle an array where no second distinct largest value exists.

Example:

10, 10, 10

Expected:

Largest: 10
Second largest: No second largest value

## Rules

- Use int[].
- Use one traversal.
- Do not sort the array.
- Do not use Arrays.sort().
- Do not use Streams.
- Do not use ArrayList.
- Main problem may assume at least two distinct values.

## Learning Outcome

Understand how to track the largest and second largest values simultaneously during a single array traversal.