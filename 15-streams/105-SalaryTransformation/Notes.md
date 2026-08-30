# Notes — CJ-105 Salary Transformation

## Concepts Learned

- Stream
- stream()
- map()
- Lambda expression
- forEach()
- Transformation
- Stream pipeline
- Original collection remains unchanged

## Key Learning

`map()` is used to transform every element of a Stream into another value.

Example:

    salaries.stream()
            .map(salary -> salary * 1.1)
            .forEach(salary -> System.out.println(salary));

Here every salary is transformed by increasing it by 10%.

## Creating a Stream

Use `stream()` on a collection:

    salaries.stream();

This creates a Stream from the collection.

The original collection is not directly modified.

## map()

`map()` transforms each element of a Stream.

Example:

    .map(salary -> salary * 1.1)

This means:

    Take each salary.
    Multiply it by 1.1.
    Return the new salary.

For:

    50000.0
    75000.0
    45000.0
    90000.0
    60000.0

The transformed values are:

    55000.0
    82500.0
    49500.0
    99000.0
    66000.0

## Lambda Expression

This:

    salary -> salary * 1.1

is a lambda expression.

It can be understood as:

    Take one salary and return salary multiplied by 1.1.

The lambda is used by `map()` to determine how each element should be transformed.

## forEach()

`forEach()` performs an action for every element remaining in the Stream.

Example:

    .forEach(salary -> System.out.println(salary));

This prints every transformed salary.

## Stream Pipeline

A Stream pipeline can contain multiple operations.

Example:

    salaries.stream()
            .map(salary -> salary * 1.1)
            .forEach(salary -> System.out.println(salary));

The flow is:

    Collection
        ↓
    stream()
        ↓
    map()
        ↓
    forEach()

## filter() vs map()

`filter()` decides which elements should remain.

Example:

    .filter(salary -> salary > 60000)

It works using a condition that produces true or false.

`map()` transforms each element.

Example:

    .map(salary -> salary * 1.1)

It produces a new value for each element.

Remember:

    filter()
    → "Should I keep this?"

    map()
    → "What should this become?"

## map() Does Not Modify the Original List

Example:

    salaries.stream()
            .map(salary -> salary * 1.1)
            .forEach(salary -> System.out.println(salary));

The Stream produces transformed values, but the original ArrayList remains unchanged.

Original list:

    [50000.0, 75000.0, 45000.0, 90000.0, 60000.0]

The transformed Stream contains:

    55000.0
    82500.0
    49500.0
    99000.0
    66000.0

## Intermediate Operation

`map()` is an intermediate Stream operation.

It transforms elements and returns another Stream.

Example:

    stream()
        .map(...)
        .map(...)
        .forEach(...)

Multiple intermediate operations can be chained.

## Terminal Operation

`forEach()` is a terminal operation.

It performs an action on the Stream elements and ends the Stream pipeline.

Example:

    .forEach(salary -> System.out.println(salary));

## Important Difference

A Stream does not automatically store the transformed results back into the original collection.

If you want to create a new collection from the transformed Stream, you can collect the results.

This problem intentionally prints the transformed Stream directly so that the original list remains unchanged.

## Interview Questions & Answers

### 1. What does map() do in Java Streams?

`map()` transforms each element of a Stream into another value.

### 2. What is the difference between filter() and map()?

`filter()` selects elements based on a condition.

`map()` transforms each element.

Example:

    filter:
    salary -> salary > 60000

    map:
    salary -> salary * 1.1

### 3. Is map() an intermediate operation?

Yes. `map()` is an intermediate Stream operation.

### 4. Does map() modify the original collection?

No. Stream `map()` does not directly modify the original collection.

### 5. What does this lambda mean?

    salary -> salary * 1.1

It means take a salary and return a new value equal to the salary multiplied by 1.1.

### 6. Why do we use 1.1 for a 10% increase?

Because:

    100% + 10% = 110%

and:

    110% = 1.10

Therefore:

    salary * 1.10

increases the salary by 10%.

### 7. What does stream() do?

It creates a Stream from a collection so that Stream operations can be applied.

### 8. What does forEach() do?

It performs an action for each element in the Stream.

### 9. Is forEach() a terminal operation?

Yes.

### 10. Can map() be chained with other Stream operations?

Yes.

Example:

    salaries.stream()
            .filter(salary -> salary > 50000)
            .map(salary -> salary * 1.1)
            .forEach(System.out::println);

### 11. What does map() return?

`map()` returns another Stream containing the transformed elements.

### 12. Can map() change the data type of elements?

Yes.

For example:

    Stream<String>
        ↓
    map(String::length)
        ↓
    Stream<Integer>

### 13. Can we use multiple map() operations?

Yes.

Example:

    stream()
        .map(...)
        .map(...)
        .forEach(...);

### 14. Can a Stream be reused after a terminal operation?

No. A Stream cannot be reused after a terminal operation.

### 15. What is a Stream pipeline?

A Stream pipeline is a sequence of operations performed on Stream elements.

Example:

    stream()
        → map()
        → forEach()

## Quick Interview Summary

    stream()
    → Create Stream

    filter()
    → Select elements

    map()
    → Transform elements

    forEach()
    → Perform action

    filter()
    → Intermediate operation

    map()
    → Intermediate operation

    forEach()
    → Terminal operation

    map()
    → Does not directly modify the original collection