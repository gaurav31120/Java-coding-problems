# Problem 76 — Generic Box

## Difficulty

Easy → Medium — 20 minutes

## Topic

Wrappers, Enums & Generics

## Subtopic

Generic Classes

## Objective

Create a generic class that can store and return any type of value.

## Problem Statement

Create a generic class called `Box<T>`.

The class should:

1. Have a private variable called `value`.
2. Have a method `setValue(T value)` to store a value.
3. Have a method `getValue()` to return the stored value.

Then create three different Box objects:

1. Box<Integer>
2. Box<String>
3. Box<Double>

Store and print:

    Integer → 50000
    String  → "Java"
    Double  → 99.99

## Expected Output

===== Generic Box =====

Integer value: 50000
String value: Java
Double value: 99.99

## Requirements

1. Create a generic class:

       class Box<T>

2. Create:

       private T value;

3. Create:

       setValue(T value)

4. Create:

       getValue()

5. Create a `Box<Integer>`.
6. Create a `Box<String>`.
7. Create a `Box<Double>`.
8. Store values using `setValue()`.
9. Retrieve values using `getValue()`.
10. Print all three values.

## Rules

- Use generics.
- Do not use Object as the variable type.
- Do not create separate Box classes for Integer, String, and Double.
- Do not use Streams.
- Keep the solution simple.

## Important Concept

`T` is a type parameter.

Example:

    class Box<T> {
        private T value;
    }

When creating:

    Box<Integer>

T becomes:

    Integer

When creating:

    Box<String>

T becomes:

    String

When creating:

    Box<Double>

T becomes:

    Double

## Learning Outcome

Understand how a generic class allows the same class to work with different data types while maintaining type safety.