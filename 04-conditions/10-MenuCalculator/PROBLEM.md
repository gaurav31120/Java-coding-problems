# Problem CJ-010 — Menu-Based Calculator

## Difficulty

Medium — 15–20 Minute Interview Practice

## Topic

Conditions

## Subtopic

switch

## Objective

Build a menu-based calculator that takes two numbers and an operation choice from the user and performs the selected arithmetic operation.

## Problem Statement

Display the following menu:

1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Modulus

Take two numbers and the user's choice.

Perform the selected operation and display the result.

## Rules

1. Choice 1 → Addition.

2. Choice 2 → Subtraction.

3. Choice 3 → Multiplication.

4. Choice 4 → Division.

5. Choice 5 → Modulus.

6. Division must support decimal results.

7. If division is selected and the second number is 0, print:

   Cannot divide by zero

8. If modulus is selected and the second number is 0, print:

   Cannot perform modulus by zero

9. If the choice is not between 1 and 5, print:

   Invalid choice

## Requirements

- Use Scanner.
- Use switch.
- Use case.
- Use default.
- Use arithmetic operators.
- Handle division by zero.
- Handle modulus by zero.
- Handle invalid choices.
- Use meaningful variables.
- Do not use arrays.
- Do not use loops.
- Do not create additional methods.

## Example

Input:

First number: 25
Second number: 4
Choice: 4

Expected:

===== Calculator Result =====
Operation: Division
Result: 6.25

## Test Cases

### Test Case 1

First number: 25
Second number: 4
Choice: 1

Expected:

Operation: Addition
Result: 29

### Test Case 2

First number: 25
Second number: 40
Choice: 2

Expected:

Operation: Subtraction
Result: -15

### Test Case 3

First number: 12
Second number: 5
Choice: 3

Expected:

Operation: Multiplication
Result: 60

### Test Case 4

First number: 25
Second number: 4
Choice: 4

Expected:

Operation: Division
Result: 6.25

### Test Case 5

First number: 25
Second number: 0
Choice: 4

Expected:

Cannot divide by zero

### Test Case 6

First number: 25
Second number: 4
Choice: 5

Expected:

Operation: Modulus
Result: 1

### Test Case 7

First number: 25
Second number: 0
Choice: 5

Expected:

Cannot perform modulus by zero

### Test Case 8

First number: 25
Second number: 4
Choice: 9

Expected:

Invalid choice

## Learning Outcome

Practice switch statements, case/default, arithmetic operations, user input, division by zero handling, modulus, and menu-based conditional logic in Java.