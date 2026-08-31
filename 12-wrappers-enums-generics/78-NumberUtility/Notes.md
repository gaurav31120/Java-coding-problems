# Notes — Problem 78: Number Utility

## Topic

Wrappers, Enums & Generics

## Subtopic

Bounded Generics

## What is a Bounded Generic?

A bounded generic restricts the types that can be used as a generic type parameter.

Example:

    <T extends Number>

This means T must be `Number` or a subclass of `Number`.

## Example

    public static <T extends Number> double doubleValue(T value)

Here:

    T
    → generic type

    extends Number
    → upper bound

Therefore T can be numeric wrapper types such as:

    Integer
    Double
    Long
    Float
    Short
    Byte

But not:

    String

## Why Use extends Number?

Without the bound:

    <T>

Java cannot guarantee that T has numeric methods.

For example:

    value.doubleValue()

would not be available for an arbitrary T.

With:

    <T extends Number>

Java knows that `value` is a Number.

Therefore Number methods can be used.

## Number Class

`Number` is the superclass of Java's numeric wrapper classes.

Examples:

    Integer
    Double
    Long
    Float
    Short
    Byte

They all extend Number.

Conceptually:

    Number
      │
      ├── Integer
      ├── Double
      ├── Long
      ├── Float
      ├── Short
      └── Byte

## doubleValue()

The `Number` class provides:

    doubleValue()

It converts the numeric value into a `double`.

Example:

    Integer number = 50;

    number.doubleValue()

produces:

    50.0

## Our Generic Method

    public static <T extends Number> double doubleValue(T value) {

        return value.doubleValue() * 2;
    }

The method:

1. Accepts a numeric type.
2. Converts it to double.
3. Multiplies it by 2.
4. Returns the result.

## Example

    doubleValue(50)

Here Java infers:

    T = Integer

Then:

    value.doubleValue()

becomes:

    50.0

Then:

    50.0 * 2

gives:

    100.0

## Another Example

    doubleValue(25.5)

Here:

    T = Double

Then:

    25.5 * 2

gives:

    51.0

## Why Not Just Use double?

We could write:

    public static double doubleValue(double value)

But then the method specifically accepts a primitive `double`.

The bounded generic method can accept different numeric wrapper types:

    Integer
    Double
    Long
    Float

while using the common Number API.

## Bounded vs Unbounded Generic

Unbounded:

    <T>

T can represent any reference type.

Bounded:

    <T extends Number>

T is restricted to Number and its subclasses.

## Important Mental Model

Think:

    <T>
    ↓
    Any reference type

    <T extends Number>
    ↓
    Only Number-family types

Therefore:

    doubleValue(50)      ✅
    doubleValue(25.5)    ✅
    doubleValue(100L)    ✅

But:

    doubleValue("Java")  ❌

because String does not extend Number.

## Generic Method Syntax

A bounded generic method:

    public static <T extends Number> double method(T value)

Breakdown:

    <T extends Number>
    → declares bounded type parameter

    double
    → return type

    method
    → method name

    T value
    → parameter

## Interview Questions & Answers

### 1. What is a bounded generic?

A bounded generic restricts the types that can be used as a type parameter.

Example:

    <T extends Number>

### 2. What does `<T extends Number>` mean?

It means T must be Number or a subclass of Number.

### 3. Why can we call doubleValue() on T?

Because T is bounded by Number, and Number provides the `doubleValue()` method.

### 4. Which classes can be used with `<T extends Number>`?

Common examples:

    Integer
    Double
    Long
    Float
    Short
    Byte

### 5. Can String be used?

No.

String does not extend Number.

### 6. What is Number?

`Number` is an abstract class that is the superclass of Java's numeric wrapper classes.

### 7. What does doubleValue() do?

It converts the numeric value to a `double`.

### 8. What is the difference between `<T>` and `<T extends Number>`?

    <T>
    → unrestricted reference type

    <T extends Number>
    → restricted to Number and subclasses

### 9. Why is the return type double?

Because `doubleValue()` returns a double and the problem requires the doubled result as a double.

### 10. Can the method accept Integer?

Yes.

    doubleValue(50)

The Integer value is accepted because Integer extends Number.

### 11. Can the method accept Double?

Yes.

    doubleValue(25.5)

Double extends Number.

### 12. Can the method accept Long?

Yes.

Example:

    doubleValue(100L)

### 13. Why is bounded generics useful?

It allows us to restrict the accepted types while still using the common functionality of the bound.

## Quick Interview Summary

    <T>
    → any reference type

    <T extends Number>
    → Number family only

    Integer
    → valid

    Double
    → valid

    Long
    → valid

    String
    → invalid

    Number
    → provides numeric methods

    doubleValue()
    → converts to double

    Main benefit:
    → type restriction + access to Number functionality