# Problem 114 — orElse() vs orElseGet()

## Difficulty

Medium — 20 minutes

## Topic

Optional

## Subtopic

orElse() vs orElseGet()

## Objective

Understand the difference between providing a fallback value with orElse() and providing a Supplier with orElseGet().

## Problem Statement

Create a User class with:

- name
- email

Create:

Amit → amit@gmail.com
Rahul → null

For each user:

1. Create Optional<String> using Optional.ofNullable().
2. Use orElse() with "default@gmail.com".
3. Use orElseGet() with "generated@gmail.com".
4. Print the results.

## Expected Result

Amit:

orElse() → amit@gmail.com
orElseGet() → amit@gmail.com

Rahul:

orElse() → default@gmail.com
orElseGet() → generated@gmail.com

## Bonus Experiment

Create:

static String generateDefaultEmail()

Print a message inside the method.

Compare:

    email.orElse(generateDefaultEmail())

with:

    email.orElseGet(() -> generateDefaultEmail())

Use an Optional that already contains a value and observe which fallback method executes.

## Rules

- Use Optional<String>.
- Use Optional.ofNullable().
- Use orElse().
- Use orElseGet().
- No Streams.
- No traditional null check.

## Learning Outcome

Understand the difference between eager fallback evaluation with orElse() and lazy fallback evaluation with orElseGet().