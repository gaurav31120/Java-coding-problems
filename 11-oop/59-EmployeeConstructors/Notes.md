# Notes — CJ-059 Employee Constructors

## Concepts Learned

- Constructor
- Parameterized constructor
- Object initialization
- Constructor parameters
- Instance variables
- Object creation

## Key Learning

A constructor is a special block used to initialize an object.

A parameterized constructor receives values when the object is created.

Example:

    Employee emp = new Employee(id, name, salary);

The constructor receives these values and initializes the object's fields.

Example:

    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

## Interview Questions & Answers

### 1. What is a constructor?

A constructor is a special member of a class used to initialize objects.

### 2. When is a constructor called?

A constructor is automatically called when an object is created using `new`.

### 3. What is a parameterized constructor?

A constructor that accepts parameters to initialize an object's fields.

### 4. Does a constructor have a return type?

No. A constructor does not have a return type, not even `void`.

### 5. Can a constructor accept parameters?

Yes. A parameterized constructor can accept values during object creation.

### 6. Why are constructors useful?

They allow an object to be initialized with valid values at the time of creation.

### 7. Can a class have multiple constructors?

Yes. A class can have multiple constructors with different parameter lists. This is called constructor overloading.

### 8. What happens when an object is created using `new`?

Memory is allocated for the object and its constructor is invoked to initialize it.