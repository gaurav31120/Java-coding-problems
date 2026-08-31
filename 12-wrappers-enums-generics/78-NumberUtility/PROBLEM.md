# Problem 78 — Number Utility

## Difficulty

Easy → Medium — 20 minutes

## Topic

Wrappers, Enums & Generics

## Subtopic

Bounded Generics

## Objective

Create a generic utility method that works only with numeric types.

## Problem Statement

Create a generic method called `doubleValue()` that accepts a number and returns its value multiplied by 2.

The method should work with different numeric wrapper types such as:

    Integer
    Double

Use:

    50
    25.5

Expected results:

    100
    51.0

## Requirements

1. Create a generic method.
2. The method must accept only numeric types.
3. Use:

       <T extends Number>

4. Use the `doubleValue()` method from the `Number` class.
5. Return the result as a `double`.
6. Test the method with:
   - Integer
   - Double

## Expected Output

===== Number Utility =====

Integer doubled: 100.0
Double doubled: 51.0

## Important Concept

A bounded generic restricts the types that can be used with a generic type parameter.

Example:

    <T extends Number>

means:

    T must be Number or a subclass of Number.

Therefore:

    Integer ✅
    Double  ✅
    Long    ✅
    Float   ✅

But:

    String ❌

## Hint About Number

`Number` provides methods such as:

    intValue()
    longValue()
    floatValue()
    doubleValue()

For this problem, use:

    number.doubleValue()

## Rules

- Use generics.
- Use `<T extends Number>`.
- Do not use Object.
- Do not create separate methods for Integer and Double.
- Do not use Streams.
- Do not use if-else to check the type.

## Learning Outcome

Understand how bounded generics restrict a generic method to a specific family of types.