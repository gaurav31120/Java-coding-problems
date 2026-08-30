# Problem CJ-085 — Set Duplicate Removal

## Difficulty

Easy–Medium — 10–15 minutes

## Topic

Collections

## Subtopic

Set

## Objective

Understand the Set interface and automatic duplicate removal.

## Problem Statement

Create a Set<String> using HashSet.

Add:

Amit
Rahul
Gaurav
Rahul
Priya
Amit
Neha
Gaurav

Then:

1. Display the Set.
2. Display the number of unique employees.
3. Demonstrate that duplicates are automatically removed.
4. Check whether Rahul exists.
5. Remove Gaurav.
6. Display the final Set and its size.

## Rules

- Use Set<String>.
- Use HashSet as the implementation.
- Do not manually remove duplicates.
- Use add().
- Use contains().
- Use remove().
- Use size().
- No arrays.
- No ArrayList.
- No user input.

## Example

Input:

[Amit, Rahul, Gaurav, Rahul, Priya, Amit, Neha, Gaurav]

Unique employees:

Amit
Rahul
Gaurav
Priya
Neha

Unique count:

5

Contains Rahul:

true

After removing Gaurav:

Amit
Rahul
Priya
Neha

Final count:

4

HashSet does not guarantee element order.

## Test Cases

### Test Case 1

Amit, Rahul, Amit

Expected unique count:

2

### Test Case 2

contains("Rahul")

Expected:

true

### Test Case 3

After remove("Gaurav")

Gaurav should no longer exist.

### Test Case 4

All initial values.

Expected unique count:

5

## Constraints

- Use Set<String>.
- Use HashSet.
- Do not manually remove duplicates.
- Use add(), contains(), remove(), and size().
- No arrays.
- No ArrayList.
- No user input.

## Learning Outcome

Understand the Set interface, HashSet implementation, and automatic duplicate removal.