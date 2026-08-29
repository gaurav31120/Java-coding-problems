# Problem CJ-059 — Employee Constructors

## Difficulty

Easy–Medium — 10–15 minutes

## Topic

OOP

## Subtopic

Constructor

## Objective

Create an Employee class with a parameterized constructor that initializes employee details.

## Problem Statement

Create an Employee class with:

- id
- name
- salary

Create a parameterized constructor that initializes all three fields.

Take employee details from the user, create an Employee object using the constructor, and display the employee details.

## Rules

- Create a separate Employee class.
- Use a parameterized constructor.
- Initialize id, name, and salary through the constructor.
- Create the object using new.
- Display the values using the object.
- Use Scanner.
- Do not use getters/setters yet.
- Do not use inheritance or interfaces.

## Example

Input:

101
Gaurav
50000

Expected Output:

===== Employee Details =====
ID: 101
Name: Gaurav
Salary: 50000.0

## Test Cases

### Test Case 1

Input:

101
Gaurav
50000

Expected:

ID: 101
Name: Gaurav
Salary: 50000.0

### Test Case 2

Input:

205
Rahul
65000.50

Expected:

ID: 205
Name: Rahul
Salary: 65000.5

### Test Case 3

Input:

1
Amit
25000

Expected:

ID: 1
Name: Amit
Salary: 25000.0

## Constraints

- Use Scanner.
- Use a separate Employee class.
- Use a parameterized constructor.
- Constructor must initialize all three fields.
- Use new to create the object.
- No getters/setters.
- No inheritance.
- No interface.
- No collections.

## Learning Outcome

Understand how constructors initialize object state and how parameterized constructors receive values during object creation.