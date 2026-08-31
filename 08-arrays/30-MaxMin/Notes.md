# Notes — CJ-030 Max & Min

## Concepts Learned

- Finding maximum in an array
- Finding minimum in an array
- Array traversal
- Comparison
- Tracking index
- Initializing with first element
- Linear scan

## Key Learning

To find the maximum and minimum values in an array, traverse the array while maintaining two variables:

    max
    min

Whenever a larger value is found, update `max`.

Whenever a smaller value is found, update `min`.

## Initialization

Instead of starting with:

    int max = 0;
    int min = 0;

initialize using the first array element:

    int max = arr[0];
    int min = arr[0];

This is safer because the array may contain negative numbers.

Example:

    {-10, -20, -5}

If:

    max = 0

then the result would incorrectly remain 0.

Using:

    max = arr[0]

starts with:

    max = -10

and allows the algorithm to correctly find:

    max = -5

## Finding Maximum

The basic logic is:

    if (arr[i] > max) {
        max = arr[i];
    }

Meaning:

    Is the current element greater than max?

If yes:

    update max

## Finding Minimum

The basic logic is:

    if (arr[i] < min) {
        min = arr[i];
    }

Meaning:

    Is the current element smaller than min?

If yes:

    update min

## Tracking Index

Sometimes we need not only the maximum/minimum value but also its position.

Create:

    int maxIndex = 0;
    int minIndex = 0;

When max changes:

    max = arr[i];
    maxIndex = i;

When min changes:

    min = arr[i];
    minIndex = i;

The value and its index must be updated together.

## Example

Array:

    {50000, 75000, 45000, 90000, 60000}

Indexes:

    0 → 50000
    1 → 75000
    2 → 45000
    3 → 90000
    4 → 60000

Initial:

    max = 50000
    min = 50000

    maxIndex = 0
    minIndex = 0

After processing 75000:

    max = 75000
    maxIndex = 1

After processing 45000:

    min = 45000
    minIndex = 2

After processing 90000:

    max = 90000
    maxIndex = 3

Final:

    max = 90000
    maxIndex = 3

    min = 45000
    minIndex = 2

## Why Start the Loop at 1?

If we initialize:

    max = arr[0]
    min = arr[0]

then index 0 has already been considered.

Therefore we can start:

    for (int i = 1; i < arr.length; i++)

This avoids comparing the first element with itself.

Starting at 0 is also correct; it is simply one unnecessary comparison.

## Linear Scan

The algorithm scans the array once.

For every element:

    compare with max
    compare with min

Therefore every element is processed once.

## Time Complexity

For `n` elements:

    O(n)

because the array is traversed once.

## Space Complexity

    O(1)

Only a constant number of variables are used.

## Important Pattern

Maximum:

    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

Minimum:

    int min = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }

## Max + Min Together

Both can be found in one loop:

    int max = arr[0];
    int min = arr[0];

    for (int i = 1; i < arr.length; i++) {

        if (arr[i] > max) {
            max = arr[i];
        }

        if (arr[i] < min) {
            min = arr[i];
        }
    }

This is better than using two separate loops.

## Common Mistake

Do not initialize:

    int max = 0;

when the array may contain negative numbers.

Prefer:

    int max = arr[0];

Similarly:

    int min = arr[0];

## Another Common Mistake

If tracking the index, don't update only the value.

Wrong:

    if (arr[i] > max) {
        max = arr[i];
    }

If the index is required, also update:

    maxIndex = i;

Correct:

    if (arr[i] > max) {
        max = arr[i];
        maxIndex = i;
    }

## Interview Questions & Answers

### 1. How do you find the maximum element in an array?

Initialize max with the first element and scan the remaining elements.

    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

### 2. How do you find the minimum element?

Use the same approach with `<`.

    int min = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }

### 3. Why initialize max with arr[0] instead of 0?

Because the array may contain only negative values.

### 4. Why initialize min with arr[0]?

For the same reason. The first actual array value provides a valid starting point.

### 5. What is the time complexity?

    O(n)

### 6. What is the auxiliary space complexity?

    O(1)

### 7. Can max and min be found in one loop?

Yes.

Maintain both variables during the same traversal.

### 8. Why can the loop start at index 1?

Because index 0 was already used to initialize max and min.

### 9. How do you find the index of maximum?

Maintain a `maxIndex` variable and update it whenever max changes.

### 10. How do you find the index of minimum?

Maintain a `minIndex` variable and update it whenever min changes.

### 11. What happens with an array containing duplicate maximum values?

Using `>` keeps the index of the first occurrence.

For example:

    {90, 50, 90}

the maximum index remains:

    0

If `>=` were used, the index would become:

    2

### 12. What happens with duplicate minimum values?

Using `<` keeps the first occurrence.

Using `<=` would update to the later occurrence.

### 13. Can Arrays.sort() be used?

Technically yes, but it is unnecessary for this problem.

Sorting would take more work than a simple linear scan.

### 14. Why is a linear scan preferred here?

Because maximum and minimum can be found in O(n) without modifying or sorting the array.

### 15. What is the general max pattern?

    if (current > max) {
        max = current;
    }

### 16. What is the general min pattern?

    if (current < min) {
        min = current;
    }

## Quick Interview Summary

    Max initialization
    → arr[0]

    Min initialization
    → arr[0]

    Max condition
    → current > max

    Min condition
    → current < min

    Max index
    → update when max changes

    Min index
    → update when min changes

    Time
    → O(n)

    Space
    → O(1)

    Negative values
    → initialize from arr[0]