# Problem 109 — Group Employees

## Difficulty

Medium — 20 minutes

## Topic

Streams

## Subtopic

groupingBy()

## Objective

Use Stream groupingBy() to group employees according to their department.

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

Use Streams to group employees by department.

Then:

1. Display the grouped employees.
2. Display the number of employees in each department.

## Rules

- Use ArrayList<Employee>.
- Use stream().
- Use Collectors.groupingBy().
- Use Map<String, List<Employee>>.
- Use forEach().
- Do not manually create department lists.
- Do not use traditional loops for grouping.
- No user input.

## Expected Groups

IT:

Amit
Gaurav

HR:

Rahul
Neha

Finance:

Priya
Karan

## Expected Counts

IT → 2
HR → 2
Finance → 2

## Learning Outcome

Understand how groupingBy() groups Stream elements according to a selected property.