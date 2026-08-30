# Problem 106 — Salary Aggregation

## Difficulty

Medium — 20 minutes

## Topic

Streams

## Subtopic

Aggregation

## Objective

Use the Stream API to calculate total and average salary.

## Problem Statement

Create an ArrayList<Double> containing:

50000.0
75000.0
45000.0
90000.0
60000.0

Use Streams to:

1. Calculate the total salary.
2. Calculate the average salary.
3. Display both results.

## Rules

- Use ArrayList<Double>.
- Use stream().
- Use mapToDouble().
- Use sum().
- Use average().
- Do not use a traditional for loop.
- Do not manually maintain a total variable.
- No user input.

## Expected Result

Total salary:

320000.0

Average salary:

64000.0

## Learning Outcome

Understand how Stream aggregation operations can reduce multiple values into a single result.