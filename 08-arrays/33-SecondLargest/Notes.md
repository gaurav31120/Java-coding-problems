# Notes — CJ-033 Second Largest

## Concepts Learned

- Finding maximum
- Finding second maximum
- Distinct values
- Single traversal
- Comparison
- Variable tracking
- Integer.MIN_VALUE
- Edge cases
- Time complexity
- Space complexity

## Problem

Find:

1. Largest value
2. Second largest DISTINCT value

Example:

    {10, 10, 8, 7}

Result:

    Largest = 10
    Second largest = 8

## Main Idea

Maintain two variables:

    max
    secondMax

Whenever a new maximum is found:

    old max → secondMax
    current value → max

If the current value is not the maximum but is greater than secondMax, update secondMax.

## Initialization

Use:

    int max = arr[0];

For secondMax:

    int secondMax = Integer.MIN_VALUE;

Why?

Because we need a value smaller than every possible int value.

## New Maximum

Condition:

    if (arr[i] > max)

Then:

    secondMax = max;
    max = arr[i];

Example:

    max = 75000
    secondMax = 50000

Current:

    90000

Since:

    90000 > 75000

Update:

    secondMax = 75000
    max = 90000

## Updating Second Maximum

If the current value is not a new maximum, check:

    arr[i] < max && arr[i] > secondMax

If true:

    secondMax = arr[i];

This ensures that secondMax is:

- Smaller than max
- Larger than the previous secondMax

## Why Check arr[i] < max?

The problem asks for the second DISTINCT largest value.

Suppose:

    {10, 10, 8}

When current value is 10:

    10 < max

is false.

Therefore duplicate 10 does not become secondMax.

The answer becomes:

    max = 10
    secondMax = 8

## Example Dry Run

Array:

    {10, 10, 8, 7}

Initial:

    max = 10
    secondMax = Integer.MIN_VALUE

### First 10

Already used as max.

No change.

### Second 10

    10 > 10 → false

    10 < 10 → false

No change.

### 8

    8 > 10 → false

    8 < 10 → true
    8 > Integer.MIN_VALUE → true

Therefore:

    secondMax = 8

### 7

    7 > 10 → false

    7 < 10 → true
    7 > 8 → false

No change.

Final:

    max = 10
    secondMax = 8

## Why Use Integer.MIN_VALUE?

It represents the smallest possible value of the `int` data type.

Value:

    -2147483648

Therefore, it provides a safe starting point for secondMax when the array contains normal integer values.

## Important Edge Case

Array:

    {10, 10, 10}

There is no second DISTINCT largest value.

After processing:

    max = 10
    secondMax = Integer.MIN_VALUE

Therefore check:

    if (secondMax == Integer.MIN_VALUE)

and report:

    No second largest value

## Important Definition

Second largest means:

    second DISTINCT largest value

Example:

    {100, 100, 90}

Result:

    Largest = 100
    Second largest = 90

Not:

    Second largest = 100

## Single Traversal

The array is scanned once.

Therefore:

    Time Complexity = O(n)

## Space Complexity

Only two variables are required:

    max
    secondMax

Therefore:

    Space Complexity = O(1)

## Why Not Sort?

We could sort the array, but that is unnecessary.

Sorting changes the problem from a simple linear scan into a sorting problem.

A single traversal is more efficient.

## Common Mistake

Wrong:

    int max = arr[0];
    int secondMax = max;

This creates:

    max = 10
    secondMax = 10

which doesn't represent a DISTINCT second largest value.

Better:

    int max = arr[0];
    int secondMax = Integer.MIN_VALUE;

## Another Common Mistake

Wrong:

    if (arr[i] > max) {
        max = arr[i];
    }

This loses the previous maximum.

Correct:

    if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
    }

The old maximum becomes the new second maximum.

## Interview Questions & Answers

### 1. How do you find the second largest element?

Maintain `max` and `secondMax` while traversing the array.

### 2. Why does the old maximum become secondMax?

When a new value becomes the maximum, the previous maximum is automatically the second largest candidate.

### 3. Why use Integer.MIN_VALUE?

It provides a very small initial value so that normal integers can replace it.

### 4. What does DISTINCT mean?

Duplicate values are considered only once.

Example:

    {10, 10, 8}

Second largest distinct value:

    8

### 5. What is the time complexity?

    O(n)

### 6. What is the space complexity?

    O(1)

### 7. Can this be solved in one traversal?

Yes.

### 8. Why not sort the array?

Sorting is unnecessary. A single traversal can solve the problem in O(n).

### 9. What happens with all equal elements?

There is no second distinct largest value.

### 10. What happens with negative numbers?

The algorithm still works because `secondMax` starts at `Integer.MIN_VALUE`.

Example:

    {-10, -20, -5}

Result:

    max = -5
    secondMax = -10

### 11. Why can't we initialize secondMax to 0?

Because the array could contain only negative numbers.

Example:

    {-10, -20, -5}

Initializing:

    secondMax = 0

would be incorrect.

### 12. Why do we check arr[i] < max?

To prevent a duplicate maximum from becoming the second largest.

### 13. What does this condition mean?

    arr[i] < max && arr[i] > secondMax

It means:

    current value is below the maximum
    AND
    current value is greater than current second maximum

Therefore it is a valid second-largest candidate.

### 14. What if the array has only one distinct value?

There is no second largest distinct value.

### 15. What is the general pattern?

    if (current > max) {
        secondMax = max;
        max = current;
    } else if (current < max && current > secondMax) {
        secondMax = current;
    }

## Quick Interview Summary

    max
    → largest value

    secondMax
    → second largest DISTINCT value

    New maximum
    → old max becomes secondMax

    Second candidate
    → current < max && current > secondMax

   