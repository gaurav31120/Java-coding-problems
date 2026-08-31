# Problem 73 — Autoboxing

## Difficulty

Easy — 15 minutes

## Topic

Wrappers, Enums & Generics

## Subtopic

Autoboxing

## Objective

Understand how Java automatically converts a primitive type into its corresponding wrapper class.

## Problem Statement

Create an `int` primitive containing:

    50000

Create an `Integer` wrapper object from the primitive using autoboxing.

Then print:

1. The primitive value
2. The wrapper value
3. The class/type of the wrapper object

## Expected Output

===== Autoboxing =====

Primitive value: 50000
Wrapper value: 50000
Wrapper class: java.lang.Integer

## Requirements

1. Create an `int` variable.
2. Create an `Integer` variable.
3. Assign the primitive directly to the `Integer` variable.
4. Do NOT explicitly use:

       Integer.valueOf()

5. Print both values.
6. Print the class of the wrapper object.

## Important Concept

Autoboxing is the automatic conversion of a primitive into its corresponding wrapper object.

Example:

    int number = 50000;

    Integer boxedNumber = number;

Java automatically converts:

    int
    ↓
    Integer

## Primitive → Wrapper

    int     → Integer
    double  → Double
    long    → Long
    float   → Float
    short   → Short
    byte    → Byte
    char    → Character
    boolean → Boolean

## Learning Outcome

Understand what autoboxing is and how Java automatically converts primitive values into wrapper objects.