# Problem 32 — Linear Search

## Difficulty

Easy → Medium — 15–20 minutes

## Topic

Arrays

## Subtopic

Searching, traversal, index

## Objective

Search for a target value in an array using linear search.

## Problem Statement

Create an integer array containing:

50000
75000
45000
90000
60000

Search for:

90000

The program should:

1. Traverse the array.
2. Check whether the target exists.
3. If found, print its index.
4. If not found, print "Salary not found".

## Expected Output

===== Linear Search =====

Target salary: 90000
Salary found at index: 3

## Bonus 1

Search for a salary that does not exist:

55000

Expected:

Salary not found

## Bonus 2

Solve the problem using an index variable instead of a boolean.

Use:

int index = -1;

If found, store the index.

If index remains -1, the target was not found.

## Rules

- Use int[].
- Use a traditional for loop.
- Do not use Arrays.binarySearch().
- Do not use Streams.
- Do not use ArrayList.
- Do not sort the array.

## Learning Outcome

Understand linear search, array traversal, target comparison, index tracking, and the common -1 means "not found" pattern.