# Problem CJ-084 — Unique Values

## Difficulty

Easy–Medium — 10–15 minutes

## Topic

Collections

## Subtopic

HashSet

## Objective

Understand how HashSet stores unique elements and automatically ignores duplicates.

## Problem Statement

Create a HashSet<Integer> to store employee ID numbers.

Add:

101
102
103
101
104
102
105

Then:

1. Display the HashSet.
2. Display the number of unique employee IDs.
3. Check whether 103 exists using contains().
4. Check whether 999 exists using contains().

## Rules

- Use HashSet<Integer>.
- Add all 7 IDs.
- Use contains().
- Use size().
- Do not manually remove duplicates.
- Do not use ArrayList.
- No user input required.

## Example

The unique values must be:

101
102
103
104
105

Expected information:

Unique ID Count: 5
Contains 103: true
Contains 999: false

HashSet does not guarantee insertion order, so the display order may differ.

## Test Cases

### Test Case 1

101, 102, 103, 101

Expected unique count:

3

### Test Case 2

contains(103)

Expected:

true

### Test Case 3

contains(999)

Expected:

false

### Test Case 4

101, 102, 103, 101, 104, 102, 105

Expected unique count:

5

## Constraints

- Use HashSet<Integer>.
- Add all seven IDs.
- Use contains().
- Use size().
- Do not manually remove duplicates.
- No ArrayList.
- No user input.

## Learning Outcome

Understand how HashSet automatically prevents duplicate elements and how contains() and size() can be used with a set.