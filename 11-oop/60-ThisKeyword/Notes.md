# Notes — CJ-060 this Keyword

## Concepts Learned

- `this` keyword
- Constructor parameters
- Instance variables
- Object initialization
- Current object reference

## Key Learning

The `this` keyword refers to the **current object**.

It is especially useful when constructor parameters have the same names as instance variables.

Example:

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

Here:

- `this.id` refers to the object's instance variable.
- `id` refers to the constructor parameter.

Without `this`, `id = id` would assign the parameter to itself instead of initializing the instance variable.

## Interview Questions & Answers

### 1. What is the `this` keyword?

`this` is a reference to the current object.

### 2. Why do we use `this` in constructors?

It is commonly used to distinguish instance variables from constructor parameters when they have the same names.

### 3. What does `this.id` mean?

`this.id` refers to the `id` instance variable belonging to the current object.

### 4. What does `id` mean inside the constructor?

When a parameter named `id` exists, `id` refers to that constructor parameter.

### 5. What happens with `id = id`?

The parameter is assigned to itself, so the instance variable is not initialized with the parameter value.

### 6. Can `this` be used to call another constructor?

Yes. `this()` can be used to call another constructor of the same class.

### 7. Can `this` be used in a static method?

No. `this` refers to the current object, while static methods belong to the class rather than a particular object.

### 8. Is `this` required when parameter and instance variable names are different?

No. It is not required in that case, but it can still be used explicitly to refer to the current object's instance variable.