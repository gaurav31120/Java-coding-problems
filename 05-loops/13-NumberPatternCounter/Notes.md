# Notes — CJ-013 Number Pattern Counter

## Concepts Learned

- Scanner
- Nested for loop
- Outer loop
- Inner loop
- Loop boundaries
- Pattern printing
- Input validation
- return statement

## Key Learning

Nested loops are useful when one loop needs to repeat another loop.

The outer loop controls the number of rows, while the inner loop controls the values printed in each row.

For example:

n = 3

The outer loop runs 3 times, and for every outer-loop iteration, the inner loop runs 3 times.

## Interview Questions & Answers

### 1. What is a nested loop?

A nested loop is a loop placed inside another loop.

### 2. Which loop controls the rows in this problem?

The outer `for` loop controls the rows.

### 3. Which loop controls the numbers in each row?

The inner `for` loop controls the numbers printed in each row.

### 4. How many times does the inner loop execute if n is 4?

It executes 4 times for each row.

Since there are 4 rows, the inner loop executes 4 × 4 = 16 times in total.

### 5. Why does the inner loop start from 1 for every row?

Because every row must print the sequence from 1 to n again.

### 6. Why did we validate `n <= 0`?

A zero or negative value cannot produce a valid pattern size, so the program prints `Invalid size`.

### 7. What is the purpose of `return` here?

`return` immediately stops the `main` method when the input is invalid.

### 8. What is the time complexity of this pattern?

The nested loops execute approximately n × n times, so the time complexity is O(n²).