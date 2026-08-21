# Notes — CJ-009 Electricity Bill Calculator

## Concepts Learned

- Scanner
- if / else if / else
- Relational operators
- Arithmetic operators
- Input validation
- Slab-based calculations
- Conditional surcharge

## Key Learning

When implementing slab-based calculations, each slab must correctly account for the units belonging to the previous slabs.

Example:

100 units → 100 × 2

200 units:

100 × 2 + 100 × 3

350 units:

100 × 2 + 100 × 3 + 150 × 5

## Interview Questions & Answers

### 1. What is the difference between `if` and `else if`?

`if` checks a condition independently. `else if` is checked only when the previous condition is false.

### 2. Why did we use `else if` for the electricity slabs?

Only one slab calculation should be selected based on the total number of units. Using `else if` prevents multiple slab blocks from executing.

### 3. What would happen if we used multiple independent `if` statements?

Multiple conditions could execute for the same input, causing incorrect bill calculations.

### 4. Why do we need to handle the previous slabs when calculating higher slabs?

The electricity rate changes progressively. Units in earlier ranges must be charged using their respective rates.

### 5. Why is input validation important?

It prevents invalid values such as negative units from being processed.

### 6. What is a boundary condition?

A boundary condition is a value at the edge of a range, such as 100, 200, or 400 units. These values must be handled correctly.

### 7. Why is `double` used for the bill?

The bill can contain decimal values, especially after applying the percentage surcharge.

### 8. What is the purpose of the surcharge condition?

The surcharge is applied only when the base bill is greater than ₹2000.