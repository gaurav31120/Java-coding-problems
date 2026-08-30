# Problem CJ-087 — HashMap CRUD

## Difficulty

Easy–Medium — 10–15 minutes

## Topic

Collections

## Subtopic

HashMap

## Objective

Understand basic CRUD operations using HashMap.

## Problem Statement

Create a HashMap<Integer, String> to store employee IDs and employee names.

Add:

101 → 101
102 → Rahul
103 → Gaurav
104 → Priya
105 → Neha

Then:

1. Display all employee ID-name pairs.
2. Get the name of employee ID 103.
3. Update employee ID 103 to Karan.
4. Check whether employee ID 104 exists using containsKey().
5. Check whether Rahul exists using containsValue().
6. Remove employee ID 102.
7. Display the final HashMap.
8. Display the final number of employees.

## Rules

- Use HashMap<Integer, String>.
- Use put().
- Use get().
- Use containsKey().
- Use containsValue().
- Use remove().
- Use size().
- No arrays.
- No ArrayList.
- No user input.

## Expected Result

Initial:

{101=Amit, 102=Rahul, 103=Gaurav, 104=Priya, 105=Neha}

Employee 103:

Gaurav

After updating:

103 → Karan

Contains key 104:

true

Contains value Rahul:

true

After removing 102:

{101=Amit, 103=Karan, 104=Priya, 105=Neha}

Final size:

4

HashMap does not guarantee ordering.

## Learning Outcome

Understand how HashMap stores key-value pairs and how put(), get(), containsKey(), containsValue(), remove(), and size() are used.