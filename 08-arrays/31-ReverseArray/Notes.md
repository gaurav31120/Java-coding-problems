# Notes — CJ-031 Reverse Array

## Concepts Learned

- Array reversal
- In-place modification
- Swapping
- Temporary variable
- Two-pointer technique
- Left pointer
- Right pointer
- while loop
- Array indexing
- Time complexity
- Space complexity

## Key Learning

An array can be reversed without creating another array.

We can use two pointers:

    left
    right

The left pointer starts at the beginning.

The right pointer starts at the end.

Then swap the elements and move both pointers toward the center.

## Two-Pointer Initialization

    int left = 0;
    int right = arr.length - 1;

For:

    {10, 20, 30, 40, 50}

we get:

    left = 0
    right = 4

## Visual Representation

    left                         right
      ↓                            ↓

    10    20    30    40    50
     0     1     2     3     4

## Swapping

Java does not provide a direct swap operation for two array elements.

Use a temporary variable:

    int temp = arr[left];

    arr[left] = arr[right];

    arr[right] = temp;

Example:

Before:

    10 20 30 40 50

After swapping first and last:

    50 20 30 40 10

## Moving the Pointers

After every swap:

    left++;
    right--;

This moves both pointers toward the center.

Example:

    10 20 30 40 50
    ↑           ↑

After first swap:

    50 20 30 40 10
       ↑       ↑

After second swap:

    50 40 30 20 10
          ↑ ↑

The array is now reversed.

## Loop Condition

Use:

    while (left < right)

Why?

Because we only need to swap elements while the left pointer is before the right pointer.

Once:

    left >= right

there is nothing left to swap.

## Why Not left <= right?

Using:

    left <= right

would cause the middle element of an odd-sized array to be swapped with itself.

For example:

    10 20 30 40 50

The middle element is:

    30

It doesn't need to be swapped.

Therefore:

    left < right

is the standard condition.

## In-Place Reversal

In-place means modifying the original array instead of creating another array.

Original:

    10 20 30 40 50

After the algorithm, the same array becomes:

    50 40 30 20 10

No second array is required.

## Why Is This Better Than Creating Another Array?

A second array would require additional memory.

Two-pointer reversal only needs:

    left
    right
    temp

Therefore auxiliary space is constant.

## Time Complexity

Every element is effectively processed once.

Time complexity:

    O(n)

where `n` is the number of elements.

## Space Complexity

Only a few variables are used:

    left
    right
    temp

Therefore:

    O(1)

auxiliary space.

## Two-Pointer Pattern

This is an important pattern:

    int left = 0;
    int right = arr.length - 1;

    while (left < right) {

        // process left and right

        left++;
        right--;
    }

This pattern is useful for:

- Reversing arrays
- Palindrome checking
- Two-sum variations
- Comparing elements from both ends
- Partitioning problems

## Reverse by Printing vs Reverse In-Place

These are different.

### Printing backwards

    for (int i = arr.length - 1; i >= 0; i--) {
        System.out.println(arr[i]);
    }

This prints:

    50
    40
    30
    20
    10

But the original array remains:

    10 20 30 40 50

### In-place reversal

Using swapping:

    10 20 30 40 50

becomes:

    50 40 30 20 10

The actual array is modified.

## Important Difference

    Reverse printing
    → array is NOT modified

    In-place reversal
    → array IS modified

## Common Mistake

Wrong:

    int right = arr.length;

For an array of length 5:

    arr.length = 5

but the last valid index is:

    4

Therefore:

    int right = arr.length - 1;

## Another Common Mistake

Wrong:

    arr[arr.length]

Correct:

    arr[arr.length - 1]

Because indexes start at 0.

## Swap Pattern

Memorize this:

    int temp = a;
    a = b;
    b = temp;

For arrays:

    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

## Interview Questions & Answers

### 1. How do you reverse an array in-place?

Use two pointers, one at the beginning and one at the end, and repeatedly swap the elements.

### 2. What is the two-pointer technique?

It uses two indexes that move through a data structure, often from opposite directions.

### 3. Why is right initialized to length - 1?

Because array indexing starts at 0.

For length 5:

    last index = 4

### 4. Why do we use left < right?

We only need to swap pairs until the pointers meet.

### 5. What is the time complexity?

    O(n)

### 6. What is the space complexity?

    O(1)

### 7. What does in-place mean?

It means modifying the existing array without creating another array of the same size.

### 8. Why do we need a temporary variable?

Without a temporary variable, the original value could be overwritten before it is assigned to the other position.

### 9. Can an array be reversed using a for loop?

Yes.

For example:

    for (int i = 0; i < arr.length / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }

### 10. What is the advantage of two pointers?

They allow us to process elements from both ends simultaneously.

### 11. What happens if the array has one element?

Nothing needs to be swapped.

The array remains unchanged.

### 12. What happens if the array is empty?

There are no elements to swap.

The loop does not execute.

### 13. Why is reversing by printing not considered an in-place reversal?

Because printing in reverse order does not modify the original array.

### 14. What is the swap sequence?

    temp = left
    left = right
    right = temp

### 15. What happens after each iteration?

    left++
    right--

Both pointers move toward the center.

## Quick Interview Summary

    Reverse array
    → Two pointers

    left
    → 0

    right
    → length - 1

    Condition
    → left < right

    Operation
    → swap

    After swap
    → left++, right--

    Time
    → O(n)

    Space
    → O(1)

    In-place
    → Original array is modified