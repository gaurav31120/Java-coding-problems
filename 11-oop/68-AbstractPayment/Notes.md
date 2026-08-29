# Notes — CJ-068 Abstract Payment

## Concepts Learned

- Abstract class
- Abstract method
- Concrete subclass
- Constructor in abstract class
- `super()`
- Method overriding
- Cannot instantiate abstract class

## Key Learning

An abstract class is a class declared using the `abstract` keyword.

Example:

    abstract class Payment {
        double amount;

        Payment(double amount) {
            this.amount = amount;
        }

        abstract void processPayment();
    }

An abstract class can have:

- Fields
- Constructors
- Concrete methods
- Abstract methods

## Abstract Method

An abstract method has no implementation/body.

Example:

    abstract void processPayment();

The child class must provide the implementation.

Example:

    @Override
    void processPayment() {
        System.out.println("Processing card payment of " + amount);
    }

## Important Rule

An abstract class cannot be instantiated directly.

This is invalid:

    Payment payment = new Payment(5000);

Instead, create an object of a concrete child class:

    CardPayment payment = new CardPayment(5000);

## `super()` with Abstract Classes

The parent abstract class can have a constructor.

The child constructor can call it using `super()`.

Example:

    CardPayment(double amount) {
        super(amount);
    }

This initializes the `amount` field defined in the parent class.

## Interview Questions & Answers

### 1. What is an abstract class?

An abstract class is a class declared with the `abstract` keyword. It can contain abstract and concrete methods and cannot be instantiated directly.

### 2. What is an abstract method?

An abstract method is a method declared without a body. A concrete child class must implement it.

Example:

    abstract void processPayment();

### 3. Can an abstract class have a constructor?

Yes. An abstract class can have constructors.

### 4. Can we create an object of an abstract class?

No. An abstract class cannot be instantiated directly.

### 5. Why use an abstract class?

It provides a common base and can define behavior that child classes are required to implement.

### 6. Can an abstract class contain normal methods?

Yes. An abstract class can contain both abstract and concrete methods.

### 7. Can an abstract class contain variables?

Yes. It can contain instance and static variables.

### 8. Why is `processPayment()` abstract here?

Because different payment types need different implementations of payment processing.

### 9. What does `super(amount)` do?

It calls the parent class constructor and passes the amount to it.

### 10. What happens if a child class does not implement an inherited abstract method?

The child class must itself be declared abstract; otherwise, the compiler reports an error.