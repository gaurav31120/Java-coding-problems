# Notes — CJ-005 Integer to Double

## Concepts Learned

- Type casting
- Widening type casting
- Implicit casting
- int → double

## Key Learning

Widening casting happens when a smaller numeric type is converted into a larger compatible numeric type.

Example:

double value = intValue;

Java performs this conversion automatically, so explicit casting is not required.

## Interview Questions & Answers

### 1. What is widening type casting?

Widening type casting is converting a smaller data type into a larger compatible data type.

Example:

int → double

### 2. What is implicit type casting?

Implicit type casting is when Java automatically converts one compatible data type into another without requiring an explicit cast.

### 3. Why can int be converted to double automatically?

`double` can represent the range of values that an `int` can represent, so Java allows this conversion automatically.

### 4. Is `(double) value` required for int to double conversion?

No. Java automatically performs the conversion.

Example:

double result = value;

### 5. What is the difference between widening and narrowing casting?

Widening converts a smaller type to a larger compatible type and is usually automatic.

Narrowing converts a larger type to a smaller type and generally requires explicit casting.