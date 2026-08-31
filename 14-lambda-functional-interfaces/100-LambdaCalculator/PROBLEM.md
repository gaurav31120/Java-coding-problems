# Problem 100 — Lambda Calculator

## Difficulty

Easy — 15–20 minutes

## Topic

Lambda & Functional Interfaces

## Objective

Create a simple calculator using a functional interface and lambda expressions.

## Problem Statement

Create a functional interface called `Calculator` with one method:

    int calculate(int a, int b);

Create lambda expressions for the following operations:

1. Addition
2. Subtraction
3. Multiplication
4. Division

Use two numbers:

    20
    5

Perform all four operations.

## Expected Output

===== Lambda Calculator =====

Addition: 25
Subtraction: 15
Multiplication: 100
Division: 4

## Requirements

1. Create a functional interface named `Calculator`.
2. The interface must contain:

       int calculate(int a, int b);

3. Create separate lambda expressions for:
   - Addition
   - Subtraction
   - Multiplication
   - Division
4. Execute each lambda.
5. Print the result of each operation.
6. Do not create a separate implementation class.
7. Do not use Streams.

## Concepts Practiced

- Functional interface
- Single abstract method
- Lambda expression
- Lambda parameters
- Lambda return value
- Assigning lambda to an interface reference
- Calling the functional interface method

## Bonus

Create a lambda for modulus:

    20 % 5

Expected:

    Modulus: 0

## Learning Outcome

Understand how lambda expressions can provide different implementations of the same functional interface.