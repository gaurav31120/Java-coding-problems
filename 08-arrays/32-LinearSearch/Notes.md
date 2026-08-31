# Notes — CJ-032 Linear Search

## Concepts Learned

- Linear search
- Array traversal
- Target value
- Comparison
- Index tracking
- `return`
- Search termination
- Time complexity
- Space complexity

## Key Learning

Linear search checks elements one by one until:

1. The target is found, or
2. The entire array has been searched.

Example:

    int[] arr = {
        50000,
        75000,
        45000,
        90000,
        60000
    };

Target:

    90000

The algorithm checks:

    50000 → not equal
    75000 → not equal
    45000 → not equal
    90000 → found

The target is at index:

    3

## Basic Linear Search

    for (int i = 0; i < arr.length; i++) {

        if (arr[i] == target) {
            // target found
        }
    }

## Target

The value we are searching for is called the target.

Example:

    int target = 90000;

Then compare:

    arr[i] == target

## Index

The loop variable `i` represents the current index.

Example:

    i = 3

means:

    arr[3]

If:

    arr[3] == target

then the target was found at index 3.

## Using return

The solution uses:

    return;

after finding the target.

Example:

    if (arr[i] == target) {
        System.out.println("Salary found at index: " + i);
        return;
    }

`return` exits the `main()` method immediately.

Therefore, once the target is found, there is no reason to continue searching.

## Why return is useful

Suppose the target is:

    90000

and it is found at index 3.

Without `return`, the loop would continue checking index 4.

With:

    return;

the program stops immediately.

This is useful when we only need the first occurrence.

## Not Found Logic

After the loop:

    System.out.println("Salary not found");

This line only executes if the loop completes without finding the target.

Why?

Because if the target is found:

    return;

exits the method before reaching the not-found message.

## Search Flow

    Start
      ↓
    Check first element
      ↓
    Is it target?
      ↓
    YES → print index → return
      ↓
    NO
      ↓
    Check next element
      ↓
    Continue
      ↓
    End of array
      ↓
    Not found

## Important Difference from Earlier Attempt

Wrong approach:

    for (...) {

        if (arr[i] == target) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }

This is wrong because `else` executes for every element that does not match.

For example:

    50000 → not found
    75000 → not found
    45000 → not found
    90000 → found

But we should only say "not found" after checking the entire array.

## Correct Approach

Search first.

Only after the entire loop finishes do we conclude:

    target not found

The `return` approach handles this cleanly:

    if (found) {
        print result
        return;
    }

    print "not found"

## Linear Search with Boolean

Another valid approach is:

    boolean found = false;

    for (int i = 0; i < arr.length; i++) {

        if (arr[i] == target) {
            found = true;
            System.out.println("Found at index: " + i);
            break;
        }
    }

    if (!found) {
        System.out.println("Not found");
    }

The boolean remembers whether the target was found.

## Linear Search with Index

Another common interview pattern is:

    int index = -1;

    for (int i = 0; i < arr.length; i++) {

        if (arr[i] == target) {
            index = i;
            break;
        }
    }

    if (index != -1) {
        System.out.println("Found at index: " + index);
    } else {
        System.out.println("Not found");
    }

## Why -1?

Valid array indexes start from:

    0

Therefore:

    -1

can represent:

    not found

This is a very common pattern in Java coding problems.

## break vs return

`break`:

    exits the loop

`return`:

    exits the current method

Example:

    if (arr[i] == target) {
        break;
    }

The loop stops, but execution continues after the loop.

With:

    if (arr[i] == target) {
        return;
    }

the entire `main()` method ends.

## First Occurrence

The current solution returns as soon as it finds the target.

Therefore, if the array contains duplicates:

    {10, 20, 10, 30}

and target is:

    10

the result is:

    index 0

It does not continue searching for the second occurrence.

## Time Complexity

Best case:

    O(1)

If the target is the first element, only one comparison is needed.

Average case:

    O(n)

Worst case:

    O(n)

Worst case happens when:

- Target is at the last position, or
- Target doesn't exist.

## Space Complexity

    O(1)

Only a few variables are used.

No additional array is created.

## When to Use Linear Search

Linear search is useful when:

- Data is unsorted.
- The array is small.
- Simplicity is preferred.
- You need to search sequentially.

## Linear Search vs Binary Search

Linear search:

    O(n)

Does not require sorted data.

Binary search:

    O(log n)

Requires sorted data.

For this problem, linear search is appropriate because the array is not sorted.

## Common Mistake

Don't print "not found" inside the loop.

Wrong:

    for (...) {
        if (...) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }

Correct:

    for (...) {
        if (...) {
            System.out.println("Found");
            return;
        }
    }

    System.out.println("Not found");

## Interview Questions & Answers

### 1. What is linear search?

Linear search checks each element sequentially until the target is found or the entire collection is searched.

### 2. What is the time complexity of linear search?

Best case:

    O(1)

Average case:

    O(n)

Worst case:

    O(n)

### 3. What is the space complexity?

    O(1)

### 4. Does linear search require a sorted array?

No.

Linear search works on both sorted and unsorted arrays.

### 5. Why use `return` after finding the target?

It immediately stops the method because the target has already been found.

### 6. What does `break` do?

It exits the current loop.

### 7. What is the difference between break and return?

`break` exits the loop.

`return` exits the current method.

### 8. Why shouldn't "not found" be printed inside the loop?

Because an individual element not matching the target does not mean the target doesn't exist elsewhere in the array.

### 9. What does `arr[i] == target` mean?

It checks whether the current array element equals the target value.

### 10. What does `i` represent?

The current array index.

### 11. What does `-1` commonly represent in search problems?

It commonly represents:

    target not found

because valid array indexes start at 0.

### 12. What happens if the target is the first element?

Linear search finds it immediately.

Time:

    O(1)

### 13. What happens if the target is the last element?

The algorithm checks all elements.

Time:

    O(n)

### 14. What happens if the target doesn't exist?

The entire array is searched and the not-found result is produced.

### 15. Does this solution find all occurrences?

No.

It stops at the first occurrence.

### 16. How would you find all occurrences?

Don't return immediately. Continue traversing the array and print/store every matching index.

### 17. What is the difference between linear and binary search?

Linear search checks elements sequentially and works on unsorted data.

Binary search repeatedly divides a sorted search range and runs in O(log n).

### 18. Why is binary search not used here?

The purpose of this problem is to practice linear search, and the array does not need to be sorted.

### 19. What is the common index-search pattern?

    int index = -1;

    for (...) {
        if (...) {
            index = i;
            break;
        }
    }

### 20. What is the main idea of linear search?

    Check
      ↓
    Compare
      ↓
    Found?
      ↓
    YES → return result
    NO  → continue

## Quick Interview Summary

    Linear Search
    → Check elements one by one

    Target
    → Value being searched

    Current index
    → i

    Found
    → arr[i] == target

    Stop immediately
    → return / break

    Not found
    → after entire search

    Best
    → O(1)

    Average
    → O(n)

    Worst
    → O(n)

    Space
    → O(1)

    Sorted array required?
    → No