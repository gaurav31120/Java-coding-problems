# Notes — Problem 100: Lambda Calculator

## Topic

Lambda & Functional Interfaces

## Key Concepts

- Functional Interface
- @FunctionalInterface
- Lambda Expression
- Lambda Parameters
- Lambda Return Value
- Functional Interface Reference
- Calling Lambda

## Functional Interface

A functional interface is an interface having exactly one abstract method.

Example:

    @FunctionalInterface
    interface Calculator {

        int calculate(int a, int b);
    }

The single abstract method is:

    calculate(int a, int b)

## @FunctionalInterface

The annotation:

    @FunctionalInterface

tells Java that the interface is intended to contain exactly one abstract method.

It also allows the compiler to catch mistakes if another abstract method is accidentally added.

## Lambda Expression

A lambda provides an implementation of a functional interface's abstract method.

Basic syntax:

    (parameters) -> expression

Example:

    Calculator add = (a, b) -> a + b;

Here:

    (a, b)
    → lambda parameters

    ->
    → lambda operator

    a + b
    → implementation / return expression

## Lambda with Return Value

Because the lambda contains a single expression:

    (a, b) -> a + b

the result of the expression is automatically returned.

We do not need:

    return

Example:

    Calculator add = (a, b) -> a + b;

## Different Implementations

The same functional interface can be used for different operations.

Addition:

    Calculator add = (a, b) -> a + b;

Subtraction:

    Calculator subtract = (a, b) -> a - b;

Multiplication:

    Calculator multiply = (a, b) -> a * b;

Division:

    Calculator divide = (a, b) -> a / b;

The interface remains the same:

    Calculator

But each lambda provides a different implementation.

## Calling the Lambda

A lambda is executed by calling the functional interface method.

Example:

    add.calculate(20, 5)

This executes:

    (a, b) -> a + b

with:

    a = 20
    b = 5

Result:

    25

## Important Mental Model

Think of:

    Calculator

as a contract.

The contract says:

    "Anyone implementing me must provide
     calculate(int, int)."

The lambda provides the actual behavior.

Example:

    Calculator add = (a, b) -> a + b;

Means:

    "For this Calculator object,
     calculate means addition."

Another:

    Calculator multiply = (a, b) -> a * b;

Means:

    "For this Calculator object,
     calculate means multiplication."

## Traditional Class vs Lambda

Without lambda, we could create separate implementation classes.

For example:

    class AdditionCalculator implements Calculator {

        public int calculate(int a, int b) {
            return a + b;
        }
    }

Lambda makes this much shorter:

    Calculator add = (a, b) -> a + b;

## Lambda Syntax

For two parameters:

    (a, b) -> a + b

For one parameter:

    x -> x * 2

For no parameters:

    () -> System.out.println("Hello")

For multiple statements:

    (a, b) -> {
        int result = a + b;
        return result;
    }

## Expression Lambda

A single expression:

    (a, b) -> a + b

The value is implicitly returned.

## Block Lambda

Multiple statements:

    (a, b) -> {
        int result = a + b;
        return result;
    }

With a block lambda, an explicit return is required when a value must be returned.

## Division

The calculator uses:

    (a, b) -> a / b

Since the return type is:

    int

this performs integer division.

Example:

    20 / 5
    → 4

If the interface returned `double`, decimal division could be used.

## Important Relationship

    Functional Interface
            ↓
    Single abstract method
            ↓
    Lambda provides implementation
            ↓
    Interface reference stores lambda
            ↓
    Method call executes lambda

## Interview Questions & Answers

### 1. What is a lambda expression?

A lambda expression is a concise way to provide an implementation of a functional interface's single abstract method.

### 2. What is a functional interface?

An interface containing exactly one abstract method.

### 3. Why use @FunctionalInterface?

It tells the compiler that the interface should have exactly one abstract method and helps detect accidental violations.

### 4. What does this mean?

    Calculator add = (a, b) -> a + b;

It means the `Calculator` reference points to a lambda implementation whose `calculate` operation performs addition.

### 5. How is the lambda executed?

By calling the functional interface's method:

    add.calculate(20, 5)

### 6. Does every lambda require a functional interface?

A lambda expression needs a target functional interface type.

### 7. Why don't we write return in this lambda?

    (a, b) -> a + b

Because it is a single expression lambda, whose value is implicitly returned.

### 8. How would you write it using a block?

    (a, b) -> {
        return a + b;
    }

### 9. Can the same functional interface have multiple lambda implementations?

Yes.

Example:

    Calculator add = (a, b) -> a + b;

    Calculator multiply = (a, b) -> a * b;

### 10. What is the benefit of lambda expressions?

They reduce boilerplate code and allow behavior to be passed as a value.

### 11. What is the difference between a lambda and a normal method?

A lambda is an expression that provides behavior for a functional interface, while a method is a named member of a class/interface.

### 12. What is the single abstract method in this problem?

    int calculate(int a, int b);

### 13. Can a functional interface contain other methods?

Yes, it can contain default and static methods. The restriction is on abstract methods: there must be exactly one abstract method.

### 14. What does `->` mean?

It separates lambda parameters from the lambda body.

### 15. What does `(a, b)` represent?

The parameters of the functional interface's abstract method.

## Quick Interview Summary

    Functional Interface
    → Exactly one abstract method

    @FunctionalInterface
    → Compiler validation

    Lambda
    → Implementation of functional interface

    (a, b) -> a + b
    → Addition behavior

    add.calculate(20, 5)
    → Executes lambda

    Single expression
    → Implicit return

    Multiple statements
    → Use { } and explicit return when needed