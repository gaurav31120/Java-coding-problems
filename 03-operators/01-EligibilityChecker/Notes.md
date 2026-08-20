# Notes — CJ-007 Eligibility Checker

## Concepts Learned

- Scanner input
- Relational operators
- Logical operators
- Boolean expressions
- AND (`&&`)
- OR (`||`)
- NOT (`!`)
- Ternary operator (`?:`)
- Combining multiple business rules

## Key Learning

Complex business rules can be broken into smaller boolean conditions and then combined to produce a final result.

Example:

boolean finalEligibility =
        ageEligible &&
        citizenEligible &&
        financialEligible &&
        loanEligible;

The ternary operator can be used to convert a boolean result into a readable output.

Example:

condition ? "PASS" : "FAIL"

## Interview Questions & Answers

### 1. What is the difference between `&&` and `||`?

`&&` returns true only when both conditions are true.

`||` returns true when at least one condition is true.

### 2. What does the `!` operator do?

The `!` operator reverses a boolean value.

Example:

!true → false

### 3. What is the ternary operator?

The ternary operator is a short form of an `if-else` expression.

Syntax:

condition ? valueIfTrue : valueIfFalse

### 4. Why did we use separate boolean variables?

Separating business rules makes the code easier to read, test, debug, and maintain.

### 5. What is operator precedence?

Operator precedence determines the order in which operators are evaluated in an expression.

Parentheses can be used when the intended evaluation order needs to be made explicit.

### 6. Why is `>=` different from `>`?

`>=` includes the boundary value, while `>` does not.

Example:

age >= 21 allows age 21.

age > 21 does not allow age 21.