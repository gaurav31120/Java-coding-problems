# Notes — CJ-028 Array Explorer

## Concepts Learned

- Array declaration
- Array initialization
- int[]
- Zero-based indexing
- Array traversal
- Enhanced for loop
- Traditional for loop
- array.length
- First element
- Last element
- Array index

## Key Learning

An array stores multiple values of the same data type.

Example:

    int[] arr = {50000, 75000, 45000, 90000, 60000};

The array contains 5 elements.

## Array Indexing

Java arrays use zero-based indexing.

Example:

    int[] arr = {50000, 75000, 45000, 90000, 60000};

The array looks like:

    Index       Value

      0     →   50000
      1     →   75000
      2     →   45000
      3     →   90000
      4     →   60000

The first element is at index 0.

The last element is at index 4.

## array.length

`length` gives the number of elements in an array.

Example:

    arr.length

For:

    {50000, 75000, 45000, 90000, 60000}

the result is:

    5

Important:

    arr.length

NOT:

    arr.length()

Arrays use the `length` property.

Strings use:

    string.length()

## First Element

The first element is accessed using index 0.

Example:

    arr[0]

Result:

    50000

## Last Element

The last element can be accessed using:

    arr[arr.length - 1]

For an array of length 5:

    arr.length = 5

    last index = 5 - 1
               = 4

Therefore:

    arr[arr.length - 1]

returns:

    60000

## Traditional for Loop

Example:

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

Here:

    i
    ↓
    current index

    arr[i]
    ↓
    value at current index

## Enhanced for Loop

Java also provides an enhanced for loop:

    for (int salary : arr) {
        System.out.println(salary);
    }

Here:

    salary
    ↓
    current element

The enhanced for loop is useful when you only need the values and don't need the index.

## Traditional for vs Enhanced for

Traditional for loop:

    for (int i = 0; i < arr.length; i++) {
        System.out.println(i + " " + arr[i]);
    }

Useful when:

- Index is required.
- You need to modify elements using indexes.
- You need to move through specific positions.

Enhanced for loop:

    for (int value : arr) {
        System.out.println(value);
    }

Useful when:

- Only the values are needed.
- Index is not required.
- Simple traversal is required.

## Array Traversal

Traversal means visiting every element of an array.

Example:

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

Flow:

    i = 0 → arr[0]
    i = 1 → arr[1]
    i = 2 → arr[2]
    i = 3 → arr[3]
    i = 4 → arr[4]

Then:

    i = 5

The condition:

    i < arr.length

becomes false, so the loop stops.

## Important Relationship

For an array:

    number of elements = length

    last valid index = length - 1

Example:

    length = 5
    last index = 4

This is one of the most important things to remember about arrays.

## Array Bounds

Valid indexes for an array of length 5 are:

    0
    1
    2
    3
    4

Index 5 is invalid.

Trying:

    arr[5]

causes:

    ArrayIndexOutOfBoundsException

## Array Declaration

Example:

    int[] arr;

This declares an integer array reference.

It does not create the actual array yet.

## Array Initialization

Example:

    int[] arr = new int[5];

This creates an array capable of holding 5 integers.

Another way:

    int[] arr = {10, 20, 30, 40, 50};

This creates and initializes the array with values.

## Array Size Is Fixed

Once an array is created, its size cannot be changed.

Example:

    int[] arr = new int[5];

This array always has a length of 5.

If a dynamically growing collection is required, use a collection such as ArrayList.

## Memory Concept

An array stores elements in indexed positions.

Conceptually:

    arr
     ↓
    [50000][75000][45000][90000][60000]
       0      1      2      3      4

Each element can be accessed using its index.

## Interview Questions & Answers

### 1. What is an array?

An array is a fixed-size data structure that stores multiple values of the same type.

### 2. What is the first index of a Java array?

The first index is:

    0

### 3. What is the last index of an array?

The last index is:

    array.length - 1

### 4. How do you get the length of an array?

Use:

    array.length

### 5. Is length a method for arrays?

No.

It is a property.

Use:

    array.length

not:

    array.length()

### 6. How do you access the first element?

Use:

    array[0]

### 7. How do you access the last element?

Use:

    array[array.length - 1]

### 8. What happens if you access an invalid index?

Java throws:

    ArrayIndexOutOfBoundsException

### 9. What is zero-based indexing?

It means the first element is stored at index 0 instead of index 1.

### 10. What is array traversal?

Array traversal means visiting each element of an array.

### 11. How can you traverse an array?

You can use:

- Traditional for loop
- Enhanced for loop

### 12. What is the difference between for and enhanced for?

Traditional for provides the index.

Enhanced for directly provides each element.

### 13. Can the size of an array change after creation?

No.

Arrays have a fixed size.

### 14. What is the difference between array.length and String.length()?

For arrays:

    array.length

For Strings:

    string.length()

### 15. How do you create an array of 5 integers?

    int[] arr = new int[5];

### 16. Can an array store different data types?

A normal array stores elements of one declared type.

Example:

    int[] arr

stores integers.

### 17. What is the index of the third element?

Because indexing starts from 0:

    third element → index 2

### 18. If an array has length 10, what is its last index?

    10 - 1 = 9

### 19. What does arr[i] mean?

It means the element stored at index `i`.

### 20. Why do we use i < arr.length in a loop?

Because the largest valid index is:

    arr.length - 1

Therefore:

    i < arr.length

keeps `i` within valid bounds.

## Quick Interview Summary

    Array
    → Fixed-size collection of same-type elements

    First index
    → 0

    Last index
    → length - 1

    Array length
    → array.length

    First element
    → array[0]

    Last element
    → array[array.length - 1]

    Traditional for
    → Index + value

    Enhanced for
    → Value directly

    Invalid index
    → ArrayIndexOutOfBoundsException

    Array size
    → Fixed after creation