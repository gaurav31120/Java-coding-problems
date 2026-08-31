# Notes — Problem 73: Autoboxing

## Topic

Wrappers, Enums & Generics

## What is Autoboxing?

Autoboxing is the automatic conversion of a primitive value into its corresponding wrapper object.

Example:

    int num = 50000;

    Integer boxedNumber = num;

Java automatically converts:

    int → Integer

## Primitive and Wrapper

Java provides wrapper classes for primitive types.

    int     → Integer
    double  → Double
    long    → Long
    float   → Float
    short   → Short
    byte    → Byte
    char    → Character
    boolean → Boolean

## Example

    int num = 50000;

    Integer boxedNumber = num;

Here:

    num
    → primitive int

    boxedNumber
    → Integer object

The conversion happens automatically.

## Why Is It Called Boxing?

The primitive value is conceptually placed inside a wrapper object.

    primitive
       ↓
    wrapper object

Example:

    int
     ↓
    Integer

## Explicit vs Automatic Conversion

Without autoboxing, we could explicitly write:

    Integer boxedNumber = Integer.valueOf(num);

But Java allows:

    Integer boxedNumber = num;

This automatic conversion is autoboxing.

## Important Point

Autoboxing does NOT mean that the primitive itself becomes an object.

Instead, Java creates/uses an appropriate wrapper object representing that primitive value.

## getClass()

Wrapper objects are objects, so we can call:

    boxedNumber.getClass()

Example output:

    class java.lang.Integer

This shows that the object is an instance of:

    java.lang.Integer

## Where Autoboxing Is Useful

Autoboxing is especially useful when working with Java Collections because collections store objects rather than primitive types.

Example:

    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(10);

Here:

    10

is an `int` literal, but Java automatically boxes it into an `Integer`.

## Autoboxing Example with Collection

    List<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

Java automatically performs:

    int → Integer

when necessary.

## Interview Questions & Answers

### 1. What is autoboxing?

Autoboxing is Java's automatic conversion of a primitive value into its corresponding wrapper object.

### 2. Give an example.

    int x = 10;
    Integer y = x;

Here Java automatically converts `int` to `Integer`.

### 3. What is the wrapper class of int?

    Integer

### 4. What is the wrapper class of double?

    Double

### 5. What is the wrapper class of boolean?

    Boolean

### 6. Why are wrapper classes needed?

Wrapper classes allow primitive values to be represented as objects and are required in situations such as generic collections.

### 7. Is Integer a primitive?

No.

`Integer` is a wrapper class and therefore an object type.

### 8. Is int an object?

No.

`int` is a primitive data type.

### 9. What is the difference?

    int
    → primitive

    Integer
    → wrapper object

### 10. Can Java automatically convert int to Integer?

Yes. This is autoboxing.

### 11. What happens here?

    Integer x = 10;

Java automatically boxes the integer value into an `Integer` object.

### 12. What method can explicitly perform the conversion?

    Integer.valueOf()

But when Java performs it automatically, it is called autoboxing.

## Quick Interview Summary

    Autoboxing
    → primitive → wrapper

    int
    → Integer

    double
    → Double

    long
    → Long

    char
    → Character

    boolean
    → Boolean

    Example:
    Integer x = 10;

    Collections use wrapper types:
    List<Integer>

    Object class:
    x.getClass()