# Notes — Problem 76: Generic Box

## Topic

Wrappers, Enums & Generics

## Subtopic

Generic Classes

## What are Generics?

Generics allow a class, method, or interface to work with different data types while providing compile-time type safety.

Example:

    class Box<T>

Here `T` is a type parameter.

## Generic Class

Example:

    class Box<T> {

        private T value;

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }

The class does not decide the actual type of `T`.

The type is specified when creating the object.

## Creating Generic Objects

Integer:

    Box<Integer> integerBox = new Box<>();

String:

    Box<String> stringBox = new Box<>();

Double:

    Box<Double> doubleBox = new Box<>();

The same `Box` class works with all three types.

## How T Changes

When we write:

    Box<Integer>

then:

    T = Integer

When we write:

    Box<String>

then:

    T = String

When we write:

    Box<Double>

then:

    T = Double

## Generic Field

    private T value;

The type of `value` depends on the type supplied to `Box`.

For:

    Box<Integer>

the field behaves like:

    private Integer value;

For:

    Box<String>

it behaves like:

    private String value;

## Generic Setter

    public void setValue(T value) {
        this.value = value;
    }

The setter accepts the same type specified for the Box.

Example:

    Box<Integer> box = new Box<>();

    box.setValue(50000);

Because this is `Box<Integer>`, the setter expects an Integer.

## Generic Getter

    public T getValue() {
        return value;
    }

The getter returns the same type used by the Box.

Example:

    Box<String> box = new Box<>();

    box.setValue("Java");

    String value = box.getValue();

## Type Safety

Generics provide compile-time type safety.

Example:

    Box<Integer> box = new Box<>();

    box.setValue(50000);

This is valid.

But:

    box.setValue("Java");

is not valid because the Box expects an Integer.

## Why Generics?

Without generics, we could use Object:

    class Box {

        private Object value;

        public void setValue(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }
    }

But then we would need casting when retrieving the value.

Example:

    Integer value = (Integer) box.getValue();

Generics avoid this unnecessary casting.

With generics:

    Box<Integer> box = new Box<>();

    Integer value = box.getValue();

## Generic Class vs Separate Classes

Without generics, we might create:

    IntegerBox
    StringBox
    DoubleBox

Generics allow one reusable class:

    Box<T>

and then:

    Box<Integer>
    Box<String>
    Box<Double>

## Diamond Operator

This:

    Box<Integer> box = new Box<>();

uses the diamond operator:

    <>

Java can infer the type from the left side.

Instead of:

    new Box<Integer>()

we can write:

    new Box<>()

## Important Mental Model

Think of:

    Box<T>

as a template.

When creating:

    Box<Integer>

the template becomes an Integer Box.

When creating:

    Box<String>

the template becomes a String Box.

When creating:

    Box<Double>

the template becomes a Double Box.

## Generics and Primitive Types

Generics work with reference types, not primitive types.

This is invalid:

    Box<int>

Use the wrapper:

    Box<Integer>

Similarly:

    Box<double>    ❌
    Box<Double>    ✅

Autoboxing makes using wrapper types convenient.

Example:

    Box<Integer> box = new Box<>();

    box.setValue(50000);

The integer value can be automatically boxed into Integer.

## Interview Questions & Answers

### 1. What are generics?

Generics allow classes, methods, and interfaces to work with different types while maintaining compile-time type safety.

### 2. What does T mean?

`T` is a type parameter. It represents a type that will be supplied when the generic class is used.

### 3. What does this mean?

    Box<Integer> box = new Box<>();

It creates a Box whose type parameter `T` is Integer.

### 4. Can the same generic class work with multiple types?

Yes.

Example:

    Box<Integer>
    Box<String>
    Box<Double>

### 5. Why are generics useful?

They provide type safety, reduce casting, and allow reusable code.

### 6. Why can't we write Box<int>?

Java generics work with reference types, not primitive types.

Use:

    Box<Integer>

instead.

### 7. What is the diamond operator?

The `<>` allows Java to infer the generic type from the context.

Example:

    Box<Integer> box = new Box<>();

### 8. What is type safety?

Type safety means the compiler prevents incompatible types from being stored in a generic object.

Example:

    Box<Integer> box = new Box<>();

    box.setValue("Java");

will result in a compile-time error.

### 9. Why is Object less convenient than Generics?

With Object, values usually need casting when retrieved.

Generics provide the correct type automatically.

### 10. What is a generic class?

A class that declares one or more type parameters.

Example:

    class Box<T> {
    }

## Quick Interview Summary

    Generic class:
    class Box<T>

    Type parameter:
    T

    Integer:
    Box<Integer>

    String:
    Box<String>

    Double:
    Box<Double>

    Generic field:
    private T value;

    Generic setter:
    setValue(T value)

    Generic getter:
    T getValue()

    Primitive:
    Box<int> ❌

    Wrapper:
    Box<Integer> ✅

    Main benefits:
    → Type safety
    → Reusability
    → Less casting