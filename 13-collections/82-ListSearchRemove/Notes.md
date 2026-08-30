# Notes — CJ-082 List Search/Remove

## Concepts Learned

- ArrayList
- List searching
- contains()
- indexOf()
- remove()
- size()
- Removing by value

## Key Learning

ArrayList provides methods to search for and remove elements without manually writing a search loop.

### contains()

Checks whether an element exists.

    employees.contains("Rahul");

Returns:

    true

or:

    false

### indexOf()

Returns the index of the first occurrence of an element.

    employees.indexOf("Rahul");

If Rahul is at index 1:

    1

If the element does not exist:

    -1

### remove()

An ArrayList can remove an element by value:

    employees.remove("Rahul");

It can also remove by index:

    employees.remove(1);

Important distinction:

    remove("Rahul") → removes by value

    remove(1) → removes by index

### size()

Returns the current number of elements:

    employees.size();

## Interview Questions & Answers

### 1. What does contains() do?

It checks whether a specified element exists in the collection and returns a boolean.

### 2. What does indexOf() return?

It returns the index of the first occurrence of the specified element.

If the element is not found, it returns -1.

### 3. What is the difference between contains() and indexOf()?

contains() tells whether the element exists.

indexOf() tells where the first occurrence is located.

### 4. How can you remove an element by value?

Use:

    employees.remove("Rahul");

### 5. How can you remove an element by index?

Use:

    employees.remove(1);

### 6. What happens if indexOf() cannot find an element?

It returns -1.

### 7. Does contains() require a loop?

No. ArrayList provides contains() directly.

### 8. Does ArrayList allow duplicate elements?

Yes. If duplicate values exist, indexOf() returns the index of the first occurrence.

### 9. What is the difference between remove(Object) and remove(int)?

remove(Object) removes a matching object/value.

remove(int) removes the element at the specified index.

### 10. What happens to the elements after removing an element from the middle?

The elements after the removed element shift one position toward the beginning of the list.