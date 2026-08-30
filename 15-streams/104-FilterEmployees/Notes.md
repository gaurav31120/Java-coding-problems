# Notes — CJ-104 Filter Employees

## Concepts Learned

- Stream
- stream()
- filter()
- Lambda expression
- forEach()
- count()
- Stream pipeline

## Key Learning

Java Stream allows us to process elements from a collection using operations such as `filter()` and `count()`.

Example:

    salaries.stream()
            .filter(salary -> salary > 60000)
            .forEach(salary -> System.out.println(salary));

The Stream processes each salary and keeps only the salaries that satisfy the condition.

## Creating a Stream

Use `stream()` on a collection:

    salaries.stream();

This creates a Stream from the collection.

The original collection is not modified.

## filter()

`filter()` selects elements that satisfy a condition.

Example:

    .filter(salary -> salary > 60000)

This means:

    For every salary:
        Check whether salary > 60000.
        Keep it if true.
        Discard it if false.

For:

    50000
    75000
    45000
    90000
    60000

The result is:

    75000
    90000

## Lambda Expression

This:

    salary -> salary > 60000

is a lambda expression.

It can be understood as:

    Take one salary and check whether it is greater than 60000.

Another example:

    salary -> System.out.println(salary)

means:

    Take each salary and print it.

## forEach()

`forEach()` performs an action for every element remaining in the Stream.

Example:

    .forEach(salary -> System.out.println(salary));

It prints every filtered salary.

## count()

`count()` counts the number of elements remaining in the Stream.

Example:

    long count = salaries.stream()
            .filter(salary -> salary > 60000)
            .count();

For the given data:

    75000
    90000

the count is:

    2

`count()` returns a `long`.

## Stream Pipeline

A Stream pipeline can contain multiple operations.

Example:

    salaries.stream()
            .filter(salary -> salary > 60000)
            .forEach(salary -> System.out.println(salary));

The flow is:

    Collection
        ↓
    stream()
        ↓
    filter()
        ↓
    forEach()

## Filtering and Counting

We can use another Stream to count matching elements.

Example:

    long count = salaries.stream()
            .filter(salary -> salary > 60000)
            .count();

The flow is:

    Collection
        ↓
    stream()
        ↓
    filter()
        ↓
    count()

## Important Point

A Stream does not modify the original ArrayList.

The original list remains:

    50000
    75000
    45000
    90000
    60000

The Stream simply processes the elements.

## filter() vs count()

`filter()`:

    Selects elements based on a condition.

`count()`:

    Counts the elements that remain after previous operations.

Example:

    .filter(salary -> salary > 60000)
    .count();

means:

    First select salaries above 60000.
    Then count them.

## Intermediate and Terminal Operations

`filter()` is an intermediate operation.

It transforms or filters the Stream and can be followed by another operation.

`forEach()` is a terminal operation.

It performs an action and ends the Stream pipeline.

`count()` is also a terminal operation.

It returns the number of elements and ends the Stream pipeline.

## Interview Questions & Answers

### 1. What is a Stream in Java?

A Stream is a sequence of elements that allows us to process collection data using operations such as filtering, mapping, sorting, and aggregation.

### 2. How do you create a Stream from an ArrayList?

Use:

    list.stream();

### 3. What does filter() do?

`filter()` selects elements that satisfy a specified condition.

### 4. What is a lambda expression?

A lambda expression is a concise way of representing behavior that can be passed to a functional interface.

Example:

    salary -> salary > 60000

### 5. What does salary -> salary > 60000 mean?

It means:

    Take a salary and return true if it is greater than 60000.

### 6. What does forEach() do?

It performs an action for each element in the Stream.

### 7. What does count() do?

It returns the number of elements in the Stream.

### 8. What type does count() return?

`count()` returns a `long`.

### 9. Does filter() modify the original ArrayList?

No. Stream operations do not directly modify the original collection.

### 10. What is a Stream pipeline?

A Stream pipeline is a sequence of Stream operations.

Example:

    stream()
        → filter()
        → forEach()

### 11. Is filter() a terminal operation?

No. `filter()` is an intermediate operation.

### 12. Is forEach() a terminal operation?

Yes. `forEach()` is a terminal operation.

### 13. Is count() a terminal operation?

Yes. `count()` is a terminal operation.

### 14. Can a Stream be reused after a terminal operation?

No. Once a terminal operation has been performed, that Stream cannot be reused.

### 15. What happens to elements that fail the filter condition?

They are excluded from the resulting Stream.

### 16. What is the difference between filter() and count()?

`filter()` selects elements.

`count()` counts elements.

### 17. What happens when no elements satisfy filter()?

The resulting Stream is empty and `count()` returns `0`.

### 18. Can we use multiple filter() operations?

Yes.

For example:

    salaries.stream()
            .filter(salary -> salary > 50000)
            .filter(salary -> salary < 100000);

### 19. Why use Streams instead of a traditional loop?

Streams provide a declarative way to express data-processing operations and allow operations such as filtering, mapping, sorting, and aggregation to be chained together.

### 20. What is the basic Stream flow learned in this problem?

    collection
        ↓
    stream()
        ↓
    filter()
        ↓
    terminal operation

## Quick Interview Summary

    stream()
    → Create Stream

    filter()
    → Select matching elements

    salary -> condition
    → Lambda expression

    forEach()
    → Perform action for each element

    count()
    → Count elements

    filter()
    → Intermediate operation

    forEach()
    → Terminal operation

    count()
    → Terminal operation