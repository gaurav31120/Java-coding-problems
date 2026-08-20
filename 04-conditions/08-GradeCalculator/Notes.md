# Notes — CJ-008 Grade Calculator

## Concepts Learned

- Scanner input
- Input validation
- if / else if / else
- Relational operators
- Logical operators
- Boundary conditions
- Type casting
- Decimal arithmetic
- Business-rule evaluation
- Multiple-condition decision making

## Key Learning

Input should be validated before processing.

A good program flow is:

Input → Validation → Processing → Output

When calculating an average, at least one operand should be a floating-point value to avoid integer division.

Grade ranges should be designed carefully so decimal values are handled correctly.

Multiple conditions can be used to determine the highest value and handle ties.

## Interview Questions & Answers

### 1. Why did we validate the marks before calculating the grade?

Invalid input should not be processed. Validation prevents incorrect data from entering the business logic.

### 2. Why did we use `(double)` while calculating the average?

The marks are integers. Casting the sum to `double` ensures that division produces a decimal result instead of integer division.

### 3. What is integer division in Java?

When two integer values are divided, Java performs integer division and removes the fractional part.

Example:

```java
5 / 2