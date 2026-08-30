# Notes — CJ-114 orElse() vs orElseGet()

## Concepts Learned

- Optional
- orElse()
- orElseGet()
- Supplier
- Lambda expression
- Eager evaluation
- Lazy evaluation
- Default values
- Fallback values

## Key Learning

Both `orElse()` and `orElseGet()` provide a fallback when an Optional is empty.

The important difference is:

    orElse()
    → takes a value

    orElseGet()
    → takes a Supplier/lambda that produces a value

## orElse()

Example:

    String result =
            email.orElse("default@gmail.com");

If the Optional contains a value:

    Optional["amit@gmail.com"]
            ↓
    "amit@gmail.com"

If the Optional is empty:

    Optional.empty()
            ↓
    "default@gmail.com"

## orElseGet()

Example:

    String result =
            email.orElseGet(() -> "generated@gmail.com");

The lambda:

    () -> "generated@gmail.com"

acts as a Supplier of the fallback value.

If the Optional contains a value:

    Optional["amit@gmail.com"]
            ↓
    "amit@gmail.com"

If the Optional is empty:

    Optional.empty()
            ↓
    execute Supplier
            ↓
    "generated@gmail.com"

## Main Difference

    orElse(value)
        ↓
    provides the fallback value directly

    orElseGet(() -> value)
        ↓
    provides a function that can generate the fallback value

## Eager vs Lazy Evaluation

`orElse()` evaluates its argument even when the Optional already contains a value.

Example:

    email.orElse(generateDefaultEmail());

The `generateDefaultEmail()` method is evaluated before `orElse()` receives the argument.

`orElseGet()` evaluates the Supplier only when the Optional is empty.

Example:

    email.orElseGet(() -> generateDefaultEmail());

The method is called only when the Optional has no value.

## Example

Suppose:

    Optional<String> email =
            Optional.of("amit@gmail.com");

Then:

    email.orElse(generateDefaultEmail());

can execute:

    generateDefaultEmail()

even though the Optional already has a value.

But:

    email.orElseGet(() -> generateDefaultEmail());

does not execute the Supplier because the Optional already contains a value.

## Simple Memory Trick

    orElse()
    → Give me the default value.

    orElseGet()
    → Give me something that can create the default value.

## When to Use orElse()

Use `orElse()` when the fallback value is:

- simple
- already available
- inexpensive to create

Example:

    email.orElse("unknown@gmail.com");

## When to Use orElseGet()

Use `orElseGet()` when creating the fallback value:

- is expensive
- requires computation
- requires a method call
- should happen only when necessary

Example:

    email.orElseGet(() -> generateDefaultEmail());

## User Example

Users:

    Amit  → amit@gmail.com
    Rahul → null

Amit:

    Optional.ofNullable("amit@gmail.com")

Result:

    orElse()
    → amit@gmail.com

    orElseGet()
    → amit@gmail.com

Rahul:

    Optional.ofNullable(null)

Result:

    orElse()
    → default@gmail.com

    orElseGet()
    → generated@gmail.com

## Supplier

`orElseGet()` accepts a `Supplier`.

A Supplier represents something that produces a value.

Example:

    () -> "generated@gmail.com"

This lambda produces:

    "generated@gmail.com"

It does not require an input.

Conceptually:

    Supplier
       ↓
    produces a value

## Lambda

This:

    () -> "generated@gmail.com"

is a lambda expression.

It means:

    take no arguments
    return "generated@gmail.com"

Another example:

    () -> generateDefaultEmail()

means:

    take no arguments
    call generateDefaultEmail()
    return its result

## Optional Flow

### orElse()

    Optional
       ↓
    contains value?
       ↓
    YES → return actual value
       ↓
    NO → use fallback value

### orElseGet()

    Optional
       ↓
    contains value?
       ↓
    YES → return actual value
       ↓
    NO → execute Supplier
             ↓
        return generated value

## Important Point

The final returned result can be the same for both methods.

For example:

    email.orElse("default@gmail.com");

and:

    email.orElseGet(() -> "default@gmail.com");

can both return:

    "default@gmail.com"

when the Optional is empty.

The important difference is how the fallback is evaluated.

## orElse() vs orElseGet()

    orElse()
    → fallback expression is evaluated eagerly

    orElseGet()
    → fallback Supplier is evaluated lazily

## Interview Questions & Answers

### 1. What is the difference between orElse() and orElseGet()?

`orElse()` receives a fallback value.

`orElseGet()` receives a Supplier that generates the fallback value when needed.

### 2. What does orElse() return when Optional has a value?

It returns the value inside the Optional.

### 3. What does orElse() return when Optional is empty?

It returns the fallback value.

### 4. What does orElseGet() return when Optional has a value?

It returns the value inside the Optional and does not need to execute the Supplier.

### 5. What does orElseGet() return when Optional is empty?

It executes the Supplier and returns the generated value.

### 6. Is orElse() eager or lazy?

The fallback argument to `orElse()` is evaluated eagerly.

### 7. Is orElseGet() eager or lazy?

The Supplier used by `orElseGet()` is evaluated lazily.

### 8. What is a Supplier?

A Supplier is a functional interface that produces a value without taking an input.

### 9. What does this lambda mean?

    () -> "hello"

It takes no arguments and returns `"hello"`.

### 10. Why can orElseGet() be more efficient?

If the fallback is expensive to create, `orElseGet()` avoids creating it when the Optional already contains a value.

### 11. When should you use orElse()?

Use it when the fallback value is simple and inexpensive to evaluate.

### 12. When should you use orElseGet()?

Use it when the fallback requires computation or method execution and should happen only if needed.

### 13. Does orElseGet() always execute its Supplier?

No.

It executes the Supplier only when the Optional is empty.

### 14. Does orElse() always use the fallback value?

No.

The fallback expression can be evaluated, but if the Optional contains a value, that actual value is returned.

### 15. Can both methods return the same result?

Yes.

For an empty Optional, both can return equivalent fallback values.

### 16. What is the syntax of orElse()?

    optional.orElse(value)

### 17. What is the syntax of orElseGet()?

    optional.orElseGet(() -> value)

### 18. What is the difference between these?

    optional.orElse(generateValue());

and:

    optional.orElseGet(() -> generateValue());

The first evaluates `generateValue()` before `orElse()` is called.

The second supplies a lambda and calls `generateValue()` only if the Optional is empty.

### 19. Is orElseGet() related to Streams?

No.

`orElseGet()` is a method of Optional.

### 20. What is the basic memory rule?

    orElse()
    → value

    orElseGet()
    → Supplier/lambda

## Quick Interview Summary

    orElse(value)
    → fallback value

    orElseGet(() -> value)
    → fallback Supplier

    orElse()
    → eager evaluation of fallback argument

    orElseGet()
    → lazy evaluation of fallback Supplier

    Optional contains value
    → actual value returned

    Optional empty
    → fallback used

    Expensive fallback
    → prefer orElseGet()