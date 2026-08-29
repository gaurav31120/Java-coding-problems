# Notes — CJ-058 Employee Class

## Concepts Learned

- Class & Object
- Instance variables
- `new` keyword
- Object field access
- `Scanner`

## Key Learning

A **class** is a blueprint used to create objects.

An **object** is an instance of a class.

An object is created using the `new` keyword.

Example:

    Employee emp = new Employee();

Instance variables belong to objects and can be accessed using the dot (`.`) operator.

Example:

    emp.id = id;
    emp.name = name;
    emp.salary = salary;

Each object created from the same class can store its own values.

## Interview Questions & Answers

### 1. What is a class in Java?

A class is a blueprint that defines the properties and behavior that objects created from the class can have.

### 2. What is an object?

An object is an instance of a class created at runtime.

### 3. How do you create an object in Java?

Using the `new` keyword.

Example:

    Employee emp = new Employee();

### 4. What is an instance variable?

An instance variable is declared inside a class but outside methods. Every object has its own copy of instance variables.

### 5. How do you access instance variables?

Using an object reference followed by the dot (`.`) operator.

Example:

    emp.salary

### 6. What is the difference between a class and an object?

A class is the blueprint, while an object is an actual instance created from that blueprint.

### 7. Where are objects created in Java memory?

Objects are generally created in heap memory.

### 8. Can multiple objects be created from the same class?

Yes. Multiple objects can be created from one class, and each object can store different values in its instance variables.