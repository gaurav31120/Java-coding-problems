# Notes — CJ-066 Runtime Polymorphism

## Concepts Learned

- Runtime polymorphism
- Method overriding
- Parent reference
- Child object
- Dynamic method dispatch
- `extends`
- `@Override`

## Key Learning

Runtime polymorphism occurs when a parent-class reference refers to a child-class object and the overridden method is selected at runtime.

Example:

    Payment payment = new CardPayment();
    payment.processPayment();

The reference type is:

    Payment

The actual object is:

    CardPayment

Therefore, the `CardPayment` implementation of `processPayment()` runs.

The same reference can later point to another child object:

    payment = new UPIPayment();
    payment.processPayment();

Now the `UPIPayment` implementation runs.

## Important Rule

For overridden instance methods, Java determines the method implementation using the **actual object at runtime**, not simply the reference type.

Example:

    Payment payment = new CardPayment();

Reference type → Payment
Actual object  → CardPayment
Method executed → CardPayment.processPayment()

## Interview Questions & Answers

### 1. What is runtime polymorphism?

Runtime polymorphism is the ability of a parent reference to refer to different child objects, with the overridden method being selected at runtime.

### 2. What is dynamic method dispatch?

Dynamic method dispatch is the mechanism through which Java determines which overridden method to execute based on the actual object at runtime.

### 3. Can a parent reference refer to a child object?

Yes.

Example:

    Payment payment = new CardPayment();

### 4. What determines which overridden method executes?

For overridden instance methods, the actual object associated with the reference determines which implementation executes.

### 5. What is the difference between reference type and object type?

The reference type determines what members are accessible through the reference, while the actual object type determines which overridden instance method executes at runtime.

### 6. Why is this called runtime polymorphism?

Because the method implementation is determined when the program is running.

### 7. Is method overriding required for runtime polymorphism?

Yes. Runtime polymorphism through inheritance depends on overriding an inherited instance method.

### 8. Can the same parent reference point to different child objects?

Yes.

Example:

    Payment payment = new CardPayment();
    payment = new UPIPayment();

The reference remains `Payment`, but the object it refers to changes.