# Problem CJ-008 — Grade Calculator

## Difficulty

Medium — Interview Style

## Topic

Conditions & Operators

## Subtopic

- Scanner
- if / else if / else
- Relational Operators
- Logical Operators
- Boundary Conditions
- Arithmetic Calculations
- Business Rules

## Objective

Build a student grade evaluation system using user input, conditions, calculations, and business rules.

## Problem Statement

Take marks for:

- Java
- SQL
- Spring Boot

Each subject is out of 100.

## Rules

1. Every mark must be between 0 and 100.
2. Student must score at least 40 in every subject to pass.
3. Calculate the average.
4. Assign grade:
   - 90–100 → A
   - 75–89 → B
   - 60–74 → C
   - 40–59 → D
5. Determine the highest-scoring subject.
6. If multiple subjects have the same highest marks, print all of them.

## Requirements

- Use Scanner.
- Use if / else if / else.
- Validate all marks.
- Calculate the average as a decimal value.
- Determine PASS/FAIL.
- Determine the grade.
- Determine the highest-scoring subject.
- Handle equal highest marks.
- Handle boundary values correctly.
- Do not use arrays.
- Do not use loops.
- Do not create additional methods.

## Test Cases

### Test Case 1

Java: 85
SQL: 72
Spring Boot: 91

Expected:

Average: 82.67
Grade: B
Highest Subject: Spring Boot
Result: PASS

### Test Case 2

Java: 35
SQL: 80
Spring Boot: 90

Expected:

Result: FAIL

### Test Case 3

Java: 101
SQL: 80
Spring Boot: 90

Expected:

Invalid marks

### Test Case 4

Java: 40
SQL: 40
Spring Boot: 40

Expected:

Grade: D
Result: PASS

### Test Case 5

Java: 85
SQL: 85
Spring Boot: 70

Expected:

Highest Subject: Java, SQL

## Learning Outcome

Practice combining Scanner, variables, arithmetic operations, relational operators, logical operators, conditional statements, validation, boundary conditions, and business rules in one program.