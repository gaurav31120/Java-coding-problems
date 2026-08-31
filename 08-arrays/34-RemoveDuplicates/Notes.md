# Notes — CJ-034 Remove Duplicates

## Concepts Learned

- Duplicate detection
- Nested loops
- Array traversal
- In-place modification
- Index tracking
- `break`
- Original order preservation
- Time complexity
- Space complexity

## Problem

Given:

    {10, 20, 10, 30, 20, 40, 10}

remove duplicate values while maintaining the original order.

Result:

    {10, 20, 30, 40}

## Main Idea

For every element, check whether it has already appeared earlier in the array.

If it has appeared before:

    duplicate → ignore

If it has not appeared:

    unique → move it to the next available position

## Important Variables

    int index = 0;

`index` represents the position where the next unique element should be stored.

It also represents the number of unique elements found so far.

## Duplicate Detection

For the current element:

    arr[i]

check all previous elements:

    arr[0] ... arr[i - 1]

using:

    for (j = 0; j < i; j++)

If:

    arr[i] == arr[j]

then the current element is a duplicate.

Use:

    break;

to stop searching because we already know it exists.

## Understanding i == j

This is an important part of the solution.

After the inner loop finishes:

### Duplicate found

Suppose:

    arr[i] == arr[j]

Then:

    break;

occurs before `j` reaches `i`.

Therefore:

    j < i

So:

    i == j

is false.

### No duplicate found

If no duplicate is found, the inner loop completes normally.

Eventually:

    j == i

Therefore:

    i == j

is true.

So:

    if (i == j)

means:

    "No previous duplicate was found."

## Moving Unique Elements

When a unique element is found:

    arr[index] = arr[i];

Then:

    index++;

This moves unique values toward the beginning of the same array.

## Example

Original:

    10 20 10 30 20 40 10

Initially:

    index = 0

### First 10

No previous element exists.

Store:

    arr[0] = 10

Then:

    index = 1

### 20

Not found previously.

Store:

    arr[1] = 20

Then:

    index = 2

### Second 10

10 already exists.

Ignore it.

### 30

Not found previously.

Store:

    arr[2] = 30

Then:

    index = 3

### Second 20

20 already exists.

Ignore it.

### 40

Not found previously.

Store:

    arr[3] = 40

Then:

    index = 4

### Final 10

10 already exists.

Ignore it.

Final useful portion:

    10 20 30 40

And:

    index = 4

## In-Place Modification

This solution does not create another array.

Instead, it reuses the original array.

Example:

    Original:

    10 20 10 30 20 40 10

After processing, the first portion contains:

    10 20 30 40

The remaining positions are irrelevant.

## Why Print Only Until index?

After processing:

    index = 4

Only the first four positions contain the unique result.

Therefore:

    for (int k = 0; k < index; k++)

is correct.

Do NOT use:

    k < arr.length

because the remaining positions are not part of the unique result.

## Original Order

The algorithm preserves the order in which values first appeared.

Example:

    30 10 20 30 10

Result:

    30 10 20

The first occurrence of each value is preserved.

## Time Complexity

For every element, previous elements may need to be checked.

Therefore:

    O(n²)

in the worst case.

## Space Complexity

No second array is created.

Only a few variables are used.

Therefore auxiliary space:

    O(1)

## Why Nested Loops?

We need to answer:

    "Has this value appeared before?"

Without using a Set, we have to search the previous elements manually.

That requires a nested loop.

## Common Mistake

Wrong:

    for (int k = 0; k < arr.length; k++)

This prints positions that are not part of the unique result.

Correct:

    for (int k = 0; k < index; k++)

## Common Mistake

Using:

    Set

would make duplicate detection easier, but this problem specifically practices array logic.

## Array Approach vs Set Approach

### Array approach

    O(n²) time
    O(1) extra space

### HashSet approach

Typically:

    O(n) average time
    O(n) extra space

The Set approach is usually faster, but the array approach is useful for understanding the underlying logic.

## Important Interview Pattern

This pattern is worth remembering:

    int index = 0;

    for (...) {

        // find whether current element already exists

        if (unique) {
            arr[index] = arr[i];
            index++;
        }
    }

The first `index` positions contain the processed result.

## Interview Questions & Answers

### 1. How did you remove duplicates?

For every element, I searched the previously processed elements. If it had not appeared before, I moved it to the next unique position.

### 2. Why use a nested loop?

Because without using a Set, we need to search previous elements to determine whether the current value is a duplicate.

### 3. What does `index` represent?

It represents the position where the next unique element should be stored and also the total number of unique elements found.

### 4. Why use `break`?

Once a duplicate is found, there is no need to continue searching.

### 5. What does `i == j` mean?

It means the inner loop completed without finding a duplicate.

### 6. Why print only until `index`?

Because only the first `index` positions contain valid unique values.

### 7. Does the algorithm preserve order?

Yes. The first occurrence of each value is preserved.

### 8. What is the time complexity?

    O(n²)

### 9. What is the space complexity?

    O(1)

auxiliary space.

### 10. Can a Set solve this more efficiently?

Yes. A HashSet can generally solve duplicate removal in O(n) average time, but it requires O(n) additional space.

### 11. What does in-place mean?

The original array is reused instead of creating another array for the result.

### 12. What happens with all unique elements?

Every element is copied to its same position.

Example:

    10 20 30

Result:

    10 20 30

### 13. What happens when every element is duplicated?

Example:

    5 5 5 5

Result:

    5

and:

    index = 1

### 14. Why is `index` initially 0?

Because the first unique element should be stored at position 0.

### 15. What is the general idea?

    Check previous elements
          ↓
    Duplicate?
       ↙     ↘
     YES      NO
      ↓        ↓
    Ignore   Store
               ↓
           index++

## Quick Interview Summary

    Duplicate detection
    → Search previous elements

    Nested loop
    → Check arr[0] to arr[i-1]

    Duplicate
    → break

    Unique
    → arr[index] = arr[i]

    Then
    → index++

    Valid result
    → first index elements

    Order
    → preserved

    Time
    → O(n²)

    Space
    → O(1)