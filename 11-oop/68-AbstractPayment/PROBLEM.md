# Problem CJ-068 — Abstract Payment

## Difficulty

Medium — 10–15 minutes

## Topic

OOP

## Subtopic

Abstract Class

## Objective

Understand abstract classes and abstract methods.

## Problem Statement

Create an abstract class Payment with:

- A double amount field
- A constructor to initialize amount
- An abstract processPayment() method

Create two child classes:

- CardPayment
- UPIPayment

Both classes must extend Payment and implement processPayment().

In main():

1. Create a CardPayment object with an amount.
2. Create a UPIPayment object with an amount.
3. Call processPayment() on both objects.

## Rules

- Payment must be abstract.
- processPayment() must be abstract.
- CardPayment and UPIPayment must extend Payment.
- Both child classes must implement processPayment().
- Use constructors.
- Do not create a Payment object directly.
- Use @Override.
- No interfaces.
- No collections.
- No user input.

## Example

Expected Output:

===== Abstract Payment =====
Processing card payment of 5000.0
Processing UPI payment of 3000.0

## Test Cases

### Test Case 1

CardPayment with amount 5000.

Expected:

Processing card payment of 5000.0

### Test Case 2

UPIPayment with amount 3000.

Expected:

Processing UPI payment of 3000.0

### Test Case 3

Card amount = 7500
UPI amount = 2500

Expected:

Processing card payment of 7500.0
Processing UPI payment of 2500.0

## Constraints

- Payment must be abstract.
- processPayment() must be abstract.
- amount belongs to the parent class.
- Use super(amount) in child constructors.
- Both child classes must override processPayment().
- Do not instantiate Payment.
- No interfaces.
- No collections.

## Learning Outcome

Understand abstract classes, abstract methods, constructor chaining, and how child classes provide implementations for abstract behavior.