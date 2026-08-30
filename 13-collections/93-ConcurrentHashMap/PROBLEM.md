# Problem 93 — ConcurrentHashMap

## Difficulty

Medium — 20 minutes

## Topic

Collections

## Subtopic

ConcurrentHashMap

## Objective

Understand how ConcurrentHashMap can be safely accessed by multiple threads.

## Problem Statement

Create a ConcurrentHashMap<Integer, String> containing:

101 → Amit
102 → Rahul
103 → Gaurav
104 → Priya
105 → Neha

Then:

1. Display all employee details.
2. Get employee 103.
3. Check whether key 104 exists.
4. Check whether Rahul exists as a value.
5. Update employee 103 to Karan.
6. Remove employee 102.
7. Display the final employee details.
8. Display the employee count.

Then create two threads:

Thread 1:
106 → Arjun

Thread 2:
107 → Sneha

Start both threads and wait for both threads to finish.

Finally:

1. Display the final map.
2. Display the final employee count.

## Rules

- Use ConcurrentHashMap<Integer, String>.
- Use put().
- Use get().
- Use containsKey().
- Use containsValue().
- Use remove().
- Use entrySet().
- Use size().
- Use Thread.
- Use start().
- Use join().
- Do not use HashMap.
- Do not use synchronized.
- No ArrayList.

## Expected Result

After the initial operations:

101 → Amit
103 → Karan
104 → Priya
105 → Neha

After both threads finish:

106 → Arjun
107 → Sneha

Final employee count:

6

The iteration order does not need to be relied upon.

## Learning Outcome

Understand the purpose of ConcurrentHashMap and how it can be used when multiple threads access a shared map.