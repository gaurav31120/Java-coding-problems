# Problem 75 — Order Status

## Difficulty

Easy — 15–20 minutes

## Topic

Wrappers, Enums & Generics

## Subtopic

Enum

## Objective

Understand how to create and use an enum in Java.

## Problem Statement

Create an enum called `OrderStatus` with the following values:

    PLACED
    PROCESSING
    SHIPPED
    DELIVERED
    CANCELLED

Create an order status variable and assign:

    SHIPPED

Print the current order status.

Then use a switch statement to print a meaningful message for each possible status.

## Expected Output

===== Order Status =====

Current status: SHIPPED
Your order has been shipped.

## Requirements

1. Create an enum named `OrderStatus`.
2. Add these five constants:

       PLACED
       PROCESSING
       SHIPPED
       DELIVERED
       CANCELLED

3. Create a variable of type `OrderStatus`.
4. Set it to `SHIPPED`.
5. Print the current status.
6. Use switch to handle all five statuses.
7. Print a meaningful message for each status.

## Example Messages

PLACED:

    Order has been placed.

PROCESSING:

    Order is being processed.

SHIPPED:

    Your order has been shipped.

DELIVERED:

    Order has been delivered.

CANCELLED:

    Order has been cancelled.

## Rules

- Use enum.
- Use switch.
- Do not use String comparisons for the status.
- Do not use if-else for the status handling.
- Do not use Streams.
- Keep the solution simple.

## Learning Outcome

Understand:

- What an enum is
- How to declare an enum
- How to create an enum variable
- How to assign enum constants
- How to use enum values with switch