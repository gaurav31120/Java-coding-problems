# Problem CJ-063 — Employee Object Counter

## Difficulty

Medium — 10–15 minutes

## Topic

OOP

## Subtopic

static

## Objective

Use a static variable to count how many Employee objects have been created.

## Problem Statement

Create an Employee class with:

- id
- name
- salary
- A static variable that counts Employee objects.

Create a constructor that initializes the employee details and increments the object counter whenever a new Employee object is created.

In main():

1. Take details for three employees.
2. Create three Employee objects.
3. Display each employee's details.
4. Display the total number of employees created.

## Rules

- Create a separate Employee class.
- id, name, and salary must be instance variables.
- The employee counter must be static.
- Increment the counter inside the constructor.
- Create exactly three Employee objects.
- Use Scanner.
- Access the static counter appropriately.
- Do not use collections.
- Do not use inheritance or interfaces.

## Example

Input:

101
Gaurav
50000
102
Rahul
60000
103
Amit
55000

Expected Output:

===== Employee Details =====
ID: 101
Name: Gaurav
Salary: 50000.0

ID: 102
Name: Rahul
Salary: 60000.0

ID: 103
Name: Amit
Salary: 55000.0

Total Employees: 3

## Test Cases

### Test Case 1

Create three employees.

Expected:

Total Employees: 3

### Test Case 2

Create three employees with different salaries.

Expected:

Each employee displays the correct ID, name, and salary.

Total Employees: 3

### Test Case 3

Verify that the counter is shared by all objects.

Expected:

Total Employees: 3

## Constraints

- Create exactly three objects.
- Counter must be declared using static.
- Counter must be incremented inside the constructor.
- Use a constructor for employee initialization.
- Use Scanner.
- No collections.
- No inheritance.
- No interfaces.

## Learning Outcome

Understand how static variables are shared across objects and how they can be used to maintain class-level information.