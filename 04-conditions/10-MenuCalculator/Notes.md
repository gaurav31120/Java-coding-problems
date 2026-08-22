# Notes — CJ-010 Menu-Based Calculator

## Concepts Learned

- Scanner
- switch
- case
- default
- break
- Arithmetic operators
- double
- Division and modulus
- Input validation
- Fall-through

## Key Learning

`switch` is useful when one value needs to be compared against multiple fixed choices.

Each independent `case` should normally use `break` to prevent fall-through.

Using `double` allows the calculator to handle decimal values.

Example:

25 / 4 = 6.25

Division and modulus require checking for zero before performing the operation.

## Interview Questions & Answers

### 1. What is the purpose of a `switch` statement?

`switch` is used when one expression needs to be compared against multiple fixed values.

### 2. Why do we use `break` inside a `switch`?

`break` stops execution of the current case and prevents unwanted fall-through into the next case.

### 3. What happens if `break` is not used?

Execution can continue into the following cases even after the matching case has executed. This is called fall-through.

### 4. What is the purpose of `default`?

`default` executes when none of the specified cases match.

### 5. Why did we use `double` instead of `int`?

Because the calculator needs to support decimal values and decimal results from division.

### 6. Why can `25 / 4` produce `6` instead of `6.25` in Java?

If both operands are integers, Java performs integer division. Using `double` operands produces the decimal result.

### 7. What is the difference between `/` and `%`?

`/` performs division, while `%` returns the remainder.

Example:

25 / 4 = 6
25 % 4 = 1

### 8. Why do we check for zero before division and modulus?

Division or modulus with zero is invalid, so the program must validate the second number before performing the operation.