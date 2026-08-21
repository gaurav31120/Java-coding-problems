# Problem CJ-009 — Electricity Bill Calculator

## Difficulty

Medium

## Topic

Conditions & Operators

## Subtopic

- Scanner
- if / else if / else
- Relational Operators
- Arithmetic Operators
- Logical Operators
- Boundary Conditions
- Slab-Based Calculation

## Objective

Build an electricity bill calculator using user input, conditions, arithmetic calculations, and slab-based billing rules.

## Problem Statement

Take the number of electricity units consumed from the user.

Calculate the electricity bill based on the following slabs.

## Rules

1. First 100 units → ₹2 per unit.

2. Next 100 units (101–200) → ₹3 per unit.

3. Next 200 units (201–400) → ₹5 per unit.

4. Above 400 units → ₹7 per unit.

5. The calculation must be slab-based.

   Example for 350 units:

   - First 100 units → 100 × 2
   - Next 100 units → 100 × 3
   - Remaining 150 units → 150 × 5

6. If the base bill is greater than ₹2000, apply a 5% surcharge.

7. Calculate:

   `Final Bill = Base Bill + Surcharge`

8. If units are negative, print `Invalid units`.

## Requirements

- Use Scanner.
- Use if / else if / else.
- Calculate the bill according to the slabs.
- Calculate the surcharge when applicable.
- Calculate the final bill.
- Handle 0 units.
- Handle negative units.
- Handle boundary values correctly.
- Do not use arrays.
- Do not use loops.
- Do not create additional methods.

## Test Cases

### Test Case 1

Units: 50

Expected:

Enter units consumed: 50

===== Electricity Bill =====

Units Consumed: 50
Base Bill: ₹100.0
Surcharge: ₹0.0
Final Bill: ₹100.0

### Test Case 2

Units: 150

Expected:

Enter units consumed: 150

===== Electricity Bill =====

Units Consumed: 150
Base Bill: ₹350.0
Surcharge: ₹0.0
Final Bill: ₹350.0

### Test Case 3

Units: 350

Expected:

Enter units consumed: 350

===== Electricity Bill =====

Units Consumed: 350
Base Bill: ₹1050.0
Surcharge: ₹0.0
Final Bill: ₹1050.0

### Test Case 4

Units: 500

Expected:

Enter units consumed: 500

===== Electricity Bill =====

Units Consumed: 500
Base Bill: ₹1700.0
Surcharge: ₹0.0
Final Bill: ₹1700.0

### Test Case 5

Units: 0

Expected:

Enter units consumed: 0

===== Electricity Bill =====

Units Consumed: 0
Base Bill: ₹0.0
Surcharge: ₹0.0
Final Bill: ₹0.0

### Test Case 6

Units: -10

Expected:

Enter units consumed: -10

Invalid units

## Learning Outcome

Practice combining Scanner, conditional statements, arithmetic operations, boundary conditions, and slab-based calculations in one focused Java problem.