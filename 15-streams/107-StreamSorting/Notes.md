# Notes — CJ-107 Stream Sorting

## Concepts Learned

- Stream sorting
- stream()
- sorted()
- Comparator
- Comparator.reverseOrder()
- forEach()
- Natural ordering
- Ascending order
- Descending order

## Key Learning

The Stream API provides `sorted()` to sort elements in a Stream.

Example:

    salaries.stream()
            .sorted()
            .forEach(salary -> System.out.println(salary));

For descending order:

    salaries.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(salary -> System.out.println(salary));

## sorted()

`sorted()` sorts Stream elements according to their natural ordering.

Example:

    salaries.stream()
            .sorted()
            .forEach(salary -> System.out.println(salary));

Input:

    50000
    75000
    45000
    90000
    60000

Output:

    45000
    50000
    60000
    75000
    90000

## Natural Ordering

For numbers, natural ordering means ascending numerical order.

Example:

    5
    2
    8
    1

After:

    sorted()

Result:

    1
    2
    5
    8

## Descending Order

Use:

    Comparator.reverseOrder()

Example:

    salaries.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(salary -> System.out.println(salary));

This produces descending order.

Example:

    90000
    75000
    60000
    50000
    45000

## Comparator

`Comparator` is used to define how objects should be compared.

For descending natural order:

    Comparator.reverseOrder()

Example:

    .sorted(Comparator.reverseOrder())

## Ascending vs Descending

Ascending:

    .sorted()

Example:

    45000
    50000
    60000
    75000
    90000

Descending:

    .sorted(Comparator.reverseOrder())

Example:

    90000
    75000
    60000
    50000
    45000

## Stream Pipeline

Ascending:

    Collection
        ↓
    stream()
        ↓
    sorted()
        ↓
    forEach()

Descending:

    Collection
        ↓
    stream()
        ↓
    sorted(reverseOrder())
        ↓
    forEach()

## Does sorted() Modify the Original List?

No.

When used in a Stream pipeline, `sorted()` produces sorted Stream elements without directly changing the original ArrayList.

Original:

    [50000, 75000, 45000, 90000, 60000]

Sorted Stream:

    45000
    50000
    60000
    75000
    90000

The original ArrayList remains unchanged.

## sorted() vs Collections.sort()

Traditional collection sorting:

    Collections.sort(list);

Stream sorting:

    list.stream()
        .sorted()
        .forEach(...);

This problem focuses on Stream-based sorting.

## filter() vs map() vs sorted()

`filter()`:

    Selects elements.

Example:

    .filter(salary -> salary > 60000)

`map()`:

    Transforms elements.

Example:

    .map(salary -> salary * 1.1)

`sorted()`:

    Sorts elements.

Example:

    .sorted()

Remember:

    filter()
    → Which elements?

    map()
    → What should each element become?

    sorted()
    → In what order?

## Intermediate Operation

`sorted()` is an intermediate Stream operation.

It returns another Stream and can be followed by a terminal operation.

Example:

    .sorted()
    .forEach(...)

## Terminal Operation

`forEach()` is a terminal operation.

Example:

    .forEach(salary -> System.out.println(salary));

## Important Point

The Stream does not automatically store the sorted result back into the original collection.

If you want to save the result, you would need to collect the Stream into another collection.

## Interview Questions & Answers

### 1. What does sorted() do in Java Streams?

`sorted()` sorts the elements of a Stream according to their natural ordering.

### 2. What is natural ordering?

Natural ordering is the default ordering defined for a type.

For numbers, it is ascending numerical order.

### 3. How do you sort a Stream in ascending order?

Use:

    stream.sorted()

### 4. How do you sort a Stream in descending order?

Use:

    stream.sorted(Comparator.reverseOrder())

### 5. What is Comparator?

`Comparator` is used to define comparison logic for ordering objects.

### 6. What does Comparator.reverseOrder() do?

It provides a comparator that reverses the natural ordering.

### 7. Is sorted() an intermediate operation?

Yes. `sorted()` is an intermediate Stream operation.

### 8. Is forEach() a terminal operation?

Yes.

### 9. Does sorted() modify the original collection?

No. Stream `sorted()` does not directly modify the original collection.

### 10. Can sorted() be used with strings?

Yes.

Strings can be sorted according to their natural ordering.

### 11. Can sorted() be used with custom objects?

Yes, but the objects need a natural ordering or a Comparator must be provided.

### 12. What happens if sorted() is used without a Comparator?

The elements are sorted according to their natural ordering.

### 13. What happens if we use Comparator.reverseOrder()?

The natural ordering is reversed.

### 14. What is the difference between sorted() and filter()?

`sorted()` changes the order of elements.

`filter()` selects elements based on a condition.

### 15. What is the difference between sorted() and map()?

`sorted()` changes element ordering.

`map()` transforms elements into new values.

### 16. Can multiple Stream operations be chained with sorted()?

Yes.

Example:

    salaries.stream()
            .filter(salary -> salary > 50000)
            .sorted()
            .forEach(System.out::println);

### 17. Can sorted() be used after filter()?

Yes.

Example:

    stream()
        .filter(...)
        .sorted()
        .forEach(...);

### 18. Can sorted() be used before filter()?

Yes, although the order of operations can affect performance and behavior depending on the pipeline.

### 19. Does sorted() immediately execute the Stream?

No. `sorted()` is an intermediate operation.

### 20. What is the basic Stream sorting pattern?

Ascending:

    stream()
        .sorted()
        .forEach(...)

Descending:

    stream()
        .sorted(Comparator.reverseOrder())
        .forEach(...)

## Quick Interview Summary

    sorted()
    → Sort Stream elements

    sorted()
    → Natural/ascending order

    Comparator.reverseOrder()
    → Reverse natural order

    sorted(reverseOrder())
    → Descending order

    sorted()
    → Intermediate operation

    forEach()
    → Terminal operation

    sorted()
    → Does not directly modify original collection