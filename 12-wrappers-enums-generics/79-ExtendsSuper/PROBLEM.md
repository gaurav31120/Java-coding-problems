# Problem 79 — extends / super

## Difficulty

Medium — 25–30 minutes

## Topic

Wrappers, Enums & Generics

## Subtopic

Generic Wildcards

## Objective

Understand the difference between `? extends` and `? super`.

## Problem Statement

Create a simple class hierarchy:

    Number
       ↑
    Integer

Create two methods:

1. A method using `? extends Number`
2. A method using `? super Integer`

### Method 1 — extends

Create:

    printNumbers(List<? extends Number> numbers)

This method should print every number in the list.

Test it with:

    List<Integer>

and:

    List<Double>

### Method 2 — super

Create:

    addIntegers(List<? super Integer> numbers)

This method should add:

    10
    20
    30

to the supplied list.

Test it with:

    List<Number>

## Expected Output

===== extends Example =====

10
20
30.5
40.5

===== super Example =====

[10, 20, 30]

## Requirements

### extends

Use:

    List<? extends Number>

The method should be able to read values from:

    List<Integer>
    List<Double>

Print every value.

### super

Use:

    List<? super Integer>

The method should add Integer values to the list.

Add:

    10
    20
    30

## Important Concept

`? extends Number` means:

    "Some unknown type that is Number or a subclass of Number."

Therefore:

    List<Integer>  → valid
    List<Double>   → valid

For `? super Integer`:

    "Some unknown type that is Integer or a superclass of Integer."

Therefore:

    List<Integer> → valid
    List<Number>  → valid
    List<Object>  → valid

## Simple Rule

PECS:

    Producer Extends
    Consumer Super

If you mainly READ/produce values:

    ? extends

If you mainly ADD/consume values:

    ? super

## Rules

- Use List.
- Use `? extends Number`.
- Use `? super Integer`.
- Do not use raw List.
- Do not use Streams.
- Do not use casts.

## Learning Outcome

Understand the practical difference between:

    ? extends

and:

    ? super

and remember the PECS rule.