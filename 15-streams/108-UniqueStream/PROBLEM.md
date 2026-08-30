# Problem 108 — Unique Stream

## Difficulty

Medium — 15–20 minutes

## Topic

Streams

## Subtopic

distinct()

## Objective

Understand how Stream.distinct() removes duplicate elements.

## Problem Statement

Create an ArrayList<Integer> containing:

50000
75000
50000
90000
75000
60000
90000

Use a Stream to:

1. Display the original list.
2. Remove duplicate salaries using distinct().
3. Display unique salaries.
4. Count unique salaries.

## Rules

- Use ArrayList<Integer>.
- Use stream().
- Use distinct().
- Use forEach().
- Use count().
- Do not use HashSet.
- Do not manually check duplicates.
- Do not use a traditional for loop for duplicate removal.

## Expected Result

Unique salaries:

50000
75000
90000
60000

Unique salary count:

4

## Learning Outcome

Understand how distinct() removes duplicate elements from a Stream.