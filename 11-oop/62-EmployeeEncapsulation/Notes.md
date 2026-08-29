# Notes — CJ-062 Employee Encapsulation

## Concepts Learned

- Encapsulation
- Private fields
- Getters
- Setters
- Constructor
- Controlled access to object data

## Key Learning

Encapsulation means keeping an object's data private and providing controlled access through methods.

The fields are declared as `private`:

    private int id;
    private String name;
    private double salary;

Getters are used to read the values:

    emp.getSalary();

Setters are used to modify the values:

    emp.setSalary(updatedSalary);

This prevents direct access to the private fields from outside the class.

## Interview Questions & Answers

### 1. What is encapsulation?

Encapsulation is the practice of keeping data private inside a class and providing controlled access through methods.

### 2. Why are fields made private?

Private fields prevent direct access from outside the class and help protect the object's data.

### 3. What is a getter?

A getter is a method used to retrieve the value of a private field.

### 4. What is a setter?

A setter is a method used to modify the value of a private field.

### 5. Why do we use getters and setters?

They provide controlled access to private data and allow validation or additional logic to be added later.

### 6. Can we access a private field directly from main()?

No. A private field cannot be directly accessed outside its class.

### 7. How does encapsulation improve code design?

It hides implementation details and allows a class to control how its internal data is accessed or modified.

### 8. Is a constructor the same as a setter?

No. A constructor initializes an object when it is created, while a setter modifies an existing object's field after creation.