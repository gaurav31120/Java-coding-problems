# Problem 107 — Stream Sorting

## Difficulty

Medium — 15–20 minutes

## Topic

Streams

## Subtopic

sorted()

## Objective

Understand how to sort Stream elements in ascending and descending order.

## Problem Statement

Create an ArrayList<Integer> containing:

50000
75000
45000
90000
60000

Then:

1. Display the original list.
2. Sort salaries in ascending order using Stream.sorted().
3. Display ascending order.
4. Sort salaries in descending order using Stream.sorted() and Comparator.reverseOrder().
5. Display descending order.

## Rules

- Use ArrayList<Integer>.
- Use stream().
- Use sorted().
- Use forEach().
- Use Comparator.reverseOrder() for descending order.
- Do not use Collections.sort().
- Do not use a traditional for loop for sorting.
- Do not manually swap elements.
- Do not modify the original list.

## Expected Result

Original:

[50000, 75000, 45000, 90000, 60000]

Ascending:

45000
50000
60000
75000
90000

Descending:

90000
75000
60000
50000
45000

## Learning Outcome

Understand how sorted() orders Stream elements and how Comparator.reverseOrder() can be used for descending order.