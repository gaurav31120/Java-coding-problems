# Notes — Problem 75: Order Status

## Topic

Wrappers, Enums & Generics

## Subtopic

Enum

## What is an Enum?

An enum is a special Java type used to represent a fixed set of constants.

Example:

    enum OrderStatus {
        PLACED,
        PROCESSING,
        SHIPPED,
        DELIVERED,
        CANCELLED
    }

The possible values are restricted to these five constants.

## Why Use Enum?

Instead of using Strings:

    String status = "SHIPPED";

we can use:

    OrderStatus status = OrderStatus.SHIPPED;

This provides a fixed set of valid values.

## Enum Declaration

Basic syntax:

    enum OrderStatus {
        PLACED,
        PROCESSING,
        SHIPPED,
        DELIVERED,
        CANCELLED
    }

Each value is an enum constant.

## Creating an Enum Variable

Example:

    OrderStatus status = OrderStatus.SHIPPED;

Here:

    OrderStatus
    → enum type

    status
    → variable

    OrderStatus.SHIPPED
    → enum constant

## Accessing Enum Constants

Use:

    EnumName.CONSTANT

Example:

    OrderStatus.SHIPPED

Other examples:

    OrderStatus.PLACED
    OrderStatus.PROCESSING
    OrderStatus.DELIVERED
    OrderStatus.CANCELLED

## Enum with switch

Enums work very well with switch.

Example:

    switch (status) {

        case PLACED:
            System.out.println("Order placed.");
            break;

        case PROCESSING:
            System.out.println("Order processing.");
            break;

        case SHIPPED:
            System.out.println("Order shipped.");
            break;

        case DELIVERED:
            System.out.println("Order delivered.");
            break;

        case CANCELLED:
            System.out.println("Order cancelled.");
            break;
    }

Inside the switch, we don't need:

    OrderStatus.SHIPPED

We simply write:

    case SHIPPED:

because the switch already knows the type.

## Enum vs String

Using String:

    String status = "SHIPPED";

Problems:

- Typing mistakes are possible.
- Any arbitrary String can be assigned.
- The allowed values aren't clearly restricted.

Using enum:

    OrderStatus status = OrderStatus.SHIPPED;

Only defined enum constants can be assigned.

## Example

Valid:

    OrderStatus status = OrderStatus.SHIPPED;

Invalid:

    OrderStatus status = "SHIPPED";

The second example attempts to assign a String to an OrderStatus variable.

## Enum Values

Java provides a built-in `values()` method.

Example:

    for (OrderStatus status : OrderStatus.values()) {
        System.out.println(status);
    }

This can be used to iterate over all enum constants.

## Enum valueOf()

Java also provides:

    OrderStatus.valueOf("SHIPPED")

which returns:

    OrderStatus.SHIPPED

Be careful: if the supplied String does not exactly match a constant, `valueOf()` throws an exception.

## Enum ordinal()

Enums also have:

    ordinal()

Example:

    OrderStatus.SHIPPED.ordinal()

This returns the zero-based position of the constant.

However, ordinal values should generally not be used as permanent business identifiers because changing the enum order changes the ordinal.

## Important Mental Model

Think of an enum as a controlled list of allowed values.

    OrderStatus
         ↓
    ┌─────────────┐
    │ PLACED      │
    │ PROCESSING  │
    │ SHIPPED     │
    │ DELIVERED   │
    │ CANCELLED   │
    └─────────────┘

The variable can hold one of these values.

## Real-World Uses

Enums are commonly useful for:

- Order status
- Payment status
- User roles
- Days of week
- Directions
- Priority
- State machines
- Categories with fixed values

Examples:

    PaymentStatus.SUCCESS
    PaymentStatus.FAILED

    UserRole.ADMIN
    UserRole.USER

    Priority.HIGH
    Priority.LOW

## Interview Questions & Answers

### 1. What is an enum?

An enum is a special Java type used to represent a fixed set of constants.

### 2. Why use enums?

They provide a restricted set of valid values and make code more readable and type-safe than using arbitrary Strings or integers.

### 3. How do you declare an enum?

    enum OrderStatus {
        PLACED,
        PROCESSING,
        SHIPPED
    }

### 4. How do you create an enum variable?

    OrderStatus status = OrderStatus.SHIPPED;

### 5. Can an enum variable store a String?

No.

The variable must contain one of the enum's constants.

### 6. Can enums be used with switch?

Yes.

Enums are commonly used with switch statements.

### 7. Why don't we write OrderStatus.SHIPPED inside case?

Because the switch expression already has the enum type.

So:

    switch (status) {
        case SHIPPED:
    }

is sufficient.

### 8. What does values() do?

It returns an array containing all enum constants.

Example:

    OrderStatus.values()

### 9. What does valueOf() do?

It converts a matching String into the corresponding enum constant.

Example:

    OrderStatus.valueOf("SHIPPED")

### 10. What happens if valueOf() receives an invalid value?

It throws `IllegalArgumentException`.

### 11. What does ordinal() return?

It returns the zero-based position of the enum constant.

### 12. Should ordinal() be used as a database ID?

Generally no. Enum ordering can change, which would change the ordinal.

### 13. Can an enum contain methods?

Yes. Enums can contain fields, constructors, methods, and more.

### 14. Why are enums useful in backend applications?

They are useful for representing fixed business states such as order status, payment status, roles, and priorities.

## Quick Interview Summary

    enum
    → fixed set of constants

    Example:
    OrderStatus.SHIPPED

    Variable:
    OrderStatus status

    switch:
    switch (status)

    case:
    case SHIPPED:

    All values:
    OrderStatus.values()

    String → enum:
    OrderStatus.valueOf("SHIPPED")

    Position:
    status.ordinal()