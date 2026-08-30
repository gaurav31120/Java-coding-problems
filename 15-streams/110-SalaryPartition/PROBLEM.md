# Problem 110 — Salary Partition

## Difficulty

Medium — 20 minutes

## Topic

Streams

## Subtopic

partitioningBy()

## Objective

Use partitioningBy() to divide employees into two groups based on salary.

## Problem Statement

Create an Employee class with:

- name
- department
- salary

Create these employees:

Amit   → IT       → 70000
Rahul  → HR       → 50000
Gaurav → IT       → 80000
Priya  → Finance  → 60000
Neha   → HR       → 55000
Karan  → Finance  → 75000

Partition employees into:

1. Salary greater than 60000.
2. Salary less than or equal to 60000.

Use:

    Collectors.partitioningBy()

## Rules

- Use ArrayList<Employee>.
- Use stream().
- Use Collectors.partitioningBy().
- Use Map<Boolean, List<Employee>>.
- Do not manually create two lists.
- Do not use a traditional for loop for partitioning.

## Expected Result

Salary > 60000:

Amit
Gaurav
Karan

Salary <= 60000:

Rahul
Priya
Neha

## Learning Outcome

Understand how partitioningBy() divides Stream elements into exactly two groups based on a boolean condition.