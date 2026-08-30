# Problem 90 — Character Frequency

## Difficulty

Easy–Medium — 15 minutes

## Topic

Collections

## Subtopic

HashMap + Strings

## Objective

Use HashMap to count the frequency of each character in a String.

## Problem Statement

Given:

"java programming"

Use HashMap<Character, Integer> to count the frequency of every character.

Then:

1. Display every character and its frequency.
2. Display the frequency of 'a'.
3. Check whether 'z' exists.
4. Display the number of unique characters.

Ignore spaces.

## Rules

- Use HashMap<Character, Integer>.
- Use charAt().
- Use containsKey().
- Use get().
- Use put().
- Use entrySet().
- Use size().
- Do not use getOrDefault().
- Ignore spaces.
- No ArrayList.

## Expected Result

a → 3

z present:

false

Unique characters:

10

The order of HashMap entries may vary.

## Learning Outcome

Understand how HashMap can be used to map individual characters to their frequencies.