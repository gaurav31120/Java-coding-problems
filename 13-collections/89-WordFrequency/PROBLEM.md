# Problem CJ-089 — Word Frequency

## Difficulty

Easy–Medium — 15 minutes

## Topic

Collections

## Subtopic

HashMap + Strings

## Objective

Use HashMap to count the frequency of each word in a sentence.

## Problem Statement

Given:

"java is easy and java is powerful"

Use HashMap<String, Integer> to count how many times each word appears.

Then:

1. Split the sentence into words.
2. Store each word as a key.
3. Store its frequency as the value.
4. Display every word and its frequency.
5. Display the frequency of java.
6. Check whether python exists.
7. Display the number of unique words.

## Rules

- Use HashMap<String, Integer>.
- Use split().
- Use containsKey().
- Use get().
- Use put().
- Use size().
- Do not manually count each word.
- No ArrayList.
- No user input.
- Do not use getOrDefault().

## Expected Result

java → 2
is → 2
easy → 1
and → 1
powerful → 1

java frequency:

2

python present:

false

Unique word count:

5

HashMap does not guarantee ordering.

## Learning Outcome

Understand how HashMap can be used to map each word to its frequency and update values when the same key appears multiple times.