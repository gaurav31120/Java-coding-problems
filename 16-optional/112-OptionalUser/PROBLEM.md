# Problem 112 — Optional User

## Difficulty

Medium — 15–20 minutes

## Topic

Optional

## Subtopic

Optional.ofNullable(), isPresent(), get()

## Objective

Learn how Optional can safely represent a value that may or may not exist.

## Problem Statement

Create a User class with:

- name
- email

Create:

Amit → amit@gmail.com
Rahul → null

Use Optional to safely handle the email.

For each user:

1. Create Optional<String> from the email.
2. Check whether the email is present.
3. Print the email if present.
4. Otherwise print "No email found".

## Rules

- Use Optional<String>.
- Use Optional.ofNullable().
- Use isPresent().
- Use get() only after checking presence.
- Do not directly operate on a possibly-null email.
- No Streams.
- No user input.

## Expected Result

Amit email:

amit@gmail.com

Rahul email:

No email found

## Learning Outcome

Understand how Optional represents a value that may or may not be present and how isPresent() and get() can be used to safely handle it.