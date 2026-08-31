# Problem 77 — Generic Utility

## Difficulty

Easy → Medium — 20 minutes

## Topic

Wrappers, Enums & Generics

## Subtopic

Generic Methods

## Objective

Create a generic utility method that can print any type of value.

## Problem Statement

Create a class called `GenericUtility`.

Inside the class, create a generic static method:

    printValue(T value)

The method should print the supplied value.

Then call the same method with:

1. Integer
2. String
3. Double

Use these values:

    50000
    "Java"
    99.99

## Expected Output

===== Generic Utility =====

Integer: 50000
String: Java
Double: 99.99

## Requirements

1. Create a generic method.
2. The method should work with different data types.
3. The method must use a type parameter `<T>`.
4. The method should be static so it can be called directly from main.
5. Call the same method three times.
6. Do not create separate methods for Integer, String, and Double.
7. Do not use Object as the parameter type.
8. Do not use Streams.

## Important Concept

A generic method can work with different types.

Example:

    public static <T> void printValue(T value) {
        System.out.println(value);
    }

The `<T>` before `void` declares the method's type parameter.

## Example Calls

    printValue(50000);

    printValue("Java");

    printValue(99.99);

Java can infer the appropriate type for T.

## Learning Outcome

Understand:

- Generic methods
- Type parameters on methods
- Type inference
- Reusable generic utility methods