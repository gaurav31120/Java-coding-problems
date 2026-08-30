# Problem CJ-081 — ArrayList CRUD

## Difficulty

Medium — 10–15 minutes

## Topic

Collections

## Subtopic

ArrayList

## Objective

Understand basic CRUD operations using ArrayList.

## Problem Statement

Create an ArrayList<String> to store employee names.

Perform:

1. Create — Add 5 employee names.
2. Read — Display all employee names.
3. Update — Update the third employee's name.
4. Delete — Remove the second employee.
5. Display the final employee list and its size.

Use:

- add()
- get()
- set()
- remove()
- size()

## Rules

- Use ArrayList<String>.
- Add exactly 5 initial employee names.
- Use get() to read an element.
- Use set() for updating.
- Use remove() for deleting.
- Use size() to display the final count.
- Do not use arrays.
- Do not use other collection types.
- No user input required.

## Example

Initial:

[Amit, Rahul, Gaurav, Priya, Neha]

Update third employee:

Gaurav → Rohan

Remove second employee:

Rahul

Expected final list:

[Amit, Rohan, Priya, Neha]

Final size:

4

## Test Cases

### Test Case 1

Third employee should be Gaurav.

### Test Case 2

After update:

[Amit, Rahul, Rohan, Priya, Neha]

### Test Case 3

After deletion:

[Amit, Rohan, Priya, Neha]

Final size:

4

## Constraints

- Use ArrayList<String>.
- Exactly 5 initial elements.
- Update third element using set().
- Remove second element using remove().
- Display final size using size().

## Learning Outcome

Understand ArrayList CRUD operations and zero-based indexing.