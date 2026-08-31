# Problem 74 — Unboxing

## Difficulty

Easy — 15 minutes

## Topic

Wrappers, Enums & Generics

## Subtopic

Unboxing

## Objective

Understand how Java automatically converts a wrapper object into its corresponding primitive type.

## Problem Statement

Create an `Integer` wrapper object containing:

    50000

Convert the `Integer` object into an `int` primitive using automatic unboxing.

Then perform a calculation by adding:

    10000

Print:

1. The wrapper value
2. The primitive value
3. The result of the calculation
4. The primitive type/value being used in the calculation

## Expected Output

===== Unboxing =====

Wrapper value: 50000
Primitive value: 50000
After adding 10000: 60000

## Requirements

1. Create an `Integer` variable.
2. Create an `int` variable.
3. Assign the `Integer` directly to the `int`.
4. Do NOT explicitly use:

       intValue()

5. Perform the calculation using the primitive variable.
6. Print the results.

## Important Concept

Unboxing is the automatic conversion of a wrapper object into its corresponding primitive type.

Example:

    Integer number = 50000;

    int primitiveNumber = number;

Java automatically converts:

    Integer
       ↓
      int

## Autoboxing vs Unboxing

Autoboxing:

    int → Integer

Unboxing:

    Integer → int

## Learning Outcome

Understand the difference between autoboxing and unboxing and how Java automatically performs wrapper-to-primitive conversion.