# Notes — CJ-113 Optional Mapping

## Concepts Learned

- Optional
- Optional.ofNullable()
- Optional.map()
- orElse()
- null handling
- Transforming Optional values
- Optional chaining
- Lambda expression

## Key Learning

`Optional.map()` is used to transform the value inside an Optional.

In this problem:

    Email
      ↓
    Email domain

Example:

    "amit@gmail.com"
          ↓
        map()
          ↓
    "gmail.com"

## Problem

We have two users:

    Amit  → amit@gmail.com
    Rahul → null

We need to safely extract the email domain.

Expected:

    Amit domain: gmail.com
    Rahul domain: No domain found

## Optional.ofNullable()

Use `ofNullable()` when the value may be null.

Example:

    Optional<String> email =
            Optional.ofNullable(user.email);

For Amit:

    "amit@gmail.com"
          ↓
    Optional["amit@gmail.com"]

For Rahul:

    null
      ↓
    Optional.empty()

## Optional.map()

`map()` transforms a value inside an Optional.

Example:

    email.map(e -> ...)

The lambda receives the String value if the Optional contains a value.

In this problem:

    e -> e.substring(e.indexOf("@") + 1)

This transforms:

    "amit@gmail.com"

into:

    "gmail.com"

## Extracting the Domain

The email is:

    amit@gmail.com

We find the position of `@`:

    e.indexOf("@")

Then move one character after `@`:

    e.indexOf("@") + 1

Then extract the remaining characters:

    e.substring(e.indexOf("@") + 1)

Therefore:

    email.map(
        e -> e.substring(e.indexOf("@") + 1)
    )

## orElse()

`orElse()` provides a fallback value when the Optional is empty.

Example:

    .orElse("No domain found")

If the Optional contains:

    "gmail.com"

then:

    orElse("No domain found")

returns:

    "gmail.com"

If the Optional is empty:

    Optional.empty()

then:

    orElse("No domain found")

returns:

    "No domain found"

## Complete Pipeline

The complete operation is:

    Optional<String> email =
            Optional.ofNullable(user.email);

    String domain = email
            .map(e -> e.substring(e.indexOf("@") + 1))
            .orElse("No domain found");

Flow:

    User
      ↓
    user.email
      ↓
    Optional.ofNullable()
      ↓
    Optional<String>
      ↓
    map()
      ↓
    Email domain
      ↓
    orElse()
      ↓
    String

## Amit Example

Input:

    "amit@gmail.com"

Flow:

    "amit@gmail.com"
            ↓
    Optional.ofNullable()
            ↓
    Optional["amit@gmail.com"]
            ↓
    map()
            ↓
    "gmail.com"
            ↓
    orElse()
            ↓
    "gmail.com"

Output:

    Amit domain: gmail.com

## Rahul Example

Input:

    null

Flow:

    null
      ↓
    Optional.ofNullable()
      ↓
    Optional.empty()
      ↓
    map() is not executed
      ↓
    orElse()
      ↓
    "No domain found"

Output:

    Rahul domain: No domain found

## Important Behavior of map()

If the Optional is empty, the mapping function is not executed.

Example:

    Optional.empty()
        .map(e -> ...)
        .orElse("No domain found")

The lambda does not run.

## Optional.map() vs Stream.map()

Both use the name `map()`, but they operate on different things.

### Stream map()

Transforms every element in a Stream.

Example:

    employees.stream()
             .map(employee -> employee.name)

Conceptually:

    Stream<Employee>
          ↓
    Stream<String>

### Optional map()

Transforms the value inside one Optional.

Example:

    email.map(e -> e.toUpperCase())

Conceptually:

    Optional<String>
          ↓
    Optional<String>

Remember:

    Stream.map()
    → Transform every Stream element

    Optional.map()
    → Transform the value if present

## Optional.map() vs filter()

`map()` transforms the value.

Example:

    email.map(e -> e.toUpperCase())

`filter()` checks whether the value satisfies a condition.

Example:

    email.filter(e -> e.contains("@"))

Remember:

    map()
    → Transform

    filter()
    → Keep/remove based on condition

## Optional.map() vs get()

`get()` extracts the value from Optional.

Example:

    email.get()

`map()` transforms the value while keeping it inside Optional.

Example:

    email.map(e -> e.toUpperCase())

Conceptually:

    get()
    → Optional → Value

    map()
    → Optional<Value> → Optional<NewValue>

## Optional.map() vs orElse()

`map()` transforms a present value.

Example:

    email.map(e -> e.toUpperCase())

`orElse()` provides a fallback if the Optional is empty.

Example:

    email.orElse("No email")

They are often used together:

    email.map(...)
         .orElse(...)

## Why No if-else?

Problem 112 used:

    if (email.isPresent()) {
        email.get();
    } else {
        ...
    }

Problem 113 introduces a more functional approach:

    email.map(...)
         .orElse(...)

Instead of:

    Check
      ↓
    Get
      ↓
    Transform

we can write:

    Transform
      ↓
    Fallback

## Important Point

`Optional.map()` returns another Optional.

For example:

    Optional<String> email =
            Optional.of("amit@gmail.com");

    Optional<String> domain =
            email.map(e ->
                e.substring(e.indexOf("@") + 1)
            );

The result is still:

    Optional<String>

It is not directly a String.

To get a final String with a fallback:

    String domain = email
            .map(...)
            .orElse("No domain found");

## Interview Questions & Answers

### 1. What does Optional.map() do?

It transforms the value inside an Optional if a value is present.

### 2. What happens if Optional is empty and map() is called?

The mapping function is not executed and the result remains an empty Optional.

### 3. What does this mean?

    email.map(e -> e.toUpperCase())

It means:

    If email exists:
        transform it to uppercase.

    If email is absent:
        keep the Optional empty.

### 4. What does Optional.map() return?

It returns another Optional containing the transformed value.

### 5. What is the difference between Optional.map() and Stream.map()?

Stream `map()` transforms each element in a Stream.

Optional `map()` transforms the value contained in one Optional.

### 6. What does orElse() do?

It returns the Optional's value if present; otherwise it returns the provided fallback value.

### 7. What happens when orElse() is used on a non-empty Optional?

The actual Optional value is returned.

### 8. What happens when orElse() is used on an empty Optional?

The fallback value is returned.

### 9. Why use ofNullable() in this problem?

Because the user's email can be null.

### 10. What happens when ofNullable(null) is called?

It returns:

    Optional.empty()

### 11. What is the purpose of `e.indexOf("@") + 1`?

It finds the position immediately after the `@` character.

### 12. What does substring() do here?

It extracts the characters from the specified starting position to the end of the String.

### 13. Why does map() not throw a NullPointerException for Rahul?

Rahul's email becomes `Optional.empty()` through `ofNullable()`.

Therefore the map function is not executed.

### 14. Can Optional.map() return an empty Optional?

Yes.

If the original Optional is empty, the result is empty.

### 15. Can Optional.map() be chained?

Yes.

Example:

    optional
        .map(...)
        .map(...)
        .orElse(...)

### 16. What is the difference between map() and flatMap()?

`map()` wraps the mapping result in an Optional.

`flatMap()` is used when the mapping function already returns an Optional and we want to avoid nested Optionals.

### 17. Is Optional.map() a Stream operation?

No.

It is a method of `Optional`.

### 18. Is orElse() a Stream operation?

No.

It is a method of `Optional`.

### 19. What happens if the Optional contains null?

An Optional does not contain null as its value. `ofNullable(null)` creates an empty Optional.

### 20. What is the basic Optional transformation pattern?

    Optional.ofNullable(value)
        .map(value -> transformation)
        .orElse(fallback)

## Quick Interview Summary

    Optional.ofNullable()
    → Safely create Optional from possibly-null value

    Optional.map()
    → Transform value if present

    orElse()
    → Provide fallback

    Empty Optional
    → map() is skipped

    Optional.map()
    → Returns Optional

    Stream.map()
    → Transforms Stream elements

    Optional.map()
    → Transforms Optional value