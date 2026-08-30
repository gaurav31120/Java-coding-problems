# Problem 104 — Filter Employees

## Difficulty

Medium — 15–20 minutes

## Topic

Streams

## Subtopic

filter()

## Objective

Use Java Streams to filter employee salaries based on a condition.

## Problem Statement

Create an ArrayList<Integer> containing:

50000
75000
45000
90000
60000

Use a Stream to filter salaries greater than 60000.

Then:

1. Display the filtered salaries.
2. Count how many salaries are greater than 60000.

## Rules

- Use ArrayList<Integer>.
- Use stream().
- Use filter().
- Use forEach().
- Use count().
- Do not use a traditional for loop for filtering.
- Do not manually create a second list.

## Expected Result

Filtered salaries:

75000
90000

Count:

2

## Learning Outcome

Understand how Stream.filter() selects elements that satisfy a condition.