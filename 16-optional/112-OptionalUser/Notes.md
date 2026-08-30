# Notes — CJ-112 Optional User

## Concepts Learned

- Optional
- Optional.ofNullable()
- isPresent()
- get()
- null handling
- NullPointerException prevention
- Optional.empty()
- Optional containing a value

## Key Learning

`Optional` is a container that can represent either:

- A value is present
- No value is present

Example:

    Optional<String> email;

Instead of directly working with a potentially null value, Optional allows us to explicitly handle the possibility that the value may be missing.

## Why Optional?

A normal String can contain:

    "amit@gmail.com"

or:

    null

If we directly operate on a null value, we can get a `NullPointerException`.

Optional provides a safer way to represent a value that may not exist.

## Optional.ofNullable()

`Optional.ofNullable()` creates an Optional from a value that may be null.

Example:

    Optional<String> email =
            Optional.ofNullable(user.email);

If the value is not null:

    "amit@gmail.com"
        ↓
    Optional containing "amit@gmail.com"

If the value is null:

    null
      ↓
    Optional.empty()

## Example

    User user1 = new User("Amit", "amit@gmail.com");

    Optional<String> email1 =
            Optional.ofNullable(user1.email);

Here:

    email1
    → Optional containing "amit@gmail.com"

For a null email:

    User user2 = new User("Rahul", null);

    Optional<String> email2 =
            Optional.ofNullable(user2.email);

Here:

    email2
    → Optional.empty()

## isPresent()

`isPresent()` checks whether an Optional contains a value.

Example:

    if (email.isPresent()) {
        ...
    }

It returns:

    true
    → value exists

    false
    → value does not exist

## get()

`get()` returns the value stored inside the Optional.

Example:

    email.get()

If:

    email = Optional["amit@gmail.com"]

then:

    email.get()

returns:

    "amit@gmail.com"

In this beginner problem, `get()` is used only after checking `isPresent()`.

## Basic Optional Pattern

    Optional<String> email =
            Optional.ofNullable(user.email);

    if (email.isPresent()) {
        System.out.println(email.get());
    } else {
        System.out.println("No email found");
    }

## Optional Flow

For Amit:

    "amit@gmail.com"
            ↓
    Optional.ofNullable()
            ↓
    Optional containing value
            ↓
    isPresent()
            ↓
          true
            ↓
          get()
            ↓
    "amit@gmail.com"

For Rahul:

    null
     ↓
    Optional.ofNullable()
     ↓
    Optional.empty()
     ↓
    isPresent()
     ↓
    false
     ↓
    "No email found"

## Optional.empty()

When `ofNullable()` receives null, the result is an empty Optional.

Conceptually:

    Optional.empty()

means:

    No value is present.

## of() vs ofNullable()

`Optional.of()` should be used when the value is known to be non-null.

Example:

    Optional<String> email =
            Optional.of("amit@gmail.com");

If null is passed to `Optional.of()`, it throws `NullPointerException`.

`Optional.ofNullable()` can safely handle null.

Example:

    Optional<String> email =
            Optional.ofNullable(null);

This creates:

    Optional.empty()

Remember:

    of()
    → value must not be null

    ofNullable()
    → value may be null

## Null Handling

Without Optional:

    String email = user.email;

    if (email != null) {
        System.out.println(email);
    }

With Optional:

    Optional<String> email =
            Optional.ofNullable(user.email);

    if (email.isPresent()) {
        System.out.println(email.get());
    }

Optional makes the possibility of absence explicit.

## Important Point

`Optional` is not a replacement for every null check.

It is especially useful for representing the possible absence of a value, particularly in return types and functional-style code.

## Important Point About get()

Calling:

    optional.get()

when the Optional is empty throws:

    NoSuchElementException

Therefore, in this beginner exercise:

    if (optional.isPresent()) {
        optional.get();
    }

The `get()` call is performed only when a value is known to exist.

## User Class

The problem uses:

    static class User {
        String name;
        String email;

        User(String name, String email) {
            this.name = name;
            this.email = email;
        }
    }

The `email` field may contain a value or null.

## Optional vs Null

Normal value:

    String email = "amit@gmail.com";

Possible null:

    String email = null;

Optional:

    Optional<String> email =
            Optional.ofNullable(value);

Optional explicitly represents:

    value present
    OR
    value absent

## Interview Questions & Answers

### 1. What is Optional in Java?

`Optional` is a container object that may or may not contain a value.

### 2. Why was Optional introduced?

It provides a way to represent the possible absence of a value and can help reduce some common null-handling problems.

### 3. What does Optional.ofNullable() do?

It creates an Optional from a value that may be null.

### 4. What happens when ofNullable() receives null?

It returns an empty Optional.

### 5. What is Optional.empty()?

It represents an Optional containing no value.

### 6. What does isPresent() do?

It checks whether the Optional contains a value.

### 7. What does isPresent() return?

It returns:

    true
    → value is present

    false
    → value is absent

### 8. What does get() do?

`get()` returns the value contained inside the Optional.

### 9. What happens if get() is called on an empty Optional?

It throws `NoSuchElementException`.

### 10. What is the difference between of() and ofNullable()?

`of()` requires a non-null value.

`ofNullable()` accepts both null and non-null values.

### 11. What happens if Optional.of(null) is called?

It throws `NullPointerException`.

### 12. What happens if Optional.ofNullable(null) is called?

It returns:

    Optional.empty()

### 13. How do you safely access an Optional value in this problem?

Use:

    if (optional.isPresent()) {
        System.out.println(optional.get());
    }

### 14. Can Optional contain null?

An Optional itself does not contain null as its value.

A null passed to `ofNullable()` results in an empty Optional.

### 15. What is the difference between null and Optional.empty()?

`null` means there is no object reference.

`Optional.empty()` is an actual Optional object representing the absence of a value.

### 16. Does Optional eliminate NullPointerException completely?

No. Optional does not eliminate all possible NullPointerExceptions.

It provides a structured way to represent and handle potentially missing values.

### 17. What exception can get() throw?

Calling `get()` on an empty Optional throws `NoSuchElementException`.

### 18. Should get() always be used?

No. Modern Optional code often uses methods such as `orElse()`, `orElseGet()`, `ifPresent()`, `map()`, or `orElseThrow()` depending on the requirement.

### 19. What is Optional<String>?

It is an Optional that can contain a String value.

Example:

    Optional<String>

### 20. What is the basic Optional pattern learned here?

    Optional.ofNullable(value)

    if (optional.isPresent()) {
        optional.get();
    } else {
        // value absent
    }

## Quick Interview Summary

    Optional
    → Container that may contain a value

    ofNullable()
    → Safely create Optional from possibly-null value

    of()
    → Value must not be null

    empty()
    → No value

    isPresent()
    → Check whether value exists

    get()
    → Retrieve value

    empty Optional + get()
    → NoSuchElementException

    null + of()
    → NullPointerException

    null + ofNullable()
    → Optional.empty()