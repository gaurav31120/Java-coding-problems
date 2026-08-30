# Problem CJ-082 — List Search/Remove

## Difficulty

Easy–Medium — 10–15 minutes

## Topic

Collections

## Subtopic

List

## Objective

Understand searching and removing elements from an ArrayList using List methods.

## Problem Statement

Create an ArrayList<String> containing 5 employee names.

Perform:

1. Display the complete employee list.
2. Search whether "Rahul" exists using contains().
3. Find the index of "Rahul" using indexOf().
4. Remove "Rahul".
5. Check again whether "Rahul" exists.
6. Display the final list and its size.

## Rules

- Use ArrayList<String>.
- Use contains().
- Use indexOf().
- Use remove().
- Use size().
- Do not manually search using a loop.
- Do not use HashSet or HashMap.
- No user input required.

## Example

Initial list:

[Amit, Rahul, Gaurav, Priya, Neha]

Expected:

===== Employee List =====
Employees: [Amit, Rahul, Gaurav, Priya, Neha]

Contains Rahul: true
Rahul Index: 1

===== After Removing Rahul =====
Employees: [Amit, Gaurav, Priya, Neha]
Contains Rahul: false
Employee Count: 4

## Test Cases

### Test Case 1

contains("Rahul")

Expected:

true

### Test Case 2

indexOf("Rahul")

Expected:

1

### Test Case 3

After removing Rahul:

[Amit, Gaurav, Priya, Neha]

Expected size:

4

## Constraints

- Use ArrayList<String>.
- Use contains().
- Use indexOf().
- Use remove().
- Use size().
- No manual searching with loops.
- No HashSet or HashMap.
- No user input.

## Learning Outcome

Understand how List methods can be used to search for elements, find their positions, remove them, and determine the current size of an ArrayList.