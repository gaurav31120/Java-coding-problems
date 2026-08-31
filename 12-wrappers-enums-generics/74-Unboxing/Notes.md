# Notes — Problem 74: Unboxing

## Topic

Wrappers, Enums & Generics

## What is Unboxing?

Unboxing is the automatic conversion of a wrapper object into its corresponding primitive type.

Example:

    Integer number = 50000;

    int primitiveNumber = number;

Java automatically converts:

    Integer → int

## Autoboxing vs Unboxing

Autoboxing:

    int → Integer

Example:

    int number = 50000;
    Integer boxedNumber = number;

Unboxing:

    Integer → int

Example:

    Integer boxedNumber = 50000;
    int number = boxedNumber;

## Example from This Problem

    Integer num1 = 50000;

    int unboxedNumber = num1;

The second line performs automatic unboxing.

`num1` is an `Integer` object.

`unboxedNumber` is an `int` primitive.

## Explicit Unboxing

Java also provides wrapper methods for explicit conversion.

For Integer:

    int number = num1.intValue();

But this problem uses automatic unboxing:

    int number = num1;

## Why Wrapper Classes Matter

Wrapper classes allow primitive values to be used where objects are required.

For example:

    ArrayList<Integer> numbers = new ArrayList<>();

Collections store objects, so primitive values such as `int` are automatically boxed into `Integer`.

When an `Integer` is assigned to an `int`, Java can automatically unbox it.

## Arithmetic with Unboxed Values

Example:

    Integer number = 50000;

    int primitive = number;

    int result = primitive + 10000;

Result:

    60000

The arithmetic is performed using the primitive `int`.

## Important Relationship

    int
     ↓
    Integer

    Autoboxing

    Integer
     ↓
    int

    Unboxing

## Interview Questions & Answers

### 1. What is unboxing?

Unboxing is the automatic conversion of a wrapper object into its corresponding primitive type.

### 2. Give an example.

    Integer x = 10;
    int y = x;

Here Java automatically converts `Integer` to `int`.

### 3. What is the difference between autoboxing and unboxing?

Autoboxing:

    primitive → wrapper

Unboxing:

    wrapper → primitive

### 4. What is the wrapper class of int?

    Integer

### 5. How can Integer be explicitly converted to int?

Using:

    intValue()

Example:

    int x = integerValue.intValue();

### 6. Is int an object?

No.

`int` is a primitive type.

### 7. Is Integer an object?

Yes.

`Integer` is a wrapper class.

### 8. Can Java automatically unbox Integer?

Yes.

Example:

    Integer x = 10;
    int y = x;

### 9. Where is unboxing commonly encountered?

It commonly occurs when working with wrapper objects and Java Collections.

### 10. What happens in this expression?

    Integer x = 10;
    int y = x + 5;

Java automatically unboxes `x` before performing the arithmetic.

## Important Edge Case

Be careful with:

    Integer number = null;

    int value = number;

This causes:

    NullPointerException

because Java cannot unbox `null` into a primitive value.

## Quick Interview Summary

    Unboxing
    → wrapper → primitive

    Integer → int
    Double → double
    Long → long
    Boolean → boolean
    Character → char

    Automatic:
    int x = integerObject;

    Explicit:
    int x = integerObject.intValue();

    Important:
    null wrapper → unboxing → NullPointerException