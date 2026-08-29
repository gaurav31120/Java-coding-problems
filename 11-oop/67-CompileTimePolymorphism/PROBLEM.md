# Problem CJ-067 — Compile-Time Polymorphism

## Difficulty

Medium — 10–15 minutes

## Topic

OOP

## Subtopic

Method Overloading

## Objective

Understand compile-time polymorphism through method overloading.

## Problem Statement

Create a Calculator class with an overloaded calculate() method.

Create three versions:

1. calculate(int a, int b) — returns the sum of two integers.
2. calculate(double a, double b) — returns the sum of two doubles.
3. calculate(int a, int b, int c) — returns the sum of three integers.

Create a Calculator object and call all three methods.

## Rules

- Create a Calculator class.
- Use the same method name: calculate.
- Use different parameter lists.
- Methods must return the calculated result.
- Call all three methods.
- No inheritance.
- No interfaces.
- No collections.
- No user input.

## Example

Expected Output:

===== Compile-Time Polymorphism =====
Sum of two integers: 30
Sum of two doubles: 35.5
Sum of three integers: 60

## Test Cases

### Test Case 1

calculate(10, 20)

Expected:

30

### Test Case 2

calculate(15.5, 20.0)

Expected:

35.5

### Test Case 3

calculate(10, 20, 30)

Expected:

60

## Constraints

- Method name must be calculate.
- Use method overloading.
- Parameter lists must be different.
- Return the calculated values.
- Call all three methods.
- No inheritance.
- No interfaces.
- No collections.

## Learning Outcome

Understand method overloading and how Java resolves overloaded methods at compile time based on the method arguments.