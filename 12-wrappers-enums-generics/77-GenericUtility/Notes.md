# Notes — Problem 77: Generic Utility

## Topic

Wrappers, Enums & Generics

## Subtopic

Generic Methods

## What is a Generic Method?

A generic method is a method that can work with different data types using a type parameter.

Example:

    public static <T> void printValue(T value) {
        System.out.println(value);
    }

The method can accept different types without creating separate methods.

## Generic Method Syntax

Basic syntax:

    <T> returnType methodName(T value)

Example:

    public static <T> void printValue(T value)

Here:

    <T>
    → declares the type parameter

    void
    → return type

    printValue
    → method name

    T value
    → parameter using the type parameter

## Important: Position of <T>

For a generic method:

    public static <T> void printValue(T value)

The `<T>` comes before the return type.

This is different from a generic class:

    class Box<T>

## Using the Same Method with Different Types

The same method can accept:

    printValue(50000);

    printValue("Java");

    printValue(99.99);

Java determines the appropriate type for `T`.

Conceptually:

    printValue(50000)
    → T = Integer

    printValue("Java")
    → T = String

    printValue(99.99)
    → T = Double

## Type Inference

Java can usually determine the type parameter automatically from the argument.

Example:

    printValue(50000);

Java understands that the argument is an Integer value.

Therefore the method can be used without explicitly writing the type.

## Generic Method vs Generic Class

Problem 76 used a generic class:

    class Box<T>

Here the entire class uses the type parameter.

Problem 77 uses a generic method:

    static <T> void printValue(T value)

Only the method needs the type parameter.

## Why Generic Methods?

Without generics, we might write separate methods:

    printInteger(int value)

    printString(String value)

    printDouble(double value)

With a generic method:

    printValue(T value)

one method can handle all these types.

## Generics vs Object

An Object-based method could be:

    static void printValue(Object value)

But generics provide stronger type information and can be used to create type-safe reusable code.

Generic version:

    static <T> void printValue(T value)

## Generic Method with Return Value

A generic method can also return a value.

Example:

    public static <T> T getValue(T value) {
        return value;
    }

Then:

    String name = getValue("Java");

    Integer number = getValue(100);

## Generic Methods Can Have Multiple Type Parameters

Example:

    public static <T, U> void printValues(T first, U second) {
        System.out.println(first);
        System.out.println(second);
    }

The method can work with two different types.

## Important Mental Model

Think of:

    <T>

as saying:

    "The caller will determine what type T represents."

Example:

    printValue(50000);

means:

    T → Integer

Example:

    printValue("Java");

means:

    T → String

Example:

    printValue(99.99);

means:

    T → Double

## Interview Questions & Answers

### 1. What is a generic method?

A generic method is a method that declares its own type parameter and can work with different data types.

### 2. Where is `<T>` placed in a generic method?

Before the return type.

Example:

    public static <T> void printValue(T value)

### 3. Is a generic method required to be inside a generic class?

No.

A generic method can exist inside a normal class.

### 4. Can the same generic method accept different types?

Yes.

Example:

    printValue(10);
    printValue("Java");
    printValue(99.99);

### 5. What is type inference?

Type inference is Java determining the appropriate generic type from the method arguments or surrounding context.

### 6. What does T represent?

`T` is a type parameter representing a type.

### 7. What is the difference between a generic class and generic method?

Generic class:

    class Box<T>

The class has a type parameter.

Generic method:

    <T> void printValue(T value)

The method has its own type parameter.

### 8. Can a generic method return T?

Yes.

Example:

    public static <T> T getValue(T value) {
        return value;
    }

### 9. Why use generics instead of separate methods?

Generics allow reusable, type-safe code without duplicating the same logic for different types.

### 10. Can a generic method have multiple type parameters?

Yes.

Example:

    <T, U>

## Quick Interview Summary

    Generic method:
    <T> void method(T value)

    `<T>`
    → declares type parameter

    T
    → represents a type

    Same method:
    → Integer
    → String
    → Double

    Generic class:
    class Box<T>

    Generic method:
    <T> void printValue(T value)

    Main benefits:
    → Reusability
    → Type safety
    → Less code