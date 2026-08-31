# Problem 80 — Generic Repository

## Difficulty

Medium — 30 minutes

## Topic

Wrappers, Enums & Generics

## Subtopic

Generic Repository

## Objective

Build a simple reusable repository using Generics.

## Problem Statement

Create a generic class called:

    Repository<T>

The repository should internally store objects using an ArrayList.

Implement these methods:

    void add(T item)

    T get(int index)

    int size()

Then create two repositories:

1. Repository<String>
2. Repository<Integer>

Add values to both repositories and retrieve values from them.

## String Repository

Add:

    "Java"
    "Spring"
    "AWS"

Then retrieve the value at index 1.

Expected:

    Spring

## Integer Repository

Add:

    100
    200
    300

Then retrieve the value at index 2.

Expected:

    300

## Expected Output

===== Generic Repository =====

String at index 1: Spring
Integer at index 2: 300
String repository size: 3
Integer repository size: 3

## Requirements

1. Create a generic class:

       Repository<T>

2. Internally use:

       ArrayList<T>

3. Implement:

       add(T item)

4. Implement:

       get(int index)

5. Implement:

       size()

6. Create a `Repository<String>`.
7. Create a `Repository<Integer>`.
8. Add at least three values to each.
9. Retrieve one value from each.
10. Print the size of each repository.

## Rules

- Use Generics.
- Use ArrayList.
- Do not use raw types.
- Do not use Object.
- Do not create separate repository classes for String and Integer.
- Do not use Streams.
- Do not use static storage.

## Important Concept

The same repository class should work with different types.

Example:

    Repository<String>

and:

    Repository<Integer>

The generic type determines what the repository can store.

## Learning Outcome

Understand how Generics can be used to build reusable data structures and simple repository-style classes.