# Problem 92 — LinkedHashMap

## Difficulty

Easy–Medium — 15 minutes

## Topic

Collections

## Subtopic

LinkedHashMap

## Objective

Understand how LinkedHashMap stores key-value pairs while maintaining insertion order.

## Problem Statement

Create a LinkedHashMap<Integer, String> containing:

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
5. Update employee 103 to Karan.
6. Remove employee 102.
7. Display final employee details.
8. Display employee count.

## Rules

- Use LinkedHashMap<Integer, String>.
- Use put().
- Use get().
- Use containsKey().
- Use containsValue().
- Use remove().
- Use entrySet().
- Use size().
- Do not use HashMap.
- Do not use TreeMap.
- No ArrayList.
- No user input.

## Expected Result

Initial insertion order:

101 → Amit
105 → Neha
103 → Gaurav
102 → Rahul
104 → Priya

After updating 103 and removing 102:

101 → Amit
105 → Neha
103 → Karan
104 → Priya

Employee count:

4

## Learning Outcome

Understand that LinkedHashMap maintains insertion order, unlike HashMap, while still providing Map operations.