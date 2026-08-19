# Notes — CJ-006 Double to Integer

## Concepts Learned

- Type casting
- Narrowing type casting
- Explicit casting
- double → int
- Decimal truncation

## Key Learning

Narrowing casting converts a larger data type into a smaller compatible data type.

Example:

int value = (int) doubleValue;

When a `double` is converted to an `int`, the decimal part is truncated.

Example:

125.75 → 125

It does not round the value.

## Interview Questions & Answers

### 1. What is narrowing type casting?

Narrowing type casting is converting a larger data type into a smaller compatible data type.

Example:

double → int

### 2. Why is explicit casting required for double to int?

Because converting `double` to `int` can cause loss of data, Java requires the developer to explicitly request the conversion.

### 3. What happens to the decimal part when double is converted to int?

The decimal part is truncated.

Example:

125.75 → 125

### 4. Does `(int) 125.75` round the value?

No. It truncates the decimal part.

`125.75` becomes `125`, not `126`.

### 5. What is the difference between widening and narrowing casting?

Widening converts a smaller compatible type to a larger type and can happen automatically.

Narrowing converts a larger type to a smaller type and generally requires explicit casting.