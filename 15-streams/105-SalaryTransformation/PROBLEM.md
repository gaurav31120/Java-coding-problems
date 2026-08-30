# Problem 105 — Salary Transformation

## Difficulty

Medium — 15–20 minutes

## Topic

Streams

## Subtopic

map()

## Objective

Understand how Stream.map() transforms every element in a Stream.

## Problem Statement

Create an ArrayList<Double> containing:

50000
75000
45000
90000
60000

Use a Stream to increase every salary by 10%.

Then:

1. Display all transformed salaries.
2. Display the original salary list afterward.

## Rules

- Use ArrayList<Double>.
- Use stream().
- Use map().
- Use forEach().
- Do not manually update the original list.
- Do not use a traditional for loop for transformation.
- Do not use filter() for transformation.
- No user input.

## Expected Result

Transformed salaries:

55000.0
82500.0
49500.0
99000.0
66000.0

Original list:

[50000.0, 75000.0, 45000.0, 90000.0, 60000.0]

## Learning Outcome

Understand how map() converts each Stream element into a transformed value without directly modifying the original collection.