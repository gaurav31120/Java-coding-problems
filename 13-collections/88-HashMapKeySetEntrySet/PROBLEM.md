# Problem CJ-088 — keySet / entrySet

## Difficulty

Easy–Medium — 10–15 minutes

## Topic

Collections

## Subtopic

HashMap Iteration

## Objective

Understand the difference between keySet() and entrySet() when iterating through a HashMap.

## Problem Statement

Create a HashMap<Integer, String> containing:

101 → Amit
102 → Rahul
103 → Gaurav
104 → Priya
105 → Neha

Then:

1. Display all employee IDs using keySet().
2. Display all employee names using get().
3. Display both employee ID and name using entrySet().
4. Display the total number of employees using size().

## Rules

- Use HashMap<Integer, String>.
- Use keySet().
- Use get().
- Use entrySet().
- Use getKey().
- Use getValue().
- Use size().
- No arrays.
- No ArrayList.
- No user input.

## Expected Result

Employee IDs:

101
102
103
104
105

Employee names:

Amit
Rahul
Gaurav
Priya
Neha

Employee details:

101 → Amit
102 → Rahul
103 → Gaurav
104 → Priya
105 → Neha

Employee Count:

5

HashMap does not guarantee insertion order.

## Learning Outcome

Understand how keySet() provides keys and entrySet() provides complete key-value mappings when iterating through a HashMap.