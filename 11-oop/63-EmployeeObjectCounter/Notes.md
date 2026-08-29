# Notes — CJ-063 Employee Object Counter

## Concepts Learned

- `static` variable
- Class-level data
- Instance variables
- Constructor
- Object creation
- Shared state

## Key Learning

A `static` variable belongs to the **class**, not to individual objects.

Therefore, all `Employee` objects share the same `counter`.

The counter is incremented whenever the constructor creates a new object:

    counter++;

For three objects:

    new Employee(...) → counter = 1
    new Employee(...) → counter = 2
    new Employee(...) → counter = 3

A static variable should preferably be accessed using the class name:

    Employee.counter

## Interview Questions & Answers

### 1. What is a static variable?

A static variable belongs to the class and is shared by all objects of that class.

### 2. What is the difference between a static and instance variable?

An instance variable belongs to each individual object, while a static variable is shared by all objects of the class.

### 3. Why is `counter` static?

Because we need one common counter shared by all Employee objects.

### 4. When does the counter increase?

It increases every time the Employee constructor is called to create an object.

### 5. How should a static variable be accessed?

Using the class name.

Example:

    Employee.counter

### 6. Can a static variable be accessed using an object?

Yes, Java allows it, but accessing it through the class name is clearer and recommended.

### 7. How many copies of a static variable exist?

Normally, there is one shared copy associated with the class rather than one copy for every object.

### 8. Can instance variables be accessed directly from a static method?

Not without an object reference because instance variables belong to objects.