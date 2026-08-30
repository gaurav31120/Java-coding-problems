# Notes — CJ-106 Salary Aggregation

## Concepts Learned

- Stream
- stream()
- mapToDouble()
- DoubleStream
- sum()
- average()
- OptionalDouble
- orElse()
- Aggregation

## Key Learning

Stream aggregation means processing multiple elements and producing a single result.

Example:

    salaries.stream()
            .mapToDouble(salary -> salary)
            .sum();

This converts the salaries into a DoubleStream and calculates their total.

## mapToDouble()

`mapToDouble()` converts Stream elements into a primitive `double` stream called `DoubleStream`.

Example:

    salaries.stream()
            .mapToDouble(salary -> salary);

Flow:

    ArrayList<Double>
          ↓
       stream()
          ↓
    mapToDouble()
          ↓
     DoubleStream

## sum()

`sum()` calculates the total of all values in a `DoubleStream`.

Example:

    double totalSalary = salaries.stream()
            .mapToDouble(salary -> salary)
            .sum();

For:

    50000.0
    75000.0
    45000.0
    90000.0
    60000.0

The result is:

    320000.0

## average()

`average()` calculates the average of the values in a `DoubleStream`.

Example:

    salaries.stream()
            .mapToDouble(salary -> salary)
            .average();

Important:

`average()` returns an `OptionalDouble`, not directly a `double`.

## OptionalDouble

`OptionalDouble` represents a possible double value.

For a non-empty stream:

    average()

contains the calculated average.

For an empty stream:

    average()

does not contain a value.

## orElse()

Use `orElse()` to provide a default value.

Example:

    double average = salaries.stream()
            .mapToDouble(salary -> salary)
            .average()
            .orElse(0.0);

If an average exists, it is returned.

If the stream is empty, `0.0` is returned.

## Aggregation

Aggregation means combining multiple values into one result.

Examples:

    sum()
    → Total

    average()
    → Average

    count()
    → Number of elements

Example:

    50000
    75000
    45000
    90000
    60000
       ↓
    Aggregation
       ↓
    320000

## map() vs mapToDouble()

`map()` transforms Stream elements.

Example:

    .map(salary -> salary * 1.1)

If the Stream contains `Double` objects, it remains a regular object Stream.

`mapToDouble()` produces a primitive `DoubleStream`.

Example:

    .mapToDouble(salary -> salary)

This is useful when performing numeric operations such as:

    sum()
    average()
    min()
    max()

## filter() vs map() vs Aggregation

`filter()`:

    Selects elements.

Example:

    .filter(salary -> salary > 60000)

`map()`:

    Transforms elements.

Example:

    .map(salary -> salary * 1.1)

Aggregation:

    Combines multiple elements into one result.

Examples:

    .sum()
    .average()
    .count()

Remember:

    filter()
    → Which elements?

    map()
    → What should each element become?

    aggregation
    → What single result can I calculate?

## Stream Flow

For total salary:

    Collection
        ↓
    stream()
        ↓
    mapToDouble()
        ↓
    sum()
        ↓
    Total

For average salary:

    Collection
        ↓
    stream()
        ↓
    mapToDouble()
        ↓
    average()
        ↓
    OptionalDouble
        ↓
    orElse()
        ↓
    Average

## Important Point

The original ArrayList is not modified.

The Stream processes the values and calculates the required result.

## Interview Questions & Answers

### 1. What is aggregation in Java Streams?

Aggregation means combining multiple Stream elements to produce a single result.

Examples include `sum()`, `average()`, and `count()`.

### 2. What does mapToDouble() do?

`mapToDouble()` converts Stream elements into a primitive `DoubleStream`.

### 3. What is a DoubleStream?

`DoubleStream` is a specialized Stream for primitive `double` values.

### 4. What does sum() do?

`sum()` returns the total of the values in a numeric Stream such as `DoubleStream`.

### 5. What does average() return?

For a `DoubleStream`, `average()` returns an `OptionalDouble`.

### 6. Why does average() return OptionalDouble?

Because the Stream may be empty, in which case there is no average value.

### 7. What does orElse(0.0) do?

It returns the value if one exists; otherwise, it returns `0.0`.

### 8. What type does sum() return for DoubleStream?

`sum()` returns a primitive `double`.

### 9. What is the difference between map() and mapToDouble()?

`map()` produces a regular Stream of objects.

`mapToDouble()` produces a primitive `DoubleStream`.

### 10. Why use mapToDouble() for salary calculations?

It provides a primitive numeric stream with operations such as `sum()`, `average()`, `min()`, and `max()`.

### 11. Does sum() modify the original collection?

No. It only calculates a result from the Stream.

### 12. Does average() modify the original collection?

No.

### 13. What happens if average() is called on an empty DoubleStream?

It returns an empty `OptionalDouble`.

### 14. What is the purpose of orElse()?

It provides a fallback value when an Optional does not contain a value.

### 15. What is the difference between count() and sum()?

`count()` tells you how many elements exist.

`sum()` adds the numeric elements together.

### 16. What is the difference between sum() and average()?

`sum()` returns the total.

`average()` returns the arithmetic mean.

### 17. Can we calculate minimum and maximum using DoubleStream?

Yes.

Examples:

    .min()

    .max()

Both return `OptionalDouble`.

### 18. Is mapToDouble() an intermediate operation?

Yes. It is an intermediate Stream operation.

### 19. Is sum() a terminal operation?

Yes. `sum()` is a terminal operation.

### 20. Is average() a terminal operation?

Yes. `average()` is a terminal operation.

## Quick Interview Summary

    stream()
    → Create Stream

    mapToDouble()
    → Create DoubleStream

    sum()
    → Total

    average()
    → Average

    average()
    → OptionalDouble

    orElse()
    → Default value

    filter()
    → Select

    map()
    → Transform

    aggregation
    → Many values → One result