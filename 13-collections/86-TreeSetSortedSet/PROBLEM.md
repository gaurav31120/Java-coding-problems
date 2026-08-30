# Problem CJ-086 — TreeSet Sorted Set

## Difficulty

Easy–Medium — 10–15 minutes

## Topic

Collections

## Subtopic

TreeSet

## Objective

Understand how TreeSet stores unique elements in sorted order.

## Problem Statement

Create a TreeSet<Integer> to store employee salary values.

Add:

50000
75000
45000
90000
60000
75000
45000

Then:

1. Display all salaries.
2. Display the smallest salary.
3. Display the largest salary.
4. Check whether 60000 exists.
5. Remove 75000.
6. Display the final sorted salaries.
7. Display the number of unique salaries.

## Rules

- Use TreeSet<Integer>.
- Use add().
- Use first().
- Use last().
- Use contains().
- Use remove().
- Use size().
- Do not manually sort.
- Do not use ArrayList.
- No user input.

## Expected Result

Initial sorted unique values:

[45000, 50000, 60000, 75000, 90000]

Smallest:

45000

Largest:

90000

Contains 60000:

true

After removing 75000:

[45000, 50000, 60000, 90000]

Final size:

4

## Learning Outcome

Understand how TreeSet automatically removes duplicates and maintains elements in sorted order.