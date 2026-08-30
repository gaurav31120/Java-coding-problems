# Problem CJ-083 — LinkedList Task Queue

## Difficulty

Medium — 10–15 minutes

## Topic

Collections

## Subtopic

LinkedList

## Objective

Understand LinkedList operations for adding, viewing, and removing elements from the beginning and end.

## Problem Statement

Create a LinkedList<String> to represent a task queue.

Add:

- Task-1
- Task-2
- Task-3
- Task-4
- Task-5

Perform:

1. Display all tasks.
2. Add Urgent-Task at the beginning.
3. Add Final-Task at the end.
4. View the first task.
5. View the last task.
6. Remove the first task.
7. Remove the last task.
8. Display the final queue and its size.

## Rules

- Use LinkedList<String>.
- Use addFirst().
- Use addLast().
- Use getFirst().
- Use getLast().
- Use removeFirst().
- Use removeLast().
- Use size().
- Do not use arrays.
- Do not use ArrayList.
- No user input required.

## Example

Initial:

[Task-1, Task-2, Task-3, Task-4, Task-5]

After adding:

[Urgent-Task, Task-1, Task-2, Task-3, Task-4, Task-5, Final-Task]

After removing first and last:

[Task-1, Task-2, Task-3, Task-4, Task-5]

Final size:

5

## Test Cases

### Test Case 1

After addFirst("Urgent-Task"):

[Urgent-Task, Task-1, Task-2, Task-3, Task-4, Task-5]

### Test Case 2

After addLast("Final-Task"):

[Urgent-Task, Task-1, Task-2, Task-3, Task-4, Task-5, Final-Task]

### Test Case 3

After removing first and last:

[Task-1, Task-2, Task-3, Task-4, Task-5]

Final size:

5

## Constraints

- Use LinkedList<String>.
- Use addFirst().
- Use addLast().
- Use getFirst().
- Use getLast().
- Use removeFirst().
- Use removeLast().
- Use size().
- No arrays.
- No ArrayList.
- No user input.

## Learning Outcome

Understand LinkedList operations at both ends of the list and how these operations can be used to model a simple task queue.