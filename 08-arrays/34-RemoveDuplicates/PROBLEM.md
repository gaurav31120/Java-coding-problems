# Problem 34 — Remove Duplicates

## Difficulty

Medium — 20–25 minutes

## Topic

Arrays

## Subtopic

Duplicates, array traversal, searching

## Objective

Remove duplicate values from an integer array while maintaining the original order.

## Problem Statement

Create an integer array containing:

10
20
10
30
20
40
10

Remove all duplicate values so that each value appears only once.

The original order must be maintained.

## Input

    int[] arr = {10, 20, 10, 30, 20, 40, 10};

## Expected Output

===== Original Array =====

10
20
10
30
20
40
10

===== After Removing Duplicates =====

10
20
30
40

Unique element count: 4

## Important Requirement

Maintain the original order.

Example:

    Input:
    10, 20, 10, 30, 20, 40, 10

    Output:
    10, 20, 30, 40

## Bonus

Test the program with:

    int[] arr = {5, 5, 5, 5};

Expected:

    5

    Unique element count: 1

## Rules

- Use int[].
- Use loops.
- Use if conditions.
- Maintain the original order.
- Do not use Set.
- Do not use HashSet.
- Do not use ArrayList.
- Do not use Streams.
- Do not use Arrays.sort().
- Do not manually print the expected result.

## Learning Outcome

Understand how to identify duplicate elements using array traversal and how to create a collection of unique values while maintaining their original order.

## Interview Focus

Be prepared to explain:

1. How duplicate detection works.
2. Why a nested loop may be required.
3. How to maintain insertion/original order.
4. Time complexity.
5. Space complexity.
6. Difference between using an array and using a Set.