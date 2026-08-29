# Problem CJ-062 — Employee Encapsulation

## Difficulty

Medium — 10–15 minutes

## Topic

OOP

## Subtopic

Getter/Setter

## Objective

Use encapsulation by making employee fields private and accessing them through getters and setters.

## Problem Statement

Create an Employee class with:

- id
- name
- salary

Make all three fields private.

Create:

- A parameterized constructor.
- Getter methods for all three fields.
- Setter methods for all three fields.

Take the initial employee details from the user, create an Employee object, display the details using getters, update the salary using its setter, and display the updated details.

## Rules

- Fields must be private.
- Use a parameterized constructor.
- Use getters to read the fields.
- Use setters to modify the fields.
- Do not access private fields directly from main().
- Use Scanner.
- No inheritance.
- No interface.
- No collections.

## Example

Input:

101
Gaurav
50000
60000

Expected Output:

===== Employee Details =====
ID: 101
Name: Gaurav
Salary: 50000.0

===== Updated Employee Details =====
ID: 101
Name: Gaurav
Salary: 60000.0

## Test Cases

### Test Case 1

Input:

101
Gaurav
50000
60000

Expected:

ID: 101
Name: Gaurav
Salary: 60000.0

### Test Case 2

Input:

205
Rahul
65000
70000

Expected:

ID: 205
Name: Rahul
Salary: 70000.0

### Test Case 3

Input:

1
Amit
25000
30000

Expected:

ID: 1
Name: Amit
Salary: 30000.0

## Constraints

- id, name, and salary must be private.
- Use a constructor.
- Use getters and setters.
- Salary can be updated through the setter.
- Do not directly access private fields from main().
- Use Scanner.

## Learning Outcome

Understand encapsulation and how getters and setters provide controlled access to private object data.