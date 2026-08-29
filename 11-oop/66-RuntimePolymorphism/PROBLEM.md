# Problem CJ-066 — Runtime Polymorphism

## Difficulty

Medium — 10–15 minutes

## Topic

OOP

## Subtopic

Runtime Polymorphism

## Objective

Understand runtime polymorphism using a parent-class reference pointing to different child objects.

## Problem Statement

Create a parent class Payment with a processPayment() method.

Create two child classes:

- CardPayment
- UPIPayment

Both child classes must override processPayment().

In main():

1. Create a Payment reference.
2. Assign a CardPayment object to it.
3. Call processPayment().
4. Reassign the same Payment reference to a UPIPayment object.
5. Call processPayment() again.

## Rules

- Payment must be the parent class.
- CardPayment and UPIPayment must extend Payment.
- Override processPayment() in both child classes.
- Use @Override.
- Use a parent-class reference.
- Do not create separate child references for the method calls.
- No interfaces.
- No collections.
- No user input.

## Example

Expected Output:

===== Runtime Polymorphism =====
Processing card payment
Processing UPI payment

## Test Cases

### Test Case 1

Payment payment = new CardPayment();
payment.processPayment();

Expected:

Processing card payment

### Test Case 2

Payment payment = new UPIPayment();
payment.processPayment();

Expected:

Processing UPI payment

### Test Case 3

Payment payment = new CardPayment();
payment.processPayment();

payment = new UPIPayment();
payment.processPayment();

Expected:

Processing card payment
Processing UPI payment

## Constraints

- Use inheritance.
- Use method overriding.
- Use a parent reference to refer to child objects.
- Use @Override.
- No interfaces.
- No collections.
- No user input.

## Learning Outcome

Understand runtime polymorphism and how Java selects an overridden method based on the actual object associated with a parent-class reference.