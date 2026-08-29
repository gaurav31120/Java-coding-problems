# Problem CJ-065 — Payment Override

## Difficulty

Medium — 10–15 minutes

## Topic

OOP

## Subtopic

Method Overriding

## Objective

Understand method overriding by creating different implementations of the same parent method.

## Problem Statement

Create a parent class Payment with a processPayment() method.

Create two child classes:

- CardPayment
- UPIPayment

Both child classes must override processPayment() with their own implementation.

Create one object of each child class and call processPayment().

## Rules

- Create a parent class Payment.
- Create CardPayment and UPIPayment extending Payment.
- Override processPayment() in both child classes.
- Use the @Override annotation.
- No interfaces.
- No collections.
- No user input required.

## Example

Expected Output:

===== Payment Processing =====
Processing card payment
Processing UPI payment

## Test Cases

### Test Case 1

Create a CardPayment object.

Expected:

Processing card payment

### Test Case 2

Create a UPIPayment object.

Expected:

Processing UPI payment

### Test Case 3

Call processPayment() on both objects.

Expected:

Processing card payment
Processing UPI payment

## Constraints

- Payment must be the parent class.
- CardPayment and UPIPayment must extend Payment.
- Both child classes must override processPayment().
- Use @Override.
- No interfaces.
- No collections.

## Learning Outcome

Understand method overriding and how child classes can provide their own implementation of a method inherited from a parent class.