# Problem CJ-064 — Employee → Manager

## Difficulty

Medium — 10–15 minutes

## Topic

OOP

## Subtopic

Inheritance

## Objective

Understand inheritance by creating a Manager class that extends Employee.

## Problem Statement

Create a parent class Employee with:

- id
- name
- salary

Create a child class Manager that extends Employee and adds:

- department
- bonus

Use constructors to initialize the employee and manager details.

Take manager details from the user, create a Manager object, display all details, and calculate total compensation.

Total compensation:

salary + bonus

## Rules

- Manager must extend Employee.
- id, name, and salary belong to Employee.
- department and bonus belong to Manager.
- Use constructors.
- Use super() to call the parent constructor.
- Use Scanner.
- Do not use getters/setters.
- Do not use interfaces.
- Do not use collections.

## Example

Input:

101
Gaurav
80000
Engineering
10000

Expected Output:

===== Manager Details =====
ID: 101
Name: Gaurav
Salary: 80000.0
Department: Engineering
Bonus: 10000.0
Total Compensation: 90000.0

## Test Cases

### Test Case 1

Input:

101
Gaurav
80000
Engineering
10000

Expected:

Total Compensation: 90000.0

### Test Case 2

Input:

205
Rahul
60000
Finance
5000

Expected:

Total Compensation: 65000.0

### Test Case 3

Input:

301
Amit
100000
Technology
25000

Expected:

Total Compensation: 125000.0

## Constraints

- Manager must extend Employee.
- Use super() in the Manager constructor.
- Use a constructor for both classes.
- Bonus must be added to salary for total compensation.
- Use Scanner.
- No getters/setters.
- No interfaces.
- No collections.

## Learning Outcome

Understand inheritance, parent-child class relationships, constructor chaining with super(), and reuse of parent class fields.