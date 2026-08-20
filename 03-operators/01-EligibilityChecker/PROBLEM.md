# Problem CJ-007 — Eligibility Checker

## Difficulty

Medium — Interview Style

## Topic

Operators

## Subtopic

- Relational Operators
- Logical Operators
- Boolean Expressions
- Operator Precedence
- Scanner Input
- Business Rule Evaluation

## Objective

Build a financial eligibility checker using multiple conditions and user input.

## Problem Statement

Take the following values from the user:

- Age
- Citizenship
- Monthly Income
- Credit Score
- Existing Loan

## Business Rules

1. Age must be at least 21.
2. Applicant must be a citizen.
3. Monthly income must be at least 50000 OR credit score must be at least 750.
4. Applicant must not have an existing loan.

## Requirements

- Use `Scanner`.
- Create separate boolean variables:
  - `ageEligible`
  - `citizenEligible`
  - `financialEligible`
  - `loanEligible`
  - `finalEligibility`
- Print the result of every check.
- Print the final decision.
- Program must work with different user inputs.
- Do not use loops.
- Do not create additional methods.
- Do not use one giant unreadable condition.

## Expected Output

===== Eligibility Report =====

Age Check: PASS
Citizenship Check: PASS
Financial Check: PASS
Existing Loan Check: PASS

Final Decision: ELIGIBLE

## Bonus Challenge

Also print:

- Income Check
- Credit Score Check

## Learning Outcome

Practice applying relational operators, logical operators, boolean expressions, Scanner input, and multiple business rules together.