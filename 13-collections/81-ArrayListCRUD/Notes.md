# Notes — CJ-081 ArrayList CRUD

## Concepts Learned

- ArrayList
- Generics
- add()
- get()
- set()
- remove()
- size()
- Zero-based indexing

## Key Learning

ArrayList is a resizable collection that stores elements in insertion order.

Example:

    ArrayList<String> employees = new ArrayList<>();

## CRUD Operations

### Create

Use `add()`:

    employees.add("Gaurav");

### Read

Use `get(index)`:

    employees.get(2);

ArrayList uses zero-based indexing.

So:

    index 0 → first element
    index 1 → second element
    index 2 → third element

### Update

Use `set(index, value)`:

    employees.set(2, "Kajal");

This replaces the existing element at index 2.

Important:

`set()` returns the old element.

### Delete

Use `remove()`:

    employees.remove(1);

This removes the element at index 1.

You can also remove by value:

    employees.remove("Nidhi");

### Count

Use:

    employees.size();

This returns the number of elements currently stored.

## Interview Questions & Answers

### 1. What is ArrayList?

ArrayList is a resizable array implementation of the List interface in Java.

### 2. Does ArrayList have a fixed size?

No. Its size can grow or shrink dynamically as elements are added or removed.

### 3. Does ArrayList allow duplicate elements?

Yes. ArrayList allows duplicate elements.

### 4. Does ArrayList maintain insertion order?

Yes. ArrayList maintains the order in which elements are inserted.

### 5. How do you access an ArrayList element?

Use the `get(index)` method.

Example:

    employees.get(2);

### 6. What is the difference between `set()` and `add()`?

`add()` inserts a new element, while `set()` replaces an existing element at a specified index.

### 7. What does `remove()` do?

It removes an element from the ArrayList.

It can remove either by index or by object/value.

### 8. What does `size()` return?

It returns the current number of elements in the ArrayList.

### 9. What is the time complexity of `get()` in ArrayList?

Typically O(1) because ArrayList provides direct index-based access.

### 10. What happens when an element is removed from the middle?

Elements after the removed element are shifted to fill the gap.

### 11. Can ArrayList store primitive types directly?

No. ArrayList stores objects, so wrapper classes are used for primitive values.

Example:

    ArrayList<Integer> numbers = new ArrayList<>();

### 12. What is the difference between ArrayList and an array?

An array has a fixed size, while ArrayList can dynamically resize.