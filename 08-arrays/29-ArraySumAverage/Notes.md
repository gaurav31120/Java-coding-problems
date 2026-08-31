# Notes — CJ-029 Array Sum/Average

## Concepts Learned

- Array traversal
- Accumulator variable
- Sum of array elements
- Array length
- Average calculation
- Integer division
- Type casting
- double

## Key Learning

To calculate the sum of all elements in an array, use an accumulator variable.

Example:

    int sum = 0;

Then traverse the array:

    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }

## Accumulator Pattern

An accumulator stores a running result.

Example:

    int sum = 0;

    sum = sum + arr[i];

Equivalent shorthand:

    sum += arr[i];

Flow:

    sum = 0

    0 + 50000
    = 50000

    50000 + 75000
    = 125000

    125000 + 45000
    = 170000

    170000 + 90000
    = 260000

    260000 + 60000
    = 320000

Final:

    sum = 320000

## Array Length

Use:

    arr.length

to get the number of elements.

Example:

    int[] arr = {10, 20, 30};

    arr.length
    → 3

## Average

The general formula is:

    Average = Sum / Number of Elements

For an array:

    double average =
            (double) sum / arr.length;

## Integer Division

If both operands are integers:

    int sum = 7;
    int count = 2;

    sum / count

Java performs integer division:

    7 / 2
    → 3

The decimal portion is discarded.

## Type Casting

To get decimal division:

    (double) sum / arr.length

Example:

    int sum = 7;
    int count = 2;

    double average =
            (double) sum / count;

Result:

    3.5

## Why Cast sum?

This:

    (double) sum

converts the integer sum into a double.

Then:

    double / int

produces a decimal result.

## Important Rule

Remember:

    int / int
    → integer division

    double / int
    → decimal division

    int / double
    → decimal division

## Example

    int sum = 320000;

    double average =
            (double) sum / 5;

Result:

    64000.0

## Traditional for Loop

The problem uses:

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }

Here:

    i
    ↓
    current index

    arr[i]
    ↓
    current value

## Enhanced for Loop Alternative

The same sum can also be calculated using:

    int sum = 0;

    for (int salary : arr) {
        sum += salary;
    }

The enhanced for loop is useful when the index is not required.

## Traditional vs Enhanced Loop

Traditional:

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }

Enhanced:

    for (int salary : arr) {
        sum += salary;
    }

Both can calculate the sum.

## Time Complexity

If there are `n` elements:

    for loop
    → visits every element once

Time complexity:

    O(n)

Space complexity:

    O(1)

because only a few extra variables are used.

## Common Mistake

Wrong:

    int average = sum / arr.length;

This performs integer division.

Better:

    double average =
            (double) sum / arr.length;

## Interview Questions & Answers

### 1. How do you calculate the sum of an array?

Use an accumulator:

    int sum = 0;

    for (int value : arr) {
        sum += value;
    }

### 2. What is an accumulator?

A variable that stores a running result during iteration.

### 3. What is the formula for average?

    Average = Sum / Number of Elements

### 4. Why should average usually be stored in double?

Because an average can contain a decimal value.

### 5. What happens with int / int?

Java performs integer division.

Example:

    7 / 2
    → 3

### 6. How do you force decimal division?

Convert one operand to double.

Example:

    (double) sum / arr.length

### 7. What is the difference between `arr.length` and `arr.length()`?

For arrays:

    arr.length

For Strings:

    string.length()

### 8. What is the time complexity of calculating the array sum?

O(n), because every element must be visited.

### 9. What is the space complexity?

O(1) auxiliary space.

### 10. Can an enhanced for loop calculate the sum?

Yes.

Example:

    for (int value : arr) {
        sum += value;
    }

### 11. Why initialize sum to 0?

Because 0 is the identity value for addition and provides the starting point for accumulation.

### 12. What happens if the array is empty?

The sum is 0.

If calculating average, dividing by zero must be handled appropriately.

### 13. What is type casting?

Converting a value from one data type to another.

Example:

    (double) sum

### 14. Why is `(double)` placed before sum?

It converts `sum` into a double before division takes place.

### 15. What is the general array sum pattern?

    int sum = 0;

    for (int value : arr) {
        sum += value;
    }

## Quick Interview Summary

    Sum
    → Accumulator pattern

    sum += arr[i]
    → Add current element

    Average
    → sum / number of elements

    int / int
    → Integer division

    (double) sum / count
    → Decimal division

    Time
    → O(n)

    Auxiliary Space
    → O(1)