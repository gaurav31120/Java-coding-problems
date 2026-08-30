# Problem 111 — Employee Map

## Difficulty

Medium — 20 minutes

## Topic

Streams

## Subtopic

map() + collect()

## Objective

Use map() to transform Employee objects into employee names and collect the results into a List<String>.

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

Use Streams to create a List<String> containing only employee names.

## Rules

- Use ArrayList<Employee>.
- Use stream().
- Use map().
- Use collect().
- Use Collectors.toList().
- Do not use a traditional for loop.
- Do not manually create the names list.

## Expected Result

[Amit, Rahul, Gaurav, Priya, Neha, Karan]

## Learning Outcome

Understand how map() transforms objects into another type and how collect() gathers the transformed elements into a List.