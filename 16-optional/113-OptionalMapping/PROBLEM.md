# Problem 113 — Optional Mapping

## Difficulty

Medium — 15–20 minutes

## Topic

Optional

## Subtopic

map()

## Objective

Use Optional.map() to transform an email into its domain while safely handling null.

## Problem Statement

Create a User class with:

- name
- email

Create:

Amit → amit@gmail.com
Rahul → null

Use Optional to extract the email domain.

Expected:

Amit domain: gmail.com
Rahul domain: No domain found

## Rules

- Use Optional<String>.
- Use Optional.ofNullable().
- Use Optional.map().
- Use orElse().
- Do not use if (email != null).
- No Streams.

## Learning Outcome

Understand how Optional.map() transforms a present value and how orElse() provides a fallback when the Optional is empty.