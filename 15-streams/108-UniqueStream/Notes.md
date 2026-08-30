# Notes — CJ-108 Unique Stream

## Concepts Learned

- Stream
- stream()
- distinct()
- forEach()
- count()
- Removing duplicates
- Unique elements
- Stream pipeline

## Key Learning

`distinct()` is used to remove duplicate elements from a Stream.

Example:

    list.stream()
            .distinct()
            .forEach(value -> System.out.println(value));

If the original list contains:

    50000
    75000
    50000
    90000
    75000
    60000
    90000

The Stream produces:

    50000
    75000
    90000
    60000

## distinct()

`distinct()` removes duplicate elements from the Stream.

Example:

    .distinct()

It keeps only one occurrence of each element.

## How distinct() Works

Conceptually:

    50000 → keep
    75000 → keep
    50000 → duplicate → remove
    90000 → keep
    75000 → duplicate → remove
    60000 → keep
    90000 → duplicate → remove

Result:

    50000
    75000
    90000
    60000

## distinct() Does Not Modify the Original List

Example:

    list.stream()
            .distinct()
            .forEach(...);

The original ArrayList is not changed.

Original:

    [50000, 75000, 50000, 90000, 75000, 60000, 90000]

The Stream contains only unique values.

## Counting Unique Elements

`distinct()` can be combined with `count()`.

Example:

    long count = list.stream()
            .distinct()
            .count();

This first removes duplicates and then counts the remaining elements.

For the given data:

    50000
    75000
    90000
    60000

The count is:

    4

## Stream Pipeline

For displaying unique values:

    Collection
        ↓
    stream()
        ↓
    distinct()
        ↓
    forEach()

For counting unique values:

    Collection
        ↓
    stream()
        ↓
    distinct()
        ↓
    count()

## distinct() vs HashSet

Traditional approach:

    HashSet<Integer> set = new HashSet<>(list);

Stream approach:

    list.stream()
        .distinct()
        .forEach(...);

This problem focuses on removing duplicates using the Stream API.

## filter() vs map() vs sorted() vs distinct()

`filter()`:

    Selects elements based on a condition.

Example:

    .filter(value -> value > 60000)

`map()`:

    Transforms elements.

Example:

    .map(value -> value * 1.1)

`sorted()`:

    Sorts elements.

Example:

    .sorted()

`distinct()`:

    Removes duplicate elements.

Example:

    .distinct()

Remember:

    filter()
    → Select

    map()
    → Transform

    sorted()
    → Sort

    distinct()
    → Remove duplicates

## Combining Stream Operations

Multiple Stream operations can be chained.

Example:

    list.stream()
            .filter(value -> value > 50000)
            .distinct()
            .sorted()
            .forEach(System.out::println);

The operations are applied as a pipeline.

## Important Point

`distinct()` uses the equality of elements to determine whether values are duplicates.

For common types such as `Integer` and `String`, their `equals()` behavior is used to determine duplicates.

## Interview Questions & Answers

### 1. What does distinct() do?

`distinct()` removes duplicate elements from a Stream.

### 2. Is distinct() an intermediate operation?

Yes. `distinct()` is an intermediate Stream operation.

### 3. Does distinct() modify the original collection?

No. It does not directly modify the original collection.

### 4. What happens when duplicate values are found?

Only one occurrence is retained in the Stream.

### 5. How can you count unique elements using Streams?

Use:

    long count = list.stream()
            .distinct()
            .count();

### 6. What is the difference between distinct() and filter()?

`distinct()` removes duplicate elements.

`filter()` selects elements based on a condition.

### 7. What is the difference between distinct() and sorted()?

`distinct()` removes duplicates.

`sorted()` changes the ordering of elements.

### 8. Can distinct() be combined with filter()?

Yes.

Example:

    list.stream()
            .filter(value -> value > 50000)
            .distinct()
            .forEach(System.out::println);

### 9. Can distinct() be combined with sorted()?

Yes.

Example:

    list.stream()
            .distinct()
            .sorted()
            .forEach(System.out::println);

### 10. Does distinct() preserve encounter order?

For an ordered Stream, `distinct()` preserves the encounter order of the remaining elements.

### 11. What does count() do after distinct()?

It counts the number of unique elements remaining in the Stream.

### 12. Can distinct() work with objects?

Yes. It determines duplicates based on equality semantics, typically involving `equals()` and `hashCode()`.

### 13. Why might HashSet also be used for duplicate removal?

HashSet is a collection that stores unique elements, so it can also be used to remove duplicates.

### 14. Why are we using distinct() in this problem?

To practice removing duplicate values directly through the Stream API.

### 15. Is count() a terminal operation?

Yes.

### 16. Is forEach() a terminal operation?

Yes.

### 17. What happens if all elements are already unique?

`distinct()` leaves all elements unchanged.

### 18. What happens if every element is the same?

`distinct()` leaves only one occurrence.

### 19. Can a Stream be reused after count()?

No. A Stream cannot be reused after a terminal operation.

### 20. What is the basic unique-value Stream pattern?

    list.stream()
        .distinct()
        .forEach(...);

## Quick Interview Summary

    stream()
    → Create Stream

    distinct()
    → Remove duplicates

    sorted()
    → Sort

    filter()
    → Select

    map()
    → Transform

    count()
    → Count elements

    distinct()
    → Intermediate operation

    count()
    → Terminal operation

    forEach()
    → Terminal operation