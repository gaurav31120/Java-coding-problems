# Problem 91 — TreeMap

## Difficulty

Easy–Medium — 15 minutes

## Topic

Collections

## Subtopic

TreeMap

## Objective

Understand how TreeMap stores key-value pairs while keeping keys sorted.

## Problem Statement

Create a TreeMap<Integer, String> containing:

101 → Amit
105 → Neha
103 → Gaurav
102 → Rahul
104 → Priya

Then:

1. Display all employee details.
2. Get employee 103.
3. Check whether key 104 exists.
4. Check whether Rahul exists as a value.
5. Remove employee 102.
6. Display the first key using firstKey().
7. Display the last key using lastKey().
8. Display the final employee details.
9. Display the employee count.

## Rules

- Use TreeMap<Integer, String>.
- Use put().
- Use get().
- Use containsKey().
- Use containsValue().
- Use remove().
- Use firstKey().
- Use lastKey().
- Use entrySet().
- Use size().
- Do not use HashMap.
- Do not use ArrayList.
- No user input.

## Expected Result

TreeMap sorts employees by employee ID.

Initial sorted order:

101 → Amit
102 → Rahul
103 → Gaurav
104 → Priya
105 → Neha

After removing 102:

101 → Amit
103 → Gaurav
104 → Priya
105 → Neha

First key:

101

Last key:

105

Final count:

4

## Learning Outcome

Understand that TreeMap maintains keys in sorted order and provides methods such as firstKey() and lastKey().